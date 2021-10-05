
// 1: MP - is a person who won from a constituency

// 2: MP spending limit is only 50000 rupees

// 2: Constituency is a place with a name and area of sq KM

// 3: Minister is MP, but minister have spending limit of 70,000

// 4: Minister also have a car , and a driver is also assigned to him

// 5: Driver assigned to Minister is a person who can drive car

// 6: PM is Minister, but PM have spending limit of 170,000

// 7: PM can have minimum one and maximum 5 cars

import java.util.*;


// Person Name 
abstract class Person{
    private String name;

    protected Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }


    public abstract void getDetails(); 
}


//Member of Parliament
class MP extends Person{
    private int spendingLimit;
    protected MP(String name) {
        super(name);
        this.spendingLimit = 50000;
    }
    public int getSpendingLimit() {
        return spendingLimit;
    }
    @Override
    public void getDetails() {
        System.out.println("MP Name :"+ super.getName());
        System.out.println("Spending Limit :" + this.spendingLimit);
    }
}


// Car class
class Car{
    private String carName;
    private String carColor;
    public Car(String carName, String carColor) {
        this.carName = carName;
        this.carColor = carColor;
    }
    public String getCarName() {
        return this.carName;
    }
    public String getCarColor() {
        return this.carColor;
    }
    public void getDetails(){
        System.out.println("Car name : "+ carName + "\nCar Color : "+ carColor);
    }
}


//Driver Class
class Driver extends Person{
    protected Driver(String name) {
        super(name);
    }
    @Override
    public void getDetails() {
        System.out.println("Driver Name :" + super.getName());
    }
}

//CarDriver Details
class CarDriver extends Driver{
    private int yearOfExperience;
    
    protected CarDriver(String name, int yearOfExperience) {
        super(name);
        this.yearOfExperience = yearOfExperience;
    }

    public int getYearOfExperience() {
        return this.yearOfExperience;
    }

    protected void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public void getDetails() {
        System.out.println("Car Driver Name : "+ super.getName());
        System.out.println("Experience : " + this.yearOfExperience);
    }
}

//Constituency Class
class Constituency{
    private String name;
    private int areaInkm;
    private MP mp;
    protected Constituency(String name, int areaInkm, MP mp) {
        this.name = name;
        this.areaInkm = areaInkm;
        this.mp = mp;
    }
    public void getDetails(){
        System.out.println("Constituency Name : " + name + "\nArea(KM) : "+ areaInkm);
        mp.getDetails();
    }
}


// Minister Class
class Minister extends MP{
    private Car car;
    private CarDriver cDriver;
    private int spendingLimit;
    protected Minister(String name, Car car, CarDriver cDriver) {
        super(name);
        this.car = car;
        this.cDriver = cDriver;
        this.spendingLimit = 70000;
    }
    @Override
    public void getDetails() {
        System.out.println("Minister name : " + super.getName());
        System.out.println("Spending Limit : "+ this.spendingLimit);
        this.car.getDetails();
        this.cDriver.getDetails();
    }
    
}


//Prime Minister Class
class PM extends Minister{
    private List<Car> cars = new ArrayList<>(5);
    private Car car;
    private CarDriver cDriver;
    private int spendingLimit;
    public PM(String name, Car car, CarDriver cDriver, List<Car> cars) {
        super(name, car, cDriver);
        this.cars = cars;
        this.car = car;
        this.cDriver = cDriver;
        this.spendingLimit = 170000;
    }
    public void getAllCars(){
        for(Car c : cars){
            c.getDetails();
            System.out.println();
        }
    }
    @Override
    public void getDetails() {
        System.out.println("PM Name : " + super.getName());
        System.out.println("Spending Limit :" + this.spendingLimit);
        this.car.getDetails();
        this.cDriver.getDetails();
        System.out.println();
        this.getAllCars();
    }
}


//Main Class
public class IndianPolitics{
    public static void main(String[] args) {
        System.out.println("\n");
        Constituency con = new Constituency("Delhi", 500, new MP("Kejriwal"));
        con.getDetails();
        System.out.println();

        Minister mn = new Minister("Arvind", new Car("Scorpio", "Black"), new CarDriver("Ram",3));
        mn.getDetails();
        System.out.println();

        List<Car> allcar = new ArrayList<>();
        allcar.add(new Car("Merc Benz", "Black"));
        allcar.add( new Car("BMWx7", "White"));
        allcar.add(new Car("RRDark","Mate Black"));
        PM pm = new PM("Modi", new Car("Merc Benz", "Black"), new CarDriver("Shayam",4), allcar);
        pm.getDetails();
    }
}