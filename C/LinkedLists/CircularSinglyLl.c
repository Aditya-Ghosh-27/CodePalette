#include<stdio.h>
#include<stdlib.h>

struct node{
    int info;
    struct node *link;
};

struct node *addToEmpty(int data)
{
    struct node *temp;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->info = data;
    temp->link = temp;
    return temp;
}

struct node *createSingly(int data)
{
    struct node *temp;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->info = data;
    temp->link = temp;
    return temp;
}

struct node *insert_at_beg(struct node *tail, int data)
{
    struct node *temp;
    temp = (struct node*)malloc(sizeof(struct node));
    temp->info = data;
    temp->link = temp;
    return tail;
}

void traverse(struct node *tail)
{
    struct node *p;
    p = tail->link;
    do
    {
        printf("%d->",p->info);
        p = p->link;
    } while (p != tail->link);
    
    
}

int main()
{
    struct node *tail;
    int data, choice, pos, item;
    tail = addToEmpty(data);



    return 0;
}