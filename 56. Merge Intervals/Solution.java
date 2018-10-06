/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {

        List<Interval> result = new ArrayList<>();
        if (intervals.size() == 0) return result;
        
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval i1, Interval i2) {
                return i1.start - i2.start;
            }
        });
        
        Interval current = intervals.get(0);
        for (Interval i: intervals) {
            if (i.start <= current.end)
                current.end = Math.max(i.end, current.end);
            else {
                result.add(current);
                current = i;
            }
        }
        
        result.add(current);
        
        return result;
    }
}