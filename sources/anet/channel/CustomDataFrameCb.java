package anet.channel;

import anet.channel.session.TnetSpdySession;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface CustomDataFrameCb {
    void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i, int i2, int i3, Map<String, Object> map);

    void onException(int i, int i2, boolean z, String str, Map<String, Object> map);
}
