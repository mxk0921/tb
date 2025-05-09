package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class gw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962593318);
    }

    public s2v getSubProcessUTSceneTracker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s2v) ipChange.ipc$dispatch("6f25730a", new Object[]{this});
        }
        return null;
    }

    public abstract Class<? extends UTTracker> getSubProcessUTTrackerClass();

    public abstract Class<? extends kpw> getSubProcessWVApiPluginClass();

    public abstract void initProxy();

    public abstract boolean isUiSubProcess();

    public abstract void registerActivityLifecycleCallbacks();
}
