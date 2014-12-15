package com.dyack.secure.repository;

import com.dyack.secure.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface ClientRepository extends JpaRepository<Client, Long> {
}
