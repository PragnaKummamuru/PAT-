#include<stdio.h>
//find largest of three numbers
int main(){
	int a=5,b=7,c=10;
	if ((a>=b)&&(a>=c)){
		printf("a is greatest");
	}
	else if ((b>=c)){
		printf("b is greatest");
	}
	else{
		printf("c is greatest");
	}
}
// the above program performs 6 checks in the worst case
// for better perfomance using ternary operation(2.5)


