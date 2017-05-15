public class Monkey {
  private String name;
  private Banana[] mouth;

  public Monkey(String name) {
    this.name = name;
    this.mouth = new Banana[5];
  }

  public String getName(){
    return this.name;
  }

  public int bananaCount() {
    int count = 0;
    for (Banana banana : mouth) {
      if(banana != null){
        count++;
      }
    }
    return count;
  }

  public void add(Banana banana) {
    if (mouthIsFull()) {
      return;
    }
    mouth[bananaCount()] = banana;
  }

  public boolean mouthIsFull() {
    return bananaCount() == mouth.length;
  }

  public void swallow() {
    for (int i = 0; i < mouth.length; i++) {
      mouth[i] = null;
    }
  }


}