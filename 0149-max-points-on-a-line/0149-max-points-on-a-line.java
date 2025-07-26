class Solution {
    public int maxPoints(int[][] points) {
        if (points == null) return 0;
        int n = points.length;
        if (n <= 2) return n;
        int result = 1;
       for (int i = 0; i < n; i++) {
            Map<Pair<Integer, Integer>, Integer> slopeCount = new HashMap<>();
            int same = 1;
            int localMax = 0;
            int x1 = points[i][0], y1 = points[i][1];
             for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0], y2 = points[j][1];
                if (x1 == x2 && y1 == y2) {
                    same++;
                } else {
                    Pair<Integer, Integer> slope = getSlope(x1, y1, x2, y2);
                    slopeCount.merge(slope, 1, Integer::sum);
                    localMax = Math.max(localMax, slopeCount.get(slope));
                }
            }
            result = Math.max(result, same + localMax);
        }
         return result;
    }
     private Pair<Integer, Integer> getSlope(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        if (dx == 0) return new Pair<>(0, 1);       
        if (dy == 0) return new Pair<>(1, 0);       
        int g = gcd(dx, dy);
        dx /= g; dy /= g;
        if (dx < 0) { dx = -dx; dy = -dy; }
        return new Pair<>(dx, dy);
    }
    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }
}