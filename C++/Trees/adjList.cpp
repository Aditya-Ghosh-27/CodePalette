#include<bits/stdc++.h>
using namespace std;

int main(){
    int n; cin >> n;

    // Declaring the adjacency list
    vector<int> tree[n];

    int u, v;
    for(int i = 0; i < n - 1; i++){
        cin >> u >> v;
        // Adding an edge from u to v
        tree[u].push_back(v);
    }

    cout << endl;
    cout << "Adjacency List" << endl;

    // Printing the adjacency list
    for(int i = 0; i < n; i++){
        for(int j = 0; j < tree[i].size(); j++){
            cout << "Indexes" << i << j << " ";
            cout << tree[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}

// How to debug and understand what are the indexes of these children nodes are?

// for(int i = 0; i < n; i++){
//     for(int j = 0; j < tree[i].size(); j++){
//         cout << "Indexes " << i << j << "-> ";
//         cout << tree[i][j] << " " << endl;
//     }
//     cout << endl;
// }


// 1. tree is an array of vectors.
// 2. Each index of tree represents a node in the tree.
// 3. The values pushed into tree[u] represent the children of node u.

// Initial State

// tree = [
//     [], // Node 0
//     [], // Node 1
//     []  // Node 2
// ]



// After 0 1
// tree = [
//     [1],  // Node 0
//     [],  // Node 1
//     [],  // Node 2
// ]

// After 0 2
// tree = [
//     [1, 2],  // Node 0
//     [],  // Node 1
//     [],  // Node 2
// ]

// After 1 3
// tree = [
//     [1, 2],  // Node 0
//     [3],  // Node 1
//     [],  // Node 2
// ]

// After 1 4
// tree = [
//     [1, 2],  // Node 0
//     [3, 4],  // Node 1
//     [],  // Node 2
// ]

// After 2 5
// tree = [
//     [1, 2],  // Node 0
//     [3, 4],  // Node 1
//     [5],  // Node 2
// ]

// Visual Representation of the tree
//      0
//     / \
//    1   2
//   / \   \
//  3   4   5