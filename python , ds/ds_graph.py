graph = {
    10:[20,40,50],
    20:[10,40],
    30:[40,50],
    40:[10,20,30,50],
    50:[10,40,30]
}
def bfs(graph,start):
    q=[start]   #queue
    visited=[start]
    while len(q)!=0:
        ele=q.pop(0)
        print(ele,end=' ')
        for i in graph[ele]:
            if i not in visited:
                q.append(i)
                visited.append(i)

bfs(graph,30)

def dfs(graph,start,visited=None):
    if visited == None:
        visited=[]
    visited.append(start)
    print(start,end=' ')
    for i in graph[start]:
        if i not in visited:
            visited.append(i)
            dfs(graph,i,visited)

dfs(graph,20)