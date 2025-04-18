package org.practice.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

        public static List<List<String>> groupAnagrams(String[] strs) {
            HashMap<String,List<String>> map = new HashMap<>();
            for(String str:strs){
//                System.out.println("KeySet:"+map.keySet());
                if(map.containsKey(sortString(str))){
                    map.get(sortString(str)).add(str);
                }else{
                    map.put(sortString(str),new ArrayList<>(Arrays.asList(str)));
                }
            }

            System.out.println(map);
            List<List<String>> res = new ArrayList<>();
            for(String str: map.keySet()){
                ArrayList<String> temp = new ArrayList<>();
                for(String s: map.get(str)){
                    temp.add(s);
                }
                res.add(temp);
            }
            return res;
        }

        public static String sortString(String s){
            String[] arr = s.split("");
            Arrays.sort(arr);
            StringBuilder res = new StringBuilder();
            for(String c:arr){
                res.append(c);
            }
            return res.toString();
        }

    public static void main(String[] args) {
        String arr[] = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagrams(arr));
//        System.out.println(sortString("cat"));

        }

}
