package TaskOne;

public class Customer { //1.a class customer created
    private String firstName; //1.d
    private String lastName; //1.d
    private String username; //1.d
    private int ID; //1.d
    private static int counter; //1.d
    public Customer(String firstName,String lastName, String username){ //1.b Constructor that takes the name and username as parameters
        this.firstName = firstName;
        this.username = username;
        this.lastName = lastName;
        counter += 1; //1.c counter gets increased each time the constructor is called
         ID = counter; //1.c using counter to initialize ID
    }
    public String toString(){ //toString method to print the variables nice and clean
       return "first name: " +this.firstName+" | last name: "+this.lastName+" | username: "+this.username+" | ID: "+this.ID+" | counter: "+counter +"\n";
    }

    //1.d Getters and setters
    public int getID(){
        return this.ID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getUsername(){
        return this.username;
    }

    public static int getCounter() {
        return counter;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;

    }
    public void setLastName(String lastName){
        this.lastName = lastName;

    }
    public void setUsername(String username){
        this.username = username;
    }
}
