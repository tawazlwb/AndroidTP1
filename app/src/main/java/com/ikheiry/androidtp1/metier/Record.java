package com.ikheiry.androidtp1.metier;

/**
 * Created by ikheiry on 09/06/2018.
 */

public class Record {
    private Fields fields;

    public Record() {
    }

    public Record(Fields fields) {
        this.fields = fields;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }
}
