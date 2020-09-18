package builders;

import builders.common.enums.CubicInterpolationMode;
import builders.common.enums.Stepped;

public class LineDataSet extends LineTypeDataSet {

    private String xAxisID, yAxisID;
    private CubicInterpolationMode cubicInterpolationMode;
    private Stepped stepped;

    //region[Region] Setters

    public void setxAxisID(String xAxisID) {
        this.xAxisID = xAxisID;
    }

    public void setyAxisID(String yAxisID) {
        this.yAxisID = yAxisID;
    }

    public void setCubicInterpolationMode(CubicInterpolationMode cubicInterpolationMode) {
        this.cubicInterpolationMode = cubicInterpolationMode;
    }

    public void setStepped(Stepped stepped) {
        this.stepped = stepped;
    }

    //endregion

    //region [Region] Getters

    String getxAxisID() {
        return xAxisID;
    }

    String getyAxisID() {
        return yAxisID;
    }

    CubicInterpolationMode getCubicInterpolationMode() {
        return cubicInterpolationMode;
    }

    Stepped getStepped() {
        return stepped;
    }


    //endregion
}
