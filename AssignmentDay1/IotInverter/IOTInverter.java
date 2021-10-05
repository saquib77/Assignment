
// company have PCU, GTI, Zelio, Regalia, iCruze Inverters,
// All Inverters have Power rating which is determined by ( Current * Operating Voltage )

// Only PCU, GTI and Regalia are solar Inverters other are not (solar inverters get charge by solar panels and solar energy),

// Solar Inverters have Solar Panels also

// Solar Inverters further have two option one Battery version that whatever energy is produced will be stored in battery other will not store any energy,

// so PCU comes with battery but GTI have no battery,

// Solar Inverter also have GRID On , system where you can sell your extra energy back, GTI is GRID On where as this feature is not available in PCU,

// Non Solar Inverters are Simple Home Inverters Which have a Battery,



//Inverter(String model, String type, double operatingVol, double current)
abstract class Inverter{
    private String model;                   // PCU, GTI, Zelio, Regalia, iCruze Inverters
    private String type;                    // solar Inv and Non-solar Inv
    private double operatingVol;             // Inv Operating Volt 
    private double current;                 // current power of inverter
    private double price;

    protected Inverter(String model, String type, double operatingVol, double current,double price) {
        this.model = model;
        this.type = type;
        this.operatingVol = operatingVol;
        this.current = current;
        this.price = price;
    }
    public abstract void getDetails();

    //Getter
    
    public double getPower(){
        return (current*operatingVol);
    }
    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getOperatingVol() {
        return this.operatingVol;
    }
    public void setOperatingVol(double operatingVol) {
        this.operatingVol = operatingVol;
    }
    public double getCurrent() {
        return this.current;
    }
    public void setCurrent(double current) {
        this.current = current;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}

//Solar Panel Class
// SolarPanel(String model,String type,double power,double size)
// Getters : getModel(), getType(), getPower(), getSize(), getDeatils()
class SolarPanel{
    private String model;
    private String type;
    private double power;
    private double size;

    public SolarPanel(String model,String type,double power,double size){
        this.model = model;
        this.type = type;
        this.power = power;
        this.size = size;
    }

    //Getters
    public String getModel() {
        return model;
    }
    public String getType() {
        return type;
    }
    public double getPower() {
        return power;
    }
    public double getSize() {
        return size;
    }
    public void getDetails(){
        System.out.println("Model : " + model + "\nType : " + type + "\nPower : " + power + "\nSize : " + size);
    }
    
}



//Battery Class
// Battery(String model, double maxCap, double currCap, String size)
// Getters : getModel(), getMaxCap(), getCurrCap(), getSize(), getDeatils()
class Battery{
    private String model;
    private double maxCap;
    private double currCap;
    private String size;
    public Battery(String model, double maxCap, double currCap, String size) {
        this.model = model;
        this.maxCap = maxCap;
        this.currCap = currCap;
        this.size = size;
    }
    public String getModel() {
        return model;
    }
    public double getMaxCap() {
        return maxCap;
    }
    public double getCurrCap() {
        return currCap;
    }
    public String getSize() {
        return size;
    }
    public void getDeatils(){
        System.out.println("Model : " + model + "\nMax Cap : " + maxCap+ "\nCurrent Cap : " + currCap + "\nSize : " + size);
    }
    
}

//SolarInverter Class
// SolarInverter(String model,String type,double operatingVol,double current,SolarPanel solarPanel,String gridOn)
//Getters 
abstract class SolarInverter extends Inverter{
    private SolarPanel solarPanel;
    private boolean gridOn;

    protected SolarInverter(String model, double operatingVol, double current, double price, SolarPanel solarPanel, boolean gridOn) {
        super(model,"Solar", operatingVol, current, price);
        this.solarPanel = solarPanel;
        this.gridOn = gridOn;
    }

    protected SolarPanel getSolarPanel() {
        return this.solarPanel;
    }
    public boolean getGrid() {
        return this.gridOn;
    }

    protected void setSolarPanel(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }
    protected void setGrid(boolean gridOn) {
        this.gridOn = gridOn;
    }

}



//SimpleHome Inverter
//SimpleHomeInverter(String model, String type, double operatingVol, double current, Battery bat)
abstract class SimpleHomeInverter extends Inverter{
    private Battery battery;

    protected SimpleHomeInverter(String model, double operatingVol, double current, double price, Battery battery) {
        super(model, "Electric" , operatingVol, current, price);
        this.battery = battery;
    }

    protected Battery getBat() {
        return this.battery;
    }

    protected void setBat(Battery battery) {
        this.battery = battery;
    }
    public void getBatteryDetails(){
        this.battery.getDeatils();
    }
}


class Pcu extends SolarInverter{
    private Battery battery;

    public Pcu(String model, double operatingVol, double current, double price, SolarPanel solarPanel,Battery battery) {
        super(model, operatingVol, current, price, solarPanel, false);
        this.battery = battery;
    }

    public Battery getBattery(){ 
        return this.battery; 
    } 
       
    public void setBattery(Battery battery){ 
        this.battery = battery; 
    }    

    public void getBatteryDetails(){
        this.battery.getDeatils();
    }

    @Override
    public void getDetails() {
        System.out.println("Inverter Type : "+super.getType());
        System.out.println("Model : "+super.getModel());
        System.out.println("Price : "+super.getPrice());
        System.out.println("Solar Panel included : Yes");
        System.out.println("Battery Included : Yes");
        System.out.println("Grid System : Off");
        System.out.println("Power Rating : "+super.getPower());
    }
}


class Gti extends SolarInverter{

    public Gti(String model, double operatingVol, double current, double price, SolarPanel solarPanel) {
        super(model, operatingVol, current, price, solarPanel, true);
    }

    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOperatingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Solar Panel Included: Yes");
        System.out.println("Battery Included : No"); 
        System.out.println("Grid System : On");
        System.out.println("Inverter Power : "+ super.getPower());
    }
}

class Regalia extends SolarInverter{

    

    public Regalia(String model, double operatingVol, double current, double price, SolarPanel solarPanel,boolean gridOn) {
        super(model, operatingVol, current, price, solarPanel, gridOn);
    }

    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOperatingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Battery Included : No");
        System.out.println("Solar Panel Included : Yes");
        System.out.println("Grid System : Off");
        System.out.println("Inverter Power : "+ super.getPower());
    }
    
}

class Zelio extends SimpleHomeInverter{

    
    public Zelio(String model, double operatingVol, double current, double price, Battery battery) {
        super(model, operatingVol, current, price, battery);
    }

    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOperatingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Battery Included : Yes");
        System.out.println("Inverter Power : "+ super.getPower());
    }
}


class Icruze extends SimpleHomeInverter{

    
    
    public Icruze(String model, double operatingVol, double current, double price, Battery battery) {
        super(model, operatingVol, current, price, battery);
    }

    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOperatingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Battery Included : Yes");
        System.out.println("Inverter Power : "+ super.getPower());
    }
}

public class IOTInverter{
    public static void main(String[] args) {
        Battery battery = new Battery("CommercialInv3456", 500, 300, "Medium");
        battery.getDeatils();
        System.out.println();
        SolarPanel solarPanel = new SolarPanel("InverterBattery3456", "silicon", 400, 500);
        solarPanel.getDetails();
        System.out.println();
        Inverter pcu = new Pcu("Inverter637",10,200,5000,solarPanel,battery);
        pcu.getDetails();
        System.out.println();
        Inverter gti = new Gti("Inverter890", 102, 89, 9000, solarPanel);
        gti.getDetails();
        System.out.println();
        SimpleHomeInverter icraze = new Icruze("HomeInverter12309", 12,220,11000, battery);
        icraze.getDetails();
    }
}