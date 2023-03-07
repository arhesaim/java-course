package pr3;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount > 0 && tonerAmount <= 100){
            if (tonerAmount + this.tonerLevel > 100){
                return -1;
            } else {
                return this.tonerLevel + tonerAmount;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (this.duplex){
            System.out.println("printer is printing in duplex mode");
            this.pagesPrinted += pagesToPrint/2;
        }
        return pagesToPrint/2;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
