package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.bac;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class sbs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final sbs INSTANCE = new sbs();

    /* renamed from: a  reason: collision with root package name */
    public static final String f27932a = bac.b.a("SHARE");
    public static final String b = bac.b.a("ABOUT");
    public static final String c = bac.b.a("MORE_CHANNEL");
    public static final String d = bac.b.a("AUTHORIZE_SETTING");
    public static final String e = bac.b.a("COMMENT");
    public static final String f = bac.b.a("ADD_TO_DESKTOP");
    public static final String g = bac.b.a("HELP");
    public static final String h = bac.b.a("REPORT");
    public static final String i = bac.b.a("FEEDBACK");

    static {
        t2o.a(839909528);
        bac.b.a("OPEN_PROXY");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60170ff6", new Object[]{this});
        }
        return b;
    }

    public final String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("921f3861", new Object[]{this});
        }
        return f;
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12e9c9c9", new Object[]{this});
        }
        return d;
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8612ce4", new Object[]{this});
        }
        return e;
    }

    public final String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7eaab72", new Object[]{this});
        }
        return i;
    }

    public final String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("68fa6e36", new Object[]{this});
        }
        return g;
    }

    public final String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b4f5887e", new Object[]{this});
        }
        return c;
    }

    public final String h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1f8042a3", new Object[]{this});
        }
        return h;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e3e55ce4", new Object[]{this});
        }
        return f27932a;
    }
}
