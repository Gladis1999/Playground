#include <iostream>
#include<stdlib.h>
using namespace std;
struct node
{
  int data;
  struct node* next;
};
struct node* head=NULL;
void pushbeg(int value)
{
  node* n=new node;
  n->data=value;
  n->next=head;
  head=n;
  
}
void pushend(int value)
{
  node* n=new node;
  node* last=head;
  n->data=value;
  n->next=NULL;
  if(head==NULL)
    head=n;
  else
  {
    while(last->next!=NULL)
  		last=last->next;
  last->next=n;
  }
}
int popbeg()
{
  int value;
  if(head==NULL)
  	return -1;
  node *temp=head;
  value=temp->data;
  head=temp->next;
  delete(temp);
  return value;
}
int popend()
{
  int value;
  node*temp=head;
  if(head==NULL)
  	return -1;
  if(head->next==NULL)
  {	value=head->data;
    head=NULL;
   	delete(temp);
  	return value;
  }
  
  while(temp->next->next!=NULL)
    	temp=temp->next;
  value=temp->next->data;
  delete(temp->next);
  temp->next=NULL;
  return value;
}
void traverse()
{ node* temp=head;
  if(head==NULL)
    cout<<"Linked list is empty.\n";
  else
  {	while(temp!=NULL)
  	{
    	cout<<temp->data<<" ";
    	temp=temp->next;
  	}
   cout<<"\n";
  }
  
}
    
  

int main() 
{
   // Try out your code here
  	int n;
    while(1)
    {	cin>>n;
      	switch(n)
      	{	case 1:
         	{
              int element;
              cout<<"Enter value of element\n";
              cin>>element;
              pushbeg(element);
              break;
            }
         	case 2:
         	{
              int element;
              cout<<"Enter value of element\n";
              cin>>element;
              pushend(element);
              break;
            }
         	case 3:
         	{	traverse();
             	break;
            }
         	case 4:
         	{
              int x;
              x=popbeg();
              if(x!=-1)
              	cout<<x<<" deleted from beginning successfully.\n";
              else
                cout<<"Linked list is empty.";
              break;
            }
         	case 5:
         	{
              int x;
              x=popend();
              if(x!=-1)
              	cout<<x<<" deleted from end successfully.\n";
              break;
            }
         	case 6:
         	{
              exit(1);
              break;
            }
         if(n>7)
         		exit(1);
        }

    }
      
    return 0;
}