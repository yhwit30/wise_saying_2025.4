package org.example;

import java.util.*;

public class App {

    private Scanner sc;

    App(Scanner sc){
        this.sc = sc;
    }

    public void run(){
        System.out.println("== motivation 앱 실행 == ");

        int lastId = 1;
        List<WiseSaying> wiseSayingList = new ArrayList<>();

        while(true){
            System.out.print("명령어) ");
            String cmd = sc.nextLine().trim();

            if(cmd.equals("add")){
                System.out.print("명언 : ");
                String content = sc.nextLine();
                System.out.print("인물 : ");
                String person = sc.nextLine();
                System.out.printf("%d번 명언이 등록되었습니다.\n", lastId);

                WiseSaying temp = new WiseSaying(lastId, content, person);
                wiseSayingList.add(temp);

                lastId++;
            }
            else if(cmd.equals("list")){

                if (wiseSayingList.size() == 0){
                    System.out.println("등록된 명언이 없습니다.");
                }
                else{
                    System.out.println("번호   /     인물     /    명언");
                    System.out.println("=".repeat(30));
                    Collections.reverse(wiseSayingList);
                    for(WiseSaying temp : wiseSayingList){
                        System.out.printf("%d        %s      %s\n", temp.getId(), temp.getPerson(), temp.getContent());

                    }

                }

            }

            else if (cmd.equals("exit")){
                System.out.println("== motivation 앱 종료 ==");
                break;
            }
            else {
                System.out.println("존재하지 않는 명령어입니다.");
            }

        }
    }
}
