package org.wiseSaying.controller;

import org.project.Container;
import org.project.Rq;
import org.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingController {

    public WiseSayingController() {
    }

    int lastId = 1;
    List<WiseSaying> wiseSayingList = new ArrayList<>();

    public void add() {
        System.out.print("명언 : ");
        String content = Container.getScanner().nextLine();
        System.out.print("인물 : ");
        String person = Container.getScanner().nextLine();
        System.out.printf("%d번 명언이 등록되었습니다.\n", lastId);

        WiseSaying temp = new WiseSaying(lastId, content, person);
        wiseSayingList.add(temp);

        lastId++;
    }

    public void list() {
        if (wiseSayingList.size() == 0) {
            System.out.println("등록된 명언이 없습니다.");
        } else {
            System.out.println("번호   /     인물     /    명언");
            System.out.println("=".repeat(30));
            for (int i = wiseSayingList.size() - 1; i >= 0; i--) {
                WiseSaying temp = wiseSayingList.get(i);
                System.out.printf("%d        %s      %s\n", temp.getId(), temp.getPerson(), temp.getContent());
            }

        }
    }

    public void remove(Rq rq){
        // 여기서 delete?id=1 의 1번을 찾아서 삭제해야한다. => rq 필요해서 인자를 받음
        int id = -1;

        try{
            id = Integer.parseInt(rq.getParams("id"));
        }
        catch (NumberFormatException e){
            System.out.println("id(정수)를 제대로 입력해주세요.");
        }

        System.out.printf("%d번 명언이 삭제되었습니다.\n", id);


    }
}
