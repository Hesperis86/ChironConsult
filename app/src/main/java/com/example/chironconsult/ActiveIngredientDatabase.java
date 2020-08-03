package com.example.chironconsult;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = ActiveIngredient.class, version = 1)
public abstract class ActiveIngredientDatabase extends RoomDatabase {

    private static ActiveIngredientDatabase instance;

    public abstract ActiveIngredientDAO activeIngredientDAO();

    public static synchronized ActiveIngredientDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ActiveIngredientDatabase.class, "active_ingredient_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
