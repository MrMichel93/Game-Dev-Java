import java.util.ArrayList;

public class Problem2_QuestLog_Solution {
    public static void completeQuest(ArrayList<String> quests, String quest) {
        quests.remove(quest);
    }
    
    public static void main(String[] args) {
        ArrayList<String> quests = new ArrayList<>();
        quests.add("Find sword");
        quests.add("Defeat goblin");
        completeQuest(quests, "Find sword");
        System.out.println("Active quests: " + quests);
    }
}
