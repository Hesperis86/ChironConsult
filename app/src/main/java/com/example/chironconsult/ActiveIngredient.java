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
    private double cat_lowerDose;
    private double cat_upperDose;
    private String cat_administration;
    private boolean isAllowedForDogs;
    private double dog_lowerDose;
    private double dog_upperDose;
    private String dog_administration;
    private String dosageUnit;
    //private String comments;
    //private boolean isFavourite;
    private boolean emergencyDrug;
    private boolean isUsedInAnaesthesia;


    public ActiveIngredient(String ingredientName, String ingredientGroup, boolean isAllowedForCats, double cat_lowerDose, double cat_upperDose, String cat_administration, boolean isAllowedForDogs, double dog_lowerDose, double dog_upperDose, String dog_administration, String dosageUnit, boolean emergencyDrug, boolean isUsedInAnaesthesia) {
        this.ingredientName = ingredientName;
        this.ingredientGroup = ingredientGroup;
        this.isAllowedForCats = isAllowedForCats;
        this.cat_lowerDose = cat_lowerDose;
        this.cat_upperDose = cat_upperDose;
        this.cat_administration = cat_administration;
        this.isAllowedForDogs = isAllowedForDogs;
        this.dog_lowerDose = dog_lowerDose;
        this.dog_upperDose = dog_upperDose;
        this.dog_administration = dog_administration;
        this.dosageUnit = dosageUnit;
        this.emergencyDrug = emergencyDrug;
        this.isUsedInAnaesthesia = isUsedInAnaesthesia;
    }

    public ActiveIngredient(String activeIngredientName) {
        this.ingredientName = ingredientName;
    }//usunąć

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

    public double getCat_lowerDose() {
        return cat_lowerDose;
    }

    public double getCat_upperDose() {
        return cat_upperDose;
    }

    public String getCat_administration() { return cat_administration; }

    public boolean isAllowedForDogs() {
        return isAllowedForDogs;
    }

    public double getDog_lowerDose() {
        return dog_lowerDose;
    }

    public double getDog_upperDose() {
        return dog_upperDose;
    }

    public String getDog_administration() { return  dog_administration; }

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
