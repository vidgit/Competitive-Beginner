from sys import setrecursionlimit
setrecursionlimit(100000)
def dfs(node):
	vis[node]=1
	if graph[node]==[]:
		return 1
	n=1
	for i in graph[node]:
		if vis[i]==0:
			n+=dfs(i)
	return n
n,e=map(int,raw_input().split())
graph=[[]for i in xrange(n)]
for i in xrange(e):
	fro,to=map(int,raw_input().split())
	graph[fro].append(to)
	graph[to].append(fro)
#print graph
#i=input()
vis=[0]*n
max_len=-1
for i in xrange(n):
	if vis[i]==0:
		max_len=max(dfs(i),max_len)
print max_len
