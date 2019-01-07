package swingy;

import swingy.Hero.Hero;
import swingy.Items.Armor.Armor;
import swingy.Items.Helm.Helm;
import swingy.Items.Weapon.Sword;
import swingy.Items.Weapon.Weapon;

public class Main {

    public static void XpGainer(Hero hero, Monster monster){
        System.out.println(monster.getDamage());
        hero.setXp(monster.getXp());
    }

    public static void Fight(Hero hero, Monster monster){
        do {
            hero.setHp(hero.getHp() - monster.getDamage());
            monster.setHp(monster.getHp() - hero.getDamage());
        } while (hero.getHp() > 0 && monster.getHp() > 0);
        if (hero.getHp() > 0){
            XpGainer(hero, monster);
            System.out.println("I'm alive, LET'S FUCKING GO BOIS" + hero.getXp());
        }
    }

    public static void main(String[] args) {
        Weapon sword = new Sword(10, 10);
        Armor guardian = new Armor();
        Helm golova = new Helm();
        Coordinates coordinates = new Coordinates();
        final Hero hero = new Hero.HeroBuilder().name("OlegBalaban").hp(100).
                damage(10).xp(0).lvl(1).weapon(sword).armor(guardian).
                helm(golova).coordinates(coordinates).build("Assasin");
        Monster monster = new Monster(500, 1, hero.getLvl());
        Fight(hero, monster);
        System.out.println(monster.getHp() + " " + hero.getHp());
        System.out.println(hero.getDamage());
    }
}
