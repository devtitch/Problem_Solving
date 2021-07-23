## TIL

### [시저암호](https://programmers.co.kr/learn/courses/30/lessons/12926)

- `import string` 후

  list(string.ascii_lowercase)를 사용하면 ['a', 'b', 'c', ...] 과 같은

  소문자 list를 생성할 수 있다.

- list이름.index(값) => 해당 값이 있는 index를 알려준다

### [이상한 문자 만들기](https://programmers.co.kr/learn/courses/30/lessons/12930)

- islower() : 소문자이면 true 반환
- isupper() : 대문자이면 true 반환
- lower() / upper() : 소문자로, 대문자로 만들어주는 함수
- split(' ') : 공백을 기준으로 단어 자르기

  - `JAVA`의 StringTokenizer

### [H-Index](https://programmers.co.kr/learn/courses/30/lessons/42747)

  - 정렬
    a = [1, 10, 5, 7, 6]
    a.reverse() : 리스트를 거꾸로 뒤집기 [6, 7, 5, 10, 1]
    a.sort() : 오름차순 정렬, 내림차순은 sort(reverse=Ture)
    b = sorted(a) : a의 정렬된 결과를 b에 저장



### [로또의 최고순위와 최저순위](https://programmers.co.kr/learn/courses/30/lessons/77484?language=python3)

 - 해당 리스트에 원소가 있는지

   `if 원소 in 리스트(배열)`



### Input 값 입력받기

```python
import sys
sys.stdin = open('파일명.txt', 'r')
N, M = map(int, input().split()) #2 3 과 같이 공백으로 띄워서 들어왔을 때
arr = list(input()) #10011 -> arr ['1','0','0','1','1']
```

```python
#2차원 배열 받기
map = [[int(k) for k in input().split()] for _ in range(N)]
```

```python
#2차원 배열 선언
dp = [[0 for i in range(3)] for j in range(N)] 
```



### for 문에서 Index 뛰어 넘기

[BOJ_1543_문서검색](https://github.com/devtitch/Problem_Solving/blob/main/Study_Python/BOJ_1543_문서검색.py)

파이썬에서는 for문에서 index 뛰어 넘는 방법이 없다고 한다

```java
for(int i=0; i<10; i++){
    System.out.println(i);
    if(i%2==0){
        i++;
    }
} // 0 2 4 6 8
```

위와 같은 자바코드를 파이썬에서는 사용할 수 없다.

```python
for i in range(10):
    print(i)
    if i % 2 == 0:
        i += 1
# 0 1 2 3 4 5 6 7 8 9
```

이와 같이 반복문 안에서는 i가 반영이 되지만 java처럼 i를 건너뛸수는 없다

따라서 이와 같은 방법을 사용한다고 한다

```python
i = 0
while i < 10:
    print(i)
    if i % 2 == 0:
        i += 1

    i += 1
# 0 2 4 6 8
```

