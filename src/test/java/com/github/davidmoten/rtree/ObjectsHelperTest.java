package com.github.davidmoten.rtree;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.github.davidmoten.util.ObjectsHelper;

public class ObjectsHelperTest {

    @Test
    public void testAsClassIsAbsentIfNull() {
        assertFalse(ObjectsHelper.asClass(null, Integer.class).isPresent());
    }

    @Test
    public void testAsClassIsAbsentIfDifferentClass() {
        assertFalse(ObjectsHelper.asClass(1, String.class).isPresent());
    }
}
