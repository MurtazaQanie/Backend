//package exercise6;
//
//import java.util.*;
//
//public class DictionaryOfManyTranslations {
//    HashMap<String, ArrayList<String>> hashMap = new HashMap<>();
//    ArrayList<String> myList = new ArrayList<>();
//
//    public void add(String word, String translation){
//        hashMap.put(word,new ArrayList<>());
//
//
//
//    }
//    public void showingDick(){
//        for (Map.Entry<String, String> i: hashMap.entrySet()){
//            System.out.println(i);
//
//
//        }
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        DictionaryOfManyTranslations that = (DictionaryOfManyTranslations) o;
//        return Objects.equals(hashMap, that.hashMap) && Objects.equals(myList, that.myList);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(hashMap, myList);
//    }
//
//    public ArrayList<String> translate(String word){
//        for (String i: hashMap.keySet()){
//
//            if (hashMap.containsKey(word)){
//                myList.addAll(hashMap.values());}
//            else {
//                break;
//            }
//
//        return myList;
//    }
//}
