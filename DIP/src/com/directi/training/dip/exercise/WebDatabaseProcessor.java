package com.directi.training.dip.exercise;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.URL;

public class WebDatabaseProcessor implements DataProcessor {
    private final String urlString;
    private final MyDatabase database;

    public WebDatabaseProcessor(String urlString, MyDatabase database) {
        this.urlString = urlString;
        this.database = database;
    }

    @Override
    public String read() throws Exception {
        StringBuilder content = new StringBuilder();
        URL url = new URL(urlString);
        try (InputStream in = url.openStream();
                InputStreamReader reader = new InputStreamReader(in)) {
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
        }
        return content.toString();
    }

    @Override
    public void write(String data) {
        database.write(data);
    }
}
