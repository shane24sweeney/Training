import java.util.ArrayList;

public class GroceryList {


    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }

    public void printGroceryList()
    {
        System.out.println("You have "+groceryList.size()+"in your cart");
        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println(i+1 +","+groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newitem)
    {
        groceryList.set(position,newitem);
        System.out.println("grocery item" +position+1+ " has been modified");
    }

    public void removeGroceryItem(int position)
    {
        String theitem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem)
    {
      //  boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if(position >= 0)
        {
            return groceryList.get(position);
        }
        return null;
    }
}
