def solution(lottos, win_nums):
    answer = [0, 0]
    
    zeroNum = 0
    correct = 0
    for i in lottos:
        if i in win_nums:
            correct += 1
        if i == 0:
            zeroNum += 1
    
    if correct <= 1:
        answer[1] = 6
    else:
        answer[1] = 7-correct
        
    if correct+zeroNum <= 1:
        answer[0] = 6
    else:
        answer[0] = 7-(correct+zeroNum)
        
    return answer