package com.f3pro.dslist.controllers;

import com.f3pro.dslist.dto.GameMinDTO;
import com.f3pro.dslist.entities.Game;
import com.f3pro.dslist.services.GameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameServices gameServices;

    @GetMapping
    public List<GameMinDTO> findAll() {
        var result = gameServices.findAll();
        return result;

    }
}
