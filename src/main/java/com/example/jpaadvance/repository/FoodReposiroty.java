package com.example.jpaadvance.repository;

import com.example.jpaadvance.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodReposiroty extends JpaRepository<Food, Long> {
}
