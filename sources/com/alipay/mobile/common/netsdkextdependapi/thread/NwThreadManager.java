package com.alipay.mobile.common.netsdkextdependapi.thread;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface NwThreadManager {
    boolean addIdleTask(Runnable runnable, String str, int i);

    void executeNormalTask(Runnable runnable);
}
