#include<stdio.h>
//if grade is a-car, else if grade is b-bike , else grade is c-rtc
int main(){
	char grade ='a';
	if (grade=='a'){
		printf("CAR");
	}
	else if (grade=='b'){
		printf("BIKE");	
	}
	else if (grade=='c'){
	printf("RTC"); // use else if instead of else to avoid exceptioN
}
}
