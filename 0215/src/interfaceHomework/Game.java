package interfaceHomework;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("김","kim123");
        C1 Garen = new C1();
        C2 Jerry = new C2();

        player1.chooseChampion(Garen);
        Garen.on();
        Garen.on2();
        Garen.off2();
        Garen.off();

        player1.chooseChampion(Jerry);
        Jerry.on();
        Jerry.off();
    }
}
