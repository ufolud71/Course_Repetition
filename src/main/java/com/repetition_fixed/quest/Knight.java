package com.repetition_fixed.quest;

public class Knight {

    private Quest quest;
    public Knight (Quest quest) {
        this.quest = quest;
    }

    public void finishQuest(){
        System.out.print("You have just finished: ");
        quest.process();
    }
}
