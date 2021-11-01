package com.project.user;

import java.util.*;
import com.project.data.*;
import com.project.main.*;

/**
 * UserTicketReserVation 클래스입니다.
 * 사용자의 티켓 예매를 돕습니다.
 * @author 이유미
 */
public class UserTicketReservation {
	private static Scanner scan;
	private static String userNum;
	private static String date;
	
	private static int adult;
	private static int youth;
	private static int kid;
	private static int totalPrice;
	private static int cardNum;
	
	private static ArrayList<Card> cardList;
	private static ArrayList<Ticket> ticketList;
	private static ArrayList<TicketReservation> reservationList;
	private static Calendar today;
	
	static {
		userNum = "U0001"; //TODO 임시
		scan = new Scanner(System.in);
		today = Calendar.getInstance();
	}

	public static void main(String[] args) throws Exception{
		menu();
		select();
		pay();
		
		TicketReservation t = new TicketReservation(String.format("T%tF0001", today).replace("-", "").replace("T2021", "T21")
													, String.format("T%tF", today).replace("-", "")
													, String.valueOf(adult)
													, String.valueOf(youth)
													, String.valueOf(kid)
													, String.valueOf(cardNum)
													, String.valueOf(totalPrice)
													, userNum);
		reservationList.add(t);
		Save.saveTicketReservation(reservationList);//ArrayList를 파일에 저장
		
		pause();
	}//main
	
	/**
	 * 티켓의 매수(성인/청소년/어린이)를 선택합니다.
	 */
	private static void select() {
		head();
		System.out.printf("%s월 %s일 티켓 예매를 진행합니다.\n"
						, date.substring(0, 2)
						, date.substring(2));
		System.out.println("성인: 40,000원 / 청소년: 20,000원 / 어린이: 10,000원\r\n");
		System.out.println("티켓 매수를 입력해주세요.");
		
		System.out.print("성인");
		System.out.print("👉 ");
		adult = scan.nextInt();
		
		System.out.print("청소년");
		System.out.print("👉 ");
		youth = scan.nextInt();
		
		System.out.print("어린이");
		System.out.print("👉 ");
		kid = scan.nextInt();
		
		System.out.printf("%n성인 %d매, 청소년 %d매, 어린이 %d매 선택하셨습니다.%n"
				, adult, youth, kid);
	}//select
	
	/**
	 * 카드를 선택해 티켓을 결제합니다.
	 */
	private static void pay(){
		totalPrice = adult * Integer.parseInt(ticketList.get(0).getPrice())
				+ youth * Integer.parseInt(ticketList.get(1).getPrice())
				+ kid * Integer.parseInt(ticketList.get(2).getPrice());
		
		System.out.printf("티켓 가격은 %,d원입니다.%n", totalPrice);
		System.out.println("결제 하시겠습니까?(Y/N)");
		System.out.print("👉 ");
		String sel = scan.nextLine();
		String sel2 = scan.nextLine();
		
		if(sel2.equalsIgnoreCase("N")) {
			pause();
			return;//TODO
		} else {
			System.out.println("\n제휴카드를 사용하시겠습니까?");
			System.out.println("1. 롯데카드(30%할인)");
			System.out.println("2. 삼성카드(10%할인)");
			System.out.println("3. 신한카드(20%할인)");
			System.out.println("4. 사용 안 함");
			
			System.out.print("👉 ");
			cardNum = scan.nextInt();
			if(cardNum != 4) {
				totalPrice *= Double.parseDouble(cardList.get(cardNum-1).getDiscount());
				System.out.printf("%n%s카드 할인으로 %,d원 결제됐습니다.", cardList.get(cardNum-1).getName(), totalPrice);
			}
		}
	}

	/**
	 * 사용자가 날짜를 선택합니다.
	 * @throws Exception
	 */
	private static void menu() throws Exception {
		cardList = Load.loadCard();
		ticketList = Load.loadTicket();
		reservationList = Load.loadTicketReservation();

		head();
		calendar();
		
		System.out.println("\n예매하실 티켓의 날짜를 선택해주세요.(MMDD)");
		System.out.println("B. 뒤로 가기");
		System.out.print("👉 ");
		date = scan.nextLine();
	}//menu
	
	/**
	 * 엔터를 누르기 전까지 화면 이동을 멈춥니다.
	 */
	private static void pause() {
		System.out.println();
		System.out.println("(엔터를 누르면 메뉴로 이동합니다.)");
		scan.nextLine();
	}//pause
	
	/**
	 * 헤더를 출력합니다.
	 */
	private static void head(){
		System.out.println("========================================================");
		System.out.println("\t\t\t[티켓 예매]");
		System.out.println("========================================================");
	}//head
	
	/**
	 * 예매 가능한 날짜를 출력하는 캘린더입니다.
	 * @throws Exception
	 */
	private static void calendar() throws Exception {
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		int date = today.get(Calendar.DATE);
		
		int dayOfWeek = getDayOfWeek(year, month);
		int lastDay = getLastDay(year, month);
		
		System.out.println("|일\t|월\t|화\t|수\t|목\t|금\t|토");
		
		for(int i=0; i<dayOfWeek; i++){
			System.out.print("\t");
		}
		
		for(int i=1; i<=lastDay; i++) {
			if(i>=date&&i<=date+13) {
				System.out.printf(" %s/%2d\t", month, i);
			} else {
				System.out.print("\t");
			}
			if((i + dayOfWeek) % 7 == 0) {
				System.out.println();
			}
		}
	}
	
	/**
	 * 해당월의 1일이 무슨 요일인지 반환합니다.
	 * @param year
	 * @param month
	 * @return
	 */
	private static int getDayOfWeek(int year, int month) {
		int day = 0;
		for(int i=1; i<year; i++) {
			day += isLeapYear(i) ? 366 : 365;
		}
		
		for(int i=1; i<month; i++) {
			day += getLastDay(year, i);
		}
		
		day++;
		
		return day % 7;
	}//dayOfWeek

	/**
	 * 해당월의 마지막일을 반환합니다.
	 * @param year
	 * @param month
	 * @return
	 */
	private static int getLastDay(int year, int month) {
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12 :
			return 31;
		case 4, 6, 9, 11 :
			return 30;
		case 2 : 
			return isLeapYear(year) ? 29 : 28;
		}
		return 0;
	}//lastDay

	/**
	 * 당해가 윤년인지 boolean값으로 반환합니다.
	 * @param year
	 * @return
	 */
	private static boolean isLeapYear(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}//isLeapYear
}
