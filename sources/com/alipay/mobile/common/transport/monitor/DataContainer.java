package com.alipay.mobile.common.transport.monitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface DataContainer {
    String getDataItem(String str);

    void putDataItem(String str, String str2);

    void removeDataItem(String str);

    void timeItemDot(String str);

    void timeItemDot(String str, long j);

    void timeItemRelease(String str);
}
