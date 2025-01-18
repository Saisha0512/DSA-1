class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0; 
        ListNode temp = new ListNode(0); 
        ListNode result = temp; //To keep track of the start node to return as result
        while(l1!=null || l2!=null || carry!=0){ //Proceeds when there's a digit left in either l1 or l2, or there is some carry value
            int sum = 0;
            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            carry = sum/10; //If the sum has two digits, the carry will be appropriately assigned
            sum = sum%10;  //Removes the carry if any
            ListNode nextNode = new ListNode(sum);
            temp.next = nextNode;
            temp = temp.next;

        }
        return result.next;
    }
}
