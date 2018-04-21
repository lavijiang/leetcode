import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * 平衡树
 * 时间复杂度O(nlogn)
 * @author lavi
 * @date 2018/4/21
 */
public class MyCalendarI {
    TreeMap<Integer,Integer> calendar;//start为k，end为v
    public MyCalendar() {
        calendar = new TreeMap<>();
    }

    public boolean book(int start, int end) {
        Integer pre = calendar.floorKey(start);
        Integer next = calendar.ceilingKey(start);

        if((pre==null||calendar.get(pre)<=start)&&(next==null||next>=end)){
            calendar.put(start,end);
            return true;
        }
        return false;
    }
}