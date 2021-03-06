package com.jrd.eight_chapter.randomizer;


import org.junit.Test;

import java.util.stream.Stream;

/**
 * Created by jakub on 22.11.16.
 */
public class LcgTest {

    @Test
    public void lcgTest() {
        Lcg lcg = new Lcg(62L, 25214903917L, 11L, (long)Math.pow(2, 48));
        Stream<Long> randomStr = lcg.randomStream();

        randomStr.limit(20).forEach(a -> System.out.println(a % 100));
    }
}
