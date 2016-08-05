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
N = input()
gr = [[] for i in xrange(N)]
for _ in xrange(N - 1):
	a, b = map(int, raw_input().split())
	gr[a].append(b)
	gr[b].append(a)
maxd=0
fnode=0
dfs(0,-1,0)
dfs(fnode,-1,0)
print maxd