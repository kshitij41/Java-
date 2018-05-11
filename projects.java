
import java.util.*;
public class projects {
	public void EvenBeforeOdd(int[] arr) {
		int evenIndexNum =0;
		int oddIndexNum = 0;
		int count = 0;
		int evenNum=0;
		int oddNum=0;
		for(int i = 0; i < arr.length;i++) {
			if(arr[i]%2 ==0)
				{evenNum++;}
		    if(arr[i]%2==1)
		    	{oddNum++;}}
		int[] evenIndex = new int[evenNum];
		int[] oddIndex = new int[oddNum];
		while(count < arr.length) {
			if(arr[count]%2 == 0)
				evenIndex[evenIndexNum++] = count;
			if(arr[count]%2 == 1)
				oddIndex[oddIndexNum++] = count;
			count++;
		}
		int backwardIndex = evenIndex.length-1;
		int forwardIndex = 0;
		while(evenIndex[backwardIndex]> oddIndex[forwardIndex]) {
			int temp1 = arr[evenIndex[backwardIndex]];
			int temp2 = arr[oddIndex[forwardIndex]];
			arr[evenIndex[backwardIndex--]] = temp2;
			arr[oddIndex[forwardIndex++]] = temp1;
		}
		for(int x: arr)
		  System.out.print(x+ " ");
		
	}
	public void kSort(int[] arr,int k) {
		int count =0;
		int ref = k;
		int lessTk = 0;
		int moreTk = 0;
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < ref) {lessTk++;}
			if(arr[i]>=ref){moreTk++;}
	    }
		int[] lessTObjects = new int[lessTk];
		int[] moreTObjects = new int[moreTk];
		int lessTkfill = 0;
		int moreTkfill = 0;
		while(count < arr.length) {
			if(arr[count] < ref) {lessTObjects[lessTkfill++] = count;}
			if(arr[count] >= ref) {moreTObjects[moreTkfill++] = count;}
			count++;
		}
		int backward = lessTObjects.length-1;
		int forward = 0;
		while(lessTObjects[backward]> moreTObjects[forward]) {
			int temp1 = arr[lessTObjects[backward]];
			int temp2 = arr[moreTObjects[forward]];
			arr[lessTObjects[backward]] = temp2;
			arr[moreTObjects[forward]] = temp1;
			backward--;
			if(backward < 0 ) {break;}
			forward++;
			if(forward == moreTObjects.length) {break;}
		}
		System.out.println();
		for(int x: arr)
		 System.out.print(x + " ");
	}
	
	public void sumK(int[] arr ,int sum) {
		int[] array = arr;
		int count = 0;
		int k = sum;
		int lessTHalf =0;
		int moreTHalf =0;
		int eqTHalf = 0;
		for(int i =0;i < array.length;i++) {
			if(array[i]<sum/2) {lessTHalf++;}
			if(array[i]>sum/2 && arr[i] < sum) {moreTHalf++;}
			if(array[i]== sum/2) {eqTHalf++;}
	    }
		int lessThalfObjFill = 0;
		int[] lessThalfObj =  new int[lessTHalf];
		int moreThalfObjFill = 0;
		int[] moreThalfObj = new int[moreTHalf];
		int eqTHalfFill = 0;
		int[] eqTHalfObj = new int[eqTHalf];
		if(eqTHalfObj.length >=1) {System.out.println();
			System.out.println("True (halfs)");}
		while(count < array.length) {
			if(array[count] < sum/2 && lessThalfObjFill < lessThalfObj.length) {lessThalfObj[lessThalfObjFill++] = count;}
			if(array[count] > sum/2 && moreThalfObjFill < moreThalfObj.length && array[count] < sum){moreThalfObj[moreThalfObjFill++] = count;}
			count++;
		}
		for(int x:lessThalfObj) {
			for(int y:moreThalfObj)
		           {if(array[x]+array[y]==sum) {
		        	   System.out.println();
		        	   System.out.println("True");}}
		
		           
		}
		           
	}
	
	public boolean recurStackRemove(Stack<Integer> st) {
		Stack<Integer> s = st;
		Iterator<Integer> iter = s.iterator();
		while(iter.hasNext()) {
			 s.pop();
		}
		return true;
		
	}
	
	public void StackTransfer(Stack<Integer> s) {
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		Stack<Integer> toRev = s;
		while(!(toRev.isEmpty())) {s1.add(toRev.pop());}
		while(!(s1.isEmpty())) {s2.add(s1.pop());}
		while(!(s2.isEmpty())) {toRev.add(s2.pop());}
		System.out.println(toRev.toString());
	}
		

		
		
		
		
	

}
