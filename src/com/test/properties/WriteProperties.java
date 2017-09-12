package com.test.properties;
import java.io.*;
import java.util.*;

public class WriteProperties {
    public static void main(String[] args) throws Exception {
        Properties p2=new Properties();
        p2.setProperty("name","Sonoo Jaiswal");
        p2.setProperty("email","sonoojaiswal@javatpoint.com");

        p2.store(new FileWriter("info.properties"),"Javatpoint Properties Example");
    }
}
