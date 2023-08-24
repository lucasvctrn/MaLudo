package com.lucasvictorion.maludoback.controller;

import com.lucasvictorion.maludoback.data.BoardGame;
import com.lucasvictorion.maludoback.service.BoardGameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/board-games")
public class BoardGameController {
    
    @Autowired
    private BoardGameService boardGameService;

    @GetMapping
    public List<BoardGame> findAll() {
        return boardGameService.findAll();
    }

    @GetMapping("/{id}")
    public BoardGame findById(@PathVariable String id){
        return boardGameService.findById(id);
    }

    @PostMapping
    public BoardGame create(@RequestBody BoardGame boardGame){
        return boardGameService.save(boardGame);
    }

    @PutMapping("/{id}")
    public BoardGame update(@RequestBody BoardGame boardGame){
        return boardGameService.save(boardGame);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id){
        boardGameService.deleteById(id);
    }
}