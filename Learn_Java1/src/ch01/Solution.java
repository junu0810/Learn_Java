package ch01;
import java.util.*;

public class Solution { 
	public ArrayList<Stack> browserStack(String[] actions, String start) {
    Stack<String> prevStack = new Stack<>();
    Stack<String> nextStack = new Stack<>();
    Stack<String> current = new Stack<>();
    ArrayList<Stack> result = new ArrayList<>();
		
    // TODO:
    current.push(start);
    for(int i = 0; i < actions.length; i++) {
      if (actions[i].equals("-1") && !prevStack.isEmpty()) {  // 뒤로가기 -1
        String firstpage = prevStack.pop();
        String nowpage = current.pop();
        nextStack.push(nowpage);
        current.push(firstpage);
        
        // 원래 있던 페이지를 next 스택에 넣고 prev 스택의 top에 있는 페이지로 이동한 뒤 prev 스택의 값을 pop 
        // currentStack -> nextStack / prevStack.pop -> currentStack.push
      } else if (actions[i].equals("1") && !nextStack.isEmpty()) { //앞으로가기 1
        String nowpage = current.pop();
        String nextpage = nextStack.pop();
        prevStack.push(nowpage);
        current.push(nextpage);
        
      // 앞으로 가기 버튼을 누를 경우 원래 있던 페이지를 prev 스택에 넣고 next 스택의 top에 있는 페이지로 이동한 뒤 next 스택의 값을 pop 합니다.
      // current -> prevStack / nextStack.pop -> current
      } else if (actions[i].equals("1") || actions[i].equals("-1" )){
      } else {
        prevStack.push(current.pop());
        current.push(actions[i]);
        nextStack.clear();

      // 새로운 페이지로 접속할 경우 prev 스택에 원래 있던 페이지를 넣고 next 스택을 비웁니다
      //current -> prevStack.push / nextStack.clear
      }
    }
    result.add(prevStack);
    result.add(current);
    result.add(nextStack); 
    return result;
  }
}
