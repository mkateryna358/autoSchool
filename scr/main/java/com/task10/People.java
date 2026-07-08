package com.task10;

import java.lang.reflect.Field;

public class People {

    public void printData() throws IllegalAccessException {
        //get class and all fields of successor class
        //array because we have several fields in each successor class
        Field[] fields = this.getClass().getDeclaredFields();
        //get all field names and their value
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + ": " + field.get(this));
        }
    }
}
