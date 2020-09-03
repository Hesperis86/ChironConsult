package com.example.chironconsult;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = ActiveIngredient.class, version = 2)
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
            activeIngredientDAO.insert(new ActiveIngredient("Acepromazyna", "neuroleptyki", "sedacja", "sedacja", "Boxery", "test", "nie zapijać wódką", true, true, "najlepiej smakuje schłodzona", false, false, true));
            activeIngredientDAO.insert(new ActiveIngredient("Testalazyna", "neuroleptyki", "testacja", "testowanie", "wersja alfa", "testowani", "programiści", false, false, "to jest test", true, false, false));
            activeIngredientDAO.insert(new ActiveIngredient("Mawakoksyb", "neuroleptyki", "przeciwbólowe", "zapalenie stawów", "test", "test", "jakieś na pewno są", false, true, "długotrwałe działanie", true, false, false));
        return null;
        }
    }
}
