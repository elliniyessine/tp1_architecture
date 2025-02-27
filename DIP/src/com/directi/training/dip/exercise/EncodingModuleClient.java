package com.directi.training.dip.exercise;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        DataProcessor fileProcessor = new FileProcessor( "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt",  "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileProcessor);
        fileEncodingModule.process();

        DataProcessor webDatabaseProcessor = new WebDatabaseProcessor("https://www.google.com/index.html",new MyDatabase());
        EncodingModule webEncodingModule = new EncodingModule(webDatabaseProcessor);
        webEncodingModule.process();
    }
}
