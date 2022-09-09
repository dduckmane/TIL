결론: 태스트 코드에 @Transactional를 붙이면 알아서 테스트가 끝나면 롤벡을 해준다.

![image](https://user-images.githubusercontent.com/108928206/189325302-62aa5315-9197-4028-8f55-f5e98950ae44.png)

[참고]

: @Commit를 붙이거나 @Rollback(value = false)를 한다면 커밋이 된다.
