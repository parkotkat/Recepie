package com.example.recepie.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ingredients_amount_unit")
public class IngredientAmountAndUnit extends AbstractEntity {


    @Enumerated
    private Unit unit;
    private Float amount;


    @ManyToOne(cascade = {CascadeType.REMOVE,CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "ingredients_id")
    private Ingredient ingredient;

    @ManyToOne (cascade = {CascadeType.REMOVE,CascadeType.PERSIST,CascadeType.MERGE})
    @JoinColumn(name = "recipes_id")
    private Recipe recipe;

    public IngredientAmountAndUnit(Unit unit, Float amount, Ingredient ingredient, Recipe recipe) {
        this.unit = unit;
        this.amount = amount;
        this.ingredient = ingredient;
        this.recipe = recipe;
    }

    
    public IngredientAmountAndUnit() {

    }
}
