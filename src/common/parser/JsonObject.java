package common.parser;

import java.util.HashMap;
import java.util.Map;

public class JsonObject {

    private Map<Object, Object> object;
    private String result;

    public JsonObject() {
        this.object = new HashMap<>();
        this.result = "{";
    }

    public JsonObject put(Object key, Object value) {
        this.object.put(key, value);
        return this;
    }

    public String toString() {
        object.forEach((key, value) -> result += key + ":" + value + ",");
        int index = result.length()-1;
        return result.substring(0,index)+"}";
    }
}
