#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <stdbool.h>

typedef struct ListNode ListNode;
struct ListNode {
    int val;
    ListNode *next;
};

void print (ListNode *head) {
    ListNode *curr;
    curr=head;
    while (curr!=NULL) {
        printf("%d ",curr->val);
        curr=curr->next;
    }
}

ListNode* insertR (ListNode *head, int cval) {
    if (head->val==0) {head->val=cval;return head;}
    ListNode *temp = (ListNode*)malloc(sizeof(ListNode));
    temp->val=cval;
    temp->next=NULL;

    ListNode *curr=head;
    while (curr->next!=NULL) {curr=curr->next;}
    curr->next=temp;
    curr=curr->next;
    return curr;
}

int main () {
    ListNode *head = (ListNode*)malloc(sizeof(ListNode));
    insertR(head,314159);
    insertR(head,-4201);
    ListNode *curr=insertR(head,6918872);
    curr->next=head;
    print (head);
}