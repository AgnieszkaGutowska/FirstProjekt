public class Car {

   // public String name="default";
    private String name;
    private int maxspeed;
    private Engine engine; //nowe pole typu Engine



    public Car(String s) {
      //name = "default";
        this.name = name;  //stworzony konstruktor parametrowy który gwarantuje ze weznie dane z app.java z pola name

    }

    public void printName(){
        System.out.println(name);
    }

    public static void staticMethod(){

        System.out.println("metoda statyczba");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}




