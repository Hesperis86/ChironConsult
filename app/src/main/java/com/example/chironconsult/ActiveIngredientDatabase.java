package com.example.chironconsult;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = ActiveIngredient.class, version = 1)
public abstract class ActiveIngredientDatabase extends RoomDatabase {

    private static ActiveIngredientDatabase instance;

    public abstract ActiveIngredientDAO activeIngredientDAO();

    public static synchronized ActiveIngredientDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    ActiveIngredientDatabase.class, "active_ingredient_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }
    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private ActiveIngredientDAO activeIngredientDAO;
        private PopulateDbAsyncTask(ActiveIngredientDatabase db) {
            activeIngredientDAO = db.activeIngredientDAO();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            activeIngredientDAO.insert(new ActiveIngredient("Acepromazyna", "neuroleptyki", true, 0.01, 0.05, "i.m/s.c", true, 0.01, 0.05, "i.m/s.c", "mg/kg", false, true));
            activeIngredientDAO.insert(new ActiveIngredient("Testalazyna", "neuroleptyki", true, 0.01, 0.05, "i.m/s.c", true, 0.01, 0.05, "i.m/s.c", "mg/kg", false, true));
            activeIngredientDAO.insert(new ActiveIngredient("Mawakoksyb", "neuroleptyki", true, 0.01, 0.05, "i.m/s.c", true, 0.01, 0.05, "i.m/s.c", "mg/kg", false, true));
        return null;
        }
    }
}
