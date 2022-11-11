/* 12. B.Write Java programs for implementing the Selection sort */
public class SelectionSortExample 
{  
    public static void selectionSort(int[] arr)
{  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++)
{  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
    public static void main(String a[])
{  
        int[] arr1 = {9,14,3,2,43,18,34,233,58,22};    /*9 14 3 2 43 11 58 22 --> 1st o/p */
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
    }  
}  


/*OUTPUT
Before Selection Sort
9 14 3 2 43 11 58 22 
After Selection Sort
2 3 9 11 14 22 43 58 

2ND OUTPUT

Before Selection Sort
9 14 3 2 43 18 34 233 58 22 
After Selection Sort
2 3 9 14 18 22 34 43 58 233 
 */