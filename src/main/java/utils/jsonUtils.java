package utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class jsonUtils {
    public static ObjectMapper objectMapper = new ObjectMapper();
    public static Map<String,Object> getJsonDataasMap(String jsonFileName) throws IOException {
        String compeletePath = System.getProperty("user.dir")+"/src/test/resources/"+jsonFileName;
        Map<String,Object> data = objectMapper.readValue(new File(compeletePath), new TypeReference<>() {
        });
        return data;
    }
}
