//Optimal Solution: Using Backtracking
//Use recursion and backtracking to generate all permutations directly.
//Swap elements to form new permutations and backtrack to restore the original state.
//CODE:
#include <iostream>
#include <vector>

void backtrack(std::vector<int>& nums, int start, std::vector<std::vector<int>>& result) {
    if (start == nums.size()) {
        result.push_back(nums); // Add current permutation
        return;
    }
    for (int i = start; i < nums.size(); ++i) {
        std::swap(nums[start], nums[i]); // Swap to fix one element
        backtrack(nums, start + 1, result); // Recurse for the next element
        std::swap(nums[start], nums[i]); // Backtrack to restore the original state
    }
}

std::vector<std::vector<int>> permute(std::vector<int>& nums) {
    std::vector<std::vector<int>> result;
    backtrack(nums, 0, result);
    return result;
}

int main() {
    std::vector<int> nums = {1, 2, 3};
    std::vector<std::vector<int>> permutations = permute(nums);
    for (const auto& perm : permutations) {
        for (int num : perm) {
            std::cout << num << " ";
        }
        std::cout << "\n";
    }
    return 0;
}
