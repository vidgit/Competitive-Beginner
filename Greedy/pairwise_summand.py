#uses python2
n=input()
prev=1
a=[]
rem=n
i=1
while rem!=0:
	if rem-i>i:
		#print rem,rem-i,i
		a.append(i)
		rem-=i
	if i==rem:
		a.append(i)
		break
	i+=1
#print 'rem=',rem,'size',
print len(a)
for i in a:
	print i,