package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class s9s {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final s9s INSTANCE = new s9s();

    static {
        t2o.a(835715218);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("70edc6f4", new Object[]{this});
        }
        return q9s.I3("triver_important_config", "triverErrorReportButtonBlackList", "");
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a80c49a6", new Object[]{this})).booleanValue();
        }
        return q9s.a3("triver_important_config", "triverErrorReportButtonEnable", null);
    }
}
