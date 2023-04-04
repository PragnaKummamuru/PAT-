#include<stdio.h>
#include<math.h>
int main(){
	int n;
	printf("Enter ip");
	scanf("%d",&n);
	for(int i=2;i<=n;i++){
		if(n%i==0){
			int flag=1;
			for(int j=2;j<=sqrt(i);j++){
				if(i%j==0){
					flag=0;
					break;
				}
			}
			if (flag==1){
				printf("%d",i);
			}
		}
	}
}
