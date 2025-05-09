package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u3s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295700139);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1952189", new Object[0])).booleanValue();
        }
        return vvs.b("tblive", "enableNoAgeMode", true);
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ee284517", new Object[0])).booleanValue();
        }
        if (!a() || d9m.e() == null || d9m.e().getNonageServiceX() == null) {
            return false;
        }
        return d9m.e().getNonageServiceX().c();
    }
}
