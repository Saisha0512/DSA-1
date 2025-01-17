//OPTIMAL-SOLUTION
//Single Hashmap: We will use a single Hashmap to map characters from string s to string t.
//Consistency check: While traversing the strings, we will check if the current character of s has already been mapped to a different character in t. 
//Similarly, ensure that no two different characters from s are mapped to the same character in t.
//Time Complexity:O(n)

//CODE:
#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

bool isIsomorphic(string s, string t) {
    // If the lengths of the strings are different, they can't be isomorphic
    if (s.length() != t.length()) {
        return false;
    }

    unordered_map<char, char> mapping_s_to_t; // To store the mapping of characters from s to t
    unordered_map<char, bool> mapped_t_chars; // To ensure no two characters in s map to the same character in t

    for (int i = 0; i < s.length(); i++) {
        // If s[i] is already mapped to a different character in t, return false
        if (mapping_s_to_t.find(s[i]) != mapping_s_to_t.end()) {
            if (mapping_s_to_t[s[i]] != t[i]) {
                return false;
            }
        } else {
            // If t[i] is already mapped to another character in s, return false
            if (mapped_t_chars.find(t[i]) != mapped_t_chars.end()) {
                return false;
            }
            // Create the new mapping
            mapping_s_to_t[s[i]] = t[i];
            mapped_t_chars[t[i]] = true;
        }
    }

    return true; // Return true if all mappings are valid
}

int main() {
    string s = "egg";
    string t = "add";

    if (isIsomorphic(s, t)) {
        cout << "The strings are isomorphic!" << endl;
    } else {
        cout << "The strings are not isomorphic." << endl;
    }

    return 0;
}
