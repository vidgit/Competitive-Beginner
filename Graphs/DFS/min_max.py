from sys import setrecursionlimit
setrecursionlimit(100000)
def maxheight(node):
	global gr
	global vis
	if gr[node]==[]:
		return 1
	if node is None:
		return 0
	m=[]
	for i in gr[node]:
		m.append(maxheight(i)+1)
	return max(m)
def minheight(node):
	global gr
	global vis
	if gr[node]==[]:
		return 1
	if node is None:
		return 0
	m=[]
	for i in gr[node]:
		m.append(minheight(i)+1)
	return min(m)
n,r=map(int,raw_input().split())
gr=[[]for i in xrange(n+1)]
vis=[]
for i in xrange(n-1):
	fro,to=map(int,raw_input().split())
	gr[fro].append(to)
	#gr[to].append(fro)
#print gr
print maxheight(r),minheight(r)