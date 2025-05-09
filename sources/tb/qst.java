package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qst extends i02 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int k;
    public int l;
    public float m;
    public float n;

    static {
        t2o.a(815792404);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qst(View view, boolean z) {
        super(view, z);
        ckf.g(view, "view");
    }

    public static /* synthetic */ Object ipc$super(qst qstVar, String str, Object... objArr) {
        if (str.hashCode() == 182178876) {
            super.a((ykg) objArr[0], ((Boolean) objArr[1]).booleanValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/m3/image/ThreeDIcon");
    }

    @Override // tb.i02, tb.zkg
    public void a(ykg ykgVar, boolean z) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adbd43c", new Object[]{this, ykgVar, new Boolean(z)});
            return;
        }
        this.k = 0;
        this.l = 0;
        if (ykgVar != null) {
            this.k = o1p.b(ykgVar.j());
            this.l = o1p.b(ykgVar.a());
            if (r()) {
                i = ykgVar.h();
            } else {
                i = ykgVar.c();
            }
            this.m = o1p.b(i);
            if (r()) {
                i2 = ykgVar.i();
            } else {
                i2 = ykgVar.d();
            }
            this.n = o1p.b(i2);
        }
        super.a(ykgVar, z);
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
        return 0;
    }

    @Override // tb.i02
    public int g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.l;
    }

    @Override // tb.i02
    public int h(ykg ykgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("512e84f8", new Object[]{this, ykgVar})).intValue();
        }
        ckf.g(ykgVar, "info");
        return this.l;
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
        return this.k;
    }

    @Override // tb.i02
    public float k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2087f1c2", new Object[]{this})).floatValue();
        }
        return this.m;
    }

    @Override // tb.i02
    public float l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5ee54208", new Object[]{this})).floatValue();
        }
        return this.n;
    }

    @Override // tb.i02
    public float m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f9580fff", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    @Override // tb.i02
    public int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43c263fa", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.i02
    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("627e8552", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.i02
    public int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2abaa665", new Object[]{this})).intValue();
        }
        return 0;
    }

    @Override // tb.i02
    public float q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("835f3abb", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }
}
