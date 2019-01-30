import java.util.Scanner;
public class ordenar {

	public static void main(String[] args) {
		int a,b,c,p1,p2,p3;
		System.out.println("Introduzca tres valores");
		Scanner S = new Scanner(System.in);
		p1=0;
		p2=0;
		p3=0;
		a=S.nextInt();
		b=S.nextInt();
		c=S.nextInt();
		
		if(a<b && a<c) {
			p1=a;
			if(b<c) {
				p2=b;
				p3=c;
			}
			else {
				p2=c;
				p3=b;
			}
		}
		
		if(b<a && b<c) {
			p1=b;
			if(a<c) {
				p2=a;
				p3=c;
			}
			else {
				p2=c;
				p3=a;
			}
		}
		
		if(c<a && c<b) {
			p1=c;
			if(a<b) {
				p2=a;
				p3=b;
			}
			else {
				p2=b;
				p3=a;
			}
		}
System.out.println("El ordende menor a mayor es: "+p1+" "+p2+" "+p3);
		
	}		
}
