package swingy.Items.Weapon;

import swingy.Hero.Hero;

public class Weapon {
    private int damage;
    private int bonusDamage;
    private String name;

    public Weapon(int damage, int bonusDamage) {
        this.damage = damage;
        this.bonusDamage = bonusDamage;
    }

    public void Test(){
        System.out.println(getClass());
    }

    public int getDamage(){
        return this.damage;
    }

    public int getFullDamage(){
        return this.damage + bonusDamage;
    }
}
