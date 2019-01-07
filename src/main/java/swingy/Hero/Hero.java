package swingy.Hero;

import swingy.Items.Armor.Armor;
import swingy.Coordinates;
import swingy.Items.Helm.Helm;
import swingy.Items.Weapon.Weapon;

import java.util.HashMap;

public class Hero {
    private String name;
    private int hp;
    private int damage;
    private int xp;
    private int lvl;
    private Weapon weapon;
    private Armor armor;
    private Helm helm;
    private Coordinates coordinates;
    HashMap<String, String > test;

    Hero(final HeroBuilder heroBuilder) {
        this.name = heroBuilder.getName();
        this.hp = heroBuilder.getHp();
        this.damage = heroBuilder.getDamage();
        this.xp = heroBuilder.getXp();
        this.lvl = heroBuilder.getLvl();
        this.weapon = heroBuilder.getWeapon();
        this.armor = heroBuilder.getArmor();
        this.helm = heroBuilder.getHelm();
        this.coordinates = heroBuilder.getCoordinates();
        test = new HashMap<String, String>();
        test.put("Knight", "Sword");
        test.put("Mage", "Staff");
        test.put("Assasin", "Dagger");
    }

    public int getDamage() {
        if (test.get(getClass().getSimpleName()).equals(weapon.getClass().getSimpleName())){
            return (damage + weapon.getFullDamage());
        }
        return (damage + weapon.getDamage());
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) { this.hp = hp; }

    public void setDamage(int damage) { this.damage = damage; }

    public void setXp(int xp) {
        this.xp += xp;
    }

    public int getXp() {
        return xp;
    }

    public int getLvl() {
        return lvl;
    }

    public static class HeroBuilder{
        private String name;
        private int hp;
        private int damage;
        private int xp;
        private int lvl;
        private Weapon weapon;
        private Armor armor;
        private Helm helm;
        private Coordinates coordinates;

        public HeroBuilder name(final String name){
            this.name = name;
            return this;
        }

        public HeroBuilder hp(final int hp){
            this.hp = hp;
            return this;
        }

        public HeroBuilder damage(final int damage){
            this.damage = damage;
            return this;
        }

        public HeroBuilder xp(final int xp){
            this.xp = xp;
            return this;
        }

        public HeroBuilder lvl(final int lvl){
            this.lvl = lvl;
            return this;
        }

        public HeroBuilder weapon(final Weapon weapon){
            this.weapon = weapon;
            return this;
        }
        public HeroBuilder armor(final Armor armor){
            this.armor = armor;
            return this;
        }
        public HeroBuilder helm(final Helm helm){
            this.helm = helm;
            return this;
        }
        public HeroBuilder coordinates(final Coordinates coordinates){
            this.coordinates = coordinates;
            return this;
        }

        public String getName() {
            return name;
        }

        public int getHp() {
            return hp;
        }

        public int getDamage() {
            return damage;
        }

        public int getXp() {
            return xp;
        }

        public int getLvl() {
            return lvl;
        }

        public Weapon getWeapon() {
            return weapon;
        }

        public Armor getArmor() {
            return armor;
        }

        public Helm getHelm() {
            return helm;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public Hero build(String type){
            HashMap<String, Hero> heroHashMap= new HashMap<String, Hero>();
            heroHashMap.put("Mage", new Mage(this));
            heroHashMap.put("Knight", new Knight(this));
            heroHashMap.put("Assasin", new Assasin(this));
            return heroHashMap.get(type);
        }
    }
}
