#uses python2
n=input()
a=[[]for i in xrange(n)]
for i in xrange(n):
	s,f=map(int,raw_input().split())
	a[i].append(range(s,f+1))
b=[]
for i in xrange(n):
	b.append(max(a[i]))
b,a=(list(t) for t in zip(*sorted(zip(b,a))))
c=[]
v=[0]*n
for i in xrange(n):
	for j in xrange(n):
		if b[i] in a[j] and v[j]==0:
			v[j]=1
			c.append(b[i])
			if i!=j:
				b[j]=-4
c=set(c)
print len(c)
for i in c:
	print i,

