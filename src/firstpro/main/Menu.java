package firstpro.main;
public class Menu {

    private String menuName; //�޴��� �̸�
    private long price; //�޴��� ����
    private String description; //�޴��� ����



    public Menu(String menuName, long price, String description) {
        this.menuName = menuName;
        this.price = price;
        this.description = description;
    }

    public String getMenuName() {
        return menuName;
    }


    public long getPrice() {
        return price;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "�޴� �̸�: "+menuName+"\n" +
                "����: "+price+"\n"+
                "����: "+description;
    }
}
