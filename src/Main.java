public class Main {
    public static void main(String[] args) {
        kodlandTest();
    }

    public static void kodlandTest() {
        Worker OM = new Worker("Oskar", "Makowski",
                "Teacher of Python and Lua", 9,
                2);
        OM.calculateSalary("March");
        OM.setQualityParameters(9,29.0,
                53.0, 93.0, 91.0);
        OM.calculateWorkQuality();
    }

    public static void carTest() {
        Car car = new Car(8, "Base car");
        car.startEngine();
        car.accelerate();
        car.brake();

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine() ;
        mitsubishi.accelerate();
        mitsubishi.brake();

        Ford ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        Holden holden = new Holden(6, "Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();
    }
}
