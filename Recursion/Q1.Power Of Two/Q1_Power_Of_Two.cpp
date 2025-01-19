# include <iostream>
using namespace std;

bool isPowerOfTwo(int n) {
    // Base Cases :
    if(n <= 0)  return false;
    if(n == 1)  return true;

    // Recursive Cases
    return (n%2 == 0 && isPowerOfTwo(n/2));
}

int main(){
    int n;
    cout << "n = ";
    cin >> n;
    if(isPowerOfTwo(n))     cout << "true" << endl;
    else    cout << "false" << endl;
    return 0;
}
