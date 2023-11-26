package com.diningroom.userregistry.repositories;

import com.diningroom.userregistry.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
