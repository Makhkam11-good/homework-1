package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.CharacterFactory;
import com.narxoz.rpg.factory.WarriorFactory;
import com.narxoz.rpg.factory.MageFactory;
import com.narxoz.rpg.factory.ArcherFactory;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.MedievalEquipmentFactory;
import com.narxoz.rpg.factory.MagicEquipmentFactory;
import com.narxoz.rpg.factory.RangerEquipmentFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character & Equipment System ===\n");

        createAndEquipCharacter(
            new WarriorFactory(),
            new MedievalEquipmentFactory(),
            "Aragorn"
        );

        System.out.println("\n---\n");

        createAndEquipCharacter(
            new MageFactory(),
            new MagicEquipmentFactory(),
            "Merlin"
        );

        System.out.println("\n---\n");

        createAndEquipCharacter(
            new ArcherFactory(),
            new RangerEquipmentFactory(),
            "Legolas"
        );

        System.out.println("\n=== Demo Complete ===");
    }

    private static void createAndEquipCharacter(
        CharacterFactory charFactory,
        EquipmentFactory equipFactory,
        String name
    ) {
        Character character = charFactory.createCharacter(name);

        character.displayStats();
        character.useSpecialAbility();

        character.equipWeapon(equipFactory.createWeapon());
        character.equipArmor(equipFactory.createArmor());

        System.out.println("\nEquipment:");
        character.displayEquipment();
    }
}
