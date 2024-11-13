package pl.example.vehicles;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class test {

    @Test
    public void testCar() {
        Car car = new Car("Sedan", 4);
        assertEquals(200, car.getMaxSpeed(), "Max speed of car should be 200");
        assertEquals(4, car.getDoors(), "Number of doors should be 4");
        assertEquals("Sedan", car.getName(), "Car name should be 'Sedan'");
    }

    @Test
    public void testBike() {
        Bike bike = new Bike("Mountain Bike");
        assertEquals(50, bike.getMaxSpeed(), "Max speed of bike should be 50");
        assertEquals("Mountain Bike", bike.getName(), "Bike name should be 'Mountain Bike'");
    }
}
