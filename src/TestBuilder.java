import builders.Color;
import builders.LineChartBuilder;
import builders.Data;
import builders.LineDataSet;
import builders.common.enums.BorderCapStyle;

import java.util.Arrays;

public class TestBuilder {

    private static String[] labels = {"Red", "Blue", "Yellow", "Green", "Purple", "Orange"};
    private static Object[] datas = {12, 19, 3, 5, 2, 3};

    public static void main(String[] args) {
        System.out.println(createLineChart());
    }

    private static String createLineChart() {
        LineDataSet template = new LineDataSet();
        Color color = new Color(255, 99, 132, 0.2);
        Color hoverColor = new Color(255, 99, 132, 0.8);
        template.setBackgroundColor(color);
        template.setHoverBackgroundColor(hoverColor);
        template.setBorderColor(hoverColor);
        template.setHoverBorderColor(hoverColor);
        template.setBorderCapStyle(BorderCapStyle.SQUARE);
        template.setBorderWidth(4);
        template.setFill(false);
        template.setPointRadius(2);
        template.setPointHoverRadius(6);
        template.setPointHitRadius(12);
        template.setPointHoverBorderWidth(8);

        LineChartBuilder lineChartBuilder = new LineChartBuilder();
        Data<LineDataSet> data = new Data<>();
        Arrays.asList(labels).forEach(data::addLabel);
        LineDataSet dataSet = new LineDataSet(template);
        dataSet.setLabel("Test dataset");
        dataSet.setData(datas);
        data.addDataset(dataSet);
        lineChartBuilder.setData(data);
        return lineChartBuilder.build();
    }
}
