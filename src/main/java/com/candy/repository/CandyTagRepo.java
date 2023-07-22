package com.candy.repository;

import com.candy.entity.CandyTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandyTagRepo extends JpaRepository<CandyTag, Integer> {
}
