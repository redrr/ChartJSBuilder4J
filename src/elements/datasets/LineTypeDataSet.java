package elements.datasets;

import common.types.Color;

public abstract class LineTypeDataSet extends DataSet {

    private String borderCapStyle, hoverBorderCapStyle, borderJoinStyle, hoverBorderJoinStyle, pointStyle;
    private Integer[] borderDash, hoverBorderDash;
    private Integer borderDashOffset, hoverBorderDashOffset, lineTension, pointBorderWidth, pointHoverBorderWidth, pointHitRadius, pointRadius, pointHoverRadius, pointRotation;
    private Boolean fill, spanGaps;
    private Color pointBackgroundColor, pointBorderColor, pointHoverBackgroundColor, pointHoverBorderColor;

    public String getBorderCapStyle() {
        return borderCapStyle;
    }

    public void setBorderCapStyle(String borderCapStyle) {
        this.borderCapStyle = borderCapStyle;
    }

    public String getHoverBorderCapStyle() {
        return hoverBorderCapStyle;
    }

    public void setHoverBorderCapStyle(String hoverBorderCapStyle) {
        this.hoverBorderCapStyle = hoverBorderCapStyle;
    }

    public String getBorderJoinStyle() {
        return borderJoinStyle;
    }

    public void setBorderJoinStyle(String borderJoinStyle) {
        this.borderJoinStyle = borderJoinStyle;
    }

    public String getHoverBorderJoinStyle() {
        return hoverBorderJoinStyle;
    }

    public void setHoverBorderJoinStyle(String hoverBorderJoinStyle) {
        this.hoverBorderJoinStyle = hoverBorderJoinStyle;
    }

    public String getPointStyle() {
        return pointStyle;
    }

    public void setPointStyle(String pointStyle) {
        this.pointStyle = pointStyle;
    }

    public Integer[] getBorderDash() {
        return borderDash;
    }

    public void setBorderDash(Integer[] borderDash) {
        this.borderDash = borderDash;
    }

    public Integer[] getHoverBorderDash() {
        return hoverBorderDash;
    }

    public void setHoverBorderDash(Integer[] hoverBorderDash) {
        this.hoverBorderDash = hoverBorderDash;
    }

    public Integer getBorderDashOffset() {
        return borderDashOffset;
    }

    public void setBorderDashOffset(Integer borderDashOffset) {
        this.borderDashOffset = borderDashOffset;
    }

    public Integer getHoverBorderDashOffset() {
        return hoverBorderDashOffset;
    }

    public void setHoverBorderDashOffset(Integer hoverBorderDashOffset) {
        this.hoverBorderDashOffset = hoverBorderDashOffset;
    }

    public Integer getLineTension() {
        return lineTension;
    }

    public void setLineTension(Integer lineTension) {
        this.lineTension = lineTension;
    }

    public Integer getPointBorderWidth() {
        return pointBorderWidth;
    }

    public void setPointBorderWidth(Integer pointBorderWidth) {
        this.pointBorderWidth = pointBorderWidth;
    }

    public Integer getPointHoverBorderWidth() {
        return pointHoverBorderWidth;
    }

    public void setPointHoverBorderWidth(Integer pointHoverBorderWidth) {
        this.pointHoverBorderWidth = pointHoverBorderWidth;
    }

    public Integer getPointHitRadius() {
        return pointHitRadius;
    }

    public void setPointHitRadius(Integer pointHitRadius) {
        this.pointHitRadius = pointHitRadius;
    }

    public Integer getPointRadius() {
        return pointRadius;
    }

    public void setPointRadius(Integer pointRadius) {
        this.pointRadius = pointRadius;
    }

    public Integer getPointHoverRadius() {
        return pointHoverRadius;
    }

    public void setPointHoverRadius(Integer pointHoverRadius) {
        this.pointHoverRadius = pointHoverRadius;
    }

    public Integer getPointRotation() {
        return pointRotation;
    }

    public void setPointRotation(Integer pointRotation) {
        this.pointRotation = pointRotation;
    }

    public Boolean getFill() {
        return fill;
    }

    public void setFill(Boolean fill) {
        this.fill = fill;
    }

    public Boolean getSpanGaps() {
        return spanGaps;
    }

    public void setSpanGaps(Boolean spanGaps) {
        this.spanGaps = spanGaps;
    }

    public Color getPointBackgroundColor() {
        return pointBackgroundColor;
    }

    public void setPointBackgroundColor(Color pointBackgroundColor) {
        this.pointBackgroundColor = pointBackgroundColor;
    }

    public Color getPointBorderColor() {
        return pointBorderColor;
    }

    public void setPointBorderColor(Color pointBorderColor) {
        this.pointBorderColor = pointBorderColor;
    }

    public Color getPointHoverBackgroundColor() {
        return pointHoverBackgroundColor;
    }

    public void setPointHoverBackgroundColor(Color pointHoverBackgroundColor) {
        this.pointHoverBackgroundColor = pointHoverBackgroundColor;
    }

    public Color getPointHoverBorderColor() {
        return pointHoverBorderColor;
    }

    public void setPointHoverBorderColor(Color pointHoverBorderColor) {
        this.pointHoverBorderColor = pointHoverBorderColor;
    }
}
