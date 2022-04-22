package com.example.healthpi.repository;

import com.example.healthpi.model.RequestLaunchMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<RequestLaunchMessage, Long> {
    RequestLaunchMessage findFirstByOrderByIdDesc();


}
