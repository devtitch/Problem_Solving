import sys
sys.stdin = open('input/3273.txt', 'r')

N = int(input())
numList = list(map(int, input().split()))
numSet = set(numList)
X = int(input())

answer = 0
for i in numList:
    diff = X - i
    if diff == i:
        continue

    if diff in numSet:
        numSet.remove(diff)
        numSet.remove(i)
        answer += 1

print(answer)


