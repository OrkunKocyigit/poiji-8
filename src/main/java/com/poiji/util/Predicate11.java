package com.poiji.util;

import java.util.Objects;
import java.util.function.Predicate;

@FunctionalInterface
public interface Predicate11<T> extends Predicate<T> {
    @SuppressWarnings("unchecked")
    static <T> Predicate<T> not(Predicate<? super T> target) {
        Objects.requireNonNull(target);
        return (Predicate<T>) target.negate();
    }
}