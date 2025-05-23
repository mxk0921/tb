package com.taobao.vpm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public @interface CalledByNative {
    String value() default "";
}
