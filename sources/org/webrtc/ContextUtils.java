package org.webrtc;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class ContextUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ContextUtils";
    private static Context applicationContext;

    static {
        t2o.a(395313735);
    }

    @Deprecated
    public static Context getApplicationContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("c5c75d34", new Object[0]);
        }
        return applicationContext;
    }

    public static void initialize(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
        } else if (context != null) {
            applicationContext = context;
        } else {
            throw new IllegalArgumentException("Application context cannot be null for ContextUtils.initialize.");
        }
    }
}
