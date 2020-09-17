package common.parser;

import java.util.ArrayList;
import java.util.List;

public class JsonArray {

    private List<Object> array = new ArrayList<>();
    private String result = "[";

    public void put(Object object) {
       array.add(object);
    }

    List<Object> getArray() {
        return new ArrayList<>(array);
    }

    String getArrayAsString() {
        if(array.size() > 0) {
            array.forEach(value -> {
                if(value instanceof String){
                    result += "\""+value +"\""+ ",";
                }else if(value instanceof JsonArray){
                    result += ((JsonArray) value).getArrayAsString() + ",";
                }else if(value instanceof JsonObject) {
                    result += ((JsonObject) value).tostring() + ",";
                } else {
                    result += value + ",";
                }
            });
            int index = result.length()-1;
            result = result.substring(0,index);
        }
        return result+"]";
    }
}
