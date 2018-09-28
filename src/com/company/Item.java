package com.company;

import java.util.Date;

public interface Item {
    //all fields in interfaces are final
    final String manufacturer = "OracleProduction";

    public void setProductionNumber(int p);
    void setName(String n);
    String getName();
    Date getManufacturerDate();
    int getSerialNumber(int s);

}
