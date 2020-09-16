package builders;

import common.enums.ChartType;
import elements.basic.Data;
import elements.datasets.LineDataSet;

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
        return null;
    }
}
