package org.bankymono;

import java.util.UUID;

public class Recursion {
    public static void main(String[] args) {
pritn();
    }

    static void pritn(){
        System.out.println("uuid:"+UUID.randomUUID().toString().replace("-",""));
    }


}
