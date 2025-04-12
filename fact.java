import java.util.*;
class A {
    private int  Factorial( int n ){
    int f = 1;
    for( int i =1; i<=n;i++){
        f =  f*i;
    }
    return f;
    }
    public static void main(String[] args) {
        A  a= new A();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a Number :: ");
        int n = sc.nextInt();
    // int ans  =   a.Factorial(5);

    // System.out.println("Factorial is :: "+ ans);
    if( n > 0){
        System.out.println("Factorial Is :: "+a.Factorial(n));
    } else{
        System.out.println("You Enter  A Wrong Input :: ");
    }
      
    }
}