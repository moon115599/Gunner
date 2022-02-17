package interfaceHomework;

public class C1 implements Skin{

    private String name = "가렌" ;
    private boolean skin1 = false;
    private boolean skin2 = false;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        if (skin1==true || skin2==true){
            System.out.println("이미 스킨을 착용 중입니다.");
        }
        else{
            System.out.println("전투사관학교 가렌 스킨을 착용했습니다.");
            skin1 = true;
        }
    }

    public void on2() {
        if (skin1==true || skin2==true){
            System.out.println("이미 스킨을 착용 중입니다.");

        }
        else{
            System.out.println("데마시아 강력반 가렌 스킨을 착용했습니다.");
            skin2 = true;
        }
    }

    @Override
    public void off() {
        if (skin1==true){
            System.out.println("전투사관학교 가렌 스킨 착용을 해제했습니다.");
            skin1 = false;
        }
        else{
            System.out.println("전투사관학교 가렌 스킨을 착용 중이지 않습니다.");
        }
    }

    public void off2() {
        if (skin2==true){
            System.out.println("데마시아 강력반 가렌 스킨 착용을 해제했습니다.");
            skin2 = false;
        }
        else{
            System.out.println("데마시아 강력반 가렌 스킨을 착용 중이지 않습니다.");
        }
    }
}
