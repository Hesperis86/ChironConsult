package com.example.chironconsult;

import android.app.Application;
import android.os.AsyncTask;
import android.provider.ContactsContract;

import androidx.lifecycle.LiveData;

import java.util.List;

public class ActiveIngredientRepository {
    private ActiveIngredientDAO activeIngredientDAO;
    private LiveData<List<ActiveIngredient>> allActiveIngredientData;

    public ActiveIngredientRepository(Application application) {
        ActiveIngredientDatabase database = ActiveIngredientDatabase.getInstance(application);

        activeIngredientDAO = database.activeIngredientDAO();
        allActiveIngredientData = activeIngredientDAO.getAllActiveIngredientsData();
    }

    public void insert(ActiveIngredient activeIngredient) {
        new InsertIngredientAsyncTask(activeIngredientDAO).execute(activeIngredient);
    }

    public void update(ActiveIngredient activeIngredient) {
        new UpdateIngredientAsyncTask(activeIngredientDAO).execute(activeIngredient);
    }

    public void delete(ActiveIngredient activeIngredient) {
        new DeleteIngredientAsyncTask(activeIngredientDAO).execute(activeIngredient);
    }

    public void deleteAllData() {
        new DeleteAllDataAsyncTask(activeIngredientDAO).execute();
    }

    public LiveData<List<ActiveIngredient>> getAllActiveIngredientData() {
        return allActiveIngredientData;
    }

    private static class InsertIngredientAsyncTask extends AsyncTask<ActiveIngredient, Void, Void> {
        private ActiveIngredientDAO activeIngredientDAO;

        private InsertIngredientAsyncTask(ActiveIngredientDAO activeIngredientDAO) {
            this.activeIngredientDAO = activeIngredientDAO;
        }

        @Override
        protected Void doInBackground(ActiveIngredient... activeIngredients) {
            activeIngredientDAO.insert(activeIngredients[0]);
            return null;
        }
    }

    private static class UpdateIngredientAsyncTask extends AsyncTask<ActiveIngredient, Void, Void> {
        private ActiveIngredientDAO activeIngredientDAO;

        private UpdateIngredientAsyncTask(ActiveIngredientDAO activeIngredientDAO) {
            this.activeIngredientDAO = activeIngredientDAO;
        }

        @Override
        protected Void doInBackground(ActiveIngredient... activeIngredients) {
            activeIngredientDAO.update(activeIngredients[0]);
            return null;
        }
    }

    private static class DeleteIngredientAsyncTask extends AsyncTask<ActiveIngredient, Void, Void> {
        private ActiveIngredientDAO activeIngredientDAO;

        private DeleteIngredientAsyncTask(ActiveIngredientDAO activeIngredientDAO) {
            this.activeIngredientDAO = activeIngredientDAO;
        }

        @Override
        protected Void doInBackground(ActiveIngredient... activeIngredients) {
            activeIngredientDAO.delete(activeIngredients[0]);
            return null;
        }
    }

    private static class DeleteAllDataAsyncTask extends AsyncTask<Void, Void, Void> {
        private ActiveIngredientDAO activeIngredientDAO;

        private DeleteAllDataAsyncTask(ActiveIngredientDAO activeIngredientDAO) {
            this.activeIngredientDAO = activeIngredientDAO;
        }

        @Override
        protected Void doInBackground(Void... voids) {
            activeIngredientDAO.deleteAllEntries();
            return null;
        }
    }

}
