#include<bits/stdc++.h>
using namespace std;

/*
Logic:
    1) if 0 > num > 3999, return "Enter a number between 1 and 3999".
    2) Create a vector of pairs to store the mappings in descending order.
    3) Iterate through the mapping and keep adding the roman numeral to the result until num >= mapping.first.
    4) Return the result.
    5) Time complexity: O(1).
*/

string integerToRoman(int num){
    if(num <=0 || num >= 4000){
        return "Enter a number between 1 and 3999";
    }
    vector<pair<int, string>> romanMappings = {
        {1000, "M"},
        {900, "CM"},
        {500, "D"},
        {400, "CD"},
        {100, "C"},
        {90, "XC"},
        {50, "L"},
        {40, "XL"},
        {10, "X"},
        {9, "IX"},
        {5, "V"},
        {4, "IV"},
        {1, "I"}  
    };
    string result = "";
    for(const auto& mapping: romanMappings){
        while(num >= mapping.first){
            result += mapping.second;
            num -= mapping.first;
        }
    }
    return result;
}

// Driver code
int main(){
    int n;
    cout << "Enter a number: ";
    cin >> n;
    cout << integerToRoman(n) << endl;
    return 0;
}