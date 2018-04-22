import java.util.ArrayList;
import java.util.List;

/**
 * 采用暴力求解
 * 时间复杂度O(n²)
 * @author lavi
 * @date 2018/4/22
 */
public class MyCalendarII {
    List<int[]> calendar;
    List<int[]> douCheck;
    public MyCalendarII() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for(int[] a:douCheck){
            if(start<a[1]&&end>a[0])
                return false;
        }
        for(int[] a:calendar){
            if(start<a[1]&&end>a[0]){
                douCheck.add(new int[]{Math.max(start,a[0]),Math.min(end,a[1])});
            }
        }
        calendar.add(new int[]{start,end});
        return true;
    }
}