package com.class_loaders;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Bootstrap class loader
        //$JAVA_HOME/jre/lib
        System.out.println(ArrayList.class.getClassLoader());
        //Extension class loader
        //$JAVA_HOME/jre/lib/ext

        //Application class loader
        System.out.println(Person.class.getClassLoader());
    }
}
