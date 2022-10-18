package com.example.recepie.domain;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="recipes")
public class Recipe extends AbstractEntity {

    @Column(name = "recipe_name")
    private String recipeName;

    @OneToMany (mappedBy = "recipe")
     private Set<IngredientAmountAndUnit> ingredientAmountAndUnits= new HashSet<>();

    @Column(name = "recipe_description")
    private String description;

    public Recipe(String recipeName, Set<IngredientAmountAndUnit> ingredientAmountAndUnits, String description) {
        this.recipeName = recipeName;
        this.ingredientAmountAndUnits = ingredientAmountAndUnits;
        this.description = description;
    }

    public Recipe() {

    }
}

