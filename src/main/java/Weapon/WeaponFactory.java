package Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WeaponFactory {
    public WeaponFactory(){
        addToList();
    }

    private List<WeaponBehaviour> listWeapons = new ArrayList<>();

    public WeaponBehaviour randomWeapon(){
        Random weapon = new Random();
        int weaponRandom = weapon.nextInt((listWeapons.size() - 1) + 1);
        return listWeapons.get(weaponRandom);
    }

    private void addToList(){
        listWeapons.add(new Sword());
        listWeapons.add(new GandalfsStaffs());
        listWeapons.add(new TheRingOfPower());
        listWeapons.add(new BowOfTheGaladhrim());
    }

}
