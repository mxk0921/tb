package com.alibaba.wireless.security.open.securityguardaccsadapter;

import android.content.Context;
import android.taobao.windvane.extra.uc.AliNetworkAdapter;
import com.alibaba.wireless.security.open.securityguardaccsadapter.WindvaneListener;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WindvaneAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final boolean DEBUG = false;
    private static final String TAG = "WindvaneAdapter";
    public static Context gContext = null;

    static {
        t2o.a(658505737);
    }

    public static void registerWindVaneListener(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98667b60", new Object[]{context});
            return;
        }
        WindvaneListener.WLOG.d("start registerWindVaneListener");
        gContext = context;
        AliNetworkAdapter.addHttpRequestCallback(new WindvaneListener());
    }
}
