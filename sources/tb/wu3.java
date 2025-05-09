package tb;

import android.content.Context;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wu3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final wu3 f = new wu3();

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f30923a = false;
    public volatile boolean b = false;
    public volatile String c = null;
    public boolean e = false;
    public final String d = String.valueOf(System.currentTimeMillis());

    static {
        t2o.a(962592803);
    }

    public wu3() {
        SystemClock.elapsedRealtime();
    }

    public static wu3 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wu3) ipChange.ipc$dispatch("4fc0ff4d", new Object[0]);
        }
        return f;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        return vyp.i().e();
    }

    public Context b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return vyp.i().g();
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("865d53af", new Object[]{this});
        }
        return this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86bed099", new Object[]{this});
        }
        return this.d;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bca2b02b", new Object[]{this})).booleanValue();
        }
        return this.f30923a;
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f8855f40", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f54bd0a7", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a914e503", new Object[]{this});
        } else {
            this.f30923a = true;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77945e11", new Object[]{this, str});
        } else {
            vyp.i().x(str);
        }
    }

    public void k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            vyp.i().A(context);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97380fdb", new Object[]{this});
        } else {
            this.e = true;
        }
    }

    public void m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d04510f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29f2a10f", new Object[]{this});
        } else {
            this.b = true;
        }
    }
}
