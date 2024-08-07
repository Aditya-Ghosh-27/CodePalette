#include<bits/stdc++.h>
using namespace std;

// I/P format

// 6
// 0 1
// 0 2
// 1 3
// 1 4
// 2 5

int main(){
    int n; cin >> n;

    // declaring the matrix
    vector<vector<int>> adjMatrix(n, vector<int>(n, 0));

    // Take input for all edges
    int u, v;
    for(int i = 0; i < n - 1; i++){
        cin >> u >> v;
        // Adding an edge from u to v
        adjMatrix[u][v] = 1;
    }

    // Printing the matrix
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cout << adjMatrix[i][j] << " ";
        }
        cout << endl;
    }
    return 0;
}