package com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom;

import android.app.Activity;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Map;

/* compiled from: Taobao */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface TradeHybridCustomAnnotation {
    Class<?>[] args() default {Activity.class, String.class, String.class, Map.class};
}
