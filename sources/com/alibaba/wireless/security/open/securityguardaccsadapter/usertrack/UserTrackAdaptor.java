package com.alibaba.wireless.security.open.securityguardaccsadapter.usertrack;

import com.android.alibaba.ip.runtime.IpChange;
import tb.i2v;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class UserTrackAdaptor {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "UserTrackAdaptor";

    static {
        t2o.a(658505742);
    }

    public static void registerListener(IUserTrackPlugin iUserTrackPlugin) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669b46c3", new Object[]{iUserTrackPlugin});
        } else if (iUserTrackPlugin != null) {
            i2v.getInstance().registerPlugin(new UserTrackPlugin(iUserTrackPlugin));
        }
    }
}
