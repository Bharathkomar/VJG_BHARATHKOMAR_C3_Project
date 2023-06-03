import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();
  //  List<Item> selectedItems = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
        Restaurant restauranttobefound=null;
        for(Restaurant restaurant: restaurants) {
            if(restaurant.getName().equals(restaurantName))
                return restaurant;
        }
        throw new restaurantNotFoundException("Restaurant not found");//DELETE ABOVE STATEMENT AND WRITE CODE HERE
    }
/*public List<Item> selectItems(String itemName1, String itemName2)
{ findItemByName(itemName1);
    for(Item item: selectedItems )
    {if(item.getName()==itemName1)
        selectedItems.add(item);
    }
    for(Item item:selectedItems)
    {
        System.out.println(item.getName());
    }

    return selectedItems;
}*/
public int calculateOrderValue(List<Item> list1)
{int orderValue=0;
 List<Item> orderedList  =new ArrayList<>(list1);
 for(Item item:orderedList)
 {
     orderValue=orderValue+item.getPrice();
 }
 return orderValue;
}


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        if(restaurantToBeRemoved.getName()!=restaurantName)
        throw new restaurantNotFoundException("Restaurant Not found");
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
