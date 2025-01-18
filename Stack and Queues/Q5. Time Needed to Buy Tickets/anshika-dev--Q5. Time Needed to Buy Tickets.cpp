#include<bits/stdc++.h>
using namespace std;
//BRUTE FORCE
//stimulate the process of people buying tickets
int timeNeededBrute(vector<int>& tickets, int k){
  int time=0;
  int n=tickets.size();
  int i=0;
  while(tickets[k]>0){ // While the kth person has tickets left
    if(tickets[i]>0){ 
      tickets[i]--; // Person buys one ticket
      time++; // Increment time
    }
    i=(i+1)%n; // move to the next person in the circular queue
  }
  return time;
}
//Time complexity:O(N^2)[worst case]
//Space complexity:O(1)

//optimized approach
//each person buys at most tickets[k] tickets.

//case 1:For people before or at position k, 
//they will buy all tickets[k] tickets or their own total tickets, whichever is smaller.

//case 2:For people after position k, 
//they will buy up to tickets[k] - 1 tickets or their own total tickets, whichever is smaller.

int timeNeededOptimal(vector<int>& tickets, int k){
  int time=0;
  int n=tickets.size();
  int i=0;
  for(int i=0;i<n;i++){
    if(i<=k){ //case1
      time+=min(tickets[k],tickets[i]);

    }
    else time+=min(tickets[k]-1,tickets[i]); //case 2
  }
  return time;

//Time complexity:O(N)
//Space complexity:O(1)
}
int main() {
    // Example 1
    vector<int> tickets1 = {2, 3, 2};
    int k1 = 2;
    cout << "Example 1: Time needed for k = " << k1 << " is: " 
         << timeNeededBrute(tickets1, k1) << endl;

    // Example 2
    vector<int> tickets2 = {5, 1, 1, 1};
    int k2 = 0;
    cout << "Example 2: Time needed for k = " << k2 << " is: " 
         << timeNeededOptimal(tickets2, k2) << endl;

    return 0;
}