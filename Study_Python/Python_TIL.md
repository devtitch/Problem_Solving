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

