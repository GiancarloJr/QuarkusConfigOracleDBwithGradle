package br.com.claro.pay.rentabilizador.infra.persistence.Cliente_Oracle;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "CS_CLIENTE")
public class ClienteEntity extends PanacheEntityBase {

    @Id
    @Column(name = "ID_CLIENTE")
    Long idCliente;

    @Column(name = "NOME")
    String nomeCliente;

    public ClienteEntity(){
    }

    public ClienteEntity(Long idCliente, String nomeCliente) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClienteEntity cliente = (ClienteEntity) o;
        return idCliente.equals(cliente.idCliente) && nomeCliente.equals(cliente.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCliente, nomeCliente);
    }
}
