def check_vis():
	global vis
	for i in vis:
		if i!=1:
			print 'NO'
			return
	print 'YES'
def dfs(node,parent):
	vis[node]+=1
	for i in graph[node]:
		if i!=parent:
			dfs(i,node)
n,e=map(int,raw_input().split())
graph=[[]for i in xrange(n)]
for i in xrange(e):
	fro,to=map(int,raw_input().split())
	graph[fro].append(to)
	graph[to].append(fro)
vis=[0]*n
dfs(0,-1)
check_vis()