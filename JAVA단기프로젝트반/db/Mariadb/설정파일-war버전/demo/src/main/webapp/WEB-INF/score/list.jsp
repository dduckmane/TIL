<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <!-- reset css -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/reset-css@5.0.1/reset.min.css">

  <!-- bootstrap css -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">


  <!-- bootstrap js -->
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" defer></script>

  <!-- jquery -->
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

  <style>
    label {
      display: block;
    }

    .score-list>li {
      margin-bottom: 10px;
    }

    .score-list>li:first-child {
      font-size: 1.2em;
      color: blue;
      font-weight: 700;
      border-bottom: 1px solid skyblue;
    }

    .del-btn {
      width: 10px;
      height: 10px;
      background: red;
      color: #fff;
      border-radius: 5px;
      margin-left: 5px;
      text-decoration: none;
      font-size: 0.7em;
      padding: 6px;
    }

    .del-btn:hover {
      background: orangered;
    }

    section.score {
      padding: 200px 50px 100px;
      font-size: 1.5em;
    }

    .list-header {
      display: flex;
      justify-content: space-between;

      width: 50%;
    }
    .list-header .sort-link-group {
      display: flex;

    }
    .list-header .sort-link-group div {
      margin-right: 20px;
    }

  </style>
</head>

<body>

<div class="wrap">

  <section class="score">
    <h1>시험 점수 등록</h1>
    <form action="/score/register" method="POST">
      <label>
        # 이름: <input type="text" name="name">
      </label>
      <label>
        # 국어: <input type="text" name="kor">
      </label>
      <label>
        # 영어: <input type="text" name="eng">
      </label>
      <label>
        # 수학: <input type="text" name="math">
      </label>
      <label>
        <button type="submit">확인</button>
        <button id="go-home" type="button">홈화면으로</button>
      </label>
    </form>

    <hr>

    <ul class="score-list">
      <li class="list-header">
        <div class="count">총 학생 수: ${scores.size()}명</div>
        <div class="sort-link-group">
          <div><a href="/score/list?sort=num">학번순</a></div>
          <div><a href="/score/list?sort=name">이름순</a></div>
          <div><a href="/score/list?sort=average">평균순</a></div>
        </div>

      </li>

      <c:forEach var="s" items="${scores}">
        <li>
          # 학번: ${s.stuNum}, 이름: <a href="/score/detail?stuNum=${s.stuNum}">${s.name}</a>, 국어:
            ${s.kor}점,
          영어: ${s.eng}점, 수학: ${s.math}점, 총점: ${s.total}점
          , 평균: ${s.average}점, 학점: ${s.grade}
          <a class="del-btn" href="/score/delete?stuNum=${s.stuNum}">삭제</a>
        </li>
      </c:forEach>
    </ul>

  </section>



</div>

<script>
  const $ul = document.querySelector('.score-list');

  $ul.addEventListener('click', e => {
    if (!e.target.matches('a.del-btn')) return;

    e.preventDefault();
    //console.log('클릭이벤트 발동!');

    if (confirm('정말로 삭제하시겠습니까?')) {
      //삭제 진행
      location.href = e.target.getAttribute('href');
    } else {
      //삭제 취소
      return;
    }

  });

  //홈화면으로 버튼 이벤트
  const $homeBtn = document.getElementById('go-home');
  $homeBtn.onclick = e => {
    location.href = '/';
  };
</script>

</body>

</html>