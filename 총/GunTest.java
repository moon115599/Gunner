package 총;

public class GunTest {
    public static void main(String[] args) {
        Gunner child = new Gunner("문", 13);
        Gunner gunner1 = new Gunner("문", 23);
        Gunner gunner2 = new Gunner("김", 29);

        child.shoot(4);
        gunner1.shoot(3);
        gunner2.shoot(9);
        gunner2.refillBullet(11);

    }
}
