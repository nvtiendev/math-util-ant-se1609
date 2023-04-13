
package com.tien.mathutil.core;

import junit.framework.Assert;
import org.junit.Test;


public class MathUtilTest {
    //DDT : tối ưu code test data driven testing
    // tach sbooj data kiểm thử ra 1 chỗ
    // lát hồi nhồi/fill/đền//feed data này tuần tự vaofchoox kiểm thử
    //vvis dụ tách data đã kiểm thử ở trên màn thành
    //1  1
    //120 5
    //720 6
    
    
    //Assert.assertEquals(6, MathUtil.getFactorial(3));
    // thay vì lệnh so sánh gọi viết cho từng case, ta biến lệnh này
    // trở thành tổng quát, ko đền data cụ thể, mà sẽ lấy từ đâu đó
    
    //Assert.assertEquals(???, MathUtil.getFactorial(??));
    // ?? là sẽ lấy ở tập data ở trên !!!
    //code gọn hơn, đẹp hơn, dễ bảo trì, kiểm soát dc đủ thiếu các case 
    //kĩ thuật này tách code test ra khỏi data của nó, lát hồi fill lại sau
    //đc gọi là kĩ thuật viết case theo kiểu tham số hóa
        // parameteried
    //hoặc còn gọi là 
    // viết kiểm thử hướng về tách data riêng ra !!!
    
    
    //hàm getF() dc thiết kế trả về 1 con long nếu n đưa vào 0..29
    //hàm getF() dc thiết kế ném ra excepction nếu ta đưa vào n < 0 || n > 20
        // tức là nếu gọi  getF(5) thì chỗ gọi sẽ nhận về exception tên là
    // fileArgumentThrowsException
    //đưa cả chớn, nhận ngoại lệ!!!
    //bắt xem hàm mình có đúng ném ra ngoại lệ k nếu data cà chớn
    //thấy ngoại lệ mừng rơi nước mắt
    //
    @Test(expected = Exception.class)
    // khi chạy hàm này kiểm tra dùm taoxem có
    //ngoại lệ thuộc IllegalArgumentException hay k
    // nó xh, cách nó dc new IllegalArgumentException ở đâu đó
    // nếu nó có xuất hiện mừng quá, đúng như thiết kế, màu xanh
    // kì vọng mày xh, dù mày là ex, và mày xh thật, màu xanh
    public void testFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
       
        //test case #4 n = 3!; ex 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //test case #5 n = 4!; ex 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //test case #6 n = 5!; ex 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
        //test case #7 n = 6!; ex 720
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        
      
        
        
    }
    
    //tên hàm test bao gồm luôn ý nghĩa test cái gì
    // quy ước dân kiểm thử
    //hàm này tui muốn test hàm giai thừa khi đưa tham số dùng
    //máy phải trả về đúng
    //viết code phải thuân thủ theo quy tắc _CoDing Convention
    @Test 
    public void testFactorialGivenRightArgumentReturnsWell(){
        //test case #1: kiểm thử tình huống 0! có đúng k
        //n = 0 hy vọng hàm trả về expected = 1; actual thực tế
        //hàm chạy trả về ra máy, đoán xem ??
        long expected = 1;
        long actual = MathUtil.getFactorial(0);//goin hàm xem;
        // so sánh 2 giá trị coi tương đồng k
        //so sánh  =sout() và dùng mắt để kết luận, xưa rồi
        //muốn chơi mày
        Assert.assertEquals(expected, actual);
        
        //test case #2: kiểm thử tình huống 1! có đúng k
        //n = 1 hy vọng hàm trả về expected = 1; actual thực tế
        //hàm chạy trả về ra máy, đoán xem ??
        expected = 1;
        actual = MathUtil.getFactorial(1);//goin hàm xem;
        Assert.assertEquals(expected, actual);
        
         Assert.assertEquals(expected, actual);
        //test case #3: kiểm thử tình huống 2! có đúng k
        //n = 2 hy vọng hàm trả về expected = 2; actual thực tế
        //hàm chạy trả về ra máy, đoán xem ??
        expected = 2;
        actual = MathUtil.getFactorial(2);//goin hàm xem;
        Assert.assertEquals(expected, actual);
        
        
    }
    @Test
    public void tryUnitFirst(){
        Assert.assertEquals(69, 69);
    }
    
}
// class này ta sẽ viết các đoạn code như bình thường
//nhưng code này dùng để test code chính bên mathuitl
//viet code để test code, thì cái đoạn code test này dc gọi là
// test script
//test script là những đoạn code dc viết ra để test code khác, code chính
//trả về của hàm chính cần test với giá trị kì vọng
////những đoạn code này/test script này sẽ phải bao gồm các test case
//bên trong
//test script chứa các test case
//trong test script/class này sẽ có test 5! 6! 7! -5! => test case
//@Test @ đc gọi là anotation, kí hiệu , flag, để đánh dấu đầu đoạn code
// mang ý nghĩa nào đó, và khi biến dịch/complie code thì
// thư viện đi kèm nó sẽ tự động generate thêm code cho mình tùy theo
//@
//ví dụ @Test thì thư viện JUnit này import nó sẽ ngầm tự generate
//hàm này thành public static void main() và gói main() này cho JVM
//kĩ thuật dùng thư viện bị ép phải theo cú pháp của nó qua những 
//@, thư viện này gọi là FRAMEWORK
//FW là những file, jar, dll, chứa 1 đống classbeen trong 
//ép ta phải xài theo cách của nó, theo dàn khung code mà nó quy ước
//dàn khung, template, ta điền nốt code lại 

//Thư viện = libary, những file, jar, dll chưa 1 đống class bên trong 
//ta thoải mái dùng hàm của nó theo cách của ta

//quy tắc chơi xanh đỏ
//xanh khi tất cả các test case đều xanh, tức là tất cả
// ex phải == ac
//đỏ chỉ cần 1 test case màu đỏ, xem như hàm toang/tạch
// chỉ cần 1 ex != ac, khi xem như bỏ đi hết các test case
//1 thằng gãy sai cho tất cả
//Lý do: hàm đã đúng thì phải dùng hết cho các case đã đc nêu ra 
//  chỉ cần 1 sự k == nhau của script và ex, hàm k
//  ổn định và kết quả trả về => SAI
//ko thể test hết các case (NL2) nhưng đã test case nào thì phải ngon
//xanh case đó

//nói thêm về dodr 
//đỏ xảy ra khi : có 1 sự ko = của e và ac
// lý do gì ex != ac
//có 2 lý do
//ld1: ex đúng , mình tính bên ngoài, = tay khi chưa có hàm
// ac sai , tình huống này hàm cùi bắp, bug

//ld2: ex sai, vứt luôn test case này đi, anh chàng qc/dev bị ngáo
//kì vọng mà sai, hy vọng gì ở ac 
