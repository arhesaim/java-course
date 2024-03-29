package pr7.ex1;

import java.util.ArrayList;

public class SportsTeam<T extends Player, S>{
    private S affiliation;
    private String name;
    private ArrayList<T> arrayList = new ArrayList<>();

    public SportsTeam(String name, S affiliation) {
        this.name = name;
        this.affiliation = affiliation;
    }

    void addTeamMember(T player){
        this.arrayList.add(player);
    }

    void listTeamMembers(){
        System.out.println((affiliation == null ? "" : " Affil: "+ affiliation));
    }
}