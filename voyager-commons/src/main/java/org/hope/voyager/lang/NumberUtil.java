package org.hope.voyager.lang;

/**
 * 数字相关操作工具类
 * @author caiweiquan
 * @since 2021/4/21
 */
public class NumberUtil {

    //<editor-fold desc="Description">
    public static void toBinaryStringPrint(byte number) {
        printf("binary: %s,number %d\n", toBinaryString(number), number);
    }

    public static void toBinaryStringPrint(byte number, String arg) {
        printf("binary: %s,number %d,arg %s\n", toBinaryString(number), number, arg);
    }

    /**
     * https://blog.csdn.net/qiantudou/article/details/49928423
     * @param number
     * @return
     */
    public static String toBinaryString(byte number){
        return Integer.toBinaryString((number & 0xFF) + 0x100).substring(1);
    }
    //</editor-fold>

    //<editor-fold desc="printlnIntegerToBinaryStr to int">

    public static void toBinaryStringPrint(int number) {
        printf("binary: %s,number %d\n", toBinaryString(number), number);
    }

    public static void toBinaryStringPrint(int number, String arg) {
        printf("binary: %s,number %d,arg %s\n", toBinaryString(number), number, arg);
    }

    public static String toBinaryString(int number){
        return Integer.toBinaryString(number);
    }
    //</editor-fold>

    public static void printf(String format, Object ... args){
        System.out.printf(format,args);
    }


}
