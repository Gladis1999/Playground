#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int t,n,i;
  	cin>>t;
  	while(t>0)
    {
      cin>>n;
      int s[n];
      s[0]=1;
      s[1]=6;
      i=2;
      while(n>2)
      {	
        
      	s[i]=2*(s[i-1]+2)-s[i-2];
      	if(i+1==n)
        {	cout<<s[i];
         	cout<<"\t"<<endl;
         	break;
        }
      	i++;
      }
      t--;
  	if(n<=2)
      cout<<s[n-1]<<"\t"<<endl;;
    }
    return 0;
}