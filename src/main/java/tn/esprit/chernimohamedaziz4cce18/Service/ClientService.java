package tn.esprit.chernimohamedaziz4cce18.Service;

import tn.esprit.chernimohamedaziz4cce18.Domain.Client;
import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> getAllClients();
    Optional<Client> getClientById(Long id);
    Client saveClient(Client client);
    void deleteClient(Long id);
}
