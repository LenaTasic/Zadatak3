public class DwarfWarrior extends BaseHero{
    @Override
    public void receiveHit() {
        this.health -= 10;
        this.dead = this.health <=0;
    }

    @Override
    public void primaryFire() {
        this.mana -= 5;
        System.out.println("Firing primary !");
    }

    @Override
    public void secondaryFire() {
        this.mana -= 10;
        System.out.println("Firing secondary !!");
    }
    public void show(){
        System.out.println("Health: "+this.health);
        System.out.println("Mana: "+this.mana);
        System.out.println("Dead: "+this.dead);
    }
}
