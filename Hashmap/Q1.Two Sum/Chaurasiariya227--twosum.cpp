#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

vector<int>TwoSum(vector<int>& nums, int target) {
    // A hash map to store each number and its index in the array
    unordered_map<int, int> numIdx;

    // Loop through the numbers in the array
    for (int currIdx = 0; currIdx < nums.size(); currIdx++) {
        // Calculate the complement needed to reach the target sum
        int complement = target - nums[currIdx];

        // Check if the complement exists in the hash map
        if (numIdx.find(complement) != numIdx.end()) {
            // If found, return the indices of the complement and the current number
            return {numIdx[complement], currIdx};
        }

        // Otherwise, add the current number and its index to the hash map
        numIdx[nums[currIdx]] = currIdx;
    }

    // If no solution is found (this should not happen as per the problem constraints)
    return {};
}

int main() {
    // Example
    vector<int> numbers1 = {2, 7, 11, 15};
    int targetSum1 = 9;
    vector<int> result1 = TwoSum(numbers1, targetSum1);
    cout << "Indices: [" << result1[0] << ", " << result1[1] << "]" << endl;

    return 0;
}
