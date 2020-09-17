package common.parser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JsonObject {

    private Map<Object, Object> object;
    private String result;

    public JsonObject() {
        this.object = new HashMap<>();
        this.result = "";
    }

    public JsonObject put(Object key, Object value) {
        if(Objects.nonNull(value))
            this.object.put(key, value);
        return this;
    }

    public String tostring() {
        object.forEach((key, value) -> {
            if(value instanceof String)
                result += "\""+key + "\""+ ":" + "\""+value +"\""+ ",";
            if(value instanceof Boolean || value instanceof Integer)
                result += "\""+key + "\""+ ":" + value + ",";
            if(value instanceof JsonArray)
                result += "\""+key + "\""+ ":" + ((JsonArray) value).getArrayAsString() + ",";
            if(value instanceof JsonObject)
                result += "\""+key + "\""+ ":" + ((JsonObject) value).tostring() + ",";
        });
        int index = result.length()-1;
        return object.isEmpty() ? "{}" : "{"+result.substring(0,index)+"}";
    }
}
