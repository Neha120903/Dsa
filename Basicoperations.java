package Stack;
import java.util.*;
class MyStack{
	int arr[];
	int cap;
	int top;
	MyStack(int c){
		 top=-1;
		 cap=c;
		 arr=new int[cap];
	}
	void push(int x) {
		if(top==cap-1)
			return;
		top++;
		arr[top] =x;
	}
	int pop() {
		if(top==-1)
			return -1;
		int res=arr[top];
		top--;
		return res;
	}
	int peek() {
		if(top==-1)
			return -1;
		return arr[top];
	}
	int size() {
		return top+1;
	}
	boolean isEmpty() {
		return (top==-1);
	}
}
public class Basicoperations {
public static void main(String[] args) {
	MyStack ms= new MyStack(3);
	ms.push(10);
	ms.push(20);
	System.out.println(ms.pop());
	ms.push(30);
	System.out.println(ms.size());
}
}
