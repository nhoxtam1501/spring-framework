package com.ducku.beans;

import com.ducku.beans.DatabaseConnection;
import org.springframework.stereotype.Component;

@Component("mysqlDatabase")
public class MySQLDatabaseConnection implements DatabaseConnection {
    @Override
    public void connect() {
        System.out.println("MySQL database Connected");
    }
}
