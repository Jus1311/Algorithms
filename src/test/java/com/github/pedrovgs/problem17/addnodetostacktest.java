package com.github.pedrovgs.problem17;

import com.github.pedrovgs.binarytree.BinaryNode;
import org.junit.Before;
import org.junit.Test;
import java.lang.reflect.Method;
import java.util.Stack;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class addnodetostacktest {

    private BinaryTreeEquals binaryTreeEquals;
    private Method addNodeToStackMethod;

    @Before
    public void setUp() throws NoSuchMethodException {
        binaryTreeEquals = new BinaryTreeEquals();
        addNodeToStackMethod = BinaryTreeEquals.class.getDeclaredMethod("addNodeToStack", Stack.class, BinaryNode.class);
        addNodeToStackMethod.setAccessible(true);
    }

    @Test
    public void testAddNodeToStackWithNonNullNode() throws Exception {
        Stack<BinaryNode> stack = new Stack<>();
        BinaryNode<Integer> node = new BinaryNode<>(1);
        addNodeToStackMethod.invoke(binaryTreeEquals, stack, node);
        assertFalse("Stack should not be empty after adding a non-null node", stack.isEmpty());
        assertTrue("Stack should contain the added node", stack.contains(node));
    }

    @Test
    public void testAddNodeToStackWithNullNode() throws Exception {
        Stack<BinaryNode> stack = new Stack<>();
        addNodeToStackMethod.invoke(binaryTreeEquals, stack, null);
        assertTrue("Stack should be empty after attempting to add a null node", stack.isEmpty());
    }
}