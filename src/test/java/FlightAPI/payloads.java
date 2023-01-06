package FlightAPI;

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
}
