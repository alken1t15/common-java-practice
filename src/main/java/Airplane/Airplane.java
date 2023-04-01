package Airplane;

public class Airplane {
    public Airplane(String model){
        this.model = model;
    }
    String model;
    boolean refueled;
    boolean processed;
    boolean whole;

    boolean messageWeather;

    public void refueledAirplane(){
        this.refueled = true;
    }

    public void processedAirplane(){
        this.processed = true;
    }

    public void wholeAirplane(){
        this.whole = true;
    }

    public void messageWeatherAirplane(){
        this.messageWeather = true;
    }

    public void fly(Season season) throws AirplaneNotReadyFly{
        if(season.toString() == Season.Winter.toString() && season.name().toString() == Season.Autumn.toString()){
            if(messageWeather && whole && refueled && processed){
                System.out.printf("Самалет %s готов к вылету Зимой", model);
            }
            else {
                throw new AirplaneNotReadyFly("Самалет не готов к вылету");
            }
        }
        else {
            if(messageWeather && whole && refueled ){
                System.out.printf("Самалет %s готов к вылету", model);
            }
            else {
                throw new AirplaneNotReadyFly("Самалет не готов к вылету");
            }
        }
    }
}
