package org.android.spdy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SpdyStreamContext {
    public Spdycb callBack;
    public Object streamContext;
    public int streamId;

    public SpdyStreamContext(Object obj, Spdycb spdycb) {
        this.streamContext = obj;
        this.callBack = spdycb;
    }
}
