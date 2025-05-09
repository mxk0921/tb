package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class pwi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26359a;
    public String b;
    public boolean c;
    public long d = -1;

    static {
        t2o.a(573571077);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4be7588a", new Object[]{this});
        }
        return this.b;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f3c168d0", new Object[]{this})).longValue();
        }
        try {
            if (this.d == -1) {
                return -1L;
            }
            long currentTimeMillis = System.currentTimeMillis() - this.d;
            if (currentTimeMillis < 0) {
                return -1L;
            }
            return currentTimeMillis;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c61b4cd2", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8edda7bf", new Object[]{this})).booleanValue();
        }
        return this.f26359a;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e0ba47", new Object[]{this});
        } else {
            this.d = -1L;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41cfda2c", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd2fb18e", new Object[]{this, new Boolean(z)});
        } else {
            this.c = z;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890d89b1", new Object[]{this, new Boolean(z)});
        } else {
            this.f26359a = z;
        }
    }

    public void i(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0c94730", new Object[]{this, new Long(j)});
        } else {
            this.d = j;
        }
    }
}
