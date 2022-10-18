package com.example.recepie;

import com.example.recepie.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.rmi.NoSuchObjectException;
import java.util.NoSuchElementException;
import java.util.Scanner;


@Component
public class UserActions {
    Scanner scanner = new Scanner(System.in);
    @Autowired
    IngredientService ingredientService;

    @Transactional
    public void enterIngredientName() throws NoSuchElementException {
        System.out.println("Please enter the name of the product you want to add to database");


        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            System.out.println(s);
            if (s.isEmpty())
                throw new NoSuchElementException("No product entered!");

            if (s.equals("SAVE"))
                return;
            else
                ingredientService.createIngredientInDataBase(s);


        }
    }

    // public enterRecepie(){}
}
