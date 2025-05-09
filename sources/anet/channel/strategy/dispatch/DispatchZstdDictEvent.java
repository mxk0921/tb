package anet.channel.strategy.dispatch;

import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class DispatchZstdDictEvent {
    public String LatestDictionaryStr;
    public String contentEncodeStr;
    public String urlKey;
    public String useAsDictionaryStr;

    static {
        t2o.a(607125906);
    }

    public DispatchZstdDictEvent(boolean z, String str, String str2, String str3, String str4) {
        this.urlKey = null;
        this.contentEncodeStr = str2;
        this.useAsDictionaryStr = str3;
        this.LatestDictionaryStr = str4;
        if (z) {
            this.urlKey = str;
        }
    }
}
