package com.chaining.ctwing;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * description
 * <p>
 *
 * @author <a href="mail to: ning.chai@foxmail.com" rel="nofollow">chaining</a>
 */
public class StrUtils {
    /**
     * 存放16进制字符串,字符串2为 2为存
     * @param hexString
     * @return
     */
    public static List<String> parseArrayList(String hexString){
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < hexString.length()/2; i++){
            int index = i * 2;
            String var = hexString.substring(index,index+2);
            strings.add(var);
        }
        return strings;
    }
}
