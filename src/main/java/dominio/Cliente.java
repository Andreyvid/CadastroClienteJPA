package dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private Date dataDeNascimento;

    public Cliente() {
    }

    public Cliente(Date dataDeNascimento, String email, Integer id, String nome) {
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.nome = nome;
        this.id = id;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) { this.id = id; }

    public String getNome(String nomeConsulta) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dataDeNascimento=" + dataDeNascimento +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
