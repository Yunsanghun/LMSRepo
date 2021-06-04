package LMS;

import java.util.ArrayList;
import java.util.Scanner;

class C01Student
{
	String stdId;
	String stdName;
	String stdAddr;
	String stdPhone;
	String Subject[];	//수강신청과목 저장 
}

public class C01StudentMenu {
	
	ArrayList<C01Student> Stdlist = new ArrayList();
	int Curidx;	// 현재 로그인한 학생 idx 저장  
	
	Scanner sc = new Scanner(System.in);
	int no=0;
	void run() {
		while(true)
		{
		System.out.println("------------ 학생메뉴 -------------");
		System.out.println("1.계정 등록");
		System.out.println("2.로그  인");
		System.out.println("3.로그 아웃");
		System.out.println("4.내 강의실");
		System.out.println("5.수강 신청");
		System.out.println("6.신청 취소");
		System.out.println("7.정보 수정");
		System.out.println("8.계정 삭제");
		System.out.println("9.종료");
		System.out.println("------------ 학생메뉴 -------------");
		System.out.print("입력 :");
		no = sc.nextInt();
		switch(no)
		{
		case 1:
			//C01StudentMenu객체를 만들고 
			//각정보 입력한 후
			//ArrayList에 추가합니다
			break;
		case 2:
			//로그인
			//ArrayList에 해당 stdId가 있는 idx를 CurIdx에 저장
			break;
		case 3:
			//로그아웃
			//CurIdx 에 9999값 넣음
			break;
		case 4:
			//내가 신청한 과목 정보 출력(여러 과목일수 있음)
			break;
		case 5:
			//CurIdx에 있는 학생 정보객체에 과목을 입력받아 저장 
			break;
		case 6:
			//신청 취소할 과목을 입력받아
			//동일한 과목이 있다면 삭제(NULL값 입력)
			break;
		case 7:
			//학생정보를 수정
			break;
		case 8:
			//계정삭제
			//현재 CurIdx 를 리스트에서 제거 
			break;
		case 9:
			//종료
			return ;
		default :
			//잘못입력 다시
		}
		
		
		
		}	
		
	}
}
