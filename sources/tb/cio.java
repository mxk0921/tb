package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class cio {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int EXPIRE_TYPE_INFINITE = 3;
    public static final int EXPIRE_TYPE_INSTANT = 1;
    public static final int EXPIRE_TYPE_TIME = 2;
    public static final int EXPIRE_TYPE_UNKNOWN = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f17086a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public String i;
    public final ze4 j;
    public final List<x80> k;
    public boolean f = false;
    public long h = 0;
    public int g = 3;

    static {
        t2o.a(615514193);
    }

    public cio(String str, long j, String str2, String str3, ze4 ze4Var, List<x80> list, int i) {
        this.f17086a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.j = ze4Var;
        this.k = list;
        this.e = i;
    }

    public abstract boolean a(tx8 tx8Var);

    public abstract void b(tx8 tx8Var) throws Exception;

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("42bddf1", new Object[]{this});
        }
        return this.i;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6b3585e9", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("81e05888", new Object[]{this});
        }
        return this.f17086a;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("304dabda", new Object[]{this});
        }
        return this.d;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb44f6", new Object[]{this});
        }
        return this.c;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea86dc9d", new Object[]{this})).longValue();
        }
        return this.b;
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4f97d6f4", new Object[]{this})).booleanValue();
        }
        if (this.g != 2 || System.currentTimeMillis() <= this.h) {
            return false;
        }
        return true;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b6173b7a", new Object[]{this})).booleanValue();
        }
        return this.f;
    }

    public void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
        } else {
            this.i = str;
        }
    }

    public void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158cc94f", new Object[]{this, new Long(j)});
        } else {
            this.h = j;
        }
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32524541", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aebd2556", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return String.format("%s_%s_%d", this.c, this.f17086a, Long.valueOf(this.b));
    }
}
