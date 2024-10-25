package RecursionFinish.Assingment;
//https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
public class PrintWithoutLoop {
    public static void main(String[] args) {
        int n=5;
        print(1, n);
    }
    static void print(int index, int n){
           if(index==n) {
               System.out.print(index +" ");
               return;
           }
        System.out.print(index +" ");
        print(index+1, n);
    }

}
