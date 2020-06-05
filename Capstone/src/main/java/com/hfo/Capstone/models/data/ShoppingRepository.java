package com.hfo.Capstone.models.data;

import com.hfo.Capstone.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingRepository extends CrudRepository<Item, Integer> {
}
