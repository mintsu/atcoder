package com.mintsudev.atcoder.practice.contest.a;

import com.mintsudev.atcoder.practice.contest.a.Main;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MainTest {
    private ByteArrayOutputStream out;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @Test
    public void case1() {
        String input =
        "1" + System.lineSeparator()
        + "2 3" + System.lineSeparator()
        + "test" + System.lineSeparator();

        String expected = "6 test" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);
//        assertEquals(expected , out.toString());
        assertThat(out.toString(), is(expected));

    }

    @Test
    public void case2() {
        String input =
        "72" + System.lineSeparator()
        + "128 256" + System.lineSeparator()
        + "myonmyon" + System.lineSeparator();

        String expected = "456 myonmyon" + System.lineSeparator();

        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(null);
//        assertEquals(expected , out.toString());
        assertThat(out.toString(), is(expected));
    }
}