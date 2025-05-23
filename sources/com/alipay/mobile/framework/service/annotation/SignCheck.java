package com.alipay.mobile.framework.service.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public @interface SignCheck {
    String value() default "yes";
}
