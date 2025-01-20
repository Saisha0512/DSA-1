# include <iostream>
# include <cmath>
# include <vector>
using namespace std;

vector<vector<int>> subsets(vector<int>& nums) {
    int n = nums.size();   
    vector<vector<int>> powerSet; 

    // Iterating through all the possible subsets.
    for (int digit = 0; digit < pow(2, n); digit++) {
        vector<int> subset; // Temporary vector to store the current subset.
        for (int i = 0; i < n; i++) {
            // Check if the i-th bit in 'digit' is set.
            if (digit & (1 << i)) {
                subset.push_back(nums[i]); // Add nums[i] to the current subset
            }
        }
        powerSet.push_back(subset); // Add the current subset to the powerSet
    }
    return powerSet; // Return the result
}

int main(){
    int n;
    cout << "No of elements, n = ";
    cin >> n;
    vector<int> nums(n);
    cout << "Elements of the Array, nums = ";
    for (int i = 0; i < n; i ++){
        cin >> nums[i];
    }
    vector<vector<int>> ans = subsets(nums);
    int m = ans.size();
    cout << "[";
    for (int i = 0; i < m; i ++){
        int k = ans[i].size();
        cout << "[";
        for (int j = 0; j < k; j ++){
            cout << ans[i][j];
            if (j != k - 1)     cout << ", ";
        }
        cout << "]";
        if (i != m - 1)     cout << ", ";
    }
    cout << "]" << endl;
    return 0;
}
