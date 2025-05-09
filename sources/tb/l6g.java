package tb;

import android.graphics.Color;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class l6g extends i02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static final int l = o1p.a(16.0f);
    public static final float m = o1p.a(7.5f);
    public static final int n = o1p.a(4.0f);
    public static final float o = o1p.a(8.0f);
    public static final float p = o1p.a(5.0f);
    public static final float q = o1p.a(8.0f);
    public static final float r = o1p.a(5.0f);
    public static final int s = o1p.a(11.0f);
    public static final int t = o1p.a(8.0f);
    public static final int u = Color.parseColor("#4d000000");
    public static final int v = o1p.a(1.0f);
    public static final int w = o1p.a(4.0f);
    public static final float x = o1p.a(10.0f);
    public final boolean k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792389);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792388);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6g(View view, boolean z, boolean z2) {
        super(view, z);
        ckf.g(view, "view");
        this.k = z2;
    }

    public static /* synthetic */ Object ipc$super(l6g l6gVar, String str, Object... objArr) {
        if (str.hashCode() == 182178876) {
            super.a((ykg) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/image/LBSIcon");
    }

    @Override // tb.i02, tb.zkg
    public void a(ykg ykgVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbd43c", new Object[]{this, ykgVar, new Boolean(z)});
            return;
        }
        if (ykgVar != null) {
            ykgVar.k("https://gw.alicdn.com/mt/TB1OEU_7hD1gK0jSZFsXXbldVXa-30-38.png");
        }
        super.a(ykgVar, z);
    }

    @Override // tb.i02
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cdc4557", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.i02
    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cbe599", new Object[]{this})).intValue();
        }
        return u;
    }

    @Override // tb.i02
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return l;
    }

    @Override // tb.i02
    public int h(ykg ykgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512e84f8", new Object[]{this, ykgVar})).intValue();
        }
        ckf.g(ykgVar, "info");
        return s;
    }

    @Override // tb.i02
    public int i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45a0c79e", new Object[]{this})).intValue();
        }
        return n;
    }

    @Override // tb.i02
    public int j(ykg ykgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("256b1659", new Object[]{this, ykgVar})).intValue();
        }
        ckf.g(ykgVar, "info");
        return t;
    }

    @Override // tb.i02
    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c2", new Object[]{this})).floatValue();
        }
        if (r()) {
            return o;
        }
        return p;
    }

    @Override // tb.i02
    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee54208", new Object[]{this})).floatValue();
        }
        if (r()) {
            return q;
        }
        return r;
    }

    @Override // tb.i02
    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
        }
        if (this.k) {
            return c0h.Companion.a();
        }
        return m;
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
        return v;
    }

    @Override // tb.i02
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2abaa665", new Object[]{this})).intValue();
        }
        return w;
    }

    @Override // tb.i02
    public float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue();
        }
        return x;
    }
}
