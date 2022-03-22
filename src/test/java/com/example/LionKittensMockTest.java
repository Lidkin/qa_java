package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)

public class LionKittensMockTest {

    @Mock
    Feline felineMock;

        @Test
        public void lionKittens () throws Exception {
        Lion lion = new Lion("Самка", felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());

    }
}