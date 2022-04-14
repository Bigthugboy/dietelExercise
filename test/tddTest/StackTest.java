package tddTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    Stack stack;
    @BeforeEach
    public void set(){
        stack = new Stack();
    }

    @Test
    public void stackCanBeCreated(){
        assertNotNull(stack);
    }

    @Test
    public void stackIsEmpty(){
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushOneElement_stackIsNotEmpty(){
        stack.push(13);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popX_stackShouldBeEmpty(){
        stack.push(13);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushXandY_popY_stackShouldNotBeEmptyTest(){
        stack.push(14);
        stack.push(14);
        stack.pop();
        assertFalse(stack.isEmpty());

    }
    @Test
    public void pushX_popX_elementShouldBeXTest(){
        stack.push(34);
        int element = stack.pop();
        assertEquals(34,element);
    }

    @Test
    public void pushXandY_popYandX_elementIsYthenXTest(){
        stack.push(34);
        stack.push(64);
        int element = stack.pop();
        assertEquals(64,element);
        element = stack.pop();
        assertEquals(34,element);
    }
    @Test
    public void pushXandY_peekReturnYTest(){
        stack.push(32);
        stack.push(69);
        int element = stack.peek();
        assertEquals(69,element);

        element = stack.pop();
        assertEquals(69,element);

        element = stack.peek();
        assertEquals(32,element);

    }
}
