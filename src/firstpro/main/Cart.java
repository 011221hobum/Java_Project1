package firstpro.main;
import java.util.ArrayList;
import java.util.List;


public class Cart {

    //��ٱ��� Ŭ����
    private List<CartItem> cartItems;

    public Cart() {
        this.cartItems = new ArrayList<>();

    }
    //��ٱ��Ͽ� �޴� �߰�
    void addItems(Menu menu, int quantity){
        cartItems.add(new CartItem(menu,quantity));
    }
    //��ٱ����� �޴� �ջ�
    double getTotalPrice(){
        double total = 0;
        for(CartItem item : cartItems){
            total += item.getTotalPrice();
        }
        return total;
    }
    void showAllCart(){
        if(cartItems.isEmpty()){
            System.out.println("��ٱ��ϰ� ����ֽ��ϴ�."); //���� ����ִ� �������� ����
        }else {
            for(CartItem item:cartItems){
                System.out.println(item); //���� ��ٱ��� �������� ���� ����
            }
        }
    }
    void clearCart(){
        cartItems.clear();
    }


}
