package com.example.chironconsult;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ActiveIngredientDAO {

    @Insert
    void insert(ActiveIngredient activeIngredient);

    @Update
    void update(ActiveIngredient activeIngredient);

    @Delete
    void delete(ActiveIngredient activeIngredient);

    @Query("DELETE FROM active_ingredient_table")
    void deleteAllEntries();

    @Query("SELECT ingredientName FROM active_ingredient_table ORDER BY id")
    LiveData<List<String>> getAllActiveIngredients();

    @Query("SELECT * FROM active_ingredient_table ORDER BY id")
    LiveData<List<ActiveIngredient>> getAllActiveIngredientsData();
}
