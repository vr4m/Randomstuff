public class Euler_2{


            public static main(String[] args){

            fibonacci_gen(4000000);
            sum_even;

            }

            public  int[] fibonacci_gen(int x){
                int[] a = new int[x];
                a[0]=1;
                a[1]=2;
                for(int i=2; i<(a.length-2); i++){
                  a[i]=a[i-1]+a[i-2];
                }

              return a;
            }

            public int sum_even(){
              int sum;
              for(int j = 0; j<a.length;j++){
                while(a[j]%2==0){
                  sum+=a[j];
                }
              }
              return sum;
            }

}
