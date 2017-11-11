import org.junit.jupiter.api.Test;

import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeTest {
    @Test void subSet() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(9);
        tree.add(7);
        tree.add(4);
        tree.add(5);
        tree.add(2);
        tree.add(15);
        tree.add(20);
        SortedSet<Integer> sortedSet = new TreeSet<>();
        assertEquals(sortedSet, tree.subSet(5, 5));
        assertEquals(sortedSet, tree.subSet(4, 4));
        sortedSet.add(7);
        sortedSet.add(9);
        assertEquals(sortedSet, tree.subSet(7,15));
        sortedSet.add(4);
        sortedSet.add(5);
        sortedSet.add(2);
        sortedSet.add(15);
        assertEquals(sortedSet, tree.subSet(2, 20));

    }


    @Test void headSet() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(9);
        tree.add(7);
        tree.add(4);
        tree.add(5);
        tree.add(2);
        tree.add(15);
        tree.add(20);
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(2);
        sortedSet.add(4);
        assertEquals(sortedSet, tree.headSet(5));
        sortedSet.add(5);
        sortedSet.add(7);
        sortedSet.add(9);
        assertEquals(sortedSet, tree.headSet(15));

    }

    @Test void tailSet() {
        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(9);
        tree.add(7);
        tree.add(4);
        tree.add(5);
        tree.add(2);
        tree.add(15);
        tree.add(20);
        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(15);
        sortedSet.add(20);
        assertEquals(sortedSet, tree.tailSet(15));
        sortedSet.add(9);
        sortedSet.add(7);
        assertEquals(sortedSet, tree.tailSet(7));

    }
}