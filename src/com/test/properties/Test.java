package com.test.properties;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("db.properties");
        Properties p = new Properties();

        p.load(reader);
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
    }
}
