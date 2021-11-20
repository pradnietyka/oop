//public class Car {
//
//    private int speed = 0;
//    private int gear;
//    private String name;
//    private boolean lights;
//
//    public Car(int speed, int gear, String name, boolean lights);{
//        this.speed = speed;
//        this.gear = gear;
//        this.name = name;
//        this.lights = lights;
//    }
//
//
//
//    public void startEngine() {
//        System.out.println("Silnik działa");
//    }
//        public void stopEngine(){
//            System.out.println("Silnik zgasł");
//        }
//
//        public void accelerate (int accelerate){
//        this.speed += accelerate;
//        System.out.println("Samochód jedzie z prędkością "+speed +" km/h");
//        }
//        public void slowDown(int speed){
//        this.speed -= speed;
//        System.out.println("Samochód zwalnia do prędkości "+this.speed +" km/h");
//        }
//        public void setGear(int gear) {
//            if (gear < 7 && gear > 0) {
//                this.gear = gear;
//                System.out.println("Jesteś na biegu " + this.gear);
//            }
//        }
//        public void setLights(boolean lights) {
//            this.lights = lights;
//            }
//        public boolean getLights(){
//            return lights;
//
//            }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public int getGear() {
//        return gear;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public boolean isLights() {
//        return lights;
//    }
//}

public class Car {

    private int speed = 0;
    private int gear;
    private String model;
    private boolean lights;

    public Car(int speed, int gear, String model, boolean lights){
        this.speed = speed;
        this.gear = gear;
        this.model = model;
        this.lights = lights;
    }

    public Car(){
    }
//    public Car(int speed, int gear, String model){
//        this.speed = speed;
//        this.gear = gear;
//        this.model = model;
//    }
//    public void startEngine() {
//        System.out.println("silnik dziala");
//    }
//    public void stopEngine(){
//        System.out.println("silnik zgasl");
//    }
//    public void accelerate(int acceleration){
//        this.speed += acceleration;
//        System.out.println("samochod jedzie z predkoscia " + speed+ "km/h");
//    }
//    public void slowDown(int speed){
//        this.speed -= speed;
//        System.out.println("samochod zwalnia do predkosci " + this.speed + "km/h");
//    }
//    public void setGear(int gear){
//        if(gear < 7 && gear > 0){
//            this.gear = gear;
//            System.out.println("jestes na biegu " + this.gear);
//        }
//    }
//    public void setLights(boolean lights){
//        this.lights = lights;
//    }
//    public boolean getLights(){
//        return lights;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public int getGear() {
//        return gear;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public boolean isLights() {
//        return lights;
//    }
}
