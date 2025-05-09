package com.alibaba.android.ultron.vfw.perf.rebuilddelay;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Taobao */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public @interface UltronViewRebuildDelayType {
    public static final String rebuildWhenIdle = "rebuildWhenIdle";
    public static final String rebuildWhenIdleOrLastItemVisible = "rebuildWhenIdleOrLastItemVisible";
}
