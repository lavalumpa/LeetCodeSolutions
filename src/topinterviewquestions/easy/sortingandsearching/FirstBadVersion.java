package topinterviewquestions.easy.sortingandsearching;

public class FirstBadVersion {
    public boolean isBadVersion(int x) {
        return true;
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int max = n;
        while (low < max) {
            int mid = low + (max - low) / 2;
            if (isBadVersion(mid)) {
                max = mid;
            } else {

                low = mid + 1;
            }
        }
        return low;
    }
}
