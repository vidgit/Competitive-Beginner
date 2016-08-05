from sys import setrecursionlimit
setrecursionlimit(100000)

def dfs(c,p,d):
	global maxd,fnode
	if d>maxd:
		maxd=d
		fnode=c
	
	for i in gr[c]:
		if i!=p:
			dfs(i,c,d+1)

n,m=map(int,raw_input().split())
gr=[[] for i in xrange(n)]
for i in xrange(m):
	fro,to=map(int,raw_input().split())
	gr[fro].append(to)
	gr[to].append(fro)
#print gr
if m!=n-1:
	print 'Not a path graph'
else:
	maxd=0
	fnode=0
	dfs(0,-1,0)
	#print maxd,fnode
	dfs(fnode,-1,0)
	#print maxd
	if maxd==n-1:
		print 'It is a path graph'
	else:
		print 'Not a path graph'