package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {

    private int damage;
    private String weaponType;
    private String range;

    public Longbow() {
        this.damage = 30;
        this.weaponType = "Bow";
        this.range = "long";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranger) - A masterfully crafted bow for precision strikes";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Range: " + range);
        System.out.println("Type: " + weaponType);
    }
}
