package interfaceHomework;

public class Player {
    private String name;
    private String ID;

    public Player(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    public void chooseChampion(Skin skin){
        System.out.println("이 챔피언의 이름은 "+skin.getName()+"입니다.");
    }


}
