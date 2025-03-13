package TaskThree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //3.g creating three instances of Room
       Room myRoom1 = new Room(3,8);
       Room myRoom2 = new Room(4,6);
       Room myRoom3 = new Room(10,20);
       ArrayList<Room> rooms = new ArrayList<>();
       //3.h adding the rooms to a collection I used ArrayList
       rooms.add(myRoom1);
       rooms.add(myRoom2);
       rooms.add(myRoom3);
       Building myBuilding1 = new Building(rooms,4);//3.i instantiating a new building object with my rooms arrayList
       int finalResultLamps = countLampsInBuilding(myBuilding1);
       int finalResultWindows = countWindowsInBuilding(myBuilding1);
       int finalResultRooms = countRoomsInBuilding(myBuilding1);
       boolean resultOfNormal = isNormal(myBuilding1);

        System.out.println("Number of lamps: "+finalResultLamps+" number of windows: "+finalResultWindows+" number of rooms: "+finalResultRooms+" is the building normal?: "+isNormal(myBuilding1));
    }
    //3.j
    public static int countLampsInBuilding(Building x){
        int numberOfLampsResult=0;
                for(Room i:x.getRooms()){
                    numberOfLampsResult+=i.getNumberOfLamps();
                }

        return numberOfLampsResult*x.getNumberOfFloors();
    }
    //3.j
    public static int countWindowsInBuilding(Building x){
        int numberOfWindowsResult = 0;
            for(Room i:x.getRooms()){
                numberOfWindowsResult+=i.getNumberOfWindows();
            }
            return numberOfWindowsResult*x.getNumberOfFloors();
    }
    //3.j
    public static int countRoomsInBuilding(Building x){
        int numberOfRoomsResult = 0;
            for(Room i:x.getRooms()){
                numberOfRoomsResult+=1;
            }
            return numberOfRoomsResult;

    }//3.k
    public static boolean isNormal(Building x){
        return x.getNumberOfFloors() <= countRoomsInBuilding(x);
    }
}
