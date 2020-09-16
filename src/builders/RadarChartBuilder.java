package builders;

import common.enums.ChartType;
import elements.basic.Data;
import elements.datasets.BarDataSet;
import elements.datasets.RadarDataSet;

public class RadarChartBuilder extends ChartBuilder {

    private Data<RadarDataSet> data;

    public RadarChartBuilder() {
        this.setType(ChartType.radar);
    }

    public void setData(Data<RadarDataSet> data) {
        this.data = data;
    }

    @Override
    public String build() {
        return null;
    }
}
