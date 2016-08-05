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
b=sorted(b)
c=[]
v=[0]*n
for i in xrange(n):
	for j in xrange(n):
		if b[i] in a[j] and v[j]==0:
			v[j]=1
			c.append(b[i])
			print b[i],':',v
			k=input()
c=set(c)
print len(c)
for i in c:
	print i,