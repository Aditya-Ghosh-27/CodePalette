#include<bits/stdc++.h>
using namespace std;

int main(){
    int n; cin >> n;

    vector<int> tree[n + 1];
    
    int u, v;
    for(int i = 0; i < n - 1; i++){
        cin >> u >> v;
        tree[u].push_back(v);
    }

    queue<int>q;
    vector<bool> vis(n + 1, false);

    // Push the root into the queue
    q.push(1);

    // Iterate till the queue is empty
    while(!q.empty()){
        // Get the node from the front and print it
        int u = q.front();
        cout << u << ' ';

        // Make the node visited and remove from the queue
        vis[u] = true;
        q.pop();

        // Add all the unvisited children of this node to the queue
        for(int v : tree[u]){
            if(!vis[v]){
                q.push(v);
            }
        }
    }
    return 0;
}