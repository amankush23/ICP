import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void backtrack(int[] arr, int target, int start, List<Integer> path, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < arr.length && arr[i] <= target; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue;
            path.add(arr[i]);
            backtrack(arr, target - arr[i], i + 1, path, ans);
            path.remove(path.size() - 1);
        }
    }
}
