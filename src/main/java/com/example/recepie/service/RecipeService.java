package com.example.recepie.service;

import com.example.recepie.domain.Ingredient;
import com.example.recepie.domain.IngredientAmountAndUnit;
import com.example.recepie.domain.Recipe;
import com.example.recepie.repository.RecipeRepository;

import java.util.Map;
import java.util.Set;

public class RecipeService {

    private Recipe recipe;
    private RecipeRepository recipeRepository;

 public void createRecepie(String recipeName, Set<IngredientAmountAndUnit> ingredientAmountAndUnits, String description){
     recipe= new Recipe(recipeName, ingredientAmountAndUnits, description);
     recipeRepository.save(recipe);
 }
}
