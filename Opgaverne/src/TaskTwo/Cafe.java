package TaskTwo;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe { //2.c created class Cafe
    private ArrayList<String> coffeeMenu = new ArrayList<>(); //2.c created ArrayList

    public ArrayList<String> getCoffeeMenu(){//2.c getter that returns the ArrayList
        for(String i:coffeeMenu){
            System.out.println(i);
        }
        return coffeeMenu;
    }
    public void loadMenuData(){ //2.c method to create new file object to load data
        File file = new File("coffees.txt");
        try{
            Scanner sc = new Scanner(file); //2.d reading from the new object file
            while(sc.hasNextLine()){ //2.e using the hasNextLine() to iterate through the whole txt file
                coffeeMenu.add(sc.nextLine());//2.e the string lines to the coffeeMenu arraylist
            }
        } catch(java.io.FileNotFoundException FNFE){
            System.out.println("Error");
        }

    }

}

