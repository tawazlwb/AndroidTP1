package com.ikheiry.androidtp1.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ikheiry on 09/06/2018.
 */

public class ResultSet {
    private List<Record> records;

    public ResultSet() {
        this.records = new ArrayList<>();
    }

    public ResultSet(List<Record> records) {
        this.records = records;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }
}
