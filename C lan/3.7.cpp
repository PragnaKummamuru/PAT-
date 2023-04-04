#include<stdio.h>
#include<string.h>

int main(){
	char ip[10];
	printf("Enter ur string:\n");
	scanf("%s",ip);
	printf("\nLength of string:\n");
	printf("%d",strlen(ip));
	printf("\nReverse:\n");
	printf("%s",strrev(ip));
	
}
