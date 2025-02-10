package com.MUSH_FOOD.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name;

    private String description;

    private Long price;

    @ManyToOne
    private Category foodCategory;

    @Column(length = 1000)
    @ElementCollection // this will create separate table for food images
    private List<String> images;

    private boolean available;


    @ManyToOne // because inside one restaurant there will be multiple food
    private Restaurant restaurant;


    @ManyToMany // because  inside one food there will be multiple ingredients
     private List<IngredientsItem> ingredients = new ArrayList<>();


    private Date creationdate;
}
