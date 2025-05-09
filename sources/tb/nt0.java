package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class nt0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final nt0 INSTANCE = new nt0();

    /* renamed from: a  reason: collision with root package name */
    public static String f24934a;
    public static String b;

    static {
        t2o.a(766510141);
    }

    public final String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c42f8fac", new Object[]{this, str});
        }
        if (!ckf.b(str, f24934a)) {
            return null;
        }
        String str2 = b;
        b = null;
        f24934a = null;
        return str2;
    }

    public final void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("469bab41", new Object[]{this, str, str2});
            return;
        }
        f24934a = str;
        b = str2;
    }
}
