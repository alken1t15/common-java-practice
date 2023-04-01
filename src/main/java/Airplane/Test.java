package Airplane;

public class Test {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Боинг 777");
        airplane.refueledAirplane();
        airplane.messageWeatherAirplane();
        airplane.processedAirplane();
        airplane.wholeAirplane();
        try {
            airplane.fly(Season.Winter);
        } catch (AirplaneNotReadyFly e) {
            System.out.println(e.getMessage());
        }
    }
}
