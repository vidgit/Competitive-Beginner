t=input()
p=[]
for i in xrange(t):
    x,y=map(int,raw_input().split())
    p.append(x+y)
for i in xrange(t):
    ind=p.index(min(p))
    print ind+1,
    p[ind]=max(p)+1