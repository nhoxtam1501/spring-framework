package com.ducku.beans;

import com.ducku.beans.DatabaseConnection;
import org.springframework.stereotype.Component;

@Component("postgresDatabase")
public class PostgreSQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("PostgreSQL database Connected");
    }
}
