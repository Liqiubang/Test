/**
 * @author liqb
 * @create 2019-08-01 15:44
 */
public class QuickSort {
    public static void quickSort(int[] arr,int left,int right){
        if(left>right){
            return;
        }
        int base = arr[left];
        int l = left;
        int r = right;
        //不知道循环多少次，用while  l和r不相遇的情况
        while (l != r){
            //必须先从右边开始找
            //如果右边的值小于base，则停下。大于base则继续找
            //把左边的当做基准数，从右边开始找，反之亦然
            while (arr[r] >= base && l<r){
                r--;
            }
            while (arr[l] <= base && l<r){
                l++;
            }
            //到这里，l和r都找到了数字并停下，交换位置
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        //l,r相遇  基准值和指针重合点交换
        arr[left] = arr[l];  //arr[left]现在还是第一个元素，也就是base
        arr[l] = base;
        //base归位，左边的都比它小，右边的都比它大

        quickSort(arr, left, l-1);
        quickSort(arr, l+1, right);
    }

    public static void main(String[] args) {

        int[] arr={7,1,4,9,4,8,4,10,1};
        quickSort(arr,0,arr.length-1);

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
