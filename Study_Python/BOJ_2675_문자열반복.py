import sys
sys.stdin = open('input/2675.txt', 'r')

T = int(input())

for i in range(T):
    n, s = map(str, input().split())
    word = ''
    for j in range(len(s)):
        repeat = s[j] * int(n)
        word += repeat

    print(word)