package com.taobao.android.xsearch.anno;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Taobao */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public @interface MUSCollectModule {
    String description();

    String name();
}
