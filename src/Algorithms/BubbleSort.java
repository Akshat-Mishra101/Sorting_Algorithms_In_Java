/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import sortingalgorithms.DataType;
import sortingalgorithms.Sorter;
import sortingalgorithms.SortingStrategy;

/**
 *
 * @author joey
 */
public class BubbleSort implements Sorter{
    
    Object data[];
    DataType data_type;
    SortingStrategy sorting_strategy;
    public BubbleSort(Object data[],DataType data_type,SortingStrategy sorting_strategy)
    {
     this.data=data;
     this.data_type=data_type;
     this.sorting_strategy=sorting_strategy;
    }
    @Override
    public void sort()
    {
      for(int i=0;i<data.length;i++)
      {
        for(int x=0;x<data.length-(i+1);x++)
        {
         if(data_type==DataType.INT){
            if(sorting_strategy==SortingStrategy.BY_SIZE_ASCENDING)
            {
                if(Integer.parseInt(data[x].toString())>Integer.parseInt(data[x+1].toString()))
                {
                int temp=Integer.parseInt(data[x+1].toString());
                data[x+1]=data[x];
                data[x]=""+temp;
                }
                
                
            }
            else if(sorting_strategy==SortingStrategy.BY_SIZE_DESCENDING){
               if(Integer.parseInt(data[x].toString())<Integer.parseInt(data[x+1].toString()))
                {
                int temp=Integer.parseInt(data[x+1].toString());
                data[x+1]=data[x];
                data[x]=""+temp;
                }
            }
         }
         else {
            
             if(sorting_strategy==SortingStrategy.BY_LENGTH_ASCENDING)
             {
                if(data[x].toString().length()>data[x+1].toString().length())
                {
                String temp=data[x+1].toString();
                data[x+1]=data[x];
                data[x]=temp;
                }
             }
             else if(sorting_strategy==SortingStrategy.BY_LENGTH_DESCENDING)
             {
                if(data[x].toString().length()<data[x+1].toString().length())
                {
                String temp=data[x+1].toString();
                data[x+1]=data[x];
                data[x]=temp;
                }
                
             }
         
         }
            
        }
        
      }
        
        
    }
   

    @Override
    public Object[] getSortedArray() {
        
        return data;
    }
    
}
