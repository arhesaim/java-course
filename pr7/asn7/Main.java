package pr7.asn7;

public class Main {
    public static void main(String[] args) {
        Rivers river1 = new Rivers("Missisipi", new String[][] {{"47.216", "-95.2348"}, {"29.1566", "-89.2495"}, {"35.1226", "-90.0659"}});
        National_Parks park1 = new National_Parks("grand canyon", new String[]{"30.3456", "45.6543"});

        Layer layer = new Layer();
        layer.addElement(river1);
        layer.addElement(park1);
        layer.renderLayer();

    }
}
