package tb;

import android.view.View;
import com.alibaba.ability.env.PerfTracer;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.Map;
import tb.kdb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class xq implements kdb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final PerfTracer f31540a;
    public String b;
    public String c;
    public ldb d;
    public WeakReference<View> e;
    public Object f;
    public Map<String, Object> g;

    static {
        t2o.a(144703520);
        t2o.a(144703524);
    }

    public xq() {
        this.f31540a = new PerfTracer();
    }

    @Override // tb.kdb
    public ldb a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldb) ipChange.ipc$dispatch("5f41c2b", new Object[]{this});
        }
        return this.d;
    }

    @Override // tb.kdb
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("339a8c2f", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    @Override // tb.kdb
    public void c(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22cf0cc5", new Object[]{this, obj});
        } else {
            this.f = obj;
        }
    }

    @Override // tb.kdb
    public kdb d(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kdb) ipChange.ipc$dispatch("105d7693", new Object[]{this, str, obj});
        }
        ckf.g(str, "key");
        ckf.g(obj, "data");
        return kdb.a.e(this, str, obj);
    }

    @Override // tb.kdb
    public void e(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17aa3eb9", new Object[]{this, map});
        } else {
            this.g = map;
        }
    }

    @Override // tb.kdb
    public Map<String, Object> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1aa37a0d", new Object[]{this});
        }
        return this.g;
    }

    @Override // tb.kdb
    public void g(WeakReference<View> weakReference) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c547e323", new Object[]{this, weakReference});
        } else {
            this.e = weakReference;
        }
    }

    @Override // tb.kdb
    public String getPageId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("551c67f9", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.kdb
    public Object getUserContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("49e73c1d", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.kdb
    public WeakReference<View> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakReference) ipChange.ipc$dispatch("dcb85135", new Object[]{this});
        }
        return this.e;
    }

    @Override // tb.kdb
    public PerfTracer i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PerfTracer) ipChange.ipc$dispatch("ebe8adbd", new Object[]{this});
        }
        return this.f31540a;
    }

    @Override // tb.kdb
    public void j(ldb ldbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b238ce8b", new Object[]{this, ldbVar});
        } else {
            this.d = ldbVar;
        }
    }

    @Override // tb.kdb
    public View k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("90ed9ffc", new Object[]{this});
        }
        return kdb.a.b(this);
    }

    @Override // tb.kdb
    public ldb l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldb) ipChange.ipc$dispatch("4d6d23cd", new Object[]{this});
        }
        return kdb.a.a(this);
    }

    @Override // tb.kdb
    public <T> T m(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("dfd26ad6", new Object[]{this, str});
        }
        ckf.g(str, "key");
        return (T) kdb.a.c(this, str);
    }

    @Override // tb.kdb
    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("608f618f", new Object[]{this});
        }
        return this.c;
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee1a849d", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public kdb p(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kdb) ipChange.ipc$dispatch("f0c59953", new Object[]{this, view});
        }
        return kdb.a.d(this, view);
    }

    public xq(ldb ldbVar) {
        this();
        j(ldbVar);
    }
}
