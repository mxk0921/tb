package com.taobao.android.weex_framework.platform;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Inherited
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public @interface JSMethod {
    public static final String NOT_SET = "_";

    String alias() default "_";

    boolean uiThread() default true;
}
