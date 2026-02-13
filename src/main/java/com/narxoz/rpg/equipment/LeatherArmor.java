package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {

    private int defense;
    private String armorType;
    private String agility;

    public LeatherArmor() {
        this.defense = 20;
        this.armorType = "Leather Armor";
        this.agility = "increased";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Lightweight armor for flexibility and mobility";
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Agility: " + agility);
        System.out.println("Type: " + armorType);
    }
}
