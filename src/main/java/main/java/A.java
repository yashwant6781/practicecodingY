package bubblesortingARRAY;

public class A {
    public static void main(String[] args) {
        int[] x ={1,2,3,9,86,2,3,54,1,353,59,2,6,61610,0};
        int temp=0;
        for(int j=0; j<x.length-1; j++){
            for(int i=0; i<x.length-1; i++){
                if(x[i]>x[i+1]){
                    temp=x[i+1];
                    x[i+1]=x[i];
                    x[i]=temp;
                }
            }
        }
        for(int i:x){
            System.out.println(i);
        }
    }
}
