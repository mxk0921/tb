package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.split.core.splitinstall.SplitInstallException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class wcq implements ucq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ycq f30615a;
    public final o5c b;
    public final scq c;
    public final rcq d;
    public final jvc e;

    static {
        t2o.a(677380255);
        t2o.a(676331581);
    }

    public wcq(ycq ycqVar, Context context) {
        this(ycqVar, context, context.getPackageName());
    }

    public static String i() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("abcf2ad4", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        try {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String str6 = "";
            if (stackTrace.length > 7) {
                str = stackTrace[6].getClassName();
            } else {
                str = str6;
            }
            if (stackTrace.length > 7) {
                str2 = stackTrace[6].getMethodName();
            } else {
                str2 = str6;
            }
            sb.append(str + ":" + str2);
            if (stackTrace.length > 8) {
                str3 = stackTrace[7].getClassName();
            } else {
                str3 = str6;
            }
            if (stackTrace.length > 8) {
                str4 = stackTrace[7].getMethodName();
            } else {
                str4 = str6;
            }
            sb.append(str3 + ":" + str4);
            if (stackTrace.length > 9) {
                str5 = stackTrace[8].getClassName();
            } else {
                str5 = str6;
            }
            if (stackTrace.length > 9) {
                str6 = stackTrace[8].getMethodName();
            }
            sb.append(str5 + ":" + str6);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Override // tb.ucq
    public void a(String str, vfc vfcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e765fbad", new Object[]{this, str, vfcVar});
        } else {
            this.c.f(str, vfcVar);
        }
    }

    @Override // tb.ucq
    public void b(b02 b02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a889e6", new Object[]{this, b02Var});
        } else {
            this.c.h(b02Var);
        }
    }

    @Override // tb.ucq
    public final bdt<Void> d(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("45c5a005", new Object[]{this, list});
        }
        if (acq.F(acq.p().o())) {
            for (String str : list) {
                this.e.b(str, true, "deferredInstall_channel", 0L, 0, i(), acq.p().t());
            }
            if (!n1r.a(acq.p().o())) {
                return uft.b(null);
            }
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            if (((y07) this.b).b(str2) != null && ((y07) this.b).b(str2).size() > 0) {
                arrayList.addAll(((y07) this.b).b(str2));
            }
        }
        hashSet.addAll(arrayList);
        if (!n1r.m(acq.p().o())) {
            return uft.b(null);
        }
        Set<String> f = f();
        if (f.containsAll(hashSet)) {
            return uft.b(null);
        }
        hashSet.removeAll(f);
        hashSet.removeAll(n1r.i(acq.p().o()));
        if (this.e != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                this.e.b((String) it.next(), true, jvc.ARG_DEFFERED_INSTALL, 0L, 0, "", acq.p().t());
            }
        }
        return this.f30615a.a(new ArrayList(hashSet));
    }

    @Override // tb.ucq
    public final void e(edq edqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b167d3", new Object[]{this, edqVar});
        } else {
            this.c.i(edqVar);
        }
    }

    @Override // tb.ucq
    public final Set<String> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Set) ipChange.ipc$dispatch("6bedb799", new Object[]{this});
        }
        return this.d.b();
    }

    @Override // tb.ucq
    public final void g(edq edqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4659877a", new Object[]{this, edqVar});
        } else {
            this.c.g(edqVar);
        }
    }

    public scq h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (scq) ipChange.ipc$dispatch("e8d3cd65", new Object[]{this});
        }
        return this.c;
    }

    public wcq(ycq ycqVar, Context context, String str) {
        this.b = new y07();
        this.e = (jvc) d62.a(jvc.class, new Object[0]);
        new Handler(Looper.getMainLooper());
        this.d = new rcq(context, str);
        this.f30615a = ycqVar;
        this.c = scq.j(context);
        new o97(context);
        n49.d(acq.p().o());
    }

    @Override // tb.ucq
    public final bdt<Integer> c(xcq xcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bdt) ipChange.ipc$dispatch("a59f2998", new Object[]{this, xcqVar});
        }
        if (acq.F(acq.p().o())) {
            for (String str : xcqVar.a()) {
                this.e.b(str, true, "startInstall_channel", 0L, 0, i(), acq.p().t());
            }
            this.c.k().c("startInstall features: %s from channel: %s", xcqVar.a(), Arrays.asList(Thread.currentThread().getStackTrace()));
            if (!n1r.a(acq.p().o())) {
                return uft.b(0);
            }
        }
        List<String> a2 = xcqVar.a();
        if (a2.isEmpty()) {
            return uft.a(new SplitInstallException(-3));
        }
        if (!n1r.m(acq.p().o())) {
            return uft.a(new SplitInstallException(-2));
        }
        for (String str2 : a2) {
            jvc jvcVar = this.e;
            if (jvcVar != null) {
                jvcVar.b(str2, true, jvc.ARG_START_INSTALL, 0L, 0, "", acq.p().t());
            }
        }
        return this.f30615a.f(a2, new HashSet(), xcqVar.b());
    }
}
