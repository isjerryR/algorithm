package pers.jerryr.array;
/**
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 * */
public class FirstChartIndex {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0)
            return -1;
        int[] count = new int[256];//ascll码总共有256个
        for(int i =0;i<str.length();i++){
            count[str.charAt(i)]++;//按照字母ascll顺序存储字母出现的频次
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)] == 1)//按照字符串中字母出现的顺序索引频次为1的字母最早出现的索引值
                return i;
        }
        return -1;
    }
}
