package com.dojo.kata;


import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    public void shouldTestWithAssertJ() {
        assertThat("foo").isEqualTo("foo");
    }

    @Test
    public void shouldTestWithJUnit() {
        assertEquals("foo", "foo");
    }

    @Test
    public void shouldTestWithHamcrestMatcher() {
        MatcherAssert.assertThat("foo", is("foo"));
    }

    @Test
    @DisplayName("With jUnit5 we can have nice display names for tests")
    public void shouldDisplayNiceMessage() {
        assertThat("foo").isEqualTo("foo");
    }
}

