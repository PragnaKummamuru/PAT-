#include <stdio.h>
int main(){
	int arr[]={1,2,3,4,5};
	for(int i=0;i<sizeof(arr);i++){
		printf("%d\n",arr[i]);
	}
}
