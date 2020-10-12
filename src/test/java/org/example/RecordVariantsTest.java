package org.example;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RecordVariantsTest {

    private static final Logger LOGGER = Logger.getLogger(RecordVariantsTest.class.getName());

    private RecordVariants app;

    @Before
    public void setup() {
        app = new RecordVariants();
        var employeeList = Stream.of(
                new RecordVariants.Employee(1,"Alice","Admin","Senior Executive",10000d),
                new RecordVariants.Employee(2,"Bob","Admin","Associate Executive",5000d),
                new RecordVariants.Employee(3,"Charlie","Admin","Executive",7000d),
                new RecordVariants.Employee(4,"David","Admin","Vice President",15000d)
        ).collect(Collectors.toList());
        app.setEmployees(employeeList);
    }

    @Test
    public void getEmployeeByDepartmentTest()   {
        var employeeList = app.getEmployeeByDepartment("Admin");
        assertEquals(4,employeeList.size());
        LOGGER.info("getEmployeeByDepartmentTest :" + employeeList);
    }

    @Test
    public void getEmployeeByIdTest()   {
        var actualEmployee = app.getEmployeeById(3);
        var expectedEmployee = new RecordVariants.Employee(3,"Charlie","Admin","Executive",7000d);
        assertEquals(actualEmployee,expectedEmployee);
        LOGGER.info("getEmployeeByIdTest :" + actualEmployee);
    }

    @Test
    public void shipmentTest()   {
        var actualObject = new RecordVariants.Shipment(new RecordVariants.Box("Medicine",100d),"Unilever","Bangalore","Belagavi");
        assertNotNull(actualObject);
        LOGGER.info("shipmentTest :" + actualObject);
    }

}
