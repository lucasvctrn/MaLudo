package com.lucasvictorion.maludoback.repository;

import com.lucasvictorion.maludoback.data.BoardGame;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardGameRepository extends MongoRepository<BoardGame, String> {
    
}
