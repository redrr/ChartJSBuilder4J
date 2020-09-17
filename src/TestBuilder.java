import builders.LineChartBuilder;
import common.parser.JsonObject;
import elements.basic.Data;
import elements.datasets.LineDataSet;

public class TestBuilder {

    public static void main(String[] args) {
        System.out.println(createLineChart());
    }

    private static String createLineChart() {
        LineChartBuilder lineChartBuilder = new LineChartBuilder();
        Data<LineDataSet> data = new Data<>();
        data.addLabel("test1");
        data.addLabel("test2");
        lineChartBuilder.setData(data);
        return lineChartBuilder.build();
    }
}
