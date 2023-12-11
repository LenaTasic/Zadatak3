public class Main {

    public static void main(String[] args) {
        DwarfWarrior dw = new DwarfWarrior();

        dw.dead = false;
        dw.health = 25;
        dw.mana = 25;

        dw.show();
        dw.receiveHit();
        dw.show();
        dw.receiveHit();
        dw.show();
        dw.primaryFire();
        dw.show();
        dw.secondaryFire();
        dw.show();
        dw.receiveHit();
        dw.show();



    }
}
