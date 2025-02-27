package com.directi.training.dip.exercise;

import java.util.Base64;

public class EncodingModule {
    private final DataProcessor dataProcessor;

    public EncodingModule(DataProcessor dataProcessor) {
        this.dataProcessor = dataProcessor;
    }

    public void process() throws Exception {
        String data = dataProcessor.read();
        String encodedData = Base64.getEncoder().encodeToString(data.getBytes());
        dataProcessor.write(encodedData);
    }
}
