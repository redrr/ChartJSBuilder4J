package elements.datasets;

import common.enums.BorderAlign;

public abstract class AreaTypeDataSet extends DataSet {

    private BorderAlign borderAlign;

    //region[Region] Setters

    public void setBorderAlign(BorderAlign borderAlign) {
        this.borderAlign = borderAlign;
    }

    //endregion
}
