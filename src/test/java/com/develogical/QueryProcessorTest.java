package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsTeamName() throws Exception {
        assertThat(queryProcessor.process("what is your name"), containsString("dancing_dumpling"));
    }

    @Test
    public void dumplingdefinition() throws Exception {
        assertThat(queryProcessor.process("dumpling"), containsString("fat"));
    }
    @Test
    public void add3to9() throws Exception {
        assertThat(queryProcessor.process("what is 3 plus 9"), containsString("12"));
    }

    @Test
    public void large() throws Exception {
        assertThat(queryProcessor.process("which of the following numbers is the largest: 116, 55, 94, 259"), containsString("259"));
    }

}
