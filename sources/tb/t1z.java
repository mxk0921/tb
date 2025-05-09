package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement;
import tb.can;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t1z extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int VIEW_PROPS_ARRANGEMENT_SPACING_HASH_ID = 2041468142;
    public static final int VIEW_PROPS_HORIZONTAL_ALIGNMENT_HASH_ID = -443473190;
    public static final int VIEW_PROPS_VERTICAL_ARRANGEMENT_HASH_ID = -399481817;
    public byte f = l8z.a((byte) 0);
    public byte g = etz.a((byte) 0);
    public float h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737081);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737080);
    }

    public static /* synthetic */ Object ipc$super(t1z t1zVar, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -2070965779:
                super.k(((Number) objArr[0]).intValue(), ((Number) objArr[1]).floatValue());
                return null;
            case -2070962896:
                super.h(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
                return null;
            case -213708779:
                return super.b();
            case 1028750679:
                return new Boolean(super.u((fzy) objArr[0]));
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/ColumnProps");
        }
    }

    public final float A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47b2c0c6", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final can.b B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (can.b) ipChange.ipc$dispatch("e597af70", new Object[]{this});
        }
        return l8z.b(this.f);
    }

    public final Arrangement.l C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Arrangement.l) ipChange.ipc$dispatch("129e719a", new Object[]{this});
        }
        return etz.b(this.g, this.h);
    }

    public final void D(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4d5a71e", new Object[]{this, new Float(f)});
        } else {
            this.h = f;
        }
    }

    @Override // tb.fzy, tb.jkz
    public jkz b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jkz) ipChange.ipc$dispatch("f3431015", new Object[]{this});
        }
        t1z t1zVar = (t1z) super.b();
        t1zVar.D(A());
        t1zVar.f = this.f;
        t1zVar.g = this.g;
        return t1zVar;
    }

    @Override // tb.fzy, tb.jkz
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f9d30", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == -443473190) {
            this.f = l8z.Companion.a(i2);
        } else if (i == -399481817) {
            this.g = etz.Companion.a(i2);
        } else if (i != 2041468142) {
            super.h(i, i2);
        } else {
            this.h = i2;
        }
    }

    @Override // tb.fzy, tb.jkz
    public void k(int i, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f91ed", new Object[]{this, new Integer(i), new Float(f)});
        } else if (i == 2041468142) {
            this.h = f;
        } else {
            super.k(i, f);
        }
    }

    @Override // tb.fzy
    public fzy o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fzy) ipChange.ipc$dispatch("3d4b8f22", new Object[]{this});
        }
        return new t1z();
    }

    @Override // tb.fzy
    public boolean u(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d517d57", new Object[]{this, fzyVar})).booleanValue();
        }
        ckf.g(fzyVar, "other");
        if ((fzyVar instanceof t1z) && super.u(fzyVar)) {
            t1z t1zVar = (t1z) fzyVar;
            if (t1zVar.h == this.h && l8z.c(t1zVar.f, this.f) && etz.c(t1zVar.g, this.g)) {
                return true;
            }
        }
        return false;
    }
}
