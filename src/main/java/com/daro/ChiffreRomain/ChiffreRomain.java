package com.daro.ChiffreRomain;

import java.util.LinkedHashMap;
import java.util.Map;

public class ChiffreRomain {
    private static final Map<Integer, String> romanNumeralMap = new LinkedHashMap<>();

    static {
        romanNumeralMap.put(1000, "M");
        romanNumeralMap.put(900, "CM");
        romanNumeralMap.put(500, "D");
        romanNumeralMap.put(400, "CD");
        romanNumeralMap.put(100, "C");
        romanNumeralMap.put(90, "XC");
        romanNumeralMap.put(50, "L");
        romanNumeralMap.put(40, "XL");
        romanNumeralMap.put(10, "X");
        romanNumeralMap.put(9, "IX");
        romanNumeralMap.put(5, "V");
        romanNumeralMap.put(4, "IV");
        romanNumeralMap.put(1, "I");
    }

    public static String convert(int i) {
        StringBuilder roman = new StringBuilder();
        for (Map.Entry<Integer, String> entry : romanNumeralMap.entrySet()) {
            int num = entry.getKey();
            String numeral = entry.getValue();


            while (i >= num) {

                roman.append(numeral);

                i -= num;
            }
        }


        return roman.toString();
    }
}