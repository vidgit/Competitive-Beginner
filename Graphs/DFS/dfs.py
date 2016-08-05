def dfs(c,g):
	global gr
	global vis
	if c==g:
		return True
	if gr[c]==[]:
		return False
	cc=False
	for i in gr[c]: 
		if not i in vis:
			vis.append(i)
			cc=cc or dfs(i,g)
	return cc

n,m=map(int,raw_input().split())
gr=[[]for i in xrange(n)]
vis=[]
for i in xrange(m):
	to,fro=map(int,raw_input().split())
	gr[fro].append(to)
	gr[to].append(fro)
s,g=map(int,raw_input().split())
if(dfs(s,g)):
	print 'Found'
else:
	print 'Not Found'