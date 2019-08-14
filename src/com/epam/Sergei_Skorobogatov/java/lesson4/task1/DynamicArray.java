package com.epam.Sergei_Skorobogatov.java.lesson4.task1;


import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray {
    public String[] data = new String[3];
    public int size = 0;

    public static void main(String[] args) {


        DynamicArray vector = new DynamicArray();
        vector.add("1");
        vector.add("2");
        vector.add("15");
        vector.add("JavaPractice");
        vector.add("222222222222222");
        vector.add("66666666666");

      //  System.out.println(vector.getLast());
        System.out.println(vector.get(2));
        vector.remove(2);
        //System.out.println(vector.size());
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.get(2));
        System.out.println(vector.get(3));
        System.out.println(vector.toString());
    }


    public String getLast() {
        return data[size-1];
    }

    public String get(int i) {
        return data[i];
    }

    public int size() {
        return size;
    }

    public void add(String s) {
        if (data.length <= size) {
            String[] tmp = data;
            data = new String[size*2];
            for (int i = 0; i < tmp.length; i++) {
                data[i] = tmp[i];
            }
        }
        data[size] = s;
        size++;
    }

        public void remove(int j) {
            String[] tmp1 = data;
            data = new String[data.length-1];
            for (int i = 0; i < j; i++){
            data[i] = tmp1[i];
            }
            for (int i = j+1; i < tmp1.length; i++){
                data[i-1] = tmp1[i];
            }
    }
        @Override
        public String toString() {
        return Arrays.toString(data);
        }



}






