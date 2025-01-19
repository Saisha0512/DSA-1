#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

vector<int> revealCardsInIncreasingOrder(vector<int>& deck) {
    // Step 1: Sort the deck in ascending order
    sort(deck.begin(), deck.end());
    int n = deck.size();
    vector<int> result(n, -1); // Initialize the result array with placeholders
    vector<int> positions;    // Array to simulate index-based processing

    // Initialize positions with indices [0, 1, 2, ..., n-1]
    for (int i = 0; i < n; ++i) {
        positions.push_back(i);
    }

    // Step 2: Place cards into correct positions
    for (int card : deck) {
        // Place the smallest card in the first available position
        result[positions[0]] = card;
        positions.erase(positions.begin()); // Remove the used position

        // Simulate moving the next index to the back
        if (!positions.empty()) {
            positions.push_back(positions[0]);
            positions.erase(positions.begin());
        }
    }

    return result;
}

int main() {
    int n;
    cout << "Enter the number of cards: ";
    cin >> n;

    vector<int> deck(n);
    cout << "Enter the card values:" << endl;
    for (int i = 0; i < n; ++i) {
        cin >> deck[i];
    }

    vector<int> result = revealCardsInIncreasingOrder(deck);

    cout << "Revealed order: ";
    for (int card : result) {
        cout << card << " ";
    }
    cout << endl;

    return 0;
}
