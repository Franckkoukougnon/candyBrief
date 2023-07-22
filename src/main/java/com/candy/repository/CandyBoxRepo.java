package com.candy.repository;

import com.candy.entity.CandyBox;
import com.candy.entity.CandyTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandyBoxRepo extends JpaRepository<CandyBox, Integer> {
}
