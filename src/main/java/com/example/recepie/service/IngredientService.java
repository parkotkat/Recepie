package com.example.recepie.service;

import com.example.recepie.UserActions;
import com.example.recepie.domain.Ingredient;
import com.example.recepie.repository.IngredientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.UnexpectedRollbackException;

import javax.transaction.Transactional;


@Component
public class IngredientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IngredientService.class);
    //if more than one type of ingredient (wegan ingredient, lactose free etc) >> ingredient factory
    //private IngredientFactory ingredientFactory;
    @Autowired
    private Ingredient ingredient;

    ;
    @Autowired
    private IngredientRepository ingredientRepository;

    //maybe it will be better to save list of integers in entity manager and after "SAVE" save it into database
    //on the other hand we might enter 10 ingredients and after saving it might turn out that half of them is already in database
    public void createIngredientInDataBase(String name) {

        LOGGER.info(ingredient.toString());
        if (!ingredientRepository.findByName(name).isEmpty()) {
            System.out.println("Database already contains this product: " + name + ".");
            return;
        } else
            ingredientRepository.save(new Ingredient(name));

    }
}