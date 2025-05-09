package org.android.netutil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class NetListener {
    public long native_ptr = 0;
    public NetListenerType netListenerType;

    public NetListener(NetListenerType netListenerType) {
        this.netListenerType = netListenerType;
    }
}
