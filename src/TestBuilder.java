import builders.LineChartBuilder;
import common.parser.JsonObject;

public class TestBuilder {

    public static void main(String[] args) {
        System.out.println(createLineChart());
    }

    private static String createLineChart() {
        LineChartBuilder lineChartBuilder = new LineChartBuilder();
        JsonObject object = new JsonObject();
        object.put("asd", "asd");
        object.put("asd1", "asd");
        object.put("asd2", "asd");
        return object.toString();
    }
}
