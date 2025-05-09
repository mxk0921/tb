package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class x2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a5e f31105a = null;

    static {
        t2o.a(962593321);
    }

    public static a5e getUTService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a5e) ipChange.ipc$dispatch("e1959444", new Object[0]);
        }
        return f31105a;
    }

    public static void setUTService(a5e a5eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10be72f2", new Object[]{a5eVar});
        } else {
            f31105a = a5eVar;
        }
    }
}
