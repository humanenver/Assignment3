
public class Skateboard extends Breakable implements Ridable{


  public int numOfWheels ;
  public int abecSpeed ;
  public  int deckStrength ;

    @Override
    public int getDeckStrength() {
        return deckStrength;
    }

    @Override
    public void setDeckStrength(int deckStrength) {
        this.deckStrength = deckStrength;
    }

    public int getWheels(){

      return this.numOfWheels;
  }

   public void setWheels(int numWheels)
    {

        this.numOfWheels = numOfWheels;
    }

  public int getAbecSpeed()
  {
      return abecSpeed;
  }


   public void setAbecSpeed(int abecSpeed)
   {
       this.abecSpeed = abecSpeed;
   }


    public Skateboard(int numOfWheels, int abecSpeed, int deckStrength) {
        this.numOfWheels = numOfWheels;
        this.abecSpeed = abecSpeed;
        this.deckStrength = deckStrength;
    }
}
