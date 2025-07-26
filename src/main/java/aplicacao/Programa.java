package aplicacao;

import dominio.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("cadastro-cliente");
        EntityManager em = emf.createEntityManager();

        System.out.println("============== Selecione uma opcao ==============");
        System.out.println("1-Cadastrar Cliente");
        System.out.println("2-Consultar Cliente");
        System.out.println("3-Deletar Cliente");

        int opcao = scanner.nextInt();


        if (opcao == 1) //cadastrando o cliente
        {
            try {
                System.out.println("Digite o nome do cliente:");
                String nome = scanner.next();
                System.out.println("Digite o email: ");
                String email = scanner.next();
                System.out.println("Digite a data de nascimento (DD/MM/YYYY)");
                String dataDeNascimentoStr = scanner.next();
                Date dataDeNascimento = null;
                dataDeNascimento = sdf.parse(dataDeNascimentoStr);


                Cliente cliente = new Cliente(dataDeNascimento, email, null, nome);

                em.getTransaction().begin();
                em.persist(cliente);
                em.getTransaction().commit();

                System.out.println("Cadastrado com sucesso!");
                System.out.println(cliente);

            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

        } else if (opcao == 2) //consultando o cliente
        {
            System.out.println("Digite o ID: ");

            int consultaID = scanner.nextInt();

            Cliente c = em.find(Cliente.class, consultaID);
            System.out.println(c);
        } else if (opcao == 3) //deletando o cliente
        {
            System.out.println("Digite o ID no qual quer deletar: ");

            int deletaID = scanner.nextInt();

            em.getTransaction().begin();
            Cliente c = em.find(Cliente.class, deletaID);
            if (c != null) {
                em.remove(c);
                System.out.println("Deletado com sucesso!");
            } else {
                System.out.println("ID invalido");
            }

            em.getTransaction().commit();

        }
        em.close();
        emf.close();
    }
}



