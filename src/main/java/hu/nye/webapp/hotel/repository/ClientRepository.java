package hu.nye.webapp.hotel.repository;

import hu.nye.webapp.hotel.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
