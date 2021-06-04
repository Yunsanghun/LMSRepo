package LMS;

import java.util.ArrayList;
import java.util.Scanner;

class LectureRoom
{
	int RoomNum;		//강의장번호
	boolean state; 		//강의배정여부
	String Subject;		//강의과목

}
public class C01AdminMenu {
	
	//강의실 룸정보 저장(교수메뉴/학생메뉴에도 볼수있도록 static 표시)
	public static ArrayList<LectureRoom> RoomList = new ArrayList();
	//학생정보,교수정보 확인용
	C01StudentMenu S;
	C01TeacherMenu T;
	
	//생성자를 이용해서 Menu에 있는 학생메뉴객체주소와
	//교수메뉴객체주소를 각각 멤버변수에 삽입합니다
	
	Scanner sc = new Scanner(System.in);
	int no=0;
	void run() {
		while(true)
		{
		System.out.println("------------ Admin메뉴 -------------");
		System.out.println("1.가입교수 리스트");
		System.out.println("2.가입학생 리스트");
		System.out.println("3.가능강의 리스트");
		System.out.println("4.수강학생 리스트");
		System.out.println("5.강의실 리스트");
		System.out.println("6.강의실 배정");
		System.out.println("7.교수 계정삭제");
		System.out.println("8.학생 계정삭제");
		System.out.println("9.종료");
		System.out.println("------------ Admin메뉴 -------------");
		System.out.print("입력 :");
		no = sc.nextInt();
		switch(no)
		{
		case 1:
			//가입교수 리스트
			//현재 저장된 교수 정보가 출력됩니다			
			break;
		case 2:
			//가입학생 리스트
			//현재 저장된 학생 정보가 출력됩니다
			break;
		case 3:
			//가능강의 리스트
			//현재 가능한 강의정보가 출력됩니다
			break;
		case 4:
			//수강학생 리스트 
			//현재 수강신청한 학생정보가 출력됩니다 
			break;
		case 5:
			//강의실 리스트
			//전체 강의장 번호와 
			//수업배정반의 강의장과
			//잔여 강의장을 출력합니다
			break;
		case 6:
			//배정받은 강의실 정보 출력 합니다 
			break;
		case 7:
			//교수ID를 입력받아 해당ID를  리스트에서 삭제합니다
			break;
		case 8:
			//학생ID를 입력받아 해당ID를  리스트에서 삭제합니다
			break;
		case 9:
			//Main 메뉴로 돌아갑니다
			return ;
		default :
			//잘못입력 다시
						
		}
			
		
		}	

	}
}
