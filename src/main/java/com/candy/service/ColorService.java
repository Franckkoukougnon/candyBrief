package com.candy.service;

import com.candy.entity.Color;
import com.candy.repository.ColorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorService {

    @Autowired
    private ColorRepo colorRepo;

    public List<Color> getColor() {
      return colorRepo.findAll();
    }


    public void creerColor(Color color) {
        colorRepo.save(color);
    }
}
