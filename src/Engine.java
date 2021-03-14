public class Engine {
    public Integer power;
    public Integer capacity;


    public Engine (){
        this.power=power;
        this.capacity=capacity;
    }
    public void printPower(){
        System.out.println(power);
    }
    public void printCapacity(){
        System.out.println(capacity);
    }


    public Integer getPower() {
        return power;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}

