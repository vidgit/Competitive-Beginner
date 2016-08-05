#USES python2
m=input()
a=[10,5,1]
c=0
for i in a:
	c+=(m/i)
	m=m%i
print c