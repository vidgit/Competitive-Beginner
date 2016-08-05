def solver():
    n=input()
    a=[]
    for _ in xrange(n):
        a.append(raw_input().strip())
    for _ in xrange(n-1):
        b,c=sorted(a[_]),sorted(a[_+1])
        for j in xrange(n):
            if b[j]>c[j]:
                print 'NO'
                return
    print 'YES'
    return
t=input()
for i in xrange(t):
    solver()