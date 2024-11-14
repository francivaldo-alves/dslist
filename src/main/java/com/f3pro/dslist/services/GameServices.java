package com.f3pro.dslist.services;

import com.f3pro.dslist.dto.GameMinDTO;
import com.f3pro.dslist.entities.Game;
import com.f3pro.dslist.repositories.GameRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServices {
    @Autowired
    private GameRepositoy gameRepositoy;

    public List<GameMinDTO> findAll(){
      var result =  gameRepositoy.findAll();
        return result.stream().map(GameMinDTO::new).toList();

    }
}
