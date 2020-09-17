package builders;

import common.Constants;
import common.enums.ChartType;
import common.parser.JsonArray;
import common.parser.JsonObject;
import elements.basic.Data;
import elements.datasets.LineDataSet;

import java.util.Arrays;

public class LineChartBuilder extends ChartBuilder {

    private Data<LineDataSet> data;

    public LineChartBuilder() {
        this.setType(ChartType.line);
    }

    public void setData(Data<LineDataSet> data) {
        this.data = data;
    }

    @Override
    public String build() {
        JsonObject config = new JsonObject();
        config.put(Constants.type, getType().name());
        JsonObject dataObject = new JsonObject();
        JsonArray labels = new JsonArray();
        data.getLabels().forEach(labels::put);
        dataObject.put(Constants.labels, labels.toString());
        JsonArray dataSets = new JsonArray();
        data.getDatasets().forEach(d -> {
            JsonObject dataSet = new JsonObject();
            //From DataSet class
            dataSet.put(Constants.backgroundColor, d.getBackgroundColor());
            dataSet.put(Constants.borderColor, d.getHoverBackgroundColor());
            dataSet.put(Constants.hoverBackgroundColor, d.getBorderColor());
            dataSet.put(Constants.hoverBorderColor, d.getHoverBorderColor());
            dataSet.put(Constants.borderWidth, d.getBorderWidth());
            dataSet.put(Constants.hoverBorderWidth, d.getHoverBorderWidth());
            dataSet.put(Constants.clip, d.getClip());
            if(d.getData().length > 0) {
                JsonArray data = new JsonArray();
                Arrays.asList(d.getData()).forEach(data::put);
                dataSet.put(Constants.data, data.toString());
            }
            //From LineTypeDataSet class
            dataSet.put(Constants.label, d.getLabel());
            dataSet.put(Constants.borderJoinStyle, d.getBorderJoinStyle());
            dataSet.put(Constants.hoverBorderJoinStyle, d.getHoverBorderJoinStyle());
            dataSet.put(Constants.borderCapStyle, d.getBorderCapStyle());
            dataSet.put(Constants.hoverBorderCapStyle, d.getHoverBorderCapStyle());
            dataSet.put(Constants.pointStyle, d.getPointStyle());
            dataSet.put(Constants.borderDashOffset, d.getBorderDashOffset());
            dataSet.put(Constants.hoverBorderDashOffset, d.getHoverBorderDashOffset());
            dataSet.put(Constants.lineTension, d.getLineTension());
            dataSet.put(Constants.pointBorderWidth, d.getPointBorderWidth());
            dataSet.put(Constants.pointHoverBorderWidth, d.getPointHoverBorderWidth());
            dataSet.put(Constants.pointHitRadius, d.getPointHitRadius());
            dataSet.put(Constants.pointRadius, d.getPointRadius());
            dataSet.put(Constants.pointHoverRadius, d.getPointHoverRadius());
            dataSet.put(Constants.pointRotation, d.getPointRotation());
            dataSet.put(Constants.order, d.getOrder());
            dataSet.put(Constants.fill, d.getFill());
            dataSet.put(Constants.spanGaps, d.getSpanGaps());
            dataSet.put(Constants.showLine, d.getShowLine());
            dataSet.put(Constants.pointBackgroundColor, d.getPointBackgroundColor());
            dataSet.put(Constants.pointBorderColor, d.getPointBorderColor());
            dataSet.put(Constants.pointHoverBackgroundColor, d.getPointHoverBackgroundColor());
            dataSet.put(Constants.pointHoverBorderColor, d.getPointHoverBorderColor());
            //From LineDataSet class
            dataSet.put(Constants.stepped, d.getStepped());
            dataSet.put(Constants.cubicInterpolationMode, d.getCubicInterpolationMode());
            dataSet.put(Constants.xAxisID, d.getxAxisID());
            dataSet.put(Constants.yAxisID, d.getyAxisID());
            dataSets.put(dataSet);
        });
        config.put(Constants.data, dataObject.toString());
        JsonObject optionObject = new JsonObject();
        //TODO: Options implementation
        config.put(Constants.options, optionObject.toString());
        return config.toString();
    }
}
