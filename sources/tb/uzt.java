package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class uzt {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG_STATIC_TNET_HOST_PORT = "utanalytics_static_tnet_host_port";
    public static uzt f;

    /* renamed from: a  reason: collision with root package name */
    public nzt f29705a;
    public mzt b;
    public int c = 0;
    public int d = -1;
    public boolean e = true;

    static {
        t2o.a(962592929);
    }

    public static synchronized uzt b() {
        synchronized (uzt.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (uzt) ipChange.ipc$dispatch("fa32d94c", new Object[0]);
            }
            if (f == null) {
                f = new uzt();
            }
            return f;
        }
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("60ed2b1c", new Object[]{this})).intValue();
        }
        mzt mztVar = this.b;
        if (mztVar != null) {
            return mztVar.a();
        }
        return 0;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8fa080c5", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d3090142", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public e1e e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e1e) ipChange.ipc$dispatch("59b59a53", new Object[]{this});
        }
        if (rqo.e().h()) {
            if (this.b == null) {
                this.b = new mzt();
            }
            this.c = 2;
            return this.b;
        } else if (rqo.e().i()) {
            if (this.f29705a == null) {
                this.f29705a = new nzt();
            }
            this.c = 1;
            return this.f29705a;
        } else {
            this.c = 0;
            return null;
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else {
            rqo.e().g();
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("183c4dc8", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f74672e5", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }
}
