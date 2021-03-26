import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
	static public void main(String[] args) {
		Terminator terminator1=new CDMATerminator();
		Terminator terminator2=new GSMTerminator();
		Terminator terminator3=new LTETerminator();
		
		runningFiveTimes(terminator1);
		runningFiveTimes(terminator2);
		runningFiveTimes(terminator3);
		
		List list1=new ArrayList<String>();
		List list2=new LinkedList<Integer>();
		
		doSomethingForList(list1);
		doSomethingForList(list2);
		
		String[] sAr= {"abc", "def","123","bbb","Abc","GhI"};
		Arrays.sort(sAr);
		printArray(sAr);
		
		Terminator[] tAr={ new GSMTerminator(), new LTETerminator(),new CDMATerminator()};
		Arrays.sort(tAr);
		printArray(tAr);
		
		
		
		
	}

	private static void printArray(Object[] ar) {
		// TODO Auto-generated method stub
		System.out.print('[');
		for (Object o:ar) {
			System.out.print(o+",");
		}
		System.out.println(']');
	}

	private static void doSomethingForList(List list) {
		// TODO Auto-generated method stub
		list.add("abc");
		list.add(123);
	}

	private static void runningFiveTimes(Terminator terminator) {
		// TODO Auto-generated method stub
		for (int i=0;i<5;i++) {
			terminator.sendMessage("terminator1 sending");
			String message=terminator.receiveMessage();
			System.out.println("msg received: "+message);
		}
	}
}


