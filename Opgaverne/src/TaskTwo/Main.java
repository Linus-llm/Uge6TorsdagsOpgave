package TaskTwo;

public class Main {
    public static void main(String[] args) { //2.b creating main method
    Cafe myCafe = new Cafe(); //2.g creating instance of cafe class
    myCafe.loadMenuData(); //2.g using the instance to load the menu data from the method
    myCafe.getCoffeeMenu(); //2.h printing the strings in the arraylist using the instance and method
    }
}
