import sys
sys.stdin = open('input/7567.txt', 'r')

arr = list(map(str, input()))
h = 10
before = arr[0]
for i in range(len(arr)):
    if i == 0:
        continue
    if before == arr[i]:
        h += 5
    else:
        h += 10
        before = arr[i]
print(h)
