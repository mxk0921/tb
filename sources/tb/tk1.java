package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tk1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MAX_CALL_ALGO_TIME = 1000;
    public String b;
    public long c = 0;
    public int d = 0;
    public boolean e = false;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28760a = false;

    static {
        t2o.a(481297085);
    }

    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bf95139", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5dc5322b", new Object[]{this})).longValue();
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4ea3fdc6", new Object[]{this});
        }
        return this.b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0d56ae4", new Object[]{this});
            return;
        }
        int i = this.d;
        if (i <= 10000) {
            this.d = i + 1;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f28760a;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c4b0a23", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edb7f1e1", new Object[]{this, new Long(j)});
        } else {
            this.c = j;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2585a870", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d88968c", new Object[]{this, new Boolean(z)});
        } else {
            this.f28760a = z;
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4067c25d", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }
}
