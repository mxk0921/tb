package com.taobao.android.dinamicx;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IDXHardwareInterface {
    public static final int LEVEL_HIGH = 0;
    public static final int LEVEL_LOW = 2;
    public static final int LEVEL_MEDIUM = 1;
    public static final int LEVEL_UNKNOWN = -1;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public @interface DeviceLevel {
    }

    int getDeviceLevel();
}
