package org.example;

import java.util.Scanner;

public class App {

    private Scanner sc;

    App(Scanner sc){
        this.sc = sc;
    }

    public void run(){
        System.out.println("== motivation 앱 실행 == ");

        int lastId = 1;

        while(true){
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if(cmd.equals("add")){
                System.out.print("명언 : ");
                String content = sc.nextLine();
                System.out.print("인물 : ");
                String person = sc.nextLine();
                System.out.printf("%d번 명언이 등록되었습니다.\n", lastId);
                lastId++;
            }

            if (cmd.equals("exit")){
                System.out.println("== motivation 앱 종료 ==");
                break;
            }
        }

    }


}
