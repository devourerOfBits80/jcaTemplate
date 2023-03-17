package org.devourerofbits80.jcatemplate;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testExample() {
        //given
        final String helloWorld = "HeLLo WorLd!";
        final int expectedCountOfL = 3;

        //when
        final long actualCountOfL = helloWorld.chars().filter(i -> i == 'L').count();

        //then
        assertThat(actualCountOfL).isEqualTo(expectedCountOfL);
    }
}
