package com.ducku.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private final DatabaseConnection connection;

    private String text;

    public MyBean(@Qualifier("mysqlDatabase") DatabaseConnection connection) {
        this.connection = connection;
    }

    public void connect() {
        connection.connect();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "com.ducku.beans.MyBean{" +
                "text='" + text + '\'' +
                '}';
    }
}

