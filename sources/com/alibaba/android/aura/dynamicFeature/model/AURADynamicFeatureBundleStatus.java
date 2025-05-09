package com.alibaba.android.aura.dynamicFeature.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface AURADynamicFeatureBundleStatus {
    public static final int INSTALLED = 4;
    public static final int INSTALLING = 3;
    public static final int NOT_INSTALL = 1;
    public static final int REQUEST_FOR_INSTALL = 2;
    public static final int UNDEFINE = 0;
}
