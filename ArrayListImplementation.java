package Stack;
import java.util.*;
class Mystack{
	ArrayList<Integer> al = new ArrayList<>();
	void push(int x) {
		al.add(x);
	}
	int pop() {
		int res =al.get(al.size()-1);
		al.remove(al.size()-1);
		return res;
	}
	int peek() {
		return al.get(al.size()-1);
	}
	boolean isEmpty() {
		return al.isEmpty();
	}
	int size() {
		return al.size();
	}
}
public class ArrayListImplementation {
	public static void main(String[] args) {
		Mystack ms= new Mystack();
		ms.push(10);
		ms.push(20);
		System.out.println(ms.pop());
		ms.push(30);
		System.out.println(ms.size());
	}
}
