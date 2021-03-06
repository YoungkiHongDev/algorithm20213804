// 문제2) BFS - C
#include <stdio.h>

bool visited[9];

int graph[9][3] = {{}, {2,3,8}, {1,7}, {1,4,5}, {3,5}, {3,4}, {7}, {2,6,8}, {1,7}};
int q[100];

void bfs(int start) {
    q.push(start);
    visited[start] = true;
    
    while(!q.empty()) {
        int x = q.front();
        q.pop();
        printf("%d ", x);

        for(int node : graph[x]) {
            if(!visited[node]) {
                q.push(node);
                visited[node] = true;
            }
        }
    }
}

int main(void) {
    bfs(1);
    return 0;
}