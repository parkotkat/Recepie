package com.example.recepie;

import com.example.recepie.service.IngredientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

import java.rmi.NoSuchObjectException;
import java.util.NoSuchElementException;

@SpringBootApplication
public class RecepieApplication {

    @Autowired
    private UserActions userActions;

    private static final Logger LOGGER = LoggerFactory.getLogger(RecepieApplication.class);

    public RecepieApplication(UserActions userActions) {
        this.userActions = userActions;
    }

    public static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(RecepieApplication.class, args);

    }

    @EventListener
    public void start(ApplicationReadyEvent event) {

        try {
            //ask user for ingredient
            userActions.enterIngredientName();


        } catch (NoSuchElementException e1) {
            System.out.println(e1.getMessage());

        }


    }

}

//TODO
//implement builder pattern to build ingredient and recipe maybe also ingredientamount...
//implement rest functionality