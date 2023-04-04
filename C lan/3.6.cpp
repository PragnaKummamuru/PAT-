#include<stdio.h>
int main(){
	int n,m,limit;
	printf("\nEnter limit:\n");
	scanf("%d",&limit);
	n=2;
	//for even
	while(n<=limit){
		printf("%5d",n);
		n=n+2;
	}
	//for odd
	m=1;
	while(m<=limit){
		printf("\n%5d",m);
		m=m+2;
	}
} 	
