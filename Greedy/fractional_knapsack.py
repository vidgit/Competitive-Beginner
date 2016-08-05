#USES python2
def Calc_Value(s,b,w):
	i=0
	val=0
	#print b
	#print w
	while s>0 and i<len(b):
		#print 's=',s,'i=',i
		m=min(w[i],s)
		#print 'm',m
		val+=m*b[i]
		#print val
		s-=m
		i+=1
	return val
n,s=map(int,raw_input().split())
w=s
b=[]
ww=[]
for i in xrange(n):
	v,w=map(int,raw_input().split())
	b.append(v/float(w))
	ww.append(w)
b,ww=(list(t) for t in zip(*sorted(zip(b,ww),reverse=True)))
#print b
#print ww
print round(Calc_Value(s,b,ww),4)
