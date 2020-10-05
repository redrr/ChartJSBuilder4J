package builders;

import builders.common.Constants;
import builders.common.enums.ChartType;

import java.util.Arrays;
import java.util.Objects;

public class RadarChartBuilder extends ChartBuilder {

    private Data<RadarDataSet> data;

    public RadarChartBuilder() {
        this.setType(ChartType.radar);
    }

    public void setData(Data<RadarDataSet> data) {
        this.data = data;
    }

    public void setOption(Options option) {
        this.setOptions(option);
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
                    .put(Constants.pointHoverBorderColor, lineDataSet.getPointHoverBorderColor());
            dataSets.put(dataSet.convertJsonString());
        });
        dataObject.put(Constants.datasets, dataSets);
        JsonObject optionObject = new JsonObject();

        JsonObject animationObject = new JsonObject();
        if(Objects.nonNull(getOptions())){
            Animation animation = getOptions().getAnimation();
            if(Objects.nonNull(animation)){
                JsonObject tensionObject = new JsonObject();
                animationObject.put(Constants.debug, animation.getDebug());
                animationObject.put(Constants.delay, animation.getDelay());
                animationObject.put(Constants.duration, animation.getDuration());
                animationObject.put(Constants.easing, animation.getEasing());
                animationObject.put(Constants.loop, animation.getLoop());
                animationObject.put(Constants.mode, animation.getMode());
                optionObject.put(Constants.animation, animationObject);
            }
            Layout layout = getOptions().getLayout();
        }

        config.put(Constants.type, getType().name())
                .put(Constants.data, dataObject);
        if(Objects.nonNull(optionObject))
            config.put(Constants.options, optionObject);
        return config.convertJsonString();
    }
}
