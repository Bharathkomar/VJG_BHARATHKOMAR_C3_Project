import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private String location;
    public LocalTime openingTime;
    public LocalTime closingTime;
    private List<Item> menu = new ArrayList<Item>();

    public Restaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        this.name = name;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }
    public boolean isRestaurantOpen()
    {

        if(this.getCurrentTime().isAfter(this.openingTime) && this.getCurrentTime().isBefore(this.closingTime))
        {
            return true;
        }
        return false;

            //DELETE ABOVE STATEMENT AND WRITE CODE HERE

    }

    public LocalTime getCurrentTime(){ return  LocalTime.now(); }

    public List<Item> getMenu() {
        if(menu.isEmpty()==true)
        {
            System.out.println("There are no items to show");
        }

            return menu;
        //DELETE ABOVE RETURN STATEMENT AND WRITE CODE HERE
    }


    private Item findItemByName(String itemName){
        for(Item item: menu) {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public void addToMenu(String name, int price) {
        Item newItem = new Item(name,price);
        menu.add(newItem);
    }
    
    public void removeFromMenu(String itemName) throws itemNotFoundException {

        Item itemToBeRemoved = findItemByName(itemName);
        if (itemToBeRemoved == null)
            throw new itemNotFoundException(itemName);

        menu.remove(itemToBeRemoved);
    }
    public void displayDetails(){
        System.out.println("Restaurant:"+ name + "\n"
                +"Location:"+ location + "\n"
                +"Opening time:"+ openingTime +"\n"
                +"Closing time:"+ closingTime +"\n"
                +"Menu:"+"\n"+getMenu());

    }

    public String getName() {
        return name;
    }
    public ArrayList<Item> selectItems(String itemName1, String itemName2)
{ findItemByName(itemName1);

    ArrayList<Item> selectedItems=new ArrayList<>();
    selectedItems.add(findItemByName(itemName1));
    selectedItems.add(findItemByName(itemName2));
   /* for(Item item: selectedItems )
    {if(item.getName()==itemName1)
        selectedItems.add(item);
    }
    for(Item item:selectedItems)
    {
        System.out.println(item.getName());
    }
*/
    return selectedItems;
}

}
