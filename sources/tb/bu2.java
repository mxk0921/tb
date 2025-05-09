package tb;

import android.content.res.Resources;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class bu2 implements vwn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16633a;
    public final String b;
    public final int c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final Set<Integer> h = new HashSet(2);

    static {
        t2o.a(620757052);
        t2o.a(620757063);
    }

    public bu2(String str, String str2, int i, int i2) {
        this.f16633a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6d3506e5", new Object[]{this});
        }
        return this.f16633a;
    }

    public abstract int c();

    public abstract dtl d(String str, String str2, int i, int i2, boolean z, Resources resources);

    public dtl e(boolean z, Resources resources) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dtl) ipChange.ipc$dispatch("9c869a97", new Object[]{this, new Boolean(z), resources});
        }
        dtl d = d(this.f16633a, this.b, this.c, this.d, z, resources);
        a(d);
        return d;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a7723ec", new Object[]{this});
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9467888", new Object[]{this});
        }
    }

    public synchronized void h(uwn uwnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e79cedcc", new Object[]{this, uwnVar});
        } else if (uwnVar != null) {
            this.g = true;
            uwnVar.n(null);
            ((HashSet) this.h).remove(Integer.valueOf(uwnVar.hashCode()));
            fiv.a(sie.TAG_RECYCLE, "image reference downgraded to passable, isDirty=%b, refer=%d, image=%s, drawable=%s", Boolean.valueOf(this.g), Integer.valueOf(((HashSet) this.h).size()), this, uwnVar);
        }
    }

    public synchronized void i(uwn uwnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffc5c417", new Object[]{this, uwnVar});
        } else if (uwnVar != null) {
            ((HashSet) this.h).remove(Integer.valueOf(uwnVar.hashCode()));
            fiv.a(sie.TAG_RECYCLE, "image reference released, isDirty=%b, refer=%d, image=%s, drawable=%s", Boolean.valueOf(this.g), Integer.valueOf(((HashSet) this.h).size()), this, uwnVar);
            j();
        }
    }

    public final void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97e42ca8", new Object[]{this});
        } else if (!this.f && !this.g && this.e && ((HashSet) this.h).size() == 0) {
            f();
            this.f = true;
        }
    }

    public synchronized void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f62d85b", new Object[]{this});
        } else {
            this.g = true;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return getClass().getSimpleName() + f7l.BRACKET_START_STR + Integer.toHexString(hashCode()) + ", key@" + this.f16633a + f7l.BRACKET_END_STR;
    }

    public final synchronized void a(dtl dtlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbba843", new Object[]{this, dtlVar});
        } else if (dtlVar != null) {
            if (this.f) {
                this.f = false;
                g();
            }
            if (!this.g) {
                if (dtlVar instanceof uwn) {
                    Set<Integer> set = this.h;
                    Integer valueOf = Integer.valueOf(dtlVar.hashCode());
                    if (((HashSet) set).contains(valueOf)) {
                        this.g = true;
                        fiv.k(sie.TAG_RECYCLE, "references dirty now(last releasable drawable same with the hash is lost), refer=%d, image=%s, drawable=%s", Integer.valueOf(((HashSet) this.h).size()), this, dtlVar);
                    } else {
                        ((HashSet) this.h).add(valueOf);
                        ((uwn) dtlVar).n(this);
                    }
                } else {
                    this.g = true;
                }
            }
        }
    }

    public synchronized void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2f8341c", new Object[]{this, new Boolean(z)});
            return;
        }
        if (this.f && !z) {
            this.f = false;
            g();
        }
        this.e = z;
        fiv.a(sie.TAG_RECYCLE, "release from cache, result=%b, isDirty=%b, refer=%d, image=%s", Boolean.valueOf(z), Boolean.valueOf(this.g), Integer.valueOf(((HashSet) this.h).size()), this);
        j();
    }
}
