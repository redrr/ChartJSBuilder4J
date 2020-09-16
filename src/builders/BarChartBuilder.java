package builders;

import common.enums.ChartType;
import elements.basic.Data;
import elements.datasets.BarDataSet;
import elements.datasets.LineDataSet;

public class BarChartBuilder extends ChartBuilder {

    private Data<BarDataSet> data;

    public BarChartBuilder() {
        this.setType(ChartType.bar);
    }

    public void setData(Data<BarDataSet> data) {
        this.data = data;
    }

    @Override
    public String build() {
        return null;
    }
}
