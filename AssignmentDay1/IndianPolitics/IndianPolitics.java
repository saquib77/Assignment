
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
interface Person{
    public String getName();
    public abstract void getDetails(); 
}

interface CarColor{
    public void rgb();
}

//Member of Parliament
class Mp implements Person{
    private String name;
    private int spendingLimit;
    protected Mp(String name) {
        this.name = name;
        this.spendingLimit = 50000;
    }
    public String getName() {
        return this.name;
    }
    public int getSpendingLimit() {
        return spendingLimit;
    }
    @Override
    public void getDetails() {
        System.out.println("MP Name :"+ this.name);
        System.out.println("Spending Limit :" + this.spendingLimit);
    }
}

// Car class
class Car implements CarColor{
    private String carName;
    private String carColor;
    private int r;
    private int g;
    private int b;
    
    public Car(String carName, int r, int g, int b) {
        this.carName = carName;
        this.r = r;
        this.g = g;
        this.b = b;
        rgb();
    }
    public void rgb(){
        String res="#";
        res = res + toHex(r) + toHex(g) + toHex(b);
        this.carColor = res;
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


    //RGB(x,x,x) to RGB Hex(#ffffff)
    private String toHex(int num){
        if(num==0) return "0";
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int hexDig = num & 0xF;
            if(hexDig<10) sb.append(hexDig);
            else sb.append((char)('a'+hexDig-10));
            num = num >>> 4;
        }
        return sb.reverse().toString();
    }
}


//Driver Class
class Driver implements Person{
    private String name;
    protected Driver(String name) {
        this.name=name;
    }
    public String getName() {
        return this.name;
    }
    @Override
    public void getDetails() {
        System.out.println("Driver Name :" + this.name);
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
    private Mp mp;
    protected Constituency(String name, int areaInkm, Mp mp) {
        this.name = name;
        this.areaInkm = areaInkm;
        this.mp = mp;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setAreaInkm(int areaInkm) {
        this.areaInkm = areaInkm;
    }
    protected void setMp(Mp mp) {
        this.mp = mp;
    }
    public int getAreaInkm() {
        return this.areaInkm;
    }
    public String getName() {
        return this.name;
    }
    public Mp getMp() {
        return this.mp;
    }
    public void getDetails(){
        System.out.println("Constituency Name : " + name + "\nArea(KM) : "+ areaInkm);
        mp.getDetails();
    }
}


// Minister Class
class Minister extends Mp{
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
class Pm extends Minister{
    private List<Car> cars = new ArrayList<>(5);
    private Car car;
    private CarDriver cDriver;
    private int spendingLimit;
    public Pm(String name, Car car, CarDriver cDriver, List<Car> cars) {
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
        System.out.println("All Cars");
        this.getAllCars();
    }
}


//Main Class
public class IndianPolitics{
    public static void main(String[] args) {
        System.out.println("\n");
        Constituency con = new Constituency("Delhi", 500, new Mp("Kejriwal"));
        con.getDetails();
        System.out.println();

        Minister mn = new Minister("Arvind", new Car("Scorpio",12,34,56), new CarDriver("Ram",3));
        mn.getDetails();
        System.out.println();

        List<Car> allcar = new ArrayList<>();
        allcar.add(new Car("Merc Benz", 34,56,78));
        allcar.add( new Car("BMWx7", 144, 132, 137));
        allcar.add(new Car("RRDark",100,100,100));
        Pm pm = new Pm("Modi", new Car("Merc Benz",100,100,100), new CarDriver("Shayam",4), allcar);
        pm.getDetails();
    }
}