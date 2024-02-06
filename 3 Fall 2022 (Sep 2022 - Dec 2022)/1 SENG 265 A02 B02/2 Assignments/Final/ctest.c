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

void remdup (ListNode *head) {
    ListNode *curr=head;
    while (curr->next!=NULL) {
        if (curr->val==curr->next->val) {
            if (curr->next->next==NULL) {curr->next=NULL;break;}
            else {curr->next=curr->next->next;continue;}
        }
        curr=curr->next;
    }

}

void swap (ListNode *a, ListNode *b) {
    int t = a->val;
    a->val = b->val;
    b->val = t;
}

void bsort (ListNode *head) {
    ListNode *c1 = head;
    ListNode *c2;
    if (c1->next!=NULL) {c2 = c1;}
    else return;
    while (c1->next!=NULL) {
        while (c2->next!=NULL) {
            if ((c2->val>c2->next->val)) {swap(c2,c2->next);}
            c2=c2->next;
        }
        c1=c1->next;
        c2=head;
    }
}

int main () {
    ListNode *head = (ListNode*)malloc(sizeof(ListNode));
    int arr[] = {1,9,5,3,2,7,8,9};
    int size = sizeof(arr) / sizeof(arr[0]);
    int i = 0;
    while (i<size) {
        insertR(head,arr[i]);
        i++;
    }
    // print(head);
    // remdup(head);
    bsort(head);
    print(head);
}