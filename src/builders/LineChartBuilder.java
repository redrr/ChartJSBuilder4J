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
        JsonObject dataObject = new JsonObject();
        JsonArray labels = new JsonArray();
        data.getLabels().forEach(labels::put);
        dataObject.put(Constants.labels, labels);
        JsonArray dataSets = new JsonArray();
        data.getDatasets().forEach(lineDataSet -> {
            JsonObject dataSet = new JsonObject();
            if(lineDataSet.getData().length > 0) {
                JsonArray data = new JsonArray();
                Arrays.asList(lineDataSet.getData()).forEach(data::put);
                dataSet.put(Constants.data, data);
            }
            dataSet.put(Constants.backgroundColor, lineDataSet.getBackgroundColor())
                    .put(Constants.borderColor, lineDataSet.getHoverBackgroundColor())
                    .put(Constants.hoverBackgroundColor, lineDataSet.getBorderColor())
                    .put(Constants.hoverBorderColor, lineDataSet.getHoverBorderColor())
                    .put(Constants.borderWidth, lineDataSet.getBorderWidth())
                    .put(Constants.hoverBorderWidth, lineDataSet.getHoverBorderWidth())
                    .put(Constants.clip, lineDataSet.getClip())
                    .put(Constants.label, lineDataSet.getLabel())
                    .put(Constants.borderJoinStyle, lineDataSet.getBorderJoinStyle())
                    .put(Constants.hoverBorderJoinStyle, lineDataSet.getHoverBorderJoinStyle())
                    .put(Constants.borderCapStyle, lineDataSet.getBorderCapStyle())
                    .put(Constants.hoverBorderCapStyle, lineDataSet.getHoverBorderCapStyle())
                    .put(Constants.pointStyle, lineDataSet.getPointStyle())
                    .put(Constants.borderDash, lineDataSet.getBorderDash())
                    .put(Constants.hoverBorderDash, lineDataSet.getHoverBorderDash())
                    .put(Constants.borderDashOffset, lineDataSet.getBorderDashOffset())
                    .put(Constants.hoverBorderDashOffset, lineDataSet.getHoverBorderDashOffset())
                    .put(Constants.lineTension, lineDataSet.getLineTension())
                    .put(Constants.pointBorderWidth, lineDataSet.getPointBorderWidth())
                    .put(Constants.pointHoverBorderWidth, lineDataSet.getPointHoverBorderWidth())
                    .put(Constants.pointHitRadius, lineDataSet.getPointHitRadius())
                    .put(Constants.pointRadius, lineDataSet.getPointRadius())
                    .put(Constants.pointHoverRadius, lineDataSet.getPointHoverRadius())
                    .put(Constants.pointRotation, lineDataSet.getPointRotation())
                    .put(Constants.order, lineDataSet.getOrder())
                    .put(Constants.fill, lineDataSet.getFill())
                    .put(Constants.spanGaps, lineDataSet.getSpanGaps())
                    .put(Constants.showLine, lineDataSet.getShowLine())
                    .put(Constants.pointBackgroundColor, lineDataSet.getPointBackgroundColor())
                    .put(Constants.pointBorderColor, lineDataSet.getPointBorderColor())
                    .put(Constants.pointHoverBackgroundColor, lineDataSet.getPointHoverBackgroundColor())
                    .put(Constants.pointHoverBorderColor, lineDataSet.getPointHoverBorderColor())
                    .put(Constants.stepped, lineDataSet.getStepped())
                    .put(Constants.cubicInterpolationMode, lineDataSet.getCubicInterpolationMode())
                    .put(Constants.xAxisID, lineDataSet.getxAxisID())
                    .put(Constants.yAxisID, lineDataSet.getyAxisID());
            dataSets.put(dataSet.tostring());
        });
        dataObject.put(Constants.datasets, dataSets);
        JsonObject optionObject = new JsonObject();
        //TODO: Options implementation
        config.put(Constants.type, getType().name())
                .put(Constants.data, dataObject)
                .put(Constants.options, optionObject);
        return config.tostring();
    }
}
