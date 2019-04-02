package love.programing;

public class TourAgency {

    public static void main(String[] args) {

        Customer customer1= new Customer(1,"Raghav","Kolar",true,"male");
        Customer customer2= new Customer(2,"Rama","Venkatesh",true,"male");
        Customer customer3= new Customer(3,"Ramya","Venkatesh",false,"Female");
        Customer customer4= new Customer(4,"Rama","rao",true,"male");
        Customer customer5= new Customer(5,"Ramya","Venkatesh",false,"Female");
        Customer customer6= new Customer(6,"Rama","Ramesh",true,"male");
        Customer customer7= new Customer(7,"Ramya","Frans",false,"Female");

        Car car=new Car();
        System.out.println("Seat Resrvation of Car");
        car.reserveSeat(customer1);
        car.reserveSeat(customer2);
        car.reserveSeat(customer3);
        car.reserveSeat(customer4);
        car.listseats();

        Bus myBus= new Bus();

        System.out.println("Seat Resrvation of Bus");
        myBus.reserveSeat(customer1);
        myBus.reserveSeat(customer2);
        myBus.reserveSeat(customer3);
        myBus.reserveSeat(customer4);
        myBus.reserveSeat(customer5);
        myBus.listseats();

        Plane myPlane= new Plane();
        System.out.println("Seat Resrvation of Plane");
        myPlane.reserveSeat(customer1);
        myPlane.reserveSeat(customer2);
        myPlane.reserveSeat(customer3);
        myPlane.reserveSeat(customer4);
        myPlane.reserveSeat(customer5);
        myPlane.reserveSeat(customer6);
        myPlane.reserveSeat(customer7);

        myPlane.listseats();





    }
}
