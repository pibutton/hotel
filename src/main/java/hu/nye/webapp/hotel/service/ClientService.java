package hu.nye.webapp.hotel.service;

import hu.nye.webapp.hotel.dto.ClientDTO;

import java.util.List;

public interface ClientService {

    List<ClientDTO> findAll();

    ClientDTO create(ClientDTO clientDTO);

    void delete(Long id);
}
