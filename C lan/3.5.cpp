#include<stdio.h>
int main()
{
 int n,last;
 printf("\n Enter Last Number : ");
 scanf("%d",&last);
 // Code for Even Number list
 printf("\n Even Number List :\n ");
 n=2;
 do 
  {
   printf(" %d",n);
   n=n+2;

  } 
  while(n<=last);

 // Code for Odd Number List
 printf("\n\n Odd Number List :\n ");

 n=1;
  do
  {
   printf(" %d",n);
   n=n+2;

  } 
  while(n<=last);

 }
