
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

    protected Inverter(String model, String type, double operatingVol, double current) {
        this.model = model;
        this.type = type;
        this.operatingVol = operatingVol;
        this.current = current;
    }
    public abstract void getDetails();

    //Getter
    public String getModel() {
        return this.model;
    }
    public String getType() {
        return this.type;
    }
    
    public double getOpratingVol() {
        return this.operatingVol;
    }
    
    public double getCurrent() {
        return this.current;
    }
    public double getPower(){
        return (current*operatingVol);
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
    private String gridOn;

    protected SolarInverter(String model,String type,double operatingVol,double current,SolarPanel solarPanel,String gridOn){
        super(model, type, operatingVol, current);
        this.solarPanel = solarPanel;
        this.gridOn = gridOn;
    }

    protected SolarPanel getSolarPanel() {
        return this.solarPanel;
    }

    public String getGridOn() {
        return this.gridOn;
    }
    public void getSolarPanelDetails(){
        this.solarPanel.getDetails();
    }
    
}
//SimpleHome Inverter
//SimpleHomeInverter(String model, String type, double operatingVol, double current, Battery bat)
abstract class SimpleHomeInverter extends Inverter{
    private Battery bat;

    protected SimpleHomeInverter(String model, String type, double operatingVol, double current, Battery bat) {
        super(model, type, operatingVol, current);
        this.bat = bat;
    }

    protected Battery getBattery() {
        return this.bat;
    }
    public void getBatteryDetails(){
        this.bat.getDeatils();
    }
}


class PCU extends SolarInverter{
    private Battery bat;

    public PCU(String model, String type, double operatingVol, double current, SolarPanel solarPanel, String gridOn,
            Battery bat) {
        super(model, type, operatingVol, current, solarPanel, "NO");
        this.bat = bat;
    }

    public Battery getBat() {
        return this.bat;
    }

    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOpratingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Inverter Solar Panel : Included");
        System.out.println("Inverter Grid : "+ super.getGridOn());
        System.out.println("Inverter Power : "+ super.getPower());
    }
}


class GTI extends SolarInverter{

    public GTI(String model, String type, double operatingVol, double current, SolarPanel solarPanel, String gridOn) {
        super(model, type, operatingVol, current, solarPanel, "Yes");
    }
    
    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOpratingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Inverter Solar Panel : Included");
        System.out.println("Inverter Grid : "+ super.getGridOn());
        System.out.println("Inverter Power : "+ super.getPower());
    }
}

class Regalia extends SolarInverter{

    public Regalia(String model, String type, double operatingVol, double current, SolarPanel solarPanel,
            String gridOn) {
        super(model, type, operatingVol, current, solarPanel, "NO");
    }

    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOpratingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Inverter Solar Panel : Included");
        System.out.println("Inverter Grid : "+ super.getGridOn());
        System.out.println("Inverter Power : "+ super.getPower());
    }
    
}

class Zelio extends SimpleHomeInverter{

    public Zelio(String model, String type, double operatingVol, double current, Battery bat) {
        super(model, type, operatingVol, current, bat);
    }
    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOpratingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.println("Inverter Battery :" + super.getBattery());
        System.out.println("Inverter Power : "+ super.getPower());
    }
}


class iCruze extends SimpleHomeInverter{

    public iCruze(String model, String type, double operatingVol, double current, Battery bat) {
        super(model, type, operatingVol, current, bat);
    }
    
    @Override
    public void getDetails() {
        System.out.println("Inverter Model : "+ super.getModel());
        System.out.println("Inverter Type : "+ super.getType());
        System.out.println("Inverter OpVolt : "+ super.getOpratingVol());
        System.out.println("Inverter Current : "+ super.getCurrent());
        System.out.print("Inverter Battery " ); super.getBatteryDetails();
        System.out.println("Inverter Power : "+ super.getPower());
    }
}

public class IOTInverter{
    public static void main(String[] args) {
        Battery bat = new Battery("Battery1234", 500, 300, "Medium");
        bat.getDeatils();
        System.out.println();
        SolarPanel sp = new SolarPanel("Battery3456", "silicon", 400, 500);
        sp.getDetails();
        System.out.println();
        Inverter pcu = new PCU("SolarPan1234", "Silicon", 105, 20, sp, "NO", bat);
        pcu.getDetails();
        System.out.println();
        Inverter gti = new GTI("SolarPan657", "magnesium", 80, 30, sp, "Yes");
        gti.getDetails();
        System.out.println();
        SimpleHomeInverter shi = new iCruze("Icruze916", "Copper", 350, 10, bat);
        shi.getDetails();
    }
}