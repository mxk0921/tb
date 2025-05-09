package tb;

import android.content.Context;
import com.alibaba.android.bindingx.core.a;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jb2 extends j30 implements a.g {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;

    public jb2(Context context, a aVar, Object... objArr) {
        super(context, aVar, objArr);
    }

    public static /* synthetic */ Object ipc$super(jb2 jb2Var, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1101783380) {
            jb2Var.B(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue(), ((Number) objArr[5]).intValue());
            return null;
        } else if (hashCode == 662235432) {
            return new Boolean(super.b((String) objArr[0], (String) objArr[1]));
        } else {
            if (hashCode == 2097714154) {
                jb2Var.A((String) objArr[0], ((Number) objArr[1]).doubleValue(), ((Number) objArr[2]).doubleValue(), ((Number) objArr[3]).doubleValue(), ((Number) objArr[4]).doubleValue(), ((Number) objArr[5]).doubleValue(), ((Number) objArr[6]).doubleValue(), (Object[]) objArr[7]);
                return null;
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/bindingx/plugin/android/BindingXScrollHandler");
        }
    }

    @Override // tb.j30, tb.i3c
    public boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2778e928", new Object[]{this, str, str2})).booleanValue();
        }
        a.d f = this.h.f();
        if (f == null) {
            return false;
        }
        f.a(str, this);
        return super.b(str, str2);
    }

    @Override // tb.i3c
    public void e(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("888b9cde", new Object[]{this, str, str2});
        }
    }

    @Override // tb.i3c
    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("19de22da", new Object[]{this, str, str2})).booleanValue();
        }
        a.d f = this.h.f();
        if (f == null) {
            return false;
        }
        f.b(str, this);
        return true;
    }

    public final boolean n(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6b2309a", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        if (i == i2) {
            return true;
        }
        if (i > 0 && i2 > 0) {
            return true;
        }
        if (i >= 0 || i2 >= 0) {
            return false;
        }
        return true;
    }

    @Override // tb.i3c
    public void onActivityPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e6b90f", new Object[]{this});
        }
    }

    @Override // tb.i3c
    public void onActivityResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4fa6e2", new Object[]{this});
        }
    }

    @Override // com.alibaba.android.bindingx.core.a.g
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58927bd", new Object[]{this});
        } else {
            A("scrollStart", vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.a.g
    public void i(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61098f36", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            A("scrollEnd", f, f2, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, vu3.b.GEO_NOT_SUPPORT, new Object[0]);
        }
    }

    @Override // com.alibaba.android.bindingx.core.a.g
    public void l(float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d3c1b2", new Object[]{this, new Float(f), new Float(f2)});
            return;
        }
        int i5 = (int) (f - this.n);
        int i6 = (int) (f2 - this.o);
        this.n = (int) f;
        this.o = (int) f2;
        if (i5 != 0 || i6 != 0) {
            if (!n(i6, this.t)) {
                this.r = this.o;
                z = true;
            } else {
                z = false;
            }
            if (!n(i5, this.s)) {
                this.q = this.n;
            }
            int i7 = this.n;
            int i8 = i7 - this.q;
            int i9 = this.o;
            int i10 = i9 - this.r;
            this.s = i5;
            this.t = i6;
            if (z) {
                i4 = i6;
                i3 = i5;
                i2 = i10;
                i = i8;
                A("turn", i7, i9, i5, i6, i8, i10, new Object[0]);
            } else {
                i2 = i10;
                i4 = i6;
                i = i8;
                i3 = i5;
            }
            B(this.n, this.o, i3, i4, i, i2);
        }
    }
}
