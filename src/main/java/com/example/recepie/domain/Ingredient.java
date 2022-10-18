package com.example.recepie.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;


@Entity
@Table(name = "ingredients")

@Component
public class Ingredient extends AbstractEntity {
    @Column(name = "ingredients_names", unique = true)
    private String name;

    @OneToMany(mappedBy = "ingredient",cascade = {CascadeType.REMOVE,CascadeType.PERSIST,CascadeType.MERGE})
    private List<IngredientAmountAndUnit> ingredientAmountAndUnitList;


    public Ingredient(String name) {
        this.name = name;
    }

    public Ingredient() {

    }

    public String getName() {
        return name;
    }
}
