#include<iostream>
using namespace std;
int arr[10]={5,9,7,6,2};
int s = 5;
int indinsertion(int ele,int ind){   //ele = 23, ind = 3
	if(s<10){
		for(int i=ind-1;i<s;i++){
		arr[i+1]=arr[i];
	   }
	   arr[ind]=ele;
	   s++;
	}
	else{
		cout<<"The array is full you cant enter any new value";
		return -1;
	}
}
void display(){
	cout<<endl<<"The list of array: ";
	for(int i=0;i<s;i++){
		cout<<endl<<arr[i];
	}
}
int main(){
	display();
	int element,ind;
	cout<<endl<<"Enter the value of element: ";
	cin>>element;
	cout<<endl<<"Enter the position where you want to insert this: ";
	cin>>ind;
	indinsertion(element,ind);
	display();
}