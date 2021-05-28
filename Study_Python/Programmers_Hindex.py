'''
TIL
정렬할 때 sort() : 오름차순  / sort(reverse=True) : 내림차순
sorted(citations, reverse=True) 도 가능
'''
def solution(citations):
    answer = 0
    
    citations.sort(reverse=True)
    
    for i in range(len(citations)):
        if i >= citations[i]:
            answer = i
            break
            
    if answer == 0:
        if citations[i] != 0:
            return len(citations)
    
    return answer