package com.taobao.artc.api;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class ArtcSignalRxHander {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(395313188);
    }

    public abstract void onConnected(Map<String, String> map);

    public abstract void onData(String str, byte[] bArr, Map<String, String> map);

    public abstract void onDisconnected(Map<String, String> map);

    public abstract void onResponse(String str, int i, Map<String, String> map);

    public abstract void onSendError(String str, int i, Map<String, String> map);
}
