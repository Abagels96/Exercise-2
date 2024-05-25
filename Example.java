package test2;
import java.util.Scanner;
public class Example {
public static void main(String[] args) {
MethodTesting method= new MethodTesting();
Integer copy= method.getNum();
System.out.println(copy);
for(int i=0; i<=5; i++){
	 System.out.println(method.newMethod());

	if (copy>=50 && copy<=300) {
	i=5;
		
	}
	else {
		i=0;
	}
}


 }}
