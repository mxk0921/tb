package com.alibaba.android.aura.schedule;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.PARAMETER, ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface AURAPriority {
    public static final int HIGH = 0;
    public static final int LOW = 2;
    public static final int NORMAL = 1;
}
