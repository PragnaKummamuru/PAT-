#include<stdio.h>
int main(){
	int arr[10];
	printf("Enter array elements:");
	for(int i=0;i<10;i++){
		scanf("%d",&arr[i]);
	}
	for(int j=0;j<10;j++){
		arr[j]=arr[j]*arr[j];
	}
	printf("MODIFy:\n");
	for(int i=0;i<10;i++){
		printf("%d\t",+arr[i]);
	}
}
