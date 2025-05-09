package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nanocompose.foundation.layout.RowColumn.Arrangement;
import tb.can;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class dmz extends fzy {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int VIEW_PROPS_ARRANGEMENT_SPACING_HASH_ID = 2041468142;
    public static final int VIEW_PROPS_HORIZONTAL_ARRANGEMENT_HASH_ID = -1069894765;
    public static final int VIEW_PROPS_VERTICAL_ALIGNMENT_HASH_ID = -1250442385;
    public byte f = m8z.a((byte) 0);
    public byte g = dtz.a((byte) 0);
    public float h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(598737100);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(598737099);
    }

    public static /* synthetic */ Object ipc$super(dmz dmzVar, String str, Object... objArr) {
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
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/nanocompose/foundation/layout/RowColumn/RowProps");
        }
    }

    public final float A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("47b2c0c6", new Object[]{this})).floatValue();
        }
        return this.h;
    }

    public final Arrangement.d B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Arrangement.d) ipChange.ipc$dispatch("745b0b43", new Object[]{this});
        }
        return m8z.b(this.f, this.h);
    }

    public final can.c C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (can.c) ipChange.ipc$dispatch("34934d51", new Object[]{this});
        }
        return dtz.b(this.g);
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
        dmz dmzVar = (dmz) super.b();
        dmzVar.D(A());
        dmzVar.f = this.f;
        dmzVar.g = this.g;
        return dmzVar;
    }

    @Override // tb.fzy, tb.jkz
    public void h(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848f9d30", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == -1250442385) {
            this.g = dtz.Companion.a(i2);
        } else if (i == -1069894765) {
            this.f = m8z.Companion.a(i2);
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
        return new dmz();
    }

    @Override // tb.fzy
    public boolean u(fzy fzyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d517d57", new Object[]{this, fzyVar})).booleanValue();
        }
        ckf.g(fzyVar, "other");
        if ((fzyVar instanceof dmz) && super.u(fzyVar)) {
            dmz dmzVar = (dmz) fzyVar;
            if (dmzVar.h == this.h && m8z.c(dmzVar.f, this.f) && dtz.c(dmzVar.g, this.g)) {
                return true;
            }
        }
        return false;
    }
}
