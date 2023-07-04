import java.util.Random;
class Quick_Sort {
    public static void QuickSort(int arr[], int left, int right) {
        int l = left;
        int r = right - 1;
        int size = right - left;
        if(size>1){
            Random rn = new Random();
            int Pivot = arr[rn.nextInt(size)+l];
            while(l < r){
                while(arr[r] > Pivot && r>l){
                    r--;
                }
                while(arr[l] < Pivot && l<=r){
                    l++;
                }
                if(l<r){
                    int temp = arr[l];
                    arr[l] = arr[r];
                    arr[r] = temp;
                    l++;
                }
            }
            QuickSort(arr, left, l);
            QuickSort(arr, r, right);
        }
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i<n;++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10, 54, 63, 6, 420, 11, 41, 32, 17, 22};
        QuickSort(arr, 0, arr.length);
        printArray(arr);
    }
}
