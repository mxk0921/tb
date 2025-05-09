package org.android.spdy;

import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public interface SessionCustomExtraCb {
    void onCustomFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr, SuperviseData superviseData, Map<String, Object> map);
}
