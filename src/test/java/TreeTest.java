import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {
    @Test
    void getSizeWords() {
        PrefixTree t = new PrefixTree();
        String[] str_2 = "cat rat rad bad noob nools fox fix list medium".split(" ");
        for (String s: str_2){
            t.addAll(s);
        }
        t.printTree();
        assertEquals(str_2.length, PrefixTree.getSizeWords());
    }

}