package com.path2wind.tmvp.di;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Terry
 * @time 16/9/21 20:33
 * email path2wind@gmail.com
 */

@Scope
@Retention(RUNTIME)
public @interface PerFragment {

}
