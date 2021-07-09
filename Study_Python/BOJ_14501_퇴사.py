import sys

sys.stdin = open('input/14501.txt', 'r')

N = int(input())
days = [0]
cost = [0] #1일부터
for i in range(N):
    day, price = map(int, input().split())
    days.append(day)
    cost.append(price)

dp = [0] * (N+2)
maxvalue = 0

for i in range(1, len(days)):
    if i+days[i] > N+1:
        continue
    dp[i] = max(dp[i-1], dp[i])
    dp[i+days[i]] = max(dp[i+days[i]], dp[i]+cost[i])

print(max(dp))