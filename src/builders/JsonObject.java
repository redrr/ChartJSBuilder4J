package builders;

import builders.common.Constants;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class JsonObject {

    private Map<Object, Object> object;
    private StringBuilder jsonStringBuilder;

    JsonObject() {
        this.object = new HashMap<>();
        this.jsonStringBuilder = new StringBuilder();
    }

    JsonObject put(Object key, Object value) {
        if(Objects.nonNull(value))
            this.object.put(key, value);
        return this;
    }

    String convertJsonString() {
        object.forEach((key, value) -> {
            if(value instanceof String || value instanceof Enum)
                this.jsonStringBuilder
                        .append(Constants.stringEscape).append(key).append(Constants.stringEscape).append(Constants.objectKeySeparator)
                        .append(Constants.stringEscape).append(value instanceof Enum ? ((Enum) value).name() : value).append(Constants.stringEscape).append(Constants.objectSeparator);
            if(value instanceof Boolean || value instanceof Integer)
                this.jsonStringBuilder
                        .append(Constants.stringEscape).append(key).append(Constants.stringEscape).append(Constants.objectKeySeparator)
                        .append(value).append(Constants.objectSeparator);
            if(value instanceof JsonArray)
                this.jsonStringBuilder
                        .append(Constants.stringEscape).append(key).append(Constants.stringEscape).append(Constants.objectKeySeparator)
                        .append(((JsonArray) value).getArrayAsString()).append(Constants.objectSeparator);
            if(value instanceof JsonObject)
                this.jsonStringBuilder
                        .append(Constants.stringEscape).append(key).append(Constants.stringEscape).append(Constants.objectKeySeparator)
                        .append(((JsonObject) value).convertJsonString()).append(Constants.objectSeparator);
            if(value instanceof Color)
                this.jsonStringBuilder
                        .append(Constants.stringEscape).append(key).append(Constants.stringEscape).append(Constants.objectKeySeparator)
                        .append(Constants.stringEscape).append(((Color) value).getRGBA()).append(Constants.stringEscape).append(Constants.objectSeparator);
        });
        String result = this.jsonStringBuilder.toString();
        int index = result.length()-1;
        return object.isEmpty() ? Constants.emptyJsonObject : Constants.startJsonObject+result.substring(0,index)+Constants.endJsonObject;
    }
}
