class Solution {
public:
    ListNode* reverseList(ListNode* head) {
            ListNode *prev=NULL;
            ListNode *curr=head;
            ListNode *next=NULL;
            while(curr!=NULL)
            {
                next=curr->next; // moving nextt pointer one node ahead of curr node
                curr->next=prev; // putting nextt pointer of curr to point to its previous node
                prev=curr; // moving prev pointer one node ahead
                curr=next; // moving curr pointer one node ahead
            }
            return prev;
    }
};
