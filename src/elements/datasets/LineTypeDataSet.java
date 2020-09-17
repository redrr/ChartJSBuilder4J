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
    private Integer borderDashOffset, hoverBorderDashOffset, lineTension, pointBorderWidth,
            pointHoverBorderWidth, pointHitRadius, pointRadius, pointHoverRadius, pointRotation, order;
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

    //region [Region] Getters

    public String getLabel() {
        return label;
    }

    public BorderJoinStyle getBorderJoinStyle() {
        return borderJoinStyle;
    }

    public BorderJoinStyle getHoverBorderJoinStyle() {
        return hoverBorderJoinStyle;
    }

    public BorderCapStyle getBorderCapStyle() {
        return borderCapStyle;
    }

    public BorderCapStyle getHoverBorderCapStyle() {
        return hoverBorderCapStyle;
    }

    public PointStyle getPointStyle() {
        return pointStyle;
    }

    public Integer[] getBorderDash() {
        return borderDash;
    }

    public Integer[] getHoverBorderDash() {
        return hoverBorderDash;
    }

    public Integer getBorderDashOffset() {
        return borderDashOffset;
    }

    public Integer getHoverBorderDashOffset() {
        return hoverBorderDashOffset;
    }

    public Integer getLineTension() {
        return lineTension;
    }

    public Integer getPointBorderWidth() {
        return pointBorderWidth;
    }

    public Integer getPointHoverBorderWidth() {
        return pointHoverBorderWidth;
    }

    public Integer getPointHitRadius() {
        return pointHitRadius;
    }

    public Integer getPointRadius() {
        return pointRadius;
    }

    public Integer getPointHoverRadius() {
        return pointHoverRadius;
    }

    public Integer getPointRotation() {
        return pointRotation;
    }

    public Integer getOrder() {
        return order;
    }

    public Boolean getFill() {
        return fill;
    }

    public Boolean getSpanGaps() {
        return spanGaps;
    }

    public Boolean getShowLine() {
        return showLine;
    }

    public Color getPointBackgroundColor() {
        return pointBackgroundColor;
    }

    public Color getPointBorderColor() {
        return pointBorderColor;
    }

    public Color getPointHoverBackgroundColor() {
        return pointHoverBackgroundColor;
    }

    public Color getPointHoverBorderColor() {
        return pointHoverBorderColor;
    }


    //endregion
}
