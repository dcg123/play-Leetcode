import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution56 {


    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {
        List<Interval> list=new ArrayList<>();
        Solution56 solution56=new Solution56();
        Interval interval1=solution56.new Interval(2,6);
        Interval interval2=solution56.new Interval(1,3);
        Interval interval3=solution56.new Interval(8,10);
        Interval interval4=solution56.new Interval(15,18);
        list.add(interval1);
        list.add(interval2);
        list.add(interval3);
        list.add(interval4);
        System.out.println(new Solution56().merge(list));
    }


    /**
     *合并重复区间
     * [[1,3],[2,6],[8,10],[15,18]]
     * Output: [[1,6],[8,10],[15,18]]
     * Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
     */

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result=new ArrayList<>();

        if (intervals==null||intervals.size()==0){
            return result;
        }

        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start-o2.start;
            }
        });

        result.add(intervals.get(0));

        for (int i=1;i<intervals.size();i++){
            Interval interval=intervals.get(i);
            if (result.get(result.size()-1).end<interval.start){
                result.add(interval);
            }else{
                result.get(result.size()-1).end=Math.max(result.get(result.size()-1).end,interval.end);
            }
        }

        return  result;

    }
}
