package com.epam.homework.oop.t07;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Builers {
    public String nameMainEngineer();
    public String nameProjectManager();
}