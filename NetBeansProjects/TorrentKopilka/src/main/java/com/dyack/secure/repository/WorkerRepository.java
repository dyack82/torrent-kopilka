package com.dyack.secure.repository;

import com.dyack.secure.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
