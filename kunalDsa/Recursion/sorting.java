package kunalDsa.Recursion;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int arr[] = {8,7,6,5,4,3,2,1};
        // bubble(arr, arr.length-1, 0);
        // selection(arr, arr.length, 0, 0);
        // mergeShort(arr);
        //  mergeShortInPlace(arr,0,arr.length);
        quicksort(arr, 0, arr.length-1);
        //! Arrays.sort(arr);  in-built sort function !!
        System.out.println(Arrays.toString(arr));
    }
    public static void quicksort(int arr[],int low,int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid = (s+e)/2;
        int pivot = arr[mid];
        while(s<=e){
                while(arr[s]<=pivot){
                  s++;
                }while(arr[e]>pivot){
                    e--;
                }
                if(s<=e){
                    int temp = arr[s];
                    arr[s] = arr[e];
                    arr[e] = temp;
                    e--;
                    s++;
                }
            }
            quicksort(arr, low, e);
            quicksort(arr, high, s);
        
        }
    
    public static void mergeShortInPlace(int[] arr,int s,int e){
      if(e-s == 1){
        return;
      }
      int mid = (s+e)/2;
      mergeShortInPlace(arr, s, mid);
      mergeShortInPlace(arr, mid, e);
      mergeInPlace(arr,s,mid,e);
    }
    public static int[] mergeInPlace(int[] arr, int s, int m, int e){
            int[] mix = new int[e-s];
            int i = 0;
            int j = 0;
            int k = 0;
            while(i< arr.length && j< arr.length){
                if(s<e){
                    mix[k] = arr[s];
                    s++;
                }else{
                    mix[k] = arr[e];
                    e++;
                }
                k++;
            }
            for(int l = 0;l<mix.length;l++){
                arr[s+l] = mix[l];
            }
            return mix;
    }
    public static void mergeShort(int[] arr){
       if(arr.length == 1){
        return;
       }
       int mid = arr.length/2;
       int[] left = Arrays.copyOfRange(arr, 0, mid);
       int[] right = Arrays.copyOfRange(arr, mid,arr.length);
        merge(left,right);
    }
    public static int[] merge(int[] first, int[] second){
         int i = 0;
         int j = 0;
         int k = 0;
         int[] mix = new int[first.length + second.length];
         while(i< first.length && j < second.length){
            if(first[i] < second[j]){
              mix[k] = first[i];
              i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
         }
         return mix;
    }
    public static void selection(int[] arr,int r, int c, int max){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[max]<arr[c]){
                selection(arr,r,c+1,c);
            }else{
                selection(arr, r, c+1, max);
            }

        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
    public static void bubble(int arr[], int r, int c){
        if(r == 0){
            return;
        }
        if(r>c){
           if(arr[c]> arr[c+1]){
             int temp = arr[c];
             arr[c] = arr[c+1];
             arr[c+1] = temp;
           }
           bubble(arr,r,c+1);
        }else{
            bubble(arr,r-1,0);
        }
    }
}
