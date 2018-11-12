public class Printer {
    private int paperLeft;
    private int tonnerLeft;

    public Printer(int paperleft) {
        this.paperLeft = paperleft;
        this.tonnerLeft = 0;
    }
    

    public int getPrint(int numOfCopies, int numOfPrints) {
        if (this.paperLeft >= 0) {
            return this.paperLeft - numOfPrints * numOfCopies;
        }
        return this.paperLeft;
    }

    public int getRefillPaper(int numOfPaper) {
        return this.paperLeft += numOfPaper;
    }

    public int getTonnerLeft(int numOfPrints, int numOfCopies){
        this.tonnerLeft = numOfPrints * numOfCopies;
        for (int i = 0; i> 1; i--){
            return this.tonnerLeft +i;
        }
        return this.tonnerLeft;
    }
}






