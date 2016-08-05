#uses python2
n=input()
a=[[]for i in xrange(n)]
for i in xrange(n):
	s,f=map(int,raw_input().split())
	for j in xrange(s,f+1):
		a[i].append(j)
b=[]
for i in xrange(n):
	b.append(max(a[i]))
b,a=(list(t) for t in zip(*sorted(zip(b,a))))
for i in xrange(len(b)):
	print b[i],a[i]
k=input()
c=[]
v=[0]*n
for i in xrange(len(b)):
	d=[]
	for j in xrange(n):
		if b[i] in a[j] and v[j]==0:
			v[j]=1
			c.append(b[i])
			d.append(a[j])
			if i!=j:
				b[j]=-4
			print b[i],':',v
			#k=input()
	print 'Point',b[i],'Segments',len(c),d
c=set(c)
print len(c)
for i in c:
	print i,