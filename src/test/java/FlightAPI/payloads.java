package FlightAPI;

import java.util.HashMap;
import java.util.Map;

public class payloads {

    public static String requestPayloadAsString(String id, String airlineName, String countryName,
                                                String logoUrl, String airlineSlogan, String company_headquarter,
                                                String websiteUrl, String establishYear){
        String payload = "{\n" +
                "    \"id\":"+id+",\n" +
                "    \"name\": \""+airlineName+"\",\n" +
                "    \"country\": \""+countryName+"\",\n" +
                "    \"logo\": \""+logoUrl+"\",\n" +
                "    \"slogan\": \""+airlineSlogan+"\",\n" +
                "    \"head_quaters\": \""+company_headquarter+"\",\n" +
                "    \"website\": \""+websiteUrl+"\",\n" +
                "    \"established\": \""+establishYear+"\"\n" +
                "}";
        return payload;
    }

    public static Map<String, Object> requestPayloadAsMap(String id, String airlineName, String countryName,
                                                          String logoUrl, String airlineSlogan, String company_headquarter,
                                                          String websiteUrl, String establishYear){
        Map<String, Object> payload = new HashMap<>();
        payload.put("id",id);
        payload.put("name",airlineName);
        payload.put("country",countryName);
        payload.put("logo",logoUrl);
        payload.put("slogan","45223212");
        payload.put("head_quaters",company_headquarter);
        payload.put("website",websiteUrl);
        payload.put("established",establishYear);

        return payload;
    }
}
