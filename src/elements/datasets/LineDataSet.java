package elements.datasets;

public class LineDataSet extends LineTypeDataSet {

    private String cubicInterpolationMode;
    private Boolean showLine, stepped;

    public LineDataSet() {
    }

    public String getCubicInterpolationMode() {
        return cubicInterpolationMode;
    }

    public void setCubicInterpolationMode(String cubicInterpolationMode) {
        this.cubicInterpolationMode = cubicInterpolationMode;
    }

    public Boolean getShowLine() {
        return showLine;
    }

    public void setShowLine(Boolean showLine) {
        this.showLine = showLine;
    }

    public Boolean getStepped() {
        return stepped;
    }

    public void setStepped(Boolean stepped) {
        this.stepped = stepped;
    }
}
