/*
 * Copyright (c) 2020 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.plugins;

import org.mockito.Incubating;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * A member accessor is responsible for invoking methods, constructors and for setting
 * and reading field values.
 */
@Incubating
public interface MemberAccessor {

    Object newInstance(Constructor<?> constructor, Object... arguments)
            throws InstantiationException, InvocationTargetException, IllegalAccessException;

    Object invoke(Method method, Object target, Object... arguments)
            throws InvocationTargetException, IllegalAccessException;

    Object get(Field field, Object target) throws IllegalAccessException;

    void set(Field field, Object target, Object value) throws IllegalAccessException;
}
