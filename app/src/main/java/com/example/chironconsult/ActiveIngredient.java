package com.example.chironconsult;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "active_ingredient_table")
public class ActiveIngredient {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String ingredientName;
    private String ingredientGroup;
    //private String contraindications;
    //private String interactions;
    //private String adverseReactions;
    //private String effect;
    //private String use;
    private boolean isAllowedForCats;
    private float cat_lowerDose;
    private float cat_upperDose;
    private boolean isAllowedForDogs;
    private float dog_lowerDose;
    private float dog_upperDose;
    private String dosageUnit;
    //private String comments;
    //private boolean isFavourite;
    private boolean emergencyDrug;
    private boolean isUsedInAnaesthesia;


    public ActiveIngredient(String ingredientName, String ingredientGroup, boolean isAllowedForCats, float cat_lowerDose, float cat_upperDose, boolean isAllowedForDogs, float dog_lowerDose, float dog_upperDose, String dosageUnit, boolean emergencyDrug, boolean isUsedInAnaesthesia) {
        this.ingredientName = ingredientName;
        this.ingredientGroup = ingredientGroup;
        this.isAllowedForCats = isAllowedForCats;
        this.cat_lowerDose = cat_lowerDose;
        this.cat_upperDose = cat_upperDose;
        this.isAllowedForDogs = isAllowedForDogs;
        this.dog_lowerDose = dog_lowerDose;
        this.dog_upperDose = dog_upperDose;
        this.dosageUnit = dosageUnit;
        this.emergencyDrug = emergencyDrug;
        this.isUsedInAnaesthesia = isUsedInAnaesthesia;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public String getIngredientGroup() {
        return ingredientGroup;
    }

    public boolean isAllowedForCats() {
        return isAllowedForCats;
    }

    public float getCat_lowerDose() {
        return cat_lowerDose;
    }

    public float getCat_upperDose() {
        return cat_upperDose;
    }

    public boolean isAllowedForDogs() {
        return isAllowedForDogs;
    }

    public float getDog_lowerDose() {
        return dog_lowerDose;
    }

    public float getDog_upperDose() {
        return dog_upperDose;
    }

    public String getDosageUnit() {
        return dosageUnit;
    }

    public boolean isEmergencyDrug() {
        return emergencyDrug;
    }

    public boolean isUsedInAnaesthesia() {
        return isUsedInAnaesthesia;
    }
}
