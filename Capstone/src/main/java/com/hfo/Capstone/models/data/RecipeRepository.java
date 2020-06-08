package com.hfo.Capstone.models.data;


import com.hfo.Capstone.models.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
