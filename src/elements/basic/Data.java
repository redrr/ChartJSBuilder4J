package elements.basic;

import elements.datasets.DataSet;

import java.util.ArrayList;
import java.util.List;

public class Data<T extends DataSet> {

    private List<String> labels = new ArrayList<>();
    private List<T> datasets = new ArrayList<>();

    public Data<T> addDataset(T dataset) {
        this.datasets.add(dataset);
        return this;
    }

    public Data<T> addLabel(String label) {
        this.labels.add(label);
        return this;
    }
}
