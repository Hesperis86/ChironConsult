package com.example.chironconsult;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "active_ingredient_table")
public class ActiveIngredient {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String ingredientName;
    private String ingredientGroup;
    private String effect;
    private String use;
    private String contraindications;
    private String interactions;
    private String adverseReactions;

    private boolean isAllowedForCats;
    //private double cat_lowerDose;
    //private double cat_upperDose;
    //private String cat_administration;
    private boolean isAllowedForDogs;
    //private double dog_lowerDose;
    //private double dog_upperDose;
    //private String dog_administration;
    //private String dosageUnit;
    private String comments;
    private boolean isFavourite;
    private boolean emergencyDrug;
    private boolean isUsedInAnaesthesia;


    public ActiveIngredient(String ingredientName, String ingredientGroup, String effect, String use, String contraindications, String interactions, String adverseReactions, boolean isAllowedForCats, boolean isAllowedForDogs, String comments, boolean isFavourite, boolean emergencyDrug, boolean isUsedInAnaesthesia) {
        this.ingredientName = ingredientName;
        this.ingredientGroup = ingredientGroup;
        this.effect = effect;
        this.use = use;
        this.contraindications = contraindications;
        this.interactions = interactions;
        this.adverseReactions = adverseReactions;
        this.isAllowedForCats = isAllowedForCats;
        this.isAllowedForDogs = isAllowedForDogs;
        this.comments = comments;
        this.isFavourite = isFavourite;
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

    public String getEffect() {
        return effect;
    }

    public String getUse() {
        return use;
    }

    public String getContraindications() {
        return contraindications;
    }

    public String getInteractions() {
        return interactions;
    }

    public String getAdverseReactions() {
        return adverseReactions;
    }

    public boolean isAllowedForCats() {
        return isAllowedForCats;
    }

    public boolean isAllowedForDogs() {
        return isAllowedForDogs;
    }

    public String getComments() {
        return comments;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public boolean isEmergencyDrug() {
        return emergencyDrug;
    }

    public boolean isUsedInAnaesthesia() {
        return isUsedInAnaesthesia;
    }
}
