package br.com.claro.pay.rentabilizador.infra.persistence.Cliente_Oracle;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.sql.SQLException;


@Path("/v1/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RequiredArgsConstructor
@Slf4j
public class ClienteResource {

    @Inject
    ClienteService clienteService;

    @Path("/buscarCLientes")
    @GET
    @Transactional
    public Response buscarClienteAll() throws SQLException {
        return Response.ok(clienteService.buscarCliente()).build();


    }
}


