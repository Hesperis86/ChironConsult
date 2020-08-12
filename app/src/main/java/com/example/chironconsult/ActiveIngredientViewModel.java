package com.example.chironconsult;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class ActiveIngredientViewModel extends AndroidViewModel {
    private ActiveIngredientRepository repository;
    private LiveData<List<ActiveIngredient>> allActiveIngredients;

    public ActiveIngredientViewModel(@NonNull Application application) {
        super(application);
        repository = new ActiveIngredientRepository(application);
        allActiveIngredients = repository.getAllActiveIngredientData();
    }

    public void insert(ActiveIngredient activeIngredient) {
        repository.insert(activeIngredient);
    }

    public void update(ActiveIngredient activeIngredient) {
        repository.update(activeIngredient);
    }

    public void delete(ActiveIngredient activeIngredient) {
        repository.delete(activeIngredient);
    }

    public void deleteAll() {
        repository.deleteAllData();
    }

    public LiveData<List<ActiveIngredient>> getAllActiveIngredients() {
        return allActiveIngredients;
    }
}
