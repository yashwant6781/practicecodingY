package sorting;

public class A {
    public static void main(String[] args) {
        int temp=0;
        int[] x = {1,2,98,87,65,23256554,1,644685865,56565624,4465,6598};
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
