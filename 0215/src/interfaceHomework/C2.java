package interfaceHomework;


public class C2 implements Skin{

    private String name = "제리";
    private boolean skin1 = false;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        if (skin1==true){
            System.out.println("이미 스킨을 착용 중입니다.");
        }
        else{
            System.out.println("전투사관학교 제리 스킨을 착용했습니다.");
        }
    }

    @Override
    public void off() {
        if (skin1==true){
            System.out.println("전투사관학교 제리 스킨 착용을 해제했습니다.");
        }
        else{
            System.out.println("전투사관학교 제리 스킨을 착용 중이지 않습니다.");
        }
    }
}
