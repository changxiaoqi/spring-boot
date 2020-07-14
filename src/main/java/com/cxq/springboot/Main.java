package com.cxq.springboot;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<List<Integer>> lists = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(3);
        list2.add(5);
        list2.add(7);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(6);
        list3.add(25);
        list3.add(56);
        List<Integer> list4 = new ArrayList<>();
        list4.add(9);
        list4.add(16);
        list4.add(25);
        list4.add(37);


        lists.add(list1);
        lists.add(list2);
//        lists.add(list3);
//        lists.add(list4);

        mergeNSort(lists);
    }


    // 将n个有序数集合并成一个新的有序集合,外排方式，时间复杂度list1.size()+...+listn.size()
    public static void mergeNSort(List<List<Integer>> lists) {
        List<Integer> result = lists.get(0);

        for (int i = 1; i < lists.size(); i++) {
            result = mergeTwoSort(result, lists.get(i));
        }

        for (int x : result) {

            System.out.print(x + " ");
        }
    }


    public static List<Integer> mergeTwoSort(List<Integer> list1, List<Integer> list2) {
        int p1 = 0, p2 = 0;
        List<Integer> list3 = new ArrayList<>();

        while (p1 < list1.size() && p2 < list2.size()) {
            if (list1.get(p1) < list2.get(p2))
                list3.add(list1.get(p1++));
            else
                list3.add(list2.get(p2++));
        }

        while (p1 < list1.size())
            list3.add(list1.get(p1++));

        while (p2 < list2.size())
        list3.add(list2.get(p2++));

        return list3;
        }
        }
