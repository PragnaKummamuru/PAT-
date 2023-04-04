//if marks are bw 700 and 800 , grade is A
//if marks are bw 600 and 699 , grade is B
//if marks are bw 400 and 599 , grade is C
//if marks are bw 0 and 399 , grade is F
#include<stdio.h>
int main(){
	
	int mar=12;
	if (mar>=700 && mar<=800){
		printf("A");
	}
	else if (mar>=600 && mar<=699){
		printf("B");
	}
	else if (mar>=400 && mar<=599){
		printf("C");
	}
	else if (mar>=0 && mar<=399){
		printf("F");
	}
}

