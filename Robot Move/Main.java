#include<iostream>
using namespace std;
int total(int cr,int cc,int r,int c)
{	if(cr==r && cc==c)
  		return 1;
 	if(cr>r || cc>c)
      	return 0;
 	return total(cr,cc+1,r,c)  + total(cr+1,cc,r,c);
}
int main()
{
  int m,n;
  cin>>m>>n;
  cout<<total(0,0,m-1,n-1);
  
}