package com.example.chironconsult;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "dog_medication_doses_table")
public class DogDoses {

    @PrimaryKey
    private int ingredientID;

    //p.o
    private Boolean perOs;
    private double perOsLowerDose;
    private double perOsUpperDose;
    private String perOsUnit; //jednostka

    //s.c.
    private Boolean subcutaneous;
    private double subcutaneousLowerDose;
    private double subcutaneousUpperDose;
    private String subcutaneousUnit;

    //i.m.
    private Boolean intramuscular;
    private double intramuscularLowerDose;
    private double intramuscularUpperDose;
    private String intramuscularUnit;

    //i.v.
    private Boolean intravenous;
    private double intravenousLowerDose;
    private double intravenousUpperDose;
    private String intravenousUnit;

    //i.p.
    private Boolean intraperitoneal;
    private double intraperitonealLowerDose;
    private double intraperitonealUpperDose;
    private String intraperitonealUnit;

    //per rectum
    private Boolean intrarectal;
    private double intrarectalLowerDose;
    private double intrarectalUpperDose;
    private String intrarectalUnit;

    //per vaginam
    private Boolean intravaginal;
    private double intravaginalLowerDose;
    private double intravaginalUpperDose;
    private String intravaginalUnit;

    //conjunct. sac
    private Boolean intoConjunctivalSac;
    private double intoConjunctivalSacLowerDose;
    private double intoConjunctivalSacUpperDose;
    private String intoConjunctialSacUnit;

    //topical
    private Boolean topical; //on skin
    private double topicalLowerDose;
    private double topicalUpperDose;
    private String topicalUnit; //jednostka

    public DogDoses(Boolean perOs, double perOsLowerDose, double perOsUpperDose, String perOsUnit, Boolean subcutaneous, double subcutaneousLowerDose, double subcutaneousUpperDose, String subcutaneousUnit, Boolean intramuscular, double intramuscularLowerDose, double intramuscularUpperDose, String intramuscularUnit, Boolean intravenous, double intravenousLowerDose, double intravenousUpperDose, String intravenousUnit, Boolean intraperitoneal, double intraperitonealLowerDose, double intraperitonealUpperDose, String intraperitonealUnit, Boolean intrarectal, double intrarectalLowerDose, double intrarectalUpperDose, String intrarectalUnit, Boolean intravaginal, double intravaginalLowerDose, double intravaginalUpperDose, String intravaginalUnit, Boolean intoConjunctivalSac, double intoConjunctivalSacLowerDose, double intoConjunctivalSacUpperDose, String intoConjunctialSacUnit, Boolean topical, double topicalLowerDose, double topicalUpperDose, String topicalUnit) {
        this.perOs = perOs;
        this.perOsLowerDose = perOsLowerDose;
        this.perOsUpperDose = perOsUpperDose;
        this.perOsUnit = perOsUnit;
        this.subcutaneous = subcutaneous;
        this.subcutaneousLowerDose = subcutaneousLowerDose;
        this.subcutaneousUpperDose = subcutaneousUpperDose;
        this.subcutaneousUnit = subcutaneousUnit;
        this.intramuscular = intramuscular;
        this.intramuscularLowerDose = intramuscularLowerDose;
        this.intramuscularUpperDose = intramuscularUpperDose;
        this.intramuscularUnit = intramuscularUnit;
        this.intravenous = intravenous;
        this.intravenousLowerDose = intravenousLowerDose;
        this.intravenousUpperDose = intravenousUpperDose;
        this.intravenousUnit = intravenousUnit;
        this.intraperitoneal = intraperitoneal;
        this.intraperitonealLowerDose = intraperitonealLowerDose;
        this.intraperitonealUpperDose = intraperitonealUpperDose;
        this.intraperitonealUnit = intraperitonealUnit;
        this.intrarectal = intrarectal;
        this.intrarectalLowerDose = intrarectalLowerDose;
        this.intrarectalUpperDose = intrarectalUpperDose;
        this.intrarectalUnit = intrarectalUnit;
        this.intravaginal = intravaginal;
        this.intravaginalLowerDose = intravaginalLowerDose;
        this.intravaginalUpperDose = intravaginalUpperDose;
        this.intravaginalUnit = intravaginalUnit;
        this.intoConjunctivalSac = intoConjunctivalSac;
        this.intoConjunctivalSacLowerDose = intoConjunctivalSacLowerDose;
        this.intoConjunctivalSacUpperDose = intoConjunctivalSacUpperDose;
        this.intoConjunctialSacUnit = intoConjunctialSacUnit;
        this.topical = topical;
        this.topicalLowerDose = topicalLowerDose;
        this.topicalUpperDose = topicalUpperDose;
        this.topicalUnit = topicalUnit;
    }

    public int getIngredientID() {
        return ingredientID;
    }

    public void setIngredientID(int ingredientID) {
        this.ingredientID = ingredientID;
    }

    public Boolean getPerOs() {
        return perOs;
    }

    public double getPerOsLowerDose() {
        return perOsLowerDose;
    }

    public double getPerOsUpperDose() {
        return perOsUpperDose;
    }

    public String getPerOsUnit() {
        return perOsUnit;
    }

    public Boolean getSubcutaneous() {
        return subcutaneous;
    }

    public double getSubcutaneousLowerDose() {
        return subcutaneousLowerDose;
    }

    public double getSubcutaneousUpperDose() {
        return subcutaneousUpperDose;
    }

    public String getSubcutaneousUnit() {
        return subcutaneousUnit;
    }

    public Boolean getIntramuscular() {
        return intramuscular;
    }

    public double getIntramuscularLowerDose() {
        return intramuscularLowerDose;
    }

    public double getIntramuscularUpperDose() {
        return intramuscularUpperDose;
    }

    public String getIntramuscularUnit() {
        return intramuscularUnit;
    }

    public Boolean getIntravenous() {
        return intravenous;
    }

    public double getIntravenousLowerDose() {
        return intravenousLowerDose;
    }

    public double getIntravenousUpperDose() {
        return intravenousUpperDose;
    }

    public String getIntravenousUnit() {
        return intravenousUnit;
    }

    public Boolean getIntraperitoneal() {
        return intraperitoneal;
    }

    public double getIntraperitonealLowerDose() {
        return intraperitonealLowerDose;
    }

    public double getIntraperitonealUpperDose() {
        return intraperitonealUpperDose;
    }

    public String getIntraperitonealUnit() {
        return intraperitonealUnit;
    }

    public Boolean getIntrarectal() {
        return intrarectal;
    }

    public double getIntrarectalLowerDose() {
        return intrarectalLowerDose;
    }

    public double getIntrarectalUpperDose() {
        return intrarectalUpperDose;
    }

    public String getIntrarectalUnit() {
        return intrarectalUnit;
    }

    public Boolean getIntravaginal() {
        return intravaginal;
    }

    public double getIntravaginalLowerDose() {
        return intravaginalLowerDose;
    }

    public double getIntravaginalUpperDose() {
        return intravaginalUpperDose;
    }

    public String getIntravaginalUnit() {
        return intravaginalUnit;
    }

    public Boolean getIntoConjunctivalSac() {
        return intoConjunctivalSac;
    }

    public double getIntoConjunctivalSacLowerDose() {
        return intoConjunctivalSacLowerDose;
    }

    public double getIntoConjunctivalSacUpperDose() {
        return intoConjunctivalSacUpperDose;
    }

    public String getIntoConjunctialSacUnit() {
        return intoConjunctialSacUnit;
    }

    public Boolean getTopical() {
        return topical;
    }

    public double getTopicalLowerDose() {
        return topicalLowerDose;
    }

    public double getTopicalUpperDose() {
        return topicalUpperDose;
    }

    public String getTopicalUnit() {
        return topicalUnit;
    }
}