public class ElfMage extends BaseHero{
    public ElfMage(double mana, double health, boolean dead){
        this.mana = mana;
        this.health = health;
        this.dead = dead;
    }
    @Override
    public void receiveHit() {
        this.health -= 30;
        this.dead = this.health <=0;
    }

    @Override
    public void primaryFire() {
        this.mana -= 15;
        System.out.println("Firing primary !");
    }

    @Override
    public void secondaryFire() {
        this.mana -= 50;
        System.out.println("Firing secondary !!");
    }
}
