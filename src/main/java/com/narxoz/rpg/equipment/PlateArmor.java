package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense;
    private String armorType;

    public PlateArmor() {
        this.defense = 30;
        this.armorType = "Plate Armor";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Heavy protective plating forged from steel";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
    }
}
