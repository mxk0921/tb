package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nth extends mth {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static mth h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mth) ipChange.ipc$dispatch("8d38ecae", new Object[0]);
        }
        return new nth();
    }

    public static /* synthetic */ Object ipc$super(nth nthVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/minutes/output/impl/MTSCollectorRiverLogOutput");
    }

    @Override // tb.mth
    public void b(cuh cuhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1b51ea9", new Object[]{this, cuhVar});
        } else if (cuhVar != null) {
            String e = e(cuhVar.d());
            String g = g(cuhVar.d());
            String f = f(cuhVar.d());
            guh.a(guh.TAG, "event|" + cuhVar.f() + "|" + e + "|" + g + "|" + f + "|" + cuhVar.e() + "|" + cuhVar.a());
        }
    }

    public final String e(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("720874db", new Object[]{this, quhVar});
        }
        if (quhVar == null || TextUtils.isEmpty(quhVar.x())) {
            return "unknown";
        }
        return quhVar.x();
    }

    public final String f(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8c5960d", new Object[]{this, quhVar});
        }
        if (quhVar == null || TextUtils.isEmpty(quhVar.t())) {
            return "unknown";
        }
        return quhVar.t();
    }

    public final String g(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66cef03d", new Object[]{this, quhVar});
        }
        if (quhVar == null || quhVar.v() == null || TextUtils.isEmpty(quhVar.v().a())) {
            return "unknown";
        }
        return quhVar.v().a();
    }

    @Override // tb.mth
    public void c(iuh iuhVar) {
        long j;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44a69a29", new Object[]{this, iuhVar});
            return;
        }
        String a2 = juh.a(iuhVar.x());
        String t = iuhVar.t();
        if (iuhVar.u() != null) {
            t = iuhVar.u().t() + "." + t;
        }
        fvh a3 = gvh.a();
        int x = iuhVar.x();
        if (x == 2) {
            j = iuhVar.A();
            fvh d = iuhVar.d();
            if (d != null) {
                a3.n(d);
            }
            a3.o("attrs", iuhVar.e());
        } else if (x != 3) {
            j = 0;
        } else {
            j = iuhVar.A() + iuhVar.n();
            fvh h = iuhVar.h();
            if (h != null) {
                a3.n(h);
            }
            a3.o("attrs", iuhVar.e());
            if (iuhVar.z() == 1) {
                a3.o("biz", iuhVar.w());
            }
        }
        String a4 = kuh.a(iuhVar.z());
        String g = g(iuhVar.s());
        String f = f(iuhVar.s());
        String e = a3.e();
        String e2 = e(iuhVar.s());
        if (iuhVar.A() == Long.MIN_VALUE) {
            str = "-";
        } else {
            str = String.valueOf(j);
        }
        guh.a(guh.TAG, a2 + "|" + iuhVar.v() + "|" + str + "|" + e2 + "|" + g + "|" + f + "|" + a4 + "|" + iuhVar.y().toJSONString() + "|" + t + "|" + iuhVar.n() + "|" + e);
    }
}
