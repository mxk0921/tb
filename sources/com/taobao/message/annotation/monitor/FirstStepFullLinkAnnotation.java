package com.taobao.message.annotation.monitor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public @interface FirstStepFullLinkAnnotation {
    boolean needLocalMonitor() default false;

    boolean needPersistence() default true;

    String stepId();

    String subTraceType();

    String traceType();

    int typeId();

    String userId();
}
