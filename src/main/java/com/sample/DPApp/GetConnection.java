package com.sample.DPApp;

public class GetConnection
{
    private Database database;

    public GetConnection(Database database) {
        this.database = database;
    }

    public void getConnection()
    {
        database.connection();
    }
}
