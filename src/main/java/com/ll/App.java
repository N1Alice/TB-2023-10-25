package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    void run() {
        int loop_count = 0;
        ArrayList<String> wsc = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
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

                for(int i = 0; i < wsc.size(); i++){
                    String wscs = wsc.get(i);
                    String as = a.get(i);

                    System.out.printf("%d /" + "%s /" + "%s \n", i+1, as, wscs);
                }
                continue;
            }
        }
    }
}