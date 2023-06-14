package com.lucasvictorion.maludoback.service;

import com.lucasvictorion.maludoback.data.BoardGame;
import com.lucasvictorion.maludoback.exception.EntityNotFoundException;
import com.lucasvictorion.maludoback.repository.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardGameService {
    
    @Autowired
    private BoardGameRepository boardGameRepository;

    public List<BoardGame> findAll() {
        return boardGameRepository.findAll();
    }

    public BoardGame findById(String id){
        return boardGameRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public BoardGame save(BoardGame boardGame){
        return boardGameRepository.save(boardGame);
    }

    public void deleteById(String id){
        boardGameRepository.deleteById(id);
    }
}