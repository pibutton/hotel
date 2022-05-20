package hu.nye.webapp.hotel.service.impl;

import hu.nye.webapp.hotel.dto.ClientDTO;
import hu.nye.webapp.hotel.entity.Client;
import hu.nye.webapp.hotel.repository.ClientRepository;
import hu.nye.webapp.hotel.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    private final ModelMapper modelMapper;

    public ClientServiceImpl(ClientRepository clientRepository, ModelMapper modelMapper) {
        this.clientRepository = clientRepository;
        this.modelMapper = modelMapper;

        Client client1 = new Client();
        client1.setFirstName("Eva Julia");

        Client client2 = new Client();
        client2.setFirstName("Janos Bela");

        clientRepository.save(client1);
        clientRepository.save(client2);
    }

    @Override
    public List<ClientDTO> findAll() {
        List<Client> clientList = clientRepository.findAll();

        return clientList.stream()
                .map(client -> modelMapper.map(client, ClientDTO.class))
                .collect(Collectors.toList());
    }


    // mivel entityt vár a clientRepo.save-je ezért a modelMapper átalakítja a clientDTO paramétert entityvé
    @Override
    public ClientDTO create(ClientDTO clientDTO) {
        Client clientToSave = modelMapper.map(clientDTO, Client.class);
        Client savedClient = clientRepository.save(clientToSave);
        return modelMapper.map(savedClient, ClientDTO.class);
    }

    @Override
    public void delete(Long id) {
        Optional<Client> optionalClient = clientRepository.findById(id);

        if (optionalClient.isPresent()){
            Client clientToDelete = optionalClient.get();
            clientRepository.delete(clientToDelete);
        }
        else {
            throw new RuntimeException();
        }
    }


}
