/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import Algorithms.SelectionSort;
import java.util.stream.Stream;

/**
 *
 * @author joey
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object Integer_Array[]={"1","4","3","2","5","10","7","9","6","8","0"}; // Sample Unsorted Integer Array
        Object srt_Array[]={"hello","world","this","is","akshat"};
      // Sorter sorter=new BubbleSort(srt_Array,DataType.STR,SortingStrategy.BY_LENGTH_ASCENDING);
     //  sorter.sort();
       
       
       Sorter sorter2=new SelectionSort(srt_Array,DataType.STR,SortingStrategy.BY_LENGTH_ASCENDING);
       sorter2.sort();
       Stream.of(sorter2.getSortedArray()).forEach(System.out::println);
    }
    
}
