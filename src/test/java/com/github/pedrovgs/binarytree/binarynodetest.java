package com.github.pedrovgs.binarytree;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class binarynodetest {

    @Test
    public void testHashCodeWithNoChildren() {
        BinaryNode<Integer> node = new BinaryNode<>(1);
        int expectedHashCode = 31 * (31 + Integer.hashCode(1));
        assertEquals(expectedHashCode, node.hashCode());
    }

    @Test
    public void testHashCodeWithChildren() {
        BinaryNode<Integer> parent = new BinaryNode<>(1);
        BinaryNode<Integer> leftChild = new BinaryNode<>(2);
        BinaryNode<Integer> rightChild = new BinaryNode<>(3);
        parent.setLeft(leftChild);
        parent.setRight(rightChild);

        int leftHashCode = 31 + Integer.hashCode(2);
        int rightHashCode = 31 + Integer.hashCode(3);
        int expectedHashCode = 31 * (31 * (31 + Integer.hashCode(1)) + leftHashCode) + rightHashCode;
        assertEquals(expectedHashCode, parent.hashCode());
    }

    @Test
    public void testHashCodeConsistency() {
        BinaryNode<Integer> node1 = new BinaryNode<>(1);
        BinaryNode<Integer> node2 = new BinaryNode<>(1);
        assertEquals(node1.hashCode(), node2.hashCode());
    }
}