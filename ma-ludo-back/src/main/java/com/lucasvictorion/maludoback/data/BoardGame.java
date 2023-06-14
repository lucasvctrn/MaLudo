package com.lucasvictorion.maludoback.data;

import org.springframework.data.annotation.Id;

// Classe représentative d'un jeu de société
public class BoardGame {
    
    @Id
    private String id;

    private String name;
    private String description;
    private Integer minPlayers;
    private Integer maxPlayers;

    // Constructeur
    public BoardGame() {}

    // Getter de l'ID du jeu
    public String getId() { return this.id; }

    // Getter et Setter du nom du jeu
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    // Getter et Setter de la description du jeu
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    // Getter et Setter du nombre minimum de joueurs
    public Integer getMinPlayers() { return this.minPlayers; }
    public void setMinPlayers(Integer minPlayers) { this.minPlayers = minPlayers; }

    // Getter et Setter du nombre maximum de joueurs
    public Integer getMaxPlayers() { return this.maxPlayers; }
    public void setMaxPlayers(Integer maxPlayers) { this.maxPlayers = maxPlayers; }
}
