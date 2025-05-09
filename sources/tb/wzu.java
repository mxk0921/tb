package tb;

import android.app.Application;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class wzu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593310);
    }

    public static void registeActivityLifecycleCallbacks(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce71c676", new Object[]{application});
        } else if (application != null) {
            application.registerActivityLifecycleCallbacks(izu.getInstance());
        }
    }

    public static void registerAppStatusCallbacks(tzu tzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bd7b7d9", new Object[]{tzuVar});
        } else if (tzuVar != null) {
            vzu.getInstance().registerAppStatusCallbacks(tzuVar);
        }
    }

    public static void unRegisterAppStatusCallbacks(tzu tzuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8831640", new Object[]{tzuVar});
        } else if (tzuVar != null) {
            vzu.getInstance().unregisterAppStatusCallbacks(tzuVar);
        }
    }

    public static void unregisterActivityLifecycleCallbacks(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24701f49", new Object[]{application});
        } else if (application != null) {
            application.unregisterActivityLifecycleCallbacks(izu.getInstance());
        }
    }
}
