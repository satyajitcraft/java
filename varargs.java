

public class varargs {
//Variable arguments
static int sum1(int...arr){
    int result=0;
    for (int i : arr) {
        result +=i;
        
    }
    return result;
}
    static int sum2(int x,int...arr){
        int result=x;
        for (int i : arr) {
            result +=i;
            
        }
    return result;
}
    public static void main(String[] args) {

        System.out.println("the sum of 1 is "+sum2(1));
        System.out.println("the sum of 2 and 4 is "+sum2(2,4));
        System.out.println("the sum of 2,4,5,6 is "+sum2(2,4,5,6));
        System.out.println("the sum of 2,4,5,6,7,8 is "+sum2(2,4,5,6,7,8));
        
    }
    
}

