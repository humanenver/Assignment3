public abstract class Breakable {


    boolean boardRidable = true;



    public void youBrokeTheDeck(){

        this.boardRidable = false;


    }



    public abstract void setDeckStrength(int deckStrength);



    public abstract int getDeckStrength();



}
