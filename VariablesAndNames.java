public class VariablesAndNames
{

    public static void main (String[] args)
    {
        int cars, drivers, passangers, cars_not_driven, cars_driven;
        double space_in_a_car, carpool_capacity, average_passenger_per_car;

        cars = 100;
        space_in_a_car = 4.0;
        drivers = 30;
        passangers = 90;   
        cars_not_driven = cars - drivers;
        cars_driven = drivers;
        carpool_capacity = cars_driven * space_in_a_car;
        average_passenger_per_car = passangers / cars_driven; 
        
        System.out.println ("There are " + cars + " cars available");
        System.out.println ("There are only " + drivers + " drivers available");
        System.out.println ("there will be " + cars_not_driven + " empty cars today");
        System.out.println ("we can transport " + carpool_capacity + " people today");
        System.out.println ("we have " + passangers + " to carpool today.");
        System.out.println ("We need to put about " + average_passenger_per_car + " in each car.");

    }

}