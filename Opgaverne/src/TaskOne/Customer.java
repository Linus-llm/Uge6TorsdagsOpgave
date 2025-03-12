package TaskOne;

public class Customer { //1.a class customer created
    private String firstName;
    private String lastName;
    private String username;
    private int ID;
    private static int counter;
    public Customer(String firstName,String lastName, String username){
        this.firstName = firstName;
        this.username = username;
        this.lastName = lastName;
        counter += 1;
         ID = counter;
    }
    public String toString(){
       return "first name: " +this.firstName+" | last name: "+this.lastName+" | username: "+this.username+" | ID: "+this.ID+" | counter: "+counter +"\n";
    }
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
}
