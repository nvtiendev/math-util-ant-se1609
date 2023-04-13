
package com.tien.mathutil.core;

//ta sẽ clone bộ thư viện/công cụ math util của jdk
//giả lập các hàm của class math của jdk
//những gì mà công cụ dùng cho người khác, hàm khác, class khác, thì thường sẽ được tiết 
//kế lại STATIC
//STATIC là chấm trực tiếp qua tên class, éo có new
public class MathUtil {
    
    public static final double PI = 3.141592653589793;
    //hàm tính n! = 1.2.3....n
    //quy ước :
    //ko có giai thừa cho số âm
    //0! = 1! = 1
    //21! vượt 18 số 0 ( kiểu long)
    // hàm của chúng ta design là: chỉ chấp nhận tính giai thừa từ 0-20
    //<0 || >20 chửi, mày đưa N cà chớn!!!!
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw  new IllegalArgumentException("Invalid n. n must be between 0..20");
        if(n == 0 || n ==1)
            return 1;
        
        // sống sót đến dayd, sure n từ 2..20
        long product = 1; // biến con heo đất, nhân tích lũy
                            // acc = accumulation, góp dần
        for (int i = 2; i <= n; i++) 
            product *= i;
      return product;
    }
}

// kỹ thuật lập trình kiểu mới (vẫn giữ nguyên những kiến thức lập trình đã có
//1 plugin mới cho trình độ của dev - viết code chú ý luôn/cam kết code có chất lượng 
//chất lượng không nói =  miệng, chất lượng nói = code
//kỹ thuật TDD = test driven development
//viết code và viết code để test code song song với nhau
//mỗi hàm dev viết ra phải viết ngay cái test case, phải viết ngay hành động
//kiểm thử hàm, để biết rằng hàm vừa viết chạy sai hay đúng