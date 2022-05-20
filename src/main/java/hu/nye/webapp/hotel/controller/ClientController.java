package hu.nye.webapp.hotel.controller;

import java.util.List;

import hu.nye.webapp.hotel.dto.ClientDTO;
import hu.nye.webapp.hotel.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }


    @RequestMapping(path = "/hotel", method = RequestMethod.GET )
    public List<ClientDTO> findAll() {
        return clientService.findAll();
    }
    @RequestMapping(path = "/hotel", method = RequestMethod.POST )
    public ClientDTO create(@RequestBody ClientDTO clientDTO) {
        return clientService.create(clientDTO);

    }
    @RequestMapping(path = "/hotel, /{id}", method = RequestMethod.DELETE )
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        clientService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
