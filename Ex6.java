package Dz3;

import java.util.Arrays;

public class Ex6 
{
    public static void main(String[] args) 
    {  
        Array ar = new Array();
        int a = ar.Max();
        System.out.print("Максимальный елемнт массива: " + a + "\n" );
        a = ar.Min();
        System.out.print("Минимальный елемнт массива: " + a + "\n");
        float r = ar.Avg();
        System.out.print("Среднее арифметическое: " + r + "\n");
    }
}
interface  IMath
{
    int Max();
    int Min();
    float Avg() ;
}
class Array implements IMath
{
    int[] nums = new int[] { 1, 0, 5, 3 };
 
    public int Max()
    {
        Arrays.sort(nums);
        return nums[3]; 
    }
    public int Min()
    {
        Arrays.sort(nums);
        return nums[0]; 
    }
    public float Avg()
    {
        Arrays.sort(nums);
        float sr = (nums[0] + nums[1] + nums[2] + nums[3]) / 4;
        return sr; 
    }
}