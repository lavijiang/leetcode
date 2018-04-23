import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] T) {
       int[] res = new int[T.length];
       Stack<Integer> s = new Stack<>();
       for (int i=T.length-1;i>=0;i--){
           while (!s.empty()&&T[s.peek()]<=T[i]) s.pop();
           res[i]=s.empty()?0:s.peek()-i;
           s.push(i);
       }
       return res;
    }
}