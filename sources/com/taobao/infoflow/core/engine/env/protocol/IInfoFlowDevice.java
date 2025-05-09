package com.taobao.infoflow.core.engine.env.protocol;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface IInfoFlowDevice {
    public static final String LEVEL_HIGH = "h";
    public static final String LEVEL_LOW = "l";
    public static final String LEVEL_MED = "m";
    public static final String LEVEL_UNKNOWN = "unknown";

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public @interface LEVEL {
    }

    String getDeviceLevel();

    int getDeviceScore();
}
