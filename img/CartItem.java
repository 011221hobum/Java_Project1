public class CartItem {
    //��ٱ��� �׸� Ŭ����
    private Menu menu; //��ٱ��Ͽ� �� �޴�
    private int quantity; //����

    public CartItem(Menu menu, int quantity) {
        this.menu = menu;
        this.quantity = quantity;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getQuantity() {
        return quantity;
    }
    double getTotalPrice(){
       return menu.getPrice()*quantity;
    }

    @Override
    public String toString() {
        return
                "�޴�: " + menu +"\n"+
                "����: " + quantity;

    }
}
