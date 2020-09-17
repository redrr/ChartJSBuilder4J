package elements.datasets;

import common.enums.PointStyle;

public class BubbleDataSet extends DataSet {

    private String label;
    private PointStyle pointStyle;
    private Integer order, hoverRadius, hitRadius, rotation, radius;

    //region[Region] Setters

    public void setLabel(String label) {
        this.label = label;
    }

    public void setPointStyle(PointStyle pointStyle) {
        this.pointStyle = pointStyle;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setHoverRadius(Integer hoverRadius) {
        this.hoverRadius = hoverRadius;
    }

    public void setHitRadius(Integer hitRadius) {
        this.hitRadius = hitRadius;
    }

    public void setRotation(Integer rotation) {
        this.rotation = rotation;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }

    //endregion

    //region [Region] Getters

     public String getLabel() {
        return label;
    }

    public PointStyle getPointStyle() {
        return pointStyle;
    }

    public Integer getOrder() {
        return order;
    }

    public Integer getHoverRadius() {
        return hoverRadius;
    }

    public Integer getHitRadius() {
        return hitRadius;
    }

    public Integer getRotation() {
        return rotation;
    }

    public Integer getRadius() {
        return radius;
    }


    //endregion
}
