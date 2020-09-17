package builders;

import common.Constants;
import common.enums.ChartType;
import common.parser.JsonArray;
import common.parser.JsonObject;
import elements.basic.Data;
import elements.datasets.DoughnutAndPieDataSet;
import elements.datasets.PolarAreaDataSet;

import java.util.Arrays;

public class PolarAreaChartBuilder extends ChartBuilder {

    private Data<PolarAreaDataSet> data;

    public PolarAreaChartBuilder() {
        this.setType(ChartType.bar);
    }

    public void setData(Data<PolarAreaDataSet> data) {
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
        data.getDatasets().forEach(d -> {
            JsonObject dataSet = new JsonObject();
            if (d.getData().length > 0) {
                JsonArray data = new JsonArray();
                Arrays.asList(d.getData()).forEach(data::put);
                dataSet.put(Constants.data, data);
            }
            dataSet.put(Constants.backgroundColor, d.getBackgroundColor())
                    .put(Constants.borderColor, d.getHoverBackgroundColor())
                    .put(Constants.hoverBackgroundColor, d.getBorderColor())
                    .put(Constants.hoverBorderColor, d.getHoverBorderColor())
                    .put(Constants.borderWidth, d.getBorderWidth())
                    .put(Constants.hoverBorderWidth, d.getHoverBorderWidth())
                    .put(Constants.clip, d.getClip())
                    .put(Constants.borderAlign, d.getBorderAlign());
            dataSets.put(dataSet);
        });
        JsonObject optionObject = new JsonObject();
        //TODO: Options implementation
        config.put(Constants.type, getType().name())
                .put(Constants.data, dataObject)
                .put(Constants.options, optionObject);
        return config.toString();
    }
}
