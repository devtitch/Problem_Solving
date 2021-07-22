import sys

sys.stdin = open('input/2003.txt', 'r')

N, M = map(int, input().split())
nums = list(map(int, input().split()))

sum=0
answer=0
i=0
j=0

while(1):
    if sum >= M:
        sum -= nums[i]
        i+=1
    elif j > N-1:
        break
    else:
        sum += nums[j]
        j+=1

    if sum == M:
        answer+=1

print(answer)