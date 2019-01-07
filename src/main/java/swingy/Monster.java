package swingy;

public class Monster {
    private int hp;
    private int fullHp;
    private int damage;
    private int lvl;

    public Monster(int hp, int damage, int lvl) {
        this.hp = hp;
        this.fullHp = hp;
        this.damage = damage;
        this.lvl = lvl;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getXp(){
        return ((this.lvl * 100) + (this.fullHp / 10) + (this.damage / 10));
    }
}
