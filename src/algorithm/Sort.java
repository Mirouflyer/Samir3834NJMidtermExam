package algorithm;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */

	//**************************************************************
	//SelectionSort Algorithm.

    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<array.length-1; j++){
            int min = j;
            for(int i=j+1; i<array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    //***********************************************************
    //insertionSort Algorithm

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for (int i=1;i<array.length ;i++){
            int key = array[i];
            int j = i-1;

            while (j>=0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
     //*********************************************************
    //bubbleSort Algorithm

    public int[] bubbleSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int n = array.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (array[j] > array[j+1])
                {
                    // swap temp and arr[i]
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    



        public  void mergesort(int[] input) {
        mergesort(input, 0, input.length - 1);

            final long startTime = System.currentTimeMillis();
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;

    }





        private static void mergesort(int[] input, int start, int end) {

            // break problem into smaller structurally identical problems
            int mid = (start + end) / 2;
            if (start < end) { mergesort(input, start, mid);
            mergesort(input, mid + 1, end); }
            // merge solved pieces to get solution to original problem
            int i = 0, first = start, last = mid + 1;
            int[] tmp = new int[end - start + 1];
            while (first <= mid && last <= end) {
                tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
            }
            while (first <= mid) {
                tmp[i++] = input[first++];
            }
            while (last <= end) {
                tmp[i++] = input[last++];
            } i = 0; while (start <= end) {
                input[start++] = tmp[i++];
            }




    }
        //*****************************************************************************
        //QuickSort
              private  int array [];
              private int length;
        public void quicksort(int[] inputArr) {

            if (inputArr == null || inputArr.length == 0) {
                return;
            }
            this.array = inputArr;
            this.length = inputArr.length;
            quickSort(0, length - 1);
        }

        private void quickSort(int lowerIndex, int higherIndex) {

            int i = lowerIndex;
            int j = higherIndex;
            // calculate pivot number, I am taking pivot as middle index number
            int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
            // Divide into two arrays
            while (i <= j) {
                /**
                 * In each iteration, we will identify a number from left side which
                 * is greater then the pivot value, and also we will identify a number
                 * from right side which is less then the pivot value. Once the search
                 * is done, then we exchange both numbers.
                 */
                while (array[i] < pivot) {
                    i++;
                }
                while (array[j] > pivot) {
                    j--;
                }
                if (i <= j) {
                    exchangeNumbers(i, j);
                    //move index to next position on both sides
                    i++;
                    j--;
                }
            }
            // call quickSort() method recursively
            if (lowerIndex < j)
                quickSort(lowerIndex, j);
            if (i < higherIndex)
                quickSort(i, higherIndex);
        }

        private void exchangeNumbers(int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }


        
        
   //**********************************************************

      //HeapSort Algorithm

        public void heapsort(int arr[])
        {

            int n = arr.length;

            // Build max heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(arr, n, i);
            }


            // Heap sort
            for (int i=n-1; i>=0; i--)
            {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;

                // Heapify root element
                heapify(arr, i, 0);
            }
        }

        void heapify(int arr[], int n, int i)
        {
            final long startTime = System.currentTimeMillis();
            // Find largest among root, left child and right child
            int largest = i;
            int l = 2*i + 1;
            int r = 2*i + 2;

            if (l < n && arr[l] > arr[largest])
                largest = l;

            if (r < n && arr[r] > arr[largest])
                largest = r;

            // Swap and continue heapifying if root is not largest
            if (largest != i)
            {
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;

                heapify(arr, n, largest);
            }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
        }

 //*************************************************************

  //BucketSort

    public int[] bucketsort(int[] nums, int max_value)
    {
        final long startTime = System.currentTimeMillis();
        int[] Bucket = new int[max_value + 1];
        int[] sorted_nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            Bucket[nums[i]]++;
        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sorted_nums[outPos++] = i;

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;


        return sorted_nums;
    }

    static int max_value(int[] nums)
    {
        int max_value = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] > max_value)
                max_value = nums[i];
        return max_value;
    }





  //*************************************************************
    //ShellSort Algorithm.

    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        int h = 1;
        while (h <= array.length / 3) {
            h = 3 * h + 1; //
        }


        while (h > 0) {

            // This step is similar to insertion sort below
            for (int i = 0; i < array.length; i++) {

                int temp = array[i];
                int j;

                for (j = i; j > h - 1 && array[j - h] >= temp; j = j - h) {
                    array[j] = array[j - h];
                }
                array[j] = temp;
            }
            h = (h - 1) / 3;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
