package elements.datasets;

import common.enums.AxisType;
import common.enums.BorderSkippedType;

public class BarDataSet extends DataSet {

    private String indexAxis;
    private Object borderSkipped;
    private Integer barPercentage, categoryPercentage, barThickness, maxBarThickness, minBarLength;

    public BarDataSet() {
    }

    public Object getBorderSkipped() {
        return borderSkipped;
    }

    public BarDataSet setBorderSkipped(BorderSkippedType borderSkipped) {
        this.borderSkipped = borderSkipped.equals(BorderSkippedType.FALSE) ? false : borderSkipped.name().toLowerCase();
        return this;
    }

    public String getIndexAxis() {
        return indexAxis;
    }

    public BarDataSet setIndexAxis(AxisType indexAxis) {
        this.indexAxis = indexAxis.name().toLowerCase();
        return this;
    }

    public Integer getBarPercentage() {
        return barPercentage;
    }

    public BarDataSet setBarPercentage(Integer barPercentage) {
        this.barPercentage = barPercentage;
        return this;
    }

    public Integer getCategoryPercentage() {
        return categoryPercentage;
    }

    public BarDataSet setCategoryPercentage(Integer categoryPercentage) {
        this.categoryPercentage = categoryPercentage;
        return this;
    }

    public Integer getBarThickness() {
        return barThickness;
    }

    public BarDataSet setBarThickness(Integer barThickness) {
        this.barThickness = barThickness;
        return this;
    }

    public Integer getMaxBarThickness() {
        return maxBarThickness;
    }

    public BarDataSet setMaxBarThickness(Integer maxBarThickness) {
        this.maxBarThickness = maxBarThickness;
        return this;
    }

    public Integer getMinBarLength() {
        return minBarLength;
    }

    public BarDataSet setMinBarLength(Integer minBarLength) {
        this.minBarLength = minBarLength;
        return this;
    }
}
