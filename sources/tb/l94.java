package tb;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import tb.tzm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l94 implements m94 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wzm f23190a = new wzm();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements tzm.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yzm f23191a;
        public final /* synthetic */ i94 b;

        public a(yzm yzmVar, i94 i94Var) {
            this.f23191a = yzmVar;
            this.b = i94Var;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8262ae85", new Object[]{this});
            } else {
                vhh.a(l94.this.getName(), "onCommandFinished");
            }
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37980567", new Object[]{this});
                return;
            }
            vhh.a(l94.this.getName(), "onCommandInvoked");
            this.f23191a.d(105);
            l94.b(l94.this).b(this.b.b() + 1);
        }
    }

    static {
        t2o.a(768606238);
        t2o.a(768606240);
    }

    public static /* synthetic */ wzm b(l94 l94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wzm) ipChange.ipc$dispatch("7383eec7", new Object[]{l94Var});
        }
        return l94Var.f23190a;
    }

    @Override // tb.m94
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "CompileProfile";
    }

    public final long c(Context context, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cd390c66", new Object[]{this, context, new Long(j)})).longValue();
        }
        long j2 = -1;
        for (int i = 0; i < 30; i++) {
            try {
                j2 = pbk.b(context);
                if (j2 > j) {
                    break;
                }
                vhh.c(getName(), "waiting for odex size to be changed, retry after 2000ms");
                Thread.sleep(2000L);
            } catch (Throwable th) {
                vhh.b(getName(), "get odex size occur error:", th);
            }
        }
        return j2;
    }

    @Override // tb.m94
    public void a(i94 i94Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13bf6a64", new Object[]{this, i94Var});
            return;
        }
        Context d = i94Var.d();
        yzm e = i94Var.e();
        String packageName = d.getPackageName();
        e.d(103);
        this.f23190a.g(i94Var.c().c);
        long b = pbk.b(d);
        e.f(b);
        String name = getName();
        vhh.a(name, "current odex file size is " + b);
        Pair<Boolean, Long> b2 = tzm.b(Build.VERSION.SDK_INT, packageName, "speed-profile", new a(e, i94Var));
        int a2 = i94Var.a();
        String name2 = getName();
        vhh.a(name2, "current compile times: " + a2);
        if (((Boolean) b2.first).booleanValue()) {
            this.f23190a.a(((Long) b2.second).longValue(), a2);
            long c = c(d, b);
            String name3 = getName();
            vhh.a(name3, "compiled, odexSize " + b + " -> " + c);
            e.e(c);
            this.f23190a.h(b, c, ((Long) b2.second).longValue(), a2);
            if (i94Var.c().e) {
                i94Var.g(new gj9(this, "compiled and finishWhenInvoked is true")).f();
                return;
            } else if (a2 != -1 && c <= 0) {
                String name4 = getName();
                vhh.a(name4, "something went wrong, abnormal odex file size: " + c + ", trigger retry strategy");
                i94Var.g(new k6h()).f();
                return;
            }
        } else {
            this.f23190a.d(a2);
            if (a2 != -1) {
                vhh.a(getName(), "compile failed, trigger try strategy");
                i94Var.g(new k6h()).f();
                return;
            }
        }
        i94Var.g(new gj9(this)).f();
    }
}
