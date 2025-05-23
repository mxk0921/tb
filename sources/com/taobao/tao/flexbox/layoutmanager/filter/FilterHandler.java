package com.taobao.tao.flexbox.layoutmanager.filter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public @interface FilterHandler {
    String name();
}
