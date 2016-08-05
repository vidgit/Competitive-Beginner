n = input()
v = []

for i in range(0, n):
    a, b = map(int, raw_input().split())
    v.append((a+b, i+1))
    
print ' '.join([str(x[1]) for x in sorted(v)])