import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MonkeyTest {
  Monkey monkey;
  Banana banana;
  Tree tree;


  @Before
  public void before() {
    monkey = new Monkey("Pip");
    banana = new Banana();
    tree = new Tree(3);
  }

  @Test
  public void hasName() {
    assertEquals("Pip", monkey.getName());
  }

  @Test
  public void mouthStartsEmpty() {
    assertEquals(0, monkey.bananaCount());
  }

  @Test
  public void canAddBanana(){
    monkey.add(banana);
    assertEquals(1, monkey.bananaCount());
  }

  @Test 
  public void cannotAddBananaBecauseMouthIsFull() {
    for(int i = 0; i < 6; i++){
      monkey.add(banana);
    }
    assertEquals(5, monkey.bananaCount());
  }

  @Test
  public void mouthIsFull() {
    for(int i = 0; i <5; i++) {
      monkey.add(banana);
    }
    assertEquals(true, monkey.mouthIsFull());
  }

  @Test
  public void emptyMouthafterSwallowing() {
    monkey.add(banana);
    monkey.swallow();
    assertEquals(0, monkey.bananaCount());
  }

  @Test
  public void treeIsEmpty() {
    assert(tree.isEmpty());
  }

  @Test
  public void feed() {
    assertEquals(3, tree.bananaCount());
    tree.feed(monkey);
    assertEquals(2, tree.bananaCount());
    tree.feed(monkey);
    tree.feed(monkey);
    assert(tree.isEmpty());
    tree.feed(monkey);
    assertEquals(3, monkey.bananaCount());

  }
  

}