package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class ar implements mdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(524288003);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(524288002);
        t2o.a(144703546);
    }

    public ar() {
        sq.INSTANCE.e("abilityMap", tq.class);
    }

    public final void a(Class<? extends qqc<rq>> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4df70f8", new Object[]{this, cls});
            return;
        }
        ckf.g(cls, "staticMapBuilder");
        sq.INSTANCE.e("staticAbilityMap", cls);
    }

    @Override // tb.mdb
    public idb get(String str, String str2, String str3) {
        idb idbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (idb) ipChange.ipc$dispatch("1c2b338c", new Object[]{this, str, str2, str3});
        }
        ckf.g(str, "name");
        ckf.g(str2, "namespace");
        ckf.g(str3, "businessId");
        dud j = cjf.INSTANCE.j();
        if (j == null || (idbVar = j.e(str)) == null) {
            rq a2 = sq.INSTANCE.a(str, "staticAbilityMap");
            idbVar = a2 != null ? a2.a(str2) : null;
        }
        if (idbVar != null) {
            return idbVar;
        }
        rq a3 = sq.INSTANCE.a(str, "abilityMap");
        if (a3 != null) {
            return a3.a(str2);
        }
        return null;
    }
}
