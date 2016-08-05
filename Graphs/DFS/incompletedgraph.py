def dfs(c,p):
	vis.append(c)
	for i in gr[c]:
		if i!=p:
			if i not in vis:
				dfs(i,c)
n,m=map(int,raw_input().split())
gr=[[] for i in xrange(n)]
for i in xrange(m):
	fro,to=map(int,raw_input().split())
	gr[fro].append(to)
	gr[to].append(fro)
#print gr
vis=[]
dfs(0,-1)
#print vis
if len(vis)!=n:
	print 'Incomplete Graph'
else:
	print 'Completed Graph'