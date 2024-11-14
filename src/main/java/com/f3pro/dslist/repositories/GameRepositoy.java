package com.f3pro.dslist.repositories;

import com.f3pro.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface GameRepositoy  extends JpaRepository<Game,Long> {
}
