package com.candy.repository;

import com.candy.entity.Command;
import org.springframework.data.jpa.repository.JpaRepository;

public interface commandRepo extends JpaRepository<Command, Integer>{

}
