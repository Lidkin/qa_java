package com.example;

import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bind.annotation.StubValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class LionTest {


    @Test
    public void LionKittens() throws Exception {
        Lion lion = new Lion("Самка",new Feline());
        assertEquals(1, lion.getKittens());

    }


}