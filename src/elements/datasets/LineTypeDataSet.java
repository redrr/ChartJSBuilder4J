package elements.datasets;

import common.enums.BorderCapStyle;
import common.enums.BorderJoinStyle;
import common.enums.PointStyle;
import common.types.Color;

public abstract class LineTypeDataSet extends DataSet {

    private String label;
    private BorderJoinStyle borderJoinStyle, hoverBorderJoinStyle;
    private BorderCapStyle borderCapStyle, hoverBorderCapStyle;
    private PointStyle pointStyle;
    private Integer[] borderDash, hoverBorderDash;
    private Integer borderDashOffset, hoverBorderDashOffset, lineTension, pointBorderWidth, pointHoverBorderWidth, pointHitRadius, pointRadius, pointHoverRadius, pointRotation, order;
    private Boolean fill, spanGaps, showLine;
    private Color pointBackgroundColor, pointBorderColor, pointHoverBackgroundColor, pointHoverBorderColor;

    //region[Region] Setters

    public void setLabel(String label) {
        this.label = label;
    }

    public void setBorderJoinStyle(BorderJoinStyle borderJoinStyle) {
        this.borderJoinStyle = borderJoinStyle;
    }

    public void setHoverBorderJoinStyle(BorderJoinStyle hoverBorderJoinStyle) {
        this.hoverBorderJoinStyle = hoverBorderJoinStyle;
    }

    public void setBorderCapStyle(BorderCapStyle borderCapStyle) {
        this.borderCapStyle = borderCapStyle;
    }

    public void setHoverBorderCapStyle(BorderCapStyle hoverBorderCapStyle) {
        this.hoverBorderCapStyle = hoverBorderCapStyle;
    }

    public void setPointStyle(PointStyle pointStyle) {
        this.pointStyle = pointStyle;
    }

    public void setBorderDash(Integer[] borderDash) {
        this.borderDash = borderDash;
    }

    public void setHoverBorderDash(Integer[] hoverBorderDash) {
        this.hoverBorderDash = hoverBorderDash;
    }

    public void setBorderDashOffset(Integer borderDashOffset) {
        this.borderDashOffset = borderDashOffset;
    }

    public void setHoverBorderDashOffset(Integer hoverBorderDashOffset) {
        this.hoverBorderDashOffset = hoverBorderDashOffset;
    }

    public void setLineTension(Integer lineTension) {
        this.lineTension = lineTension;
    }

    public void setPointBorderWidth(Integer pointBorderWidth) {
        this.pointBorderWidth = pointBorderWidth;
    }

    public void setPointHoverBorderWidth(Integer pointHoverBorderWidth) {
        this.pointHoverBorderWidth = pointHoverBorderWidth;
    }

    public void setPointHitRadius(Integer pointHitRadius) {
        this.pointHitRadius = pointHitRadius;
    }

    public void setPointRadius(Integer pointRadius) {
        this.pointRadius = pointRadius;
    }

    public void setPointHoverRadius(Integer pointHoverRadius) {
        this.pointHoverRadius = pointHoverRadius;
    }

    public void setPointRotation(Integer pointRotation) {
        this.pointRotation = pointRotation;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public void setSpanGaps(Boolean spanGaps) {
        this.spanGaps = spanGaps;
    }

    public void setShowLine(Boolean showLine) {
        this.showLine = showLine;
    }

    public void setPointBackgroundColor(Color pointBackgroundColor) {
        this.pointBackgroundColor = pointBackgroundColor;
    }

    public void setPointBorderColor(Color pointBorderColor) {
        this.pointBorderColor = pointBorderColor;
    }

    public void setPointHoverBackgroundColor(Color pointHoverBackgroundColor) {
        this.pointHoverBackgroundColor = pointHoverBackgroundColor;
    }

    public void setPointHoverBorderColor(Color pointHoverBorderColor) {
        this.pointHoverBorderColor = pointHoverBorderColor;
    }

    //endregion
}
