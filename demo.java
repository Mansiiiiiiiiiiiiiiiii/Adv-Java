interface Vehicle {
    void vehicleinfo();
}

class Byke implements Vehicle {
    public void vehicleinfo() {
        System.out.println("It's a Byke");
    }
}

class Car implements Vehicle {
    public void vehicleinfo() {
        System.out.println("It's a Car");
    }
}

class Bus implements Vehicle {
    public void vehicleinfo() {
        System.out.println("It's a Bus");
    }
}

public class demo {
    public static void main(String[] args) {
        Vehicle obj;

        // Creating object of Byke
        obj = new Byke();
        obj.vehicleinfo();

        // Creating object of Car
        obj = new Car();
        obj.vehicleinfo();

        // Creating object of Bus
        obj = new Bus();
        obj.vehicleinfo();
    }
}
