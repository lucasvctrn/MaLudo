package com.lucasvictorion.maludoback.data;

import org.springframework.data.annotation.Id;

// Classe représentative d'une extension d'un jeu de société
public class Extension {
    
    @Id
    private String id;

    private String name;
    private String description;
    BoardGame boardGame;

    // Constructeur
    public Extension(String name, BoardGame boardGame) {
        this.name = name;
        this.boardGame = boardGame;
    }

    // Getter de l'ID de l'extension
    public String getId() { return this.id; }

    // Getter et Setter du nom de l'extension
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    // Getter et Setter de la description de l'extension
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }
}
