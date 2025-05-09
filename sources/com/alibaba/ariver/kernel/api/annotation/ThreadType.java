package com.alibaba.ariver.kernel.api.annotation;

import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface ThreadType {
    String[] transSyncThreadNames() default {};

    ExecutorType value() default ExecutorType.SYNC;
}
