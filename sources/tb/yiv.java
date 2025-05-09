package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yiv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f32121a = null;
    public static Boolean b = null;
    public static Boolean c = null;

    static {
        t2o.a(295698799);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d93b534b", new Object[0])).booleanValue();
        }
        if (f32121a == null) {
            f32121a = Boolean.valueOf(Boolean.parseBoolean(v2s.o().p().b("tblive", "enableGoodsListAsync", "true")));
        }
        return f32121a.booleanValue();
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5cf6dfab", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(Boolean.parseBoolean(v2s.o().p().b("tblive", "enableMultiPKLinkMicAsync", "true")));
        }
        return c.booleanValue();
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("115cec0f", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(Boolean.parseBoolean(v2s.o().p().b("tblive", "enablePKLinkAsync", "true")));
        }
        return b.booleanValue();
    }
}
