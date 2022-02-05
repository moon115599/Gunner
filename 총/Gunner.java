package 총;

public class Gunner {
    private static final int maxBullet = 10;
    private String name;
    private int age;
    private static int bulletNum =10;
    private int shot;

    public Gunner(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void shoot(int shot){
        if (this.age>=20){
            while( shot != 0){
                if (bulletNum==0) {
                    System.out.println("총알이 "+ (shot - bulletNum) +"개 부족합니다. 충전해주세요.");
                    break;
                }
                System.out.println("땅!");
                bulletNum--;
                shot--;
            }
        }
        else{
            System.out.println("미성년자는 시격이 불가능합니다.");
        }


 /*    if (bulletNum < shot){
            for (int i = bulletNum; i>0 ; i--) System.out.println("땅!");
            System.out.println("총알이 "+ (shot - bulletNum) +"개 부족합니다. 충전해주세요.");
            bulletNum = 0;
        }
        else{
            for (int i=shot; i>0 ; i--) System.out.println("땅!");
            bulletNum -= shot;
        }
*/
        System.out.println("현재 남은 총알은 "+bulletNum+"개 입니다.");
        System.out.println("-----------------");
    }

    public void refillBullet(int shot){
        System.out.println(shot+"개의 총알을 충전하겠습니다.");
        while( shot != 0){
            if (bulletNum == maxBullet) {
                System.out.println("탄창이 가득 찼습니다. "+ shot +"개의 총알이 남습니다.");
                break;
            }
            bulletNum++;
            shot--;
        }

        System.out.println("현재 남은 총알은 "+bulletNum+"개 입니다.");
        System.out.println("-----------------");
    }
}
