package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class djv {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean apkUpdateEnabled;
    public boolean bundleUpdateEnabled;
    public boolean checkUpdateOnStartUp;
    public df4 config;
    public boolean enableNativeLibUpdate;
    public boolean hasTest;
    public boolean lightApkEnabled;

    static {
        t2o.a(954204168);
    }

    public djv(df4 df4Var) {
        this.config = df4Var;
    }

    public djv enableApkUpdate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (djv) ipChange.ipc$dispatch("7553dcfb", new Object[]{this});
        }
        this.apkUpdateEnabled = true;
        return this;
    }

    public djv enableCheckUpdateOnStartup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (djv) ipChange.ipc$dispatch("50b66f09", new Object[]{this});
        }
        this.checkUpdateOnStartUp = true;
        return this;
    }

    public djv enableMonitor(ekv ekvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (djv) ipChange.ipc$dispatch("dfcf65b7", new Object[]{this, ekvVar});
        }
        c62.registerInstance(ekvVar);
        return this;
    }
}
