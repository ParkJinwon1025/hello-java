package com.hellojava.demo.api.computers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hellojava.demo.domain.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
