package com.kayson.utils;

import java.util.UUID;

/**
 * @author
 * @date 2020/9/8 - 17:39
 */
public class IDutil {
    public static String getID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }



}
