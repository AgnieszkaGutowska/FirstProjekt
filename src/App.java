public class App {


  public static void printNumber(int i){
    System.out.println(i);
  }

    public static  void main(String[] args){
        //System.out.println("Hello World!");

        //wywołanie metody statycznej - nie trzeba tworzyć obiektu
        StaticExample.metodaStatyczna();

        //wywołanie metody niestatycznej - trzeba utworzyć obiekt
      StaticExample staticExample =  new StaticExample() ;
      staticExample.nonstaticMethod();

        //tworze obiekt myCAr
        Car myCar = new Car("car 1"); //jesli stworze taki konstruktor to zastępuje ten zapis z linijki niżej
        //dopiero wtedy mogę z niego wziąć
        // myCar.name="my car";
        myCar.printName();

        Car anotherCar= new Car("car 1");
        // anotherCar.name="another car";
        anotherCar.printName();


        Engine engine1 = new Engine();
        engine1.setCapacity(1);
        engine1.setPower(103);

        //engine1.printCapEn();

        System.out.println(engine1.power);
        System.out.println(engine1.capacity);

        Engine engine2 = new Engine();
        engine2.setPower(32);
        engine2.setCapacity(244);
        //engine2.printCapEn();

        System.out.println(engine2.power);
        System.out.println(engine2.capacity);


        Car car1 = new Car("car 1");
        car1.setEngine(engine1);
        //car1.printName();
        car1.getEngine().printCapacity();
        car1.getEngine().printPower();


        //System.out.println(car1.name);
        //engine1.printPower();
        //System.out.println(car1.engine.power);
        //engine1.printCapacity();
        //System.out.println(car1.engine.capacity);


        Car car2 = new Car("car 2");
        car2.setEngine(engine2);
        //engine2.printPower();
        car2.getEngine().printPower();
        car2.getEngine().printCapacity();


        //System.out.println(car2.engine.power);
       //car2.setEngine();
       // engine2.printCapacity();
        //System.out.println(car2.engine.capacity);
       // car2.printName();
        // System.out.println(car2.name);



        int number = 6;//0
        Integer number2 = 23; //null

        printNumber(number);
        printNumber(number2);

      }


    }







