package Dz3;

import java.util.Arrays;
import java.util.Collections;

public class Ex7 
{
    public static void main(String[] args) 
    {
        Array ar = new Array();
                ar.SortAsc();
                ar.SortDesc();
    }  
}
interface  ISort
{
    void SortAsc();
    void SortDesc();
}
class Array implements ISort
{
    Integer[] nums = { 1, 0, 5, 3 };
 
    public void SortAsc()
    {
        Arrays.sort(nums);
        for (Integer arr1 : nums) {
            System.out.println(arr1);
        }
    }
    public void SortDesc()
    {
        Arrays.sort(nums, Collections.reverseOrder());
        for (int arr1 : nums) {
            System.out.println(arr1);
        }
    }
    
}
