#include <iostream>
#include<string.h>
using namespace std;
int main() 
{
   // Try out your code here
  	int i,j,len1,len2,count=0;
    string s,t;
  	cin>>s;
  	cin>>t;
  	len1=s.length();
  	len2=t.length();
  	if(len1==len2)
    {
  		for(i=0;i<len1;i++)
        {
          for(j=0;j<len2;j++)
          {
          		if(s[i]==t[j])
                {	
                 	t.erase(t.begin()+j);
                  	
                }
          }
        }
    }
  	if(t.length()==0)
      cout<<"Anagram"<<endl; 
  	else
      cout<<"Not anagrams"<<endl;
    return 0;
}