package com.example;

import org.junit.Test;


public class LionDoesHaveManeWithExceptionTest {

    @Test(expected = Exception.class)
    public void lionDoesHaveMane() throws Exception {
        Lion lion = new Lion("не определено", new Feline());
        lion.doesHaveMane();
    }
}
