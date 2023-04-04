#include<stdio.h>
int main(){
	int arr[10];
	printf("Enter array elements:");
	for(int i=0;i<10;i++){
		scanf("%d",&arr[i]);
	}
	printf("EVEN:\n");
	for(int i=0;i<10;i++){
		if (arr[i]%2==0){
			printf("%3d",arr[i]);
		}
	}
	printf("\nODD:\n");
	for(int i=0;i<10;i++){
		if (arr[i]%2!=0){
			printf("%3d",arr[i]);
		}
	}
	
	
	
}
