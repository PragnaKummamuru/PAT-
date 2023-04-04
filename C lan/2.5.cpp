// usage of ternary operator  // ALWAYS USE TERNARY OPERATOR WHEN GREATEST OF CONSTANT NUMBERS IN ASKED
//find greater of two
#include<stdio.h>
int main(){
	int a=3,b=2;
	printf(a>=b?"A":"B");
}

//find greatest of three
int main(){
	int a=3,b=2,c=7;
	printf(a>=b ?(a>=c?"a":"c"):(b>=c?"b":"c"));
}
//the above program performs 4 checks in the worst case

int main(){
	int a=2,b=4,c=6,d=10;
	printf(a>=b? a>=c? a>=d ? "a" : "d" : c>=d ? "c" : "d" : b>=c ? b>=d ? "b" : "d" : c>=d ? "c" :"d"); 
}
