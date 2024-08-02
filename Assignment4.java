//outer class
class Vehicle{
    private String Vehiclename;
    private String engine;
    private int cc;
    private String model;

    public Vehicle(String vname, String engn, int cc, String modl){
        Vehiclename = vname;
        engine = engn;
        this.cc = cc;
        model = modl;

    }

    public Vehicle() {
    }

    public String getVehiclename(){
        return Vehiclename;
    }

    public String getEngine(){
        return engine;
    }

    public String getModel(){
        return model;
    }

    public int getCc(){
        return cc;
    }

    public void setProperties(){
        System.out.println("Vehicle name : "+ Vehiclename);
        System.out.println("Engine: "+ engine);
        System.out.println("CC: "+cc);
        System.out.println("Model: "+ model);
    }

    //this is an static inner class named as Owner
    static class Owner{
        private String ownername;
        private long cnic;
        private long phonenumber;

        public Owner(String ownername, long cnic, long phonenumber){
            this.ownername = ownername;
            this.cnic = cnic;
            this.phonenumber = phonenumber;

        }
        public String getOwnername(){
            return ownername;
        }

        public long getCnic(){
            return cnic;
        }

        public long getPhonenumber(){
            return phonenumber;
        }

        public void setMethod(){
            System.out.println("The Owner name is " + ownername);
            System.out.println("The cnic number the owner is "+ cnic);
            System.out.println("The phone number of the owner is "+ phonenumber);
        }
    }

    //non static nested class 
    class Nestedclass{
        //overriding owner class set method
        public void setMethod(){
            System.out.println("This is a nested class");
        }
    }

}

//This is an ineterface for making anonymous class
interface Anonymclass{
        public void display();
            
} 
//making a class to pass anonymous inner class as a method argument
class Myclass{
    public void myMethod(Anonymclass argument){
        argument.display();
    }
}

public class Assignment4{

    public static void main(String[] args) {
        
        Vehicle obj5 = new Vehicle("Toyota", "IC", 2000, "2023");
        obj5.setProperties();

        //calling inner static class 
        Vehicle.Owner obj1 = new Vehicle.Owner("myName", 4430312345679L, 0336121314);
            obj1.setMethod();

        //calling non static nested class
        Vehicle.Nestedclass obj4 = new Vehicle().new Nestedclass();
        obj4.setMethod();

        //anonymous inner class
        Anonymclass obj = new Anonymclass(){
            @Override
            public void display(){
                System.out.println("This is the display method of anonymouos inner class");
            }
        };
        //calling the overriden method
        obj.display();

        Myclass obj3 = new Myclass();
        //passing anonymous inner class as argument
        obj3.myMethod(new Anonymclass() {
            public void display(){
                System.out.println("In this method I have Passed an anonymous inner class as a method argument");
            }
        });        

    }
}