package TaskThree;

public class Room { //3.a creating class
    private int numberOfLamps; //creating variable
    private int numberOfWindows; //creating variable
    public Room(int numberOfLamps, int numberOfWindows){ //3.b creating constructor that assign values to all the fields
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }
    //3.c creating getter and setter methods for lamps and windows
    public int getNumberOfLamps(){
        return numberOfLamps;
    }
    public int getNumberOfWindows(){
        return numberOfWindows;
    }
    public void setNumberOfLamps(int numberOfLamps){
        this.numberOfLamps = numberOfLamps;
    }
    public void setNumberOfWindows(int numberOfWindows){
        this.numberOfWindows = numberOfWindows;
    }
}
