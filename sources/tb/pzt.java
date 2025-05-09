package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.x2r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pzt implements x2r.a, e1e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_TNET_HOST_PORT = "utanalytics_tnet_host_port";
    public static pzt f;

    /* renamed from: a  reason: collision with root package name */
    public final ozt f26416a;
    public final boolean b;
    public int c = 0;
    public int d = 10;
    public boolean e = false;

    static {
        t2o.a(962592947);
        t2o.a(962592825);
        t2o.a(962592943);
    }

    public pzt() {
        this.b = false;
        try {
            ozt oztVar = new ozt();
            this.f26416a = oztVar;
            oztVar.e("adashx.m.taobao.com");
            String i = u51.i(o2w.k().g(), TAG_TNET_HOST_PORT);
            if (!TextUtils.isEmpty(i)) {
                this.b = true;
            }
            i(i);
            String a2 = iaq.a(o2w.k().g(), TAG_TNET_HOST_PORT);
            if (!TextUtils.isEmpty(a2)) {
                this.b = true;
            }
            i(a2);
            i(x2r.f().e(TAG_TNET_HOST_PORT));
            x2r.f().i(TAG_TNET_HOST_PORT, this);
        } catch (Throwable unused) {
        }
    }

    public static synchronized pzt d() {
        synchronized (pzt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pzt) ipChange.ipc$dispatch("9c76facb", new Object[0]);
            }
            if (f == null) {
                f = new pzt();
            }
            return f;
        }
    }

    @Override // tb.x2r.a
    public void a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4813d18a", new Object[]{this, str, str2});
        } else {
            i(str2);
        }
    }

    @Override // tb.e1e
    public ozt b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ozt) ipChange.ipc$dispatch("f80b62d6", new Object[]{this});
        }
        return this.f26416a;
    }

    @Override // tb.e1e
    public void c(qe2 qe2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff5b6f3", new Object[]{this, qe2Var});
        } else if (qe2Var != null) {
            e();
            if (qe2Var.a()) {
                this.c = 0;
                return;
            }
            int i = this.c + 1;
            this.c = i;
            if (i > this.d) {
                o2w.k().U(true);
            }
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cf15f9d", new Object[]{this});
            return;
        }
        g();
        f();
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8286b9a", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public final void i(String str) {
        String trim;
        int indexOf;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (indexOf = (trim = str.trim()).indexOf(":")) != -1) {
            String substring = trim.substring(0, indexOf);
            int parseInt = Integer.parseInt(trim.substring(indexOf + 1, trim.length()));
            if (!TextUtils.isEmpty(substring) && parseInt > 0) {
                this.f26416a.e(substring);
                this.f26416a.f(parseInt);
            }
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78087185", new Object[]{this});
            return;
        }
        int g = x2r.f().g("tnet_downgrade");
        if (g >= 1 && g <= 10) {
            this.d = g;
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2258d63", new Object[]{this});
        } else if (!this.e) {
            String i = u51.i(o2w.k().g(), "utanalytics_tnet_downgrade");
            if (!TextUtils.isEmpty(i)) {
                try {
                    int intValue = Integer.valueOf(i).intValue();
                    if (intValue >= 1 && intValue <= 10) {
                        this.d = intValue;
                    }
                } catch (Throwable unused) {
                }
            }
            this.e = true;
        }
    }
}
