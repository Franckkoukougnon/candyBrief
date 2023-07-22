package com.candy.controller;

import com.candy.entity.Color;
import com.candy.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

public class ColorController {

    @Autowired
    private ColorService colorService;

    @PostMapping
    public void creerColor(@RequestBody Color color) {
        colorService.creerColor(color);
    }
}
