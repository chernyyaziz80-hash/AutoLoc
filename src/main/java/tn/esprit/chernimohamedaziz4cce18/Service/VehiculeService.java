package tn.esprit.chernimohamedaziz4cce18.Service;

import tn.esprit.chernimohamedaziz4cce18.Domain.Vehicule;

import java.util.List;
import java.util.Optional;

public interface VehiculeService {
    List<Vehicule> getAllVehicules();

    Optional<Vehicule> getVehiculeById(Long id);

    Vehicule saveVehicule(Vehicule vehicule);

    void deleteVehicule(Long id);
}
