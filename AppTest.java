import java.util.ArrayList;

public class AppTest {

  public Integer getStreakGoal( int numWeeks) {
    
    int sum = 0;
    for (int i = 0; i < numWeeks; i++) {
      sum += i;
    }
    return sum;
  }

  public Double getOrderTotal(double[] lineItems) {

    double arr[] = lineItems;
    double sum = 0;
    for (int i = 0; i < lineItems.length; i++) {
      sum += arr[i];
    }
    return sum;
  }
  
  public void displayMenu(ArrayList<String> menuItems) {
    // loop throug the array and print each index number and value of that index
    for(int i = 0; i < menuItems.size(); i++){
      String name = menuItems.get(i);
      System.out.println(i + " " + name);
    }
    
  }
  
  public void addCustomer(ArrayList<String> customers){
    System.out.println("Please enter your name");
    String userName = System.console().readLine();
    System.out.println("Hello," + userName);

  }
}


