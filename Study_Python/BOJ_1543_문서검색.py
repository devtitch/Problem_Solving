import sys
sys.stdin = open('input/1543.txt', 'r')
doc = input()
word = input()

wordlen = len(word)

answer = 0

index = 0
while index <= len(doc) - wordlen:
    target = doc[index:index+wordlen]
    if word == target:
        answer += 1
        index += wordlen
    else:
        index += 1

print(answer)