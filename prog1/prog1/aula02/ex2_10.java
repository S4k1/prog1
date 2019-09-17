import java.util.Scanner;


public class Ex2_10 {
	
	public static void main (String args[]) {
	
	Scanner sc = new Scanner(System.in);
	int a, m,d;
	int q, w, e;
	int r, t, y;
	int c;
	q=0;
	w=0;
	e=0;
	r=0;
	t=0;
	y=0;
	c=0;
	System.out.print("\n introduza o numero do dia:");
	d=sc.nextInt();
	
	System.out.print("\n introduza o numero do mês:");
	m=sc.nextInt();
	
	if (m>=13 || m<1) {System.out.print(" \n ERRO: Dia Inexistente \n");}
	
	else {
	
	System.out.print(" introduza o ano:");
	a=sc.nextInt();

	if ((m ==4||m ==6||m ==9||m ==11)) {
		if (d<31 && d>0) {
			if (d==30) { 
				q=d-1;
				w=m;
				r=1;
				t=m+1;
			}
			else if (d==1) {
				q=31;
				w=m-1;
				r=d+1;
				t=m;
				}else if (d!=1 && d!=30) {
					q=d-1;
				    w=m;
				    r=d+1;
				    t=m;
				}
				}
		else {c=1;}
			e=a;
			y=a;
		
		}else if(m==2) {
		   if (d<=29 && d>0) {
			if (a%400==0 && d==29) { 
				q=d-1;
				w=m;
				r=1;
			    t=m+1;
								
				}else if (a%100==0 && d==28){
					q=d-1;
				    w=m;
				    r=1;
				    t=m+1;
					}else if (a%4==0 && d==29) {
					q=d-1;
				    w=m;
				    r=1;
				    t=m+1;
					}else if (d==28 && (a%4)!=0){
					q=d-1;
				    w=m;
				    r=1;
				    t=m+1;
					}else if (d==1) {
				    q=31;
				    w=m-1;
				    r=d+1;
				    t=m;
				    }else if (d!=29 && d!=1 && a%400==0) {
						q=d-1;
				        w=m;
				        r=d+1;
				        t=m;
			        }else if (a%100==0 && d!=28 && d!=1 && d!=29) {
						q=d-1;
				        w=m;
				        r=d+1;
				        t=m;
				        }else if (a%4==0 && d!=1 && d!=29) {
						q=d-1;
				        w=m;
				        r=d+1;
				        t=m;
				        }else if (d!=28 && d!=1 && d!=29) {
						q=d-1;
				        w=m;
				        r=d+1;
				        t=m;
				        }else if (d>28) {c=1;}		
			     }else {c=1;}
			e=a;
			y=a;
			
			}else if (m==1){
				if (d<32 && d>0) {
			if (d==31) { 
				q=d-1;
				w=m;
				e=a;
				r=1;
				t=m+1;
			}
			else if (d==1) {
				q=31;
				w=12;
				e=a-1;
				r=d+1;
				t=m;
				}else if (d!=1 && d!=31) {
					q=d-1;
				    w=m;
				    e=a;
				    r=d+1;
				    t=m;
				}
				}else {c=1;}
			y=a;
			}else if (m==12) {
				if (d<32 && d>0) {
			if (d==31) { 
				q=d-1;
				w=m;
				r=1;
				t=1;
				y=a+1;
			}
			else if (d==1) {
				q=30;
				w=m-1;
				r=d+1;
				t=m;
				y=a;
				}else if (d!=1 && d!=31) {
					q=d-1;
				    w=m;
				    r=d+1;
				    t=m;
				    y=a;
				}
				}else {c=1;}
			e=a;
			}else if (m ==8) {
		if (d<32 && d>0) {
			if (d==31) { 
				q=d-1;
				w=m;
				r=1;
				t=m+1;
			}
			else if (d==1) {
				q=31;
				w=m-1;
				r=d+1;
				t=m;
				}else if (d!=1 && d!=31) {
					q=d-1;
				    w=m;
				    r=d+1;
				    t=m;
				}
				}
		else {c=1;}
			e=a;
			y=a;
		
		}else if (m==3) { 
		if (d<32 && d>0) {
			if (d==31) { 
				q=d-1;
				w=m;
				r=1;
				t=m+1;
			}
			else if (d==1) {
				if (a%400==0) { 
				q=29;
				w=m-1;
				r=d+1;
			    t=m;
								
				}else if (a%100==0){
					q=28;
				    w=m-1;
				    r=d+1;
			        t=m;
					}else if (a%4==0) {
					q=29;
				    w=m-1;
				    r=d+1;
			        t=m;
					}else if ((a%4)!=0){
					q=28;
				    w=m-1;
				    r=d+1;
			        t=m;
				}else if (d!=1 && d!=31) {
					q=d-1;
				    w=m;
				    r=d+1;
				    t=m;
				}
				}
		}else {c=1;}
			e=a;
			y=a;

		}else if ((m ==5||m ==7||m ==10)) {
		if (d<32 && d>0) {
			if (d==31) { 
				q=d-1;
				w=m;
				r=1;
				t=m+1;
			}
			else if (d==1) {
				q=30;
				w=m-1;
				r=d+1;
				t=m;
				}else if (d!=1 && d!=31) {
					q=d-1;
				    w=m;
				    r=d+1;
				    t=m;
				}
				}
		else {c=1;}
			e=a;
			y=a;
		
		}
			
		if (c!=1) {System.out.printf("\n O dia anterior é %2d-%2d-%2d.\n O dia seguinte é %2d-%2d-%2d. \n", q, w, e, r, t, y);}
		else {System.out.print(" \n ERRO: Dia Inexistente \n");}
}
}
}
		
