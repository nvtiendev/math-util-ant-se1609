
package com.tien.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    @Parameterized.Parameters
    public static Object[][] initData(){
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0}, 
                    {1, 1}, 
                    {2, 2}, 
                    {6, 3}, 
                    {24, 4}, 
                    {120, 5}, 
                    {720, 6}};
        Integer n[][] = new Integer[][]{{1, 0}, 
                    {1, 1}, 
                    {2, 2}, 
                    {6, 3}, 
                    {24, 4}, 
                    {120, 5}, 
                    {720, 6}}; 
        return new Integer[][]{{1, 0}, 
                    {1, 1}, 
                    {2, 2}, 
                    {6, 3}, 
                    {24, 4}, 
                    {120, 5}, 
                    {720, 6}}; 
    }
    //ta phải map 2 cột của từng dòng vào 2 cột của hàm so sánh
    //Assert.assertEquals(??, MathUtil.getFactorial(??));
    //Assert.assertEquals(cột 0, MathUtil.getFactorial(cột 1));
    //vậy map value của mảng từ mảng vào 2 biến nhồi 2 biến này vào hàm so sánh!!!!
    @Parameterized.Parameter(value = 0)
    public long expected; // map vào cột 0
     @Parameterized.Parameter(value = 1)
    public int n; //map vào cột 1
    @Test
    public void testFactorialGivenRightArgumentReturnWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
