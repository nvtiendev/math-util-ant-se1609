
package com.tien.mathutil.main;

import com.tien.mathutil.core.MathUtil;

public class Main {

    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
        System.out.println("This message comes from a US-built JAR file");
        tryTDDFirst();
    }
    public static void tryTDDFirst(){
        //Test Case #1 - tình huống sài app số 1;
        // n = 0; hy vọng hàm trả về expected = 1;
        //      thực tế hàm trả về máy, actual, đoán xem , chạy hàm mới biết !!!!
        long expected =  1;
        long actual = MathUtil.getFactorial(0);   //xài hàm vừa viết ;
        //so sánh 2 giá trị để hàm vừa viết đúng hay không???
        //3 thứ này tổ hợp nên 1 thứ gọi là TEST case = tình huống xài app/hàm
        System.out.println("0! Status | Expected = " + expected +
                    " | Actual = " + actual);
        // vietssub: 0! có đúng = 1 hay k ?
        
        //Test Case #2 n = 1, 1! hy vọng trả về 1 luôn thực tế là mấy ,chạy hàm mới biết 
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! Status | Expected = " + expected +
                    " | Actual = " + actual);
        //Test Case #3 n = 2, 2! hy vọng trả về 2 luôn thực tế là mấy ,chạy hàm mới biết 
        System.out.println("2! Status | Expected = 2" +
                    " | Actual = " +MathUtil.getFactorial(2));
    }
}
