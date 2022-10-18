package com.example.recepie.repository;

import com.example.recepie.domain.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

    List<Ingredient>findByName(String name);
}
