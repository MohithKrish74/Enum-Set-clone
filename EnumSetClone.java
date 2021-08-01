package com.keyword;

import java.util.EnumSet;
import java.util.Set;

enum Cars{TOYOTA,MAHINDRA,TATA,FIAT,SKODA}
public class EnumSetClone
{
    public static void main(String[] args)
    {
        EnumSet<Cars> set1 = EnumSet.allOf(Cars.class);
        System.out.println("The Set is "+set1);
        EnumSet<Cars> set2 = set1.clone();
        System.out.println("After cloning the Set is "+set2);
    }
}
