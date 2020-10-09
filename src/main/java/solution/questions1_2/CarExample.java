package solution.questions1_2;

import questions1_2.Car;

import java.util.*;

/** Solution to the CarExample problem */
public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Fusion", 22300);
        Car car2 = new Car("Honda", "Civic", 14100);
        Car car3 = new Car("Mazda", "6", 15000);
        // Create a TreeSet of cars, passing the comparator.
        SortedSet<Car> carSet = new TreeSet<>(new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                if (Math.abs(car1.getPrice() - car2.getPrice()) < 0.01)
                    return  0;
                else
                    return (int) (car1.getPrice() - car2.getPrice());
            }
        });

        /* With lambda, you can do it this way:
        SortedSet<Car> carSet = new TreeSet<>((car1, car2) -> {
            if (Math.abs(car1.getPrice()) - car2.getPrice() < 0.01)
                return  0;
            else
                return (int) (car1.getPrice() - car2.getPrice());
        });
        */

        // Add car1, car2, car3 to carSet
        carSet.add(car1);
        carSet.add(car2);
        carSet.add(car3);

        // Iterate over the TreeSet of cars and print info about
        // each car
        for (Car car: carSet) {
            System.out.println(car);
        }

    }
}
