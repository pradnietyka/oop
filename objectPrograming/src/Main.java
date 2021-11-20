//public class Main {
//    public static void main(String[] args) {
//
//        Car audi = new Car(100, 2, "A6",true);
//        audi.startEngine();
//        audi.setLights(true);
//        System.out.println(audi.getLights());
//        audi.setGear(1);
//        audi.accelerate(20)  ;
//        audi.accelerate(20);
//        audi.slowDown(10);
//        audi.stopEngine();
//
//    }
//}

public class Main {
    public static void main(String[] args) {

        Mazda V5 = new Mazda(2020, "6", true, 500,"Leather");
        V5.startEngine();

        Vehicle vehicle = new Vehicle(2003, "A6", true, 340000);
        vehicle.startEngine();

        Golf GTI = new Golf(2006,"5",true,150000,Drive.AWD);
        GTI.startEngine();

    }
}
//
//        Car audi = new Car(0, 1, "a3", true);
//
//        audi.startEngine();
//        audi.setLights(true);
//        System.out.println(audi.getLights());
//        audi.setGear(1);
//        audi.accelerate(20);
//        audi.accelerate(20);
//        audi.slowDown(10);
//        audi.stopEngine();
//
//        System.out.println("zmiana samochodu");
//
//        Car bmw = new Car(30, 3, "e36", false);
//        bmw.startEngine();
//        bmw.setLights(true);
//        System.out.println(bmw.getLights());
//        bmw.setGear(3);
//        bmw.accelerate(20);
//        bmw.accelerate(20);
//        bmw.slowDown(10);
//        bmw.stopEngine();
//
//        Car opel = new Car();
//        opel.startEngine();
//
//        Car volvo = new Car(10, 1, "jakis");
//        System.out.println(volvo.getModel());
//
//    }

