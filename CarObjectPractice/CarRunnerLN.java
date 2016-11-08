public class CarRunnerLN {

    public static void main(String[] args) {
        CarLN car1 = new CarLN("red", "2015 VW Golf GTI Autobahn Edition with Sport Package and Manual Transmission");
        CarLN car2 = new CarLN("blue", "2017 BMW M4");

        System.out.println(car1);
        System.out.println(car2);

        car1.setColor("black");
        System.out.println(car1);
        System.out.println(car2);

        car2.setModel("2017 Honda NSX");
        System.out.println(car1);
        System.out.println(car2);        
    }

}