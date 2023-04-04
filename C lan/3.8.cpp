#include<stdio.h>
#include<math.h>
int main(){
	int m,n;
	printf("Enter num:\n");
	scanf("%d",&m);
	scanf("%d",&n);
	
	for(int k=n;k<=m;k++){
		int flag=1;
		for (int i=2;i<=sqrt(k);i++){
			if (k%i==0){
				flag=0;
				break;
				}
			}
		if (flag==1){
			printf("%3d",k);
		}
		
			

	}
}

