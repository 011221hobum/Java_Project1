import java.util.ArrayList;
import java.util.List;

public class Category {
    private  String name; //ī�װ� �̸�
    private  List<Restaurant> restaurantList; //������ ����Ʈ

    public  Category(String name) {
        this.name = name;
        this.restaurantList = new ArrayList<>();

    }
     void addRestaurant(Restaurant restaurant){
        restaurantList.add(restaurant);
    }

    public String getName() {
        return name;
    }


    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
}
