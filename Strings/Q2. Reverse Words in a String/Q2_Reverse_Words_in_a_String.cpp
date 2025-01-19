# include <iostream>
# include <vector>
# include <algorithm>
# include <string>
using namespace std;

void reverseString(string &str){
    vector<string> temp;
    string s = "";
    for (int i = 0; i < str.length(); i ++){
        if (str[i] == ' '){
            temp.push_back(s);
            s = "";
        }
        else{
            s += str[i];
        }
    } 
    temp.push_back(s);
    reverse(temp.begin(), temp.end());
    str = "";   // Clearing the original string.
    for (int i = 0; i < temp.size(); i ++){
        str += temp[i];
        // Avoiding any extra spaces in the end.
        if (i != temp.size() - 1)   str += " ";
    }
    str += '\0';
}

int main(){
    string str;
    cout << "Enter the string : ";
    getline(cin, str);
    reverseString(str);
    cout << "Reversed String : ";
    cout << str << endl;
    return 0;
}
