class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void playMusic() {
        System.out.println("Playing music in the car");
    }
}

public class ErrorExample {
    public static void main(String[] args) {

        Vehicle v = new Car();

        v.playMusic();   // ERROR
    }
}

