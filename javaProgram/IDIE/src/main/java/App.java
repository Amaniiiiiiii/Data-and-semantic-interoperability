import com.fasterxml.jackson.databind.ObjectMapper;
import com.temp.test.WeatherAirConditions;
import com.temp.test.WeatherCommons;
import com.temp.test.WeatherForecast;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ObjectToJson();
        JsonToObject();
    }

    public static void ObjectToJson(){
        WeatherCommons weatherCommons = new WeatherCommons().withWeatherType("snow").withFeelLikesTemperature(13.0).withRefPointOfInterest(null).withRelativeHumidity(64.0).withTemperature(3.0).withVisibility(new WeatherCommons().getVisibility()).withWindDirection(180).withWindSpeed(10.0).withAdditionalProperty("isToday","true");
        WeatherAirConditions weatherAirConditionsMin = new WeatherAirConditions().withFeelLikesTemperature(12.0).withRelativeHumidity(60.0).withTemperature(1.0).withAdditionalProperty("PM2.5","20");
        WeatherAirConditions weatherAirConditionsMax = new WeatherAirConditions().withFeelLikesTemperature(14.0).withRelativeHumidity(68.0).withTemperature(5.0).withAdditionalProperty("PM2.5","28");
        WeatherForecast weatherForecast = new WeatherForecast().withCurrent(weatherCommons).withDate(new Date()).withDayMaximum(weatherAirConditionsMax).withDayMinimum(weatherAirConditionsMin).withLocation("Saint-Etienne").withAdditionalProperty("accuracy","95").withAlert("snow/ice") ;

        String jsonFileName = "MyWeatherForeCast.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            objectMapper.writeValue(new File(jsonFileName),weatherForecast);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void JsonToObject(){
        String jsonFileName = "MyWeatherForeCast.json";
        ObjectMapper mapper = new ObjectMapper();
        try{
            WeatherForecast weatherForecast;
            File file = new File(jsonFileName);
            Scanner scanner = new Scanner(file);
            String data = "";
            while(scanner.hasNextLine()){
                data = data + scanner.nextLine();
            }
            scanner.close();
            weatherForecast = mapper.readValue(data,WeatherForecast.class);
            System.out.println(weatherForecast.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
