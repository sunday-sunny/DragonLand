# 🎈DragonLand🎈
![image](https://user-images.githubusercontent.com/42857790/140632242-294e43dd-7ef4-4b16-9fc9-4c6f73cc0981.png)

`용용랜드`는 자바 콘솔 기반 `놀이공원 통합 관리 시스템` 프로젝트입니다.


## 주요 특징
 - [ ] 회원/관리자에서 주요 특징을 뽑아야 될까? 고민해보기

## 프로젝트 기간
**📆 2021.10.22 ~ 2021.11.04 [총 14일]**
 - ***10.22 ~ 10.23***  :: 기획 및 요구 분석서 작성
 - ***10.23 ~ 10.25***  :: 화면 설계
 - ***10.26 ~ 10.28***  :: 데이터 설계 및 생성
 - ***10.29 ~ 11.03***  :: 기능 구현
 - ***11.03 ~ 11.04***  :: PPT 작성 및 자바문서 생성

## 담당 업무
**📂 데이터 생성**
 - **`용용랜드 정보` 관련 전반적 더미 데이터 생성**
	 - 놀이공원시설위치.txt
	 - 어트랙션정보.txt
	 - 직원근무지.txt
	 - 퍼레이드정보.txt
	 - 편의시설정보.txt	 
<br/>

**💻 코드 구현부**
 - **용용랜드 정보**
	- AttractionInfo.java
	- LandInfo.java
 - **어트랙션 예약**
	 - UserAttractionReservation.java
 - **놀이공원 정보 관리**
	 - AttractionOnOff.java
	 - AttractionWaitTime.java
	 - LandInfoAdmin.java
	 - ParadeAdmin.java


## 업적
-  공통 Load/Save 파일 생성 추진


## 협업 프로그램
- **💻개발툴**
	- Eclipse (ver. Jee Oxygen)
	- Java version "9.0.4" (본인)
- **📋문서 작성 및 PPT**
	- 구글 드라이브
- **🗣 온라인 회의**
	-  MS Teams
- **💾 형상관리**
	- Git
	
	

## 후기

2주간 자바를 이용한 콘솔 프로젝트가 마무리 되었습니다 !!! 🥳🥳🥳

콘솔 프로젝트는 재학생 때 데이터베이스 수업 이후로 3년만이었습니다 (당시에는 은행 프로그램 개인 프로젝트). 당시 맨땅에 헤딩하며 4일 밤낮으로 JDBC와 이클립스를 이용해서 혼자 로그인이며 메뉴며 했던 기억으로 이번 팀프로젝트는 비교적 유연하게 짤 수 있었습니다! 

하지만 프로그램 짜는 실력과는 별개로 이번에는 다른 4명의 조원들과 협업하며 진행해야했던지라 이 부분에서 어려움이 너무 많았고(˃̣̣̣̣︿˂̣̣̣̣ ) 그와 동시에 배운 점도 많았습니다.
<br/>

### 📝 Summary
**아주 긴 후기 글이라 요약 해놓습니다!** 
이 이후 글들은 프로젝트와 관련된 사적인 글들이 이어집니다. 

> **1. 협업 부분**
> `⭐ 상대방의 의견을 들어보고 타당성을 검토하고, 의견을 어필하는 과정 중요`
> `그렇다면 상대방 의견은 어떻게 듣고, 내 의견은 어떻게 어필하여 결과를 낼 것인가`
> - 팀원들과의 소통
> - 담당 업무를 소화하지 못한 팀원에 대하여
> 
> **2. 코드 관련**
> `⭐ 공통 코드 작성 시 팀원들과 상의하여 초반에 잡아놓기`
>  - 너무나 어려운 Git
>  - 효율적인 설계
>    - 공통 코드 관련
>    - 중복 코드 관련
>    - 네이밍
>    - static
>  
> **3. UI 및 PPT**
> `⭐ 타협 하지 않기`
> `⭐ 이전 자료들을 참고하되, 프로젝트에 맞는 디자인 끊임없이 생각하기`
>
> - 콘솔 디자인
>   - 화면 꽉차게 디자인 할 것
>   - 최대한  GUI 느낌나게 디자인 할 것
>   - 디테일 살릴 것
>   - 사용자 입력이 여러 번 있을 때 input 라인 맞추기
>	
> - PPT
>    - 다음 팀프로젝트 시에는 역할 분담 반드시!
>   (공동 작성 시에도 담당 지정해놓기)

<br/>



### 🤝🏻협업 부분
#### 1. 팀원들과의 소통
팀원들과 의견 충돌이 있을 때 어떻게 해결하면 좋을까 고민하게 되었습니다. 
txt 파일을 불러오고 저장하는 부분을 설계하는 부분에서 의견 충돌이 있었습니다. 코드 관리 효율성과 중복을 막기 위해 Load / Save 파일을 공통 클래스로 만들어 사용하자는 제 의견과, 각각의 txt 파일의 클래스에서 만들어 쓰자는 팀원의 의견이 있었습니다. (이 부분에서 의견이 안 좁혀져 이틀을 잡아먹었습니다. 😭😭😭)

초반에 제 의견은 프로그램 실행과 동시에 공통 Load 파일에서 모든 파일을 불러오고, 종료 시점에 변경된 모든 파일을 Save 하자는 의견이었는데, Load 부하 문제와 계속 갱신되는 파일을 불러와야되는 문제로 두 의견를 조율하여 공통 Load / Save 클래스는 만들되, 초반에 모든 파일을 불러오는 것이 아니라 개인이 사용할 때만 불러와 사용하자는 것으로 의견이 통일 되었습니다.
**결과적으로는 공통 클래스를 만들어 사용하니 코드 중복도 해결되고 편리하다는 의견을 들어 매우 뿌듯했습니다💗**

하지만 이 의견의 맞추기 위해 많은 시간이 들었습니다. 
저 같은 경우에는 **상대방이 '왜 그렇게 설계해야되는지' 이유를 너무 알고 싶었기에** 해당 의견과 만약 만들게 되면 어디에 어떻게 클래스와 코드 만들고, 어떻게 사용하는지 타당성을 물어봤었습니다. *(정말 내가 설계한 것보다 효율적이고 실제로 가능하다면 수용해야되니까요!)*. 또한 그와 별개로 제 의견을 어필하기 위해 해당 코드를 직접 짜가 시연했습니다. 제 3자의 의견을 듣기 위해 선생님께 조언을 구하기도 했습니다.

어쨌든 상대방의 의견을 들어보고 그 타당성을 검토하고, 제 의견을 어필하는 과정은 정말 중요하다 생각합니다. 이 과정에서 제가 주장했던 부분의 부족함(초반에 모든 부분을 1회 불러오는 부분)을 수용하고 더 좋은 방향으로 설계해 갈 수 있었습니다.
<br/>

#### 2. 담당 업무를 소화하지 못한 팀원에 대하여
마감 전날까지 담당한 부분을 못한 팀원이 있었을 때 어떻게 하면 좋을까 고민하였습니다.
결론적으로는 제가 맡은 부분과 공통적인 부분이 있어 제가 가져와 프로그램을 짜긴 했지만 **'이게 맞는 걸까? 더 좋은 방법은 없던걸까?'** 고민했습니다.

저녁에 회의하여 다음날 오전에 마감을 하고 오후에 PT 작업을 하기로 했던 상황입니다. 팀원은 우선 자신이 해보고는 싶지만 완성할 수 있을지는 확답하지 못했습니다(이미 이틀 밤을 새시고ㅜㅜ 다른 수정할 곳도 많은 상황이었습니다). 그렇다고 완성하지 못한 것을 다음날 다른 팀원에게 넘기기에는 일정에도 차질이 생기고, 다른 팀원도 급박하게 진행해야되는 상황이었습니다.

이 때 저의 판단은 **프로젝트를 완성은 시켜야된다는 생각**이었습니다. 아무리 열심히 해도 완성하지 못하면 발표 조차 불가하니까요. 다음날까지 완성을 확답하지 못하는 팀원에게 이런 제 의견을 말하고 담당 업무를 가져오긴 하였으나 마음 한켠으로는 괜히 담당 업무를 뺏어온건 같아 죄송스러운 마음도 있었습니다.

- 이 짧은 시간 내에 팀원을 믿어보고 기다려야됐을까요?
- 만약 팀원을 믿어본다면 다른 방법으로 도움을 줘서 완성 시킬 수 있었을까요? 
- 그렇다면 밤 ~ 새벽 작업을 해야됐는데 어떻게 도움을 줄 수 있었을까요?
- 만약 완성을 못하고 다음날에 업무를 받아왔을 때 코드를 새로짜고 완성시키는 리스크는 어떻게 감수해야됐을까요?

1. 팀원의 역량보다 복잡한 파트
2. 마감일까지 완성 불확실로 일정 차질
3. 다른 부분 수정과 동시 작업으로 프로젝트 퀄리티 저하 우려

위 세 가지 판단 하에 업무를 제가 가져왔지만 팀원을 더 이끌 수 있는 방법은 없었을까, 이런 상황에서는 어떻게 하는 것이 좋을까 고민하게 되었습니다.
<br/>

### 💻 코드 관련
#### 1. 너무나 어려운 Git 
사실 코드를 짜는 것보다도 더 시간이 많이 걸렸던 것이 Git을 통한 협업 부분이었습니다.

이클립스에서 Git을 연동한 것도 처음, 팀원들과 Branch를 따고 진행한 것도 처음이었습니다. PUSH하는데 오류도 너무 많이 나고, PULL 하는데도 오류나고, Pull Request로 Merge하는데도 Conflict가 너무 많이나서 눈물 났습니다. 제 Branch를 PR하는데 Merge 되는게 아니라 덮어쓰기 돼서 ~~정말 돌아버리는 줄 알았습니다.~~ Clone한걸 지우고 다시 import를 몇 번 했는지 모르겠네요..

다들 협업은 서투르니 **우선 공통 코드로 master를 완성 시키고 여기서 각자 Branch를 따서 진행하자!** 제 의견을 냈습니다. 또한 master는 망가지면 안되니 각자 Branch에서 작업 후 PR하는 방법이 좋다고 생각했습니다. (우선 돌아가는거 보고 Merge해야 되는데, 자꾸 바로 Merge 요청하셔서 사실 저는 잘 이해가 안됐습니다😭😭😭, 제가 협업 부분에서 Git 사용하는게 서툰 점도 있어서 이게 맞는 거일 수도 있었겠죠?) 

원래 누군가가 검토하고 Merge하는 걸로 아는데 자기껄 바로 자기가 Merge하면 다른 사람과 같은 라인 수정시 Conflict 날텐데.. 하면서도 PR 승인 되시는게 한 분 밖에 없어서(정확히는 덮어쓰기가 안되는 분) 다행이도 해당 팀원분이 중간에서 Conflict 뜨는 부분을 필터링 해주셨습니다. 

Git 너무 어려워서 팀원들 모두 오류가 날 때마다 서로 화면 공유해서 오류도 해결하고 해결법도 배우면서 진행했습니다.
<br/>

#### 2. 효율적인 설계를 어떻게 할 수 있을까
팀원들과 협업 할 때의 전반적인 고민입니다. 
코드를 합쳤을 때 실행이 되긴 하지만 중구난방인 이름, 코드, 메소드, 스타일을 볼 때마다 아쉬움이 많이 남습니다.

- **공통 코드 관련**
	당시에 다른 건 몰라도 파일을 불러오는 Load / Save는 잡고 가야된다고 생각해서 의견을 적극 어필 했지만, 그 외 다른 부분에 대해서는 상세히 잡고 가지 못했습니다. 이런 의견을 내도 될지와, 의견을 냈을 때 끌고가야된다는 책임감 때문인 듯 합니다.

	추가적으로 메뉴 목록에서 소제목을 나타내는 `head` 메소드나, 페이지를 뒤로 갈 때 사용하는 `pageBack` 메소드 정도는 공통 코드로 더 묶어도 되지 않을까 했습니다. 매 클래스마다 만들어서 사용하니 너무 지저분해졌습니다.

- **중복 코드 관련**
	공통 코드와는 별개로 제가 담당한 코드들에서 중복이 나타나는 부분을 해결하지 못한 것이 아쉽습니다. 예를 들면 `UserAttractionReservation` 클래스는 어트랙션의 대기열을 확인하고 예약을 진행하는 클래스입니다.

	이 클래스에서는 **첫번째로 메뉴에서 타입별 어트랙션을 선택하고**, **두번째로 해당 타입 어트랙션들의 대기열**을 보여줘야합니다. 때문에 `AttractionInfo` 클래스와  `AttractionWaitTime` 두 개를 적절히 섞어 써야합니다.

	`AttractionInfo`와 `AttractionWaitTime`에서 메소드들을 잘 짜놨다면 해당 클래스에서 메소드만 호출하여 로직을 진행하게 하고 예약 부분만 짰으면 됐겠으나, 메소드들을 해당 클래스에 너무 specific하게 짜놔서.. 호출로는 불가능하고 코드를 복사해와 또 `UserAttractionReservation`에 맞게 수정해야됐습니다. 

	결국 불필요한 중복이 생기는 바람에 코드는 코드대로 길어지고, 유지보수는 유지보수대로 힘들어지는 일이 발생했습니다😭😭😭. 다른 사람이 제 코드를 가져다 쓸 수 도 없고, 저 조차도 다시 수정해서 작성해야되는 상황에 어떻게 짜야 모듈화를 잘 할 수 있을까 생각하게 되는 계기가 되었습니다.

- **네이밍**
	기본적으로 자바의 네이밍 규칙은 **카멜 표기법**입니다. 근데 코드를 합쳐서 보니 다른 팀원이 규칙을 지키지 않아 내적 비명을 질렀습니다😱😱😱. 또한 코드를 합치는 팀원이 객체를 생성하고 변수 이름을 줄여서 작성하는데 이 경우 해당 변수만 봤을 때 어떤 객체인지 알기 힘들어 개인적으로는 지양해야된다고 생각하는 부분입니다.

	**공통 코드를 정하는 시점에서 이런 네이밍 규칙과 유의점을 정해놓고 시작했으면 조금 더 깔끔한 코드 작성을 할 수 있지 않을까 아쉬웠습니다.**

	또한 저조차 메소드가 많아지다 보니 점점 메소드 이름 짓는 것이 어려워지고 중구난방으로 짓는 일이 발생하기도 했습니다. 다른 클래스에서 `getList` 라고 작성했는데, 이번 클래스에서는 `getList` 말고도 다른 리스트도 필요해서 `getAttractionList` 라고 짓는다던가 점점 이름만 봐서는 내용을 추측하기 어려워지는 메소드 이름들에 짜면서도 너무 아쉬웠습니다. 

- **static** 
	개인적으로 `static` 변수와 메소드들은 공통 코드와 클래스 내에서 본인이 쓰는 변수 외에는 지양하는게 맞지 않나 생각합니다. (사실 어떻게 설계하는게 맞는지는 여전히 잘 모르겠습니다.) 

	그래서 저 같은 경우에는 제가 만든 모든 클래스들은 객체를 생성하여 사용해야되지만, 팀원들은 모두 static으로 작성하여 코드를 합칠 때 통일성이 없어 보기 안 좋았습니다. 

	또한 다른 클래스의 static 변수들을 끌어다 쓰다보니 **static 변수들이 어디에 어떤 것이 얼마나 흩어져 있는지 파악하기 어려웠습니다.** (그냥 쓰다보니 있어서 쓴다는 느낌..)

	가령 로그인을 할 때도 회원 ID를, `Login`  클래스에 `public static String loginId` 로 설정해 다른 클래스에서 `Login.loginId` 로 끌어다 쓰는게 아니라, 메소드를 호출하고 `loginId`를 매개변수로 넘기는게 맞다고 생각합니다. 

	**이 또한 공통 코드 작성 시 팀원들과 상의하여 진행했으면 더더욱 깔끔한 코드가 되지 않았을까 아쉽습니다.**
<br/>

### 🎨 UI 및 PPT
**미적인 부분은 다시는 타협하지 않을겁니다**😭😭😭
콘솔 프로젝트라고 예시로 올려준 파일만 참고하여 끝낸걸 발표가 끝나고 굉장히 후회했습니다. 

#### 1. 콘솔 디자인
- 화면 꽉차게 디자인 할 것
- 최대한  GUI 느낌나게 디자인 할 것
- **⭐디테일 살릴 것⭐** (Box 디자인, 메뉴바, 이모티콘 및 이모지, Header, footer)
- 사용자 입력이 여러 번 있을 때 input 라인 맞추기

다른 조들의 발표를 보며 미적인 부분 신경을 덜 쓴 걸 많이 후회했습니다. 아마 역할 분담이 모호했던 탓도 있지 않을까 합니다. (기능 구현 부분만 파트를 나누고, 기획서/PPT 작성 등은 모두 같이 진행했습니다.)

다음부터는 미적 부분은 강력하게 의견을 어필해야하겠다 생각했습니다. **이전 예시 자료들을 참고하되 따라해서는 안되고, 프로젝트에 맞는 디자인을 끊임없이 생각해야됩니다.** 
<br/>

#### 2. PPT
재학 시 친한 지인들과 팀프로젝트시에는 PPT 작성의 통일성을 맞추기 위해 OneDrive Desktop을 설치하도록 권유했습니다. PPT 프로그램을 실행하여 각자 작성하고 최종적으로 제가 확인하면서 전체 정렬, 폰트, 오브젝트 사이즈 등을 맞출 수 있었기 때문입니다. 

하지만 안면식이 별로없는 팀원들에게 권유할 수 없었고, 원드라이브에서 공유를 해도 온라인 작성시에는 폰트를 맞출 수 없어 구글 슬라이드로 타협을 봤습니다.  구글 슬라이드도 나쁘지 않았고 구글폰트에서 다양한 폰트를 지원해줘서 좋았습니다.

다만, **작성 과정에서 누군가 총괄해서 정렬 등을 맞추는 것이 아니다보니** 디테일한 부분을 맞추기 어려웠고 자신이 작성한 부분 외에 다른 팀원이 작성한 부분은 신경 쓰지 않다보니 **캡쳐 화면크기가 다 다르다던가, 찌그러진 부분이 있다던가 통일성이 많이 깨졌습니다.**

* 역할 분담의 모호함
* 자기 작성 부분 외에는 신경쓰지 않았던 부분
* 다들 의견 어필이 없었던 것
* 이전 예시 PPT를 참고해 만들어 디테일하게 신경쓰지 않은 것 

이런 부분이 모여 개인적으로 PPT의 디테일이 많이 떨어진 것처럼 보였습니다. 
**다음 팀프로젝트 시에는 코드 작성 외에 다른 부분의 역할 분담도 꼭 필요함을 느꼈습니다.**



## 추후 보완점

 - 코드 리팩토링
	 - [ ] Main 클래스 정리
	 - [ ] 종료 후에도 타 메뉴가 나오는 부분 오류 잡기
	 - [ ] 내가 작성 한 클래스 메소드 순서 정리
- 문서 정리
	 - [ ] 구글 드라이브 정리 및 백업
		 - 현재 Git에 올라온건 pdf파일. 수정을 위해 ppt파일이 있는 드라이브 정리하여 백업해놓기
- 이번 프로젝트로 배운 점 정리
	 - 이클립스를 통한 github 사용법
		 - [ ] 이클립스와 github 레포지토리 clone 및 import
		 - [ ] 깃헙 로그인시 오류 -> 깃헙 토큰 생성하여 로그인하여 오류 처리 
		 - [ ] branch 생성 및 Remote, PR

	
