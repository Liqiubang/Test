//二分查找 输入的元素必须有序//
public class BinarySort
{
    public static int binary(int[] array, int value)
    {
        int min = 0; //最小索引
        int max = array.length - 1; //最大索引
        
        while(min <= max) //确保不会越界
        {
            int middle = (min + max) / 2; //中间索引
            
            if(value == array[middle])
            {
                return middle;
            }
            else if(value > array[middle])
            {
                min = middle + 1;
            }
            else if(value < array[middle])
            {
                max = middle - 1;
            }
        }
        return -1; //如果没有，返回-1
    }
    public static void main(String[] args)
    {
        int[] a = {3, 4, 5, 6, 7};
        int value = binary(a, 7);
        System.out.println(value); //返回找到的值的索引，没有则返回-1
    }
}
