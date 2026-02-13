package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {

    private int damage;
    private String weaponType;

    public IronSword() {
        this.damage = 25;
        this.weaponType = "Sword";
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
    }
}
