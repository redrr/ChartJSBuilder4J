package elements.datasets;

import common.types.Color;

public abstract class DataSet {

    private Color backgroundColor, borderColor, hoverBackgroundColor, hoverBorderColor;
    private Integer borderWidth, hoverBorderWidth;
    private Object clip;
    private Object[] data;

    //region[Region] Setters

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public void setHoverBackgroundColor(Color hoverBackgroundColor) {
        this.hoverBackgroundColor = hoverBackgroundColor;
    }

    public void setHoverBorderColor(Color hoverBorderColor) {
        this.hoverBorderColor = hoverBorderColor;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public void setHoverBorderWidth(Integer hoverBorderWidth) {
        this.hoverBorderWidth = hoverBorderWidth;
    }

    public void setClip(Object clip) {
        this.clip = clip;
    }

    public void setData(Object[] data) {
        this.data = data;
    }

    //endregion

    //region [Region] Getters

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public Color getHoverBackgroundColor() {
        return hoverBackgroundColor;
    }

    public Color getHoverBorderColor() {
        return hoverBorderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public Integer getHoverBorderWidth() {
        return hoverBorderWidth;
    }

    public Object getClip() {
        return clip;
    }

    public Object[] getData() {
        return data;
    }


    //endregion
}