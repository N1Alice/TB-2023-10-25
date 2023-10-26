package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    void run() {
        int loop_count = 0; // 루프 카운트 변수
        ArrayList<String> wsc = new ArrayList<>(); // 명언 저장 배열
        ArrayList<String> a = new ArrayList<>();  // 작가 저장 배열
        Scanner scanner = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = scanner.nextLine(); // cmd = 입력받은 명령

            if (cmd.equals("종료")) {

                break;
            } if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                String Wisesaying = scanner.nextLine();
                wsc.add(Wisesaying);

                System.out.print("작가 : ");
                String Athor = scanner.nextLine();
                a.add(Athor);


                loop_count = loop_count + 1;

                //System.out.printf("명언 : %s\n" + "작가 : %s\n", Wisesaying, Athor);

                System.out.println(loop_count + "번 명언이 등록되었습니다.");

                continue;
            } if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------------------------------");
                // 목록 출력 반복문
                for(int i = 0; i < wsc.size(); ++i){
                    String wscs = wsc.get(i);
                    String as = a.get(i);

                    if (wsc.get(i) == null){ // 비어있는 배열의 경우 넘긴다.
                        continue;
                    }
                    System.out.printf(" %d / " + " %s / " + " %s \n", i+1, as, wscs);
                }
                continue;
            } if (cmd.equals("삭제")) {

                System.out.print("번호 : ");
                //int Dn = scanner.nextInt(); // 스캐너의 고질적인 문제
                int Dn  = Integer.parseInt(scanner.nextLine());

                if (wsc.get(Dn-1) == null) // 배열 값 비교확인
                {
                    System.out.println(Dn + "번 명언은 존재하지 않습니다"); //
                    continue;

                }
                else if (wsc.get(Dn-1) != null) // 배열 값 비교확인
                {
                    wsc.set(Dn-1, null);
                    a.set(Dn-1, null);

                    System.out.println(Dn + " 번 명언이 삭제되었습니다.");
                    continue;
                }

            } if (cmd.equals("수정")) {
                System.out.print("번호 : ");
                int Cn = Integer.parseInt(scanner.nextLine()); // Scanner의고질적인 문제
                //nextInt로 받는경우 Enter입력값이 계속 남아있기에 이후에 입력받을때 자동으로 엔터가 입력된다.
                System.out.println("명언(기존) : " + wsc.get(Cn-1));
                System.out.print("명언 : ");
                String Cws = scanner.nextLine();
                wsc.set(Cn-1, Cws);

                System.out.println("작가(기존) : " + a.get(Cn-1));
                System.out.print("작가 : ");
                String Ca = scanner.nextLine();
                a.set(Cn-1, Ca);


                continue;
            }

            else{
                System.out.println("등록되지 않은 명령 입니다.");
                continue;
            }
        }
    }
}