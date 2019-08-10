package com.epam.Sergei_Skorobogatov.java.lesson4.task1;



public class DynamicArray {
    private String[] data = new String[3];
    private int size = 0;

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

 /*  public void remove(String s) {
        if (data.length <= size){
            String[] tmp1 = data;
            data = new String[size];
            for (int i = 0; i < tmp1.length; i++) {
                data[i] = tmp1[i - 1];
            }
            data[size] = s;
            size--;
        }
    }*/

    public static void main(String[] args) {
        DynamicArray vector = new DynamicArray();
        vector.add("1");
        vector.add("2");
        vector.add("15");
        vector.add("Selenium");
        vector.add("222222222222222");
        vector.add("66666666666");
       // System.out.println(vector.get(5));
       // System.out.println(vector.getLast());
        System.out.println(vector.size());
        //vector.remove("2");


    }





    /*private void Remove() {
        String[] alphabet = {"a", "b", "c", "d"};
        List list = Arrays.asList(alphabet);
        list = new ArrayList(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        list.remove(2);
        list.forEach(s -> System.out.println(s));
    }

    private void Add() {

    }*/
}






