package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w9l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f30532a = null;
    public static Boolean b = null;

    static {
        t2o.a(295699950);
    }

    public static final boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a25b3d2d", new Object[0])).booleanValue();
        }
        if (f30532a == null) {
            f30532a = Boolean.valueOf(Boolean.parseBoolean(v2s.o().p().b("tblive", "enableIntimacyDXOpt", "false")));
        }
        return f30532a.booleanValue();
    }

    public static final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d3fbe5", new Object[0])).booleanValue();
        }
        if (b == null) {
            b = Boolean.valueOf(Boolean.parseBoolean(v2s.o().p().b("tblive", "enableRankDXOpt", "true")));
        }
        return b.booleanValue();
    }
}
