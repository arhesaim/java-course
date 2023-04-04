package pr3;

public class TestCode {
    public static void main(String[] args) {
//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
//        bedRoom.makeBed();
//
//        bedRoom.getLamp().turnOn();


        ////////////////////////////////////

//        Printer printer = new Printer(50, true);
//        System.out.println(printer.addToner(50));
//        System.out.println("initial page count = " +printer.getPagesPrinted());
//        int pagesPrinted = printer.printPages(4);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
//        pagesPrinted = printer.printPages(2);
//        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());

        /////////////////////////////////////

//        Car car = new Car(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Ford ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(6, "Holden Commodore");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());

        /////////////////////////////////////////////////

        Hamburger hamburger = new Hamburger("Basic", "White", "Sausage", 3.56);
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy", "brown rye", "bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger("deluxe", "white", "Sausage & bacon", 14.54);
        db.addHamburgerAddition3("egg", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());



    }
}
