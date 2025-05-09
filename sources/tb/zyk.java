package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class zyk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f33108a;
    public String b;
    public int c;
    public String d;
    public int e;
    public List<String> f;
    public long g;
    public double h;
    public Map<String, ? extends Object> i;
    public Map<String, Object> j;
    public int k;

    static {
        t2o.a(1004536605);
    }

    public final Map<String, Object> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f0104710", new Object[]{this});
        }
        return this.j;
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26589b54", new Object[]{this, str});
        } else {
            ckf.g(str, "<set-?>");
        }
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca4201f1", new Object[]{this, str});
        } else {
            ckf.g(str, "<set-?>");
        }
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38e509c1", new Object[]{this, new Integer(i)});
        } else {
            this.k = i;
        }
    }

    public final void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3779b33e", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76cdea0c", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public final void g(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("feae8490", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public final void h(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcdcba8", new Object[]{this, new Long(j)});
        } else {
            this.g = j;
        }
    }

    public final void i(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfd407e", new Object[]{this, map});
        } else {
            this.j = map;
        }
    }

    public final void j(double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33af941c", new Object[]{this, new Double(d)});
        } else {
            this.h = d;
        }
    }

    public final void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648aa560", new Object[]{this, str});
        } else {
            this.f33108a = str;
        }
    }

    public final void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c4df120", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public final void m(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4965486c", new Object[]{this, list});
        } else {
            this.f = list;
        }
    }

    public final void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e70e8be", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
        if (r1 == null) goto L_0x00c2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fc, code lost:
        if (r2 == null) goto L_0x00fe;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Object> o() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.zyk.o():java.util.Map");
    }
}
