package com.alibaba.android.aura.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface AURAExtensionMethod {
    boolean enableAspect() default true;

    String name() default "";
}
