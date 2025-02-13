## 요구 사항 분석 및 구현 내용
<hr>
### 콘솔

> - 입력과 출력을 하는 기능
> - 추후 GUI로 변경 가능성이 있을 수 있기 때문에 Interface로 작성
>

```markdown
입력
- 조회, 연산, 종료의 기능을 하는 메뉴 선택 입력
- 연산시 필요한 연산식 입력

출력
- 메뉴 메시지 출력
- 메뉴 선택 메시지 출력
- 연산식 출력
- 에러 메시지 출력
- 연산식, 연산 값 출력
- 저장된 연산식 리스트 출력(조회 기능)
- 종료 메시지 출력
```

### 검증

> 입력된 연산식에 대한 검증 기능
> 

```markdown
연산식 분해
- 연산식 분해 후 분해된 문자가 피연산자 또는 연산자인지 판단

연산자와 피연산자의 전체 개수 검증 및 위치 검증
- 정상적으로 분해된 연산식 리스트의 경우 피연산자는 짝수, 연산자는 홀수 인덱스에 있는 것으로 판단한다.
```

### 연산

> 입력된 연산식에 대한 연산 기능
> 
> 

```markdown
중위표기법에서 후위표기법
- 입력된 연산식에 대한 우선순위를 판별해야하므로 중위표기법에서 후위표기법으로 변경

후위표기법 계산
- 후위표기법으로 된 연산식 계산
```

### 저장소

> - 입력된 연산식과 결과 값 저장, 조회 기능
> - 추후 인메모리가 아닌 다른 DB를 사용하기 위해 Interface로 생성
> 

```markdown
저장
- “index번호“를 key로 “연산식 = 결과값”를 value로 저장
    - “연산식” : “결과값” 으로 저장하는 경우 HashMap의 특성상 같은 키 값을 넣을 수 없기 때문에 중복된 연산식이 들어오는 경우 하나로 나타날 수 있기 때문에 Index번호를 Key로 작성
- 순서의 보장을 위해 LinkedHashMap으로 변경

조회
- 저장된 연산식과 값을 리스트로 불러와 출력
```
