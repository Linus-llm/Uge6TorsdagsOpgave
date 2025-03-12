package TaskThree;

import java.util.ArrayList;

public class Building { //3.d creating class building
    private ArrayList<Room> rooms = new ArrayList<>(); //creating rooms as an ArrayList and private
    private int numberOfFloors; //creating numberOfFloors as an int and private
    public Building(ArrayList<Room> list, int input){ //3.e creating constructor that populates all fields
        rooms = list;
        numberOfFloors = input;
    }
//3.f creating getters and setters for rooms and floors
    public ArrayList<Room> getRooms(){

        return rooms;
    }
    public void setRooms(ArrayList<Room> list){
        rooms = list;
    }
    public int getNumberOfFloors(){
        return numberOfFloors;
    }
    public void setNumberOfFloors(int input){
        numberOfFloors = input;
    }
}
