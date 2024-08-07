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
            cout << tree[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}