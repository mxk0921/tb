package com.taobao.weex;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.czr;
import tb.fbe;
import tb.t2o;
import tb.wv1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBWXSDKEngine implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(773849109);
    }

    public static void initSDKEngine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1172673", new Object[0]);
        } else {
            wv1.c(null, false, false, false, null);
        }
    }

    public static void setRemoteManager(fbe fbeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6890710a", new Object[]{fbeVar});
        } else {
            czr.d(fbeVar);
        }
    }

    public static void initSDKEngine(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ce5ac1", new Object[]{new Boolean(z)});
        } else {
            initSDKEngine(z, false);
        }
    }

    public static void initSDKEngine(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17fdb033", new Object[]{new Boolean(z), new Boolean(z2)});
        } else {
            wv1.c(null, false, z, z2, null);
        }
    }
}
