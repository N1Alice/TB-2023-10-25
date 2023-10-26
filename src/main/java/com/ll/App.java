package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    void run() {
        int loop_count = 0; // 루프 카운트 변수
        int delete_count = 0; // 삭제 넘버 등록 변수
        ArrayList<String> wsc = new ArrayList<>(); // 명언 저장 배열
        ArrayList<String> a = new ArrayList<>();  // 작가 저장 배열
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {

                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                Scanner wscinput = new Scanner(System.in);
                String Wisesaying = scanner.nextLine();
                wsc.add(Wisesaying);

                System.out.print("작가 : ");
                Scanner ainput = new Scanner(System.in);
                String Athor = scanner.nextLine();
                a.add(Athor);


                loop_count = loop_count + 1;

                //System.out.printf("명언 : %s\n" + "작가 : %s\n", Wisesaying, Athor);

                System.out.println(loop_count + "번 명언이 등록되었습니다.");

                continue;
            } else if (cmd.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("------------------------------------------");
                // 목록 출력 반복문
                for(int i = 0; i < wsc.size(); i++){
                    String wscs = wsc.get(i);
                    String as = a.get(i);

                    System.out.printf(" %d / " + " %s / " + " %s \n", i+1, as, wscs);
                }
                continue;
            } else if (cmd.equals("삭제")) {

                System.out.print("번호 : ");
                Scanner deletenum = new Scanner(System.in);
                int Dn = scanner.nextInt();

                if (wsc.get(Dn-1) == null) // 배열 값 확인
                {
                    System.out.println(Dn + "번 명은은 존재하지 않습니다");
                    continue;

                } else if (wsc.get(Dn) != null) {
                    wsc.set(Dn-1, null);
                    a.set(Dn-1, null);

                    System.out.println(Dn + " 번 명언이 삭제되었습니다.");
                    continue;
                }

            }
        }
    }
}