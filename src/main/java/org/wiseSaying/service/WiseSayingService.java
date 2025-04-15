package org.wiseSaying.service;

import org.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingService {
    int lastId = 1;
    List<WiseSaying> wiseSayingList = new ArrayList<>();

    public int add(String content, String person) {
        int id = lastId;
        WiseSaying temp = new WiseSaying(id, content, person);
        wiseSayingList.add(temp);
        lastId++;

        return id;
    }

    public List<WiseSaying> getList() {
        return wiseSayingList;
    }

    public void delete(WiseSaying removeWiseSaying) {
        wiseSayingList.remove(removeWiseSaying);
    }

    public int modify(WiseSaying modifyWiseSaying, String newContent, String newPerson) {
        modifyWiseSaying.setContent(newContent);
        modifyWiseSaying.setPerson(newPerson);

        return modifyWiseSaying.getId();
    }

    public WiseSaying findById(int id) {
        for (WiseSaying wiseSaying : wiseSayingList) {
            if (id == wiseSaying.getId()) {
                return wiseSaying;
            }
        }
        return null;
    }
}
