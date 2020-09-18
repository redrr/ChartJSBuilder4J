import builders.Color;
import builders.LineChartBuilder;
import builders.Data;
import builders.LineDataSet;

import java.util.Arrays;
import java.util.List;

public class TestBuilder {

    private static String[] labels = {"Red", "Blue", "Yellow", "Green", "Purple", "Orange"};
    private static Object[] datas = {12, 19, 3, 5, 2, 3};

    public static void main(String[] args) {
        System.out.println(createLineChart());
    }

    private static String createLineChart() {
        LineChartBuilder lineChartBuilder = new LineChartBuilder();
        Data<LineDataSet> data = new Data<>();
        Arrays.asList(labels).forEach(data::addLabel);
        LineDataSet dataSet = new LineDataSet();
        dataSet.setLabel("Test dataset");
        Color color = new Color(255, 99, 132, 0.2);
        Color hoverColor = new Color(255, 99, 132, 0.8);
        dataSet.setBackgroundColor(color);
        dataSet.setHoverBackgroundColor(hoverColor);
        dataSet.setBorderColor(color);
        dataSet.setHoverBorderColor(hoverColor);
        dataSet.setData(datas);
        data.addDataset(dataSet);
        lineChartBuilder.setData(data);
        return lineChartBuilder.build();
    }
}
