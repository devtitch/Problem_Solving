'''
TIL

import string 후
list(string.ascii_lowercase)를 사용하면 ['a', 'b', 'c', ...] 과 같은
소문자 list를 생성할 수 있다.

list이름.index(값) => 해당 값이 있는 index를 알려준다
'''

import string

def solution(s, n):
    answer = ''
    
    small = list(string.ascii_lowercase)
    large = list(string.ascii_uppercase)
    
    for i in range(len(s)):
        if s[i] == ' ':
            answer += " "
            continue
        
        if s[i].islower():
            answer += small[(small.index(s[i]) + n) % 26]
        else:
            answer += large[(large.index(s[i]) + n) % 26]
            
    return answer