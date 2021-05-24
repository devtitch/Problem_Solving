'''
TIL
islower(), isupper() 소문자인지 대문자인지 판별 주의할점 lower과 upper는 소문자
lower(), upper() 소문자로, 대문자로 만들어주는 함수
split(' ') 괄호 안의 값으로 문자열 자르기
'''
def solution(s):
    #문제를 잘읽자 단어별 짝/홀수인덱스
    answer = ''
    words = s.split(' ')
    index = 1
    
    for word in words:
        for i in range(len(word)):
            c = word[i]
            if i%2==0: #짝수이면
                if word[i].islower(): #소문자이면
                    c = c.upper() #대문자로
            else:
                if word[i].isupper(): #대문자이면
                    c = c.lower() #소문자로
            answer += c
            
        if index != len(words): #공백처리
            answer += " "
        index += 1
                
    return answer