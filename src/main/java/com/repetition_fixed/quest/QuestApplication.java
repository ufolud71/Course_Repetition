package com.repetition_fixed.quest;

public class QuestApplication {
    public static void main(String[] args) {
        Knight knight = new Knight(new DeadIslandQuest());
        knight.finishQuest();
        Knight knight2 = new Knight(new EliteKnightQuest());
        knight2.finishQuest();
    }
}
