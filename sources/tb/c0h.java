package tb;

import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class c0h extends i02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final float l = o1p.a(6.0f);
    public static final float m = o1p.a(6.0f);
    public static final float n = o1p.a(10.0f);
    public static final int o = o1p.a(16.0f);
    public static final float p = o1p.a(8.0f);
    public static final float q = o1p.a(4.0f);
    public static final int r = Color.parseColor("#80000000");
    public static final int s = o1p.a(3.0f);
    public static final int t = o1p.a(6.0f);
    public final boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792395);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final float a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5ae2068d", new Object[]{this})).floatValue();
            }
            return c0h.u();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792394);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0h(View view, boolean z, boolean z2) {
        super(view, z);
        ckf.g(view, "view");
        this.k = z2;
    }

    public static /* synthetic */ Object ipc$super(c0h c0hVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/image/LiveIcon");
    }

    public static final /* synthetic */ float u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ef82cf2", new Object[0])).floatValue();
        }
        return q;
    }

    @Override // tb.i02
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cdc4557", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.i02
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return r;
    }

    @Override // tb.i02
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return o;
    }

    @Override // tb.i02
    public int h(ykg ykgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512e84f8", new Object[]{this, ykgVar})).intValue();
        }
        ckf.g(ykgVar, "info");
        return o;
    }

    @Override // tb.i02
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45a0c79e", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.i02
    public int j(ykg ykgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("256b1659", new Object[]{this, ykgVar})).intValue();
        }
        ckf.g(ykgVar, "info");
        return (int) ((ykgVar.j() / ykgVar.a()) * o);
    }

    @Override // tb.i02
    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c2", new Object[]{this})).floatValue();
        }
        return l;
    }

    @Override // tb.i02
    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee54208", new Object[]{this})).floatValue();
        }
        return m;
    }

    @Override // tb.i02
    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
        }
        if (this.k) {
            return q;
        }
        return p;
    }

    @Override // tb.i02
    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue();
        }
        return -1;
    }

    @Override // tb.i02
    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("627e8552", new Object[]{this})).intValue();
        }
        return s;
    }

    @Override // tb.i02
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2abaa665", new Object[]{this})).intValue();
        }
        return t;
    }

    @Override // tb.i02
    public float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue();
        }
        return n;
    }
}
