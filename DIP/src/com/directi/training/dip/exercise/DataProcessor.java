package com.directi.training.dip.exercise;

public interface DataProcessor {
    String read() throws Exception;
    void write(String data) throws Exception;
}
