package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class hj9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f20681a;

    public static boolean a() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df182956", new Object[0])).booleanValue();
        }
        if (f20681a == null) {
            xhq c = ppo.b().c();
            if (c != null) {
                z = c.f31405a;
            } else {
                z = true;
            }
            f20681a = Boolean.valueOf(z);
        }
        Boolean bool = f20681a;
        f20681a = Boolean.TRUE;
        return bool.booleanValue();
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[0]);
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[0]);
        } else {
            f20681a = Boolean.TRUE;
        }
    }
}
