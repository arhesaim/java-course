package pr7;

public class Main {
    public static void main(String[] args){
//        SportsTeam psg = new SportsTeam ("PSG");
        var philly = new Affiliation("city", "Philadelphia", "US");

        SportsTeam<FootballPlayer, Affiliation> footballPlayerSportsTeam = new SportsTeam<>("sg", philly);
        var messi = new FootballPlayer("Lionel Messi","Forward");
        footballPlayerSportsTeam.addTeamMember(messi);

        SportsTeam<HockeyPlayer, Affiliation> hockeyPlayerSportsTeam = new SportsTeam<>("kr", philly);
        var ovechkin = new HockeyPlayer("Alexander Ovechkin","Forward");
        hockeyPlayerSportsTeam.addTeamMember(ovechkin);

        footballPlayerSportsTeam.addTeamMember(new FootballPlayer("N Roberts", "Setter"));
        footballPlayerSportsTeam.listTeamMembers();
    }
}
