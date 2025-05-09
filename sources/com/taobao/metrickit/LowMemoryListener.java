package com.taobao.metrickit;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface LowMemoryListener {
    public static final int JAVA_USAGE_PEAK = 1;
    public static final int NATIVE_USAGE_PEAK = 2;

    /* compiled from: Taobao */
    @Target({ElementType.PARAMETER})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface LowMemoryType {
    }

    void a(int i, long j, long j2);
}
