package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class haj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static gw f20501a = null;

    static {
        t2o.a(962593319);
    }

    public static gw getMultiProcessAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gw) ipChange.ipc$dispatch("1535b2e7", new Object[0]);
        }
        return f20501a;
    }

    public static void setMultiProcessAdapter(gw gwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20e80a6f", new Object[]{gwVar});
        } else {
            f20501a = gwVar;
        }
    }
}
