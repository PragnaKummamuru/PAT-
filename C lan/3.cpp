#include<stdio.h>
int main(){
	int m,n;
	int a[10][20];
	printf("Enter num of rows and cols:\n");
	scanf("%d",&m);
	scanf("%d",&n);
	printf("Enter values:\n");
	int i,j;
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			scanf("%d",&a[i][j]);
		}
	}
	printf("Print matrix:\n");
	for(i=0;i<m;i++){
		for(j=0;j<n;j++){
			printf("%5d",a[i][j]);
		}
		printf("\n");
	}
	
}
