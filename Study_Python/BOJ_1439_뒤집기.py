import sys
sys.stdin = open('input/1439.txt', 'r')

s = list(input())

zero = 0
one = 0

if s[0] == '0': zero +=1
else: one+=1

for i in range(1, len(s)):
    if s[i-1] != s[i]:
        if s[i] == '0': zero+=1
        else: one+=1

print(min(zero, one))
