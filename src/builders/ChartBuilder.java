package builders;

import common.enums.ChartType;
import elements.basic.Data;
import elements.basic.Options;
import elements.datasets.DataSet;

public abstract class ChartBuilder {

    private ChartType type;
    private Options options;

    protected void setType(ChartType type) {
        this.type = type;
    }

    public void setOptions(Options options) {
        this.options = options;
    }
}
