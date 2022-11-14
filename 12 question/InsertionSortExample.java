 
/*12.C. Write Java programs for implementing  Insertion sort  */

public class InsertionSortExample 
{  
    public static void insertionSort(int array[]) 
{  
        int n = array.length;  
        for (int j = 1; j < n; j++)
 {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) 
{  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
       
    public static void main(String a[])
{    
        int[] arr1 = {9,14,3,2,43,11,90,99,8,58,22};    /* 9 14 3 2 43 11 58 22 --> 1st o/p values */
        System.out.println("Before Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
        System.out.println();    
            
        insertionSort(arr1);//sorting array using insertion sort    
           
        System.out.println("After Insertion Sort");    
        for(int i:arr1){    
            System.out.print(i+" ");    
        }    
    }    
}    
/*
1st output

Before Insertion Sort
9 14 3 2 43 11 58 22 
After Insertion Sort
2 3 9 11 14 22 43 58 

2nd output

Before Insertion Sort
9 14 3 2 43 11 90 99 8 58 22 
After Insertion Sort
2 3 8 9 11 14 22 43 58 90 99 

 */