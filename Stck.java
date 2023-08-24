class stck{

int arr[]= new int[5];
int top;
int r;
void push(int n){

if(top<4)
{
top++;
r=n;
arr[top]=r;
}
else{
System.out.println("Stack Overflow");

}

}
void pop(int n){
if(top==-1)
{System.out.println("Stact underflew");}
else
{r=n;
arr[top--]=r;}

}
stck(){
top=-1;
}

void display(){
System.out.println("The element at position "+ top +" is " + arr[top]);
}




public static void main(String args[]){
stck X = new stck();
X.push(8);
X.display();
X.push(2);
X.display();
X.push(65);
X.display();
X.push(7);
X.display();
X.push(89);
X.display();

X.push(9);
X.display();

X.pop(10);
X.display();
X.pop(10);
X.display();
X.pop(10);
X.display();
X.pop(10);
X.display();
X.pop(10);
X.display();

}
}