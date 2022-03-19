package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {

    @Mock
    Feline felineMock;

    @Test
    public void catFoodMock() throws Exception {
        Cat catMock = new Cat(felineMock);
        Cat cat = new Cat(new Feline());
        when(catMock.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(catMock.getFood(), cat.getFood());

    }


    @Mock
    private List<String> sound;

    @Mock
    Cat catMock;

    @Test
    public void catOtherSound() {
        Mockito.when(sound.get(0)).thenReturn("Мур");
        Mockito.when(sound.get(1)).thenReturn("Му");
        Mockito.when(catMock.getSound()).thenReturn("Мур");
        assertEquals(sound.get(0), catMock.getSound());
        assertEquals("Это точно кошка?", sound.get(1), catMock.getSound());
    }

    @Test
    public void catKittens(){
        Mockito.when(felineMock.getKittens()).thenReturn(6);
        int kittens = felineMock.getKittens();
        assertEquals(6,kittens);

    }


}