package iskn90.util;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;

public class JsonUtil {
    public static String convertXmlToJson(String xml) {
        try {
            JSONObject json = XML.toJSONObject(xml);
            String jsonString = json.toString(4);
            return JsonUtil.pretty(jsonString);
        } catch (JSONException e) {
            return "Error converting xml to json, error: " + e.getMessage();
        }
    }

    public static String pretty(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement jsonElement = JsonParser.parseString(json);
        return gson.toJson(jsonElement);
    }
}
