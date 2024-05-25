package test2;
import java.util.Scanner;
public class Example {
public static void main(String[] args) {
MethodTesting method= new MethodTesting();
Integer flarf= method.getNum();
System.out.println(flarf);
for(int i=0; i<=5; i++){
	 System.out.println(method.newMethod());

	if (flarf>=50 && flarf<=300) {
	i=5;
		
	}
	else {
		i=0;
	}
}


 }}
