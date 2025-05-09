package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class er {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final er INSTANCE = new er();

    /* renamed from: a  reason: collision with root package name */
    public static mdb f18770a;
    public static mdb b;

    static {
        t2o.a(144703545);
    }

    public static final mdb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdb) ipChange.ipc$dispatch("a8d5bdc5", new Object[0]);
        }
        mdb mdbVar = f18770a;
        if (mdbVar != null) {
            return mdbVar;
        }
        ckf.y("abilityHub");
        throw null;
    }

    public static final mdb b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mdb) ipChange.ipc$dispatch("9f1d9339", new Object[0]);
        }
        mdb mdbVar = b;
        if (mdbVar != null) {
            return mdbVar;
        }
        ckf.y("rocketAbilityHub");
        throw null;
    }

    public static final void c(mdb mdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3857679", new Object[]{mdbVar});
            return;
        }
        ckf.g(mdbVar, "<set-?>");
        f18770a = mdbVar;
    }

    public static final void d(mdb mdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d51be885", new Object[]{mdbVar});
            return;
        }
        ckf.g(mdbVar, "<set-?>");
        b = mdbVar;
    }
}
