/**
 * @author liqb
 * @create 2020-01-14 9:05
 */
//冒泡排序
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        //排序趟数
        for (int i = 0; i < arr.length - 1; i++) {
            //每一趟排序比较多少次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int a = 0; a < arr.length; a++)
            System.out.println(arr[a]);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 7, 9, 4, 8, 10, 6};
        bubbleSort(arr);
    }

}
