#include <iostream>
#include <string.h>
#include <stdio.h>
using namespace std;

typedef struct Node
{
    int data1;
    int data2;
    Node *link;
};

Node *head = NULL;

void insert(int d1, int d2)
{
    Node *p = head;
    Node *temp = new Node();
    temp->data1 = d1;
    temp->data2 = d2;
    if (head == NULL)
    {
        temp->link = head;
        head = temp;
    }
    else
    {
        while (p->link != NULL)
        {
            p = p->link;
        }
        temp->link = NULL;
        p->link = temp;
    }
}

void farey(int n)
{
    Node *p = head;
    while (p->link != NULL)
    {
        Node *temp1;
        Node *temp2;
        temp1 = p;
        temp2 = p->link;
        if ((temp1->data2 + temp2->data2) > n)
        {
            p = p->link;
            continue;
        }
        else
        {
            Node *temp3 = new Node();
            temp3->data1 = (temp1->data1 + temp2->data1);
            temp3->data2 = (temp1->data2 + temp2->data2);
            temp3->link = temp1->link;
            temp1->link = temp3;
        }
        p = p->link;
    }
}

void display()
{
    Node *p = head;
    if (p == NULL)
        cout << "\nEmpty";
    else
    {
        while (p != NULL)
        {
            cout << endl
                 << p->data1 << " " << p->data2;
            p = p->link;
        }
    }
}

int main()
{
    int n;
    insert(0, 1);
    insert(1, 1);
    cout << "\nEnter n:";
    cin >> n;
    farey(n);
    display();
}
