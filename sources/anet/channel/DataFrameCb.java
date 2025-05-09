package anet.channel;

import anet.channel.session.TnetSpdySession;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface DataFrameCb {
    void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i, int i2);

    void onException(int i, int i2, boolean z, String str);
}
