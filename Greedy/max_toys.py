def max_toys(prices, rupees):
    #Compute and return final answer over here
    answer = 0
    prices=sorted(prices)
    s=0
    for i in xrange(0,len(prices)):
        s+=prices[i]
        if s<rupees:
            answer=i+1
    return answer

if __name__ == '__main__':
    n, k = map(int, raw_input().split())
    prices = map(int, raw_input().split())
    print max_toys(prices, k)