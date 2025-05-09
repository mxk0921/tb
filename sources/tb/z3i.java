package tb;

import com.alibaba.android.ultron.ext.vlayout.a;
import com.alibaba.android.ultron.ext.vlayout.b;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class z3i extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;

    static {
        t2o.a(156237999);
    }

    public static /* synthetic */ Object ipc$super(z3i z3iVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/layout/MarginLayoutHelper");
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d068cae2", new Object[]{this})).intValue();
        }
        return this.f + this.g;
    }

    public int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ab22ff91", new Object[]{this})).intValue();
        }
        return this.b + this.c;
    }

    public int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f2a18e9", new Object[]{this})).intValue();
        }
        return this.i;
    }

    public int E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c5", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public int F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee5420b", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("86af8f60", new Object[]{this})).intValue();
        }
        return this.e;
    }

    public int H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1c5536f4", new Object[]{this})).intValue();
        }
        return this.d;
    }

    public int I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33abcd34", new Object[]{this})).intValue();
        }
        return this.h + this.i;
    }

    public int J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b040477f", new Object[]{this})).intValue();
        }
        return this.d + this.e;
    }

    public void K(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed713e77", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.f = i;
        this.h = i2;
        this.g = i3;
        this.i = i4;
    }

    public void L(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41af8541", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void M(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274d54e5", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31f74b90", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public void O(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45b9dbf7", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void P(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce01816", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.b = i;
        this.c = i3;
        this.d = i2;
        this.e = i4;
    }

    @Override // com.alibaba.android.ultron.ext.vlayout.a
    public int j(int i, boolean z, boolean z2, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51cd0ec3", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2), bVar})).intValue();
        }
        return 0;
    }
}
