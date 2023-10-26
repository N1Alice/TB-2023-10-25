package com.ll;

import java.util.Scanner;

public class App {
    void run() {
        int loop_count = 0;
        System.out.println("== 명언 앱 ==");

        while (true) {
            System.out.print("명령) ");
            Scanner scanner = new Scanner(System.in);
            String cmd = scanner.nextLine();

            if (cmd.equals("종료")) {
                break;
            } else if (cmd.equals("등록")) {
                System.out.print("명언 : ");
                Scanner wsc = new Scanner(System.in);
                String Wisesaying = scanner.nextLine();
                System.out.print("작가 : ");
                Scanner a = new Scanner(System.in);
                String Athor = scanner.nextLine();
                loop_count = loop_count + 1;

                System.out.println(loop_count + "번 명언이 등록되었습니다.");

                continue;
            }
        }
    }
}