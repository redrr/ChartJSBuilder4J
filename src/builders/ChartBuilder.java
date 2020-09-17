package builders;

import common.enums.ChartType;
import elements.basic.Data;
import elements.basic.Options;
import elements.datasets.DataSet;

abstract class ChartBuilder implements IBuilder {

    private ChartType type;
    private Options options;

    void setType(ChartType type) {
        this.type = type;
    }

    void setOptions(Options options) {
        this.options = options;
    }

    ChartType getType() {
        return type;
    }

    Options getOptions() {
        return options;
    }
}
