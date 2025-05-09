package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.g;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class nb6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static int e = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f24615a = false;
    public boolean b = false;
    public int c = -1;
    public cvb d;

    static {
        t2o.a(444596883);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5d7e359", new Object[0]);
        } else if (e == 0) {
            Context x = DinamicXEngine.x();
            mub p = g.p();
            if (p == null) {
                e = 1;
            } else if (p.b(x)) {
                e = 2;
            } else if (p.a(x)) {
                e = 3;
            } else {
                e = 1;
            }
        }
    }

    public static boolean b(nb6 nb6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f464c6a6", new Object[]{nb6Var})).booleanValue();
        }
        mub p = g.p();
        if (i() || nb6Var == null || p == null) {
            return false;
        }
        if (pb6.x()) {
            return nb6Var.g();
        }
        return nb6Var.f();
    }

    public static nb6 d(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nb6) ipChange.ipc$dispatch("7f14e3ee", new Object[]{dinamicXEngine});
        }
        if (dinamicXEngine == null || dinamicXEngine.d() == null) {
            return null;
        }
        return dinamicXEngine.d().p();
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d70aa8c", new Object[0])).booleanValue();
        }
        a();
        if (e == 2) {
            return true;
        }
        return false;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8d59cef", new Object[0])).booleanValue();
        }
        a();
        if (e == 1) {
            return true;
        }
        return false;
    }

    public static boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df4cdf32", new Object[0])).booleanValue();
        }
        mub p = g.p();
        if (i() || p == null) {
            return true;
        }
        if (!h()) {
            return false;
        }
        if (!zg5.D4()) {
            return pb6.x();
        }
        String lowerCase = p.d(DinamicXEngine.x()).toLowerCase(Locale.ROOT);
        la6.e("deviceScreenType=" + lowerCase);
        return "min,small".contains(lowerCase);
    }

    public static boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("28c61cbb", new Object[0])).booleanValue();
        }
        a();
        if (e == 3) {
            return true;
        }
        return false;
    }

    public cvb c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cvb) ipChange.ipc$dispatch("7ad143ec", new Object[]{this});
        }
        return this.d;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ca3e2fa", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b61f7839", new Object[]{this})).booleanValue();
        }
        return this.f24615a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ab1fad3", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void l(cvb cvbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1addd05e", new Object[]{this, cvbVar});
        } else {
            this.d = cvbVar;
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42da0079", new Object[]{this, new Boolean(z)});
        } else {
            this.f24615a = z;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1b40783", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void o(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd585e8", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
