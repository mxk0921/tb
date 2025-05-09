package tb;

import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class eka {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseIntArray f18639a = new SparseIntArray();
    public boolean b = false;
    public int c = 0;

    static {
        t2o.a(156237996);
    }

    public int a(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b8cd6d7", new Object[]{this, new Integer(i)})).intValue();
        }
        int size = this.f18639a.size() - 1;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            if (this.f18639a.keyAt(i3) < i) {
                i2 = i3 + 1;
            } else {
                size = i3 - 1;
            }
        }
        int i4 = i2 - 1;
        if (i4 < 0 || i4 >= this.f18639a.size()) {
            return -1;
        }
        return this.f18639a.keyAt(i4);
    }

    public int b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("148a618a", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        if (!this.b) {
            return c(i, i2);
        }
        int i3 = this.f18639a.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int c = c(i, i2);
        this.f18639a.put(i, c);
        return c;
    }

    public int c(int i, int i2) {
        int i3;
        int a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("310d928c", new Object[]{this, new Integer(i), new Integer(i2)})).intValue();
        }
        int d = d(i);
        if (d == i2) {
            return 0;
        }
        int i4 = this.c;
        if (!this.b || this.f18639a.size() <= 0 || (a2 = a(i)) < 0) {
            i3 = 0;
        } else {
            int i5 = a2 + 1;
            i3 = this.f18639a.get(a2) + d(a2);
            i4 = i5;
        }
        while (i4 < i) {
            int d2 = d(i4);
            i3 += d2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = d2;
            }
            i4++;
        }
        if (d + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public abstract int d(int i);

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18ecd4dc", new Object[]{this});
        } else {
            this.f18639a.clear();
        }
    }

    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cee4ec68", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5d93693", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }
}
