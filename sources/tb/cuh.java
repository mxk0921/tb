package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class cuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f17328a;
    public String b;
    public fvh c;
    public quh d;
    public String e;

    public static cuh g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cuh) ipChange.ipc$dispatch("97c8c135", new Object[0]);
        }
        return new cuh();
    }

    public fvh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("34d878f0", new Object[]{this});
        }
        return this.c;
    }

    public fvh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("cb49e50b", new Object[]{this});
        }
        if (this.c == null) {
            this.c = gvh.a();
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd90ef3a", new Object[]{this});
        }
        return this.e;
    }

    public quh d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (quh) ipChange.ipc$dispatch("29778915", new Object[]{this});
        }
        return this.d;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }

    public long f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3737eedb", new Object[]{this})).longValue();
        }
        return this.f17328a;
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9080e4", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void i(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67ad92bd", new Object[]{this, quhVar});
        } else {
            this.d = quhVar;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77bcccc9", new Object[]{this, new Long(j)});
        } else {
            this.f17328a = j;
        }
    }

    public fvh l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fvh) ipChange.ipc$dispatch("5d5aee90", new Object[]{this});
        }
        fvh a2 = gvh.a();
        a2.m("timestamp", Long.valueOf(this.f17328a));
        fvh fvhVar = this.c;
        if (fvhVar != null) {
            a2.m("attrs", fvhVar.p());
        }
        return a2;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "{name:" + this.b + ",timestamp:" + this.f17328a + "}";
    }
}
