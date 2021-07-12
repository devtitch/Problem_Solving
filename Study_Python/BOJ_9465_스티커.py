import sys

sys.stdin = open('input/9456.txt', 'r')

T = int(input())
for tc in range(T):
    N = int(input())
    sticker = [[int(k) for k in input().split()] for _ in range(2)]

    dp = [[0 for i in range(N)] for j in range(2)]
    dp[0][0] = sticker[0][0]
    dp[1][0] = sticker[1][0]
    dp[0][1] = max(sticker[0][1], dp[1][0] + sticker[0][1])
    dp[1][1] = max(sticker[1][1], dp[0][0] + sticker[1][1])

    for i in range(2, N):
        dp[0][i] = max(dp[1][i-1], dp[0][i-2], dp[1][i-2]) + sticker[0][i]
        dp[1][i] = max(dp[0][i-1], dp[0][i-2], dp[1][i-2]) + sticker[1][i]

    print(max(dp[0][N-1], dp[1][N-1]))