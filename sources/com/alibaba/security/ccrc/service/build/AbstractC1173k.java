package com.alibaba.security.ccrc.service.build;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.alibaba.security.ccrc.service.build.k  reason: case insensitive filesystem */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface AbstractC1173k {
    String apiName() default "";

    boolean intercept() default false;

    boolean isAsync() default true;

    Class<?> responseType() default String.class;
}
