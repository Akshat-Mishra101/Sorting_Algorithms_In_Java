/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author joey
 */
public class SelectionSort implements Sorter {
    Object data[];
    DataType data_type;
    SortingStrategy sorting_strategy;
    public SelectionSort(Object data[],DataType data_type,SortingStrategy sorting_strategy){
      this.data=data;
      this.data_type=data_type;
      this.sorting_strategy=sorting_strategy;
    }
    @Override
    public void sort() {
       for(int i=0;i<data.length-1;i++)
       {
       int min_index=i;
       for(int j=i+1;j<data.length;j++)
       {
          if(data_type==DataType.INT)
          {
            if(sorting_strategy==SortingStrategy.BY_SIZE_ASCENDING)
            {
                 if (Integer.parseInt(data[j].toString()) < Integer.parseInt(data[min_index].toString()))
                    min_index = j;
            }
            else if(sorting_strategy==SortingStrategy.BY_SIZE_DESCENDING)
            {
                 if (Integer.parseInt(data[j].toString()) > Integer.parseInt(data[min_index].toString()))
                    min_index = j;
            }
          }
          else if(data_type==DataType.STR)
          {
          
          
          }
       }
       
       Object temp=data[min_index];
       data[min_index] = data[i];
       data[i] = temp;
       
       
       }
    }

    @Override
    public Object[] getSortedArray() {
        return data;
      
    }
    
}
