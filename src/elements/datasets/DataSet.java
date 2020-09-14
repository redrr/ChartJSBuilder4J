package elements.datasets;

import common.types.Color;

public abstract class DataSet {

    private String label, xAxisID, yAxisID;
    private Color backgroundColor, borderColor, hoverBackgroundColor, hoverBorderColor;
    private Integer borderWidth, hoverBorderWidth, order;
    private Object clip;
    private Object[] data;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getxAxisID() {
        return xAxisID;
    }

    public void setxAxisID(String xAxisID) {
        this.xAxisID = xAxisID;
    }

    public String getyAxisID() {
        return yAxisID;
    }

    public void setyAxisID(String yAxisID) {
        this.yAxisID = yAxisID;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public Color getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public void setHoverBackgroundColor(Color hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
    }

    public Color getHoverBorderColor() {
        return hoverBorderColor;
    }

    public void setHoverBorderColor(Color hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public Integer getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    public void setHoverBorderWidth(Integer hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Object getClip() {
        return clip;
    }

    public void setClip(Object clip) {
        this.clip = clip;
    }

    public Object[] getData() {
        return data;
    }

    public void setData(Object[] data) {
        this.data = data;
    }
}
