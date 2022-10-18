package com.example.recepie.repository;

import com.example.recepie.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface RecipeRepository extends JpaRepository<Recipe,Long> {
}
