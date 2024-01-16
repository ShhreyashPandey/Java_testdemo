import java.util.*;

class Calculator{
	public static double addition(double firstnum, double secondnum){
		return firstnum+secondnum;
	}
	public static double subtraction(double firstnum, double secondnum){
		return firstnum-secondnum;
	}
	public static double multiplication(double firstnum, double secondnum){
		return firstnum*secondnum;
	}
	public static double division(double firstnum, double secondnum){
		if (secondnum != 0) {
            return firstnum / secondnum;
        } else {
            System.out.println("Cannot divide by zero.");
			return Double.NaN;
        }
	}
	public static double sumOfArray(double[] arr,int n){
		double sum=0;
		for(int i=0; i<n; i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static double varOfArray(double[] arr,int n){
		double mean= sumOfArray(arr,n)/n;
		double var=0;
		for (int i=0; i<n; i++) {
            var += Math.pow(arr[i] - mean, 2);
        }
		var=var/n;
		return var;
	}
	public static double stddevOfArray(double[] arr,int n){
		return Math.sqrt(varOfArray(arr,n));
	}
}