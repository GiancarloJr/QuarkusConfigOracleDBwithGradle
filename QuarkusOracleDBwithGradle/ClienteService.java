package br.com.claro.pay.rentabilizador.infra.persistence.Cliente_Oracle;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ClienteService {

    @Inject
    ClienteRepository clienteRepository;

    @Transactional
    public List<ClienteEntity> buscarCliente() throws SQLException {

        List<ClienteEntity> entities = new ArrayList<>();
        entities = clienteRepository.findAll().stream().toList();

        return entities;
    }
}
