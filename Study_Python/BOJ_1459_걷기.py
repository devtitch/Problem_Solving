import sys

sys.stdin = open('input/1459.txt', 'r')
X, Y, W, S = map(int, input().split())

garosero = (X+Y) * W
daegak = min(X, Y) * S + abs(X-Y)*W
answer = min(garosero, daegak)

if (X+Y)%2 == 0:
    answer = min(answer, max(X, Y)*S)
else:
    answer = min(answer, (max(X, Y)-1)*S+W)

print(answer)

