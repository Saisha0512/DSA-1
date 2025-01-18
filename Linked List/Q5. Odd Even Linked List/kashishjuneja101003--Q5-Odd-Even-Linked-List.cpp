#include <iostream>
#include <vector>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* oddEvenList(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }

        ListNode* evenHead = head->next, *temp = evenHead->next;
        ListNode* odd = head, *even = head->next;

        while (temp != nullptr) {
            odd->next = temp;
            odd = temp;

            temp = temp->next;

            even->next = temp;
            even = temp;

            if (temp != nullptr) {
                temp = temp->next;
            }
        }

        odd->next = evenHead;
        return head;
    }
};

// Function to create a new ListNode
ListNode* createList(const vector<int>& values) {
    if (values.empty()) return nullptr;

    ListNode* head = new ListNode(values[0]);
    ListNode* current = head;
    for (size_t i = 1; i < values.size(); ++i) {
        current->next = new ListNode(values[i]);
        current = current->next;
    }
    return head;
}

// Function to print the linked list
void printList(ListNode* head) {
    ListNode* current = head;
    while (current != nullptr) {
        cout << current->val;
        if (current->next != nullptr) cout << " -> ";
        current = current->next;
    }
    cout << "\n";
}

int main() {
    // Step 1: Create a linked list with sample values
    vector<int> values = {1, 2, 3, 4, 5};
    ListNode* head = createList(values);

    // Step 2: Print the original linked list
    cout << "Original Linked List: ";
    printList(head);

    // Step 3: Apply the oddEvenList function to rearrange the list
    Solution solution;
    ListNode* rearrangedHead = solution.oddEvenList(head);

    // Step 4: Print the rearranged linked list
    cout << "Rearranged Linked List (Odd-Even): ";
    printList(rearrangedHead);

    // Cleanup dynamically allocated memory (optional for this example)
    while (head != nullptr) {
        ListNode* temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}