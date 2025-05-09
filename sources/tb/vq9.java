package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import tb.d0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vq9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final uq9 f30176a;
    public final FluidContext b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends d0c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -463345464:
                    super.h(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                    return null;
                case 1387239154:
                    super.g(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                    return null;
                case 1597345284:
                    return new Boolean(super.e(((Boolean) objArr[0]).booleanValue()));
                case 2139361695:
                    super.f(((Number) objArr[0]).floatValue(), ((Number) objArr[1]).floatValue());
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/base/manager/message/FluidCardMessageManager$1");
            }
        }

        @Override // tb.d0c.a, tb.d0c
        public boolean e(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
            }
            wq9.b(vq9.a(vq9.this), vq9.b(vq9.this));
            return super.e(z);
        }

        @Override // tb.d0c.a, tb.d0c
        public void f(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            super.f(f, f2);
            wq9.a(vq9.a(vq9.this), vq9.b(vq9.this), f, f2);
        }

        @Override // tb.d0c.a, tb.d0c
        public void g(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52af96f2", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            super.g(f, f2);
            wq9.c(vq9.a(vq9.this), vq9.b(vq9.this), f, f2);
        }

        @Override // tb.d0c.a, tb.d0c
        public void h(float f, float f2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
                return;
            }
            super.h(f, f2);
            if ((vq9.b(vq9.this) instanceof ici) && ((ici) vq9.b(vq9.this)).I0() != null) {
                ir9.b("FluidCardMessageManager", "ShortVideoCard.onCardClick " + vq9.b(vq9.this).M() + ",contentId=" + vq9.b(vq9.this).P());
                ((ici) vq9.b(vq9.this)).I0().a0(f, f2);
            }
        }
    }

    static {
        t2o.a(468713946);
    }

    public vq9(uq9 uq9Var) {
        this.f30176a = uq9Var;
        this.b = uq9Var.U();
        c();
    }

    public static /* synthetic */ FluidContext a(vq9 vq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("1a5c589c", new Object[]{vq9Var});
        }
        return vq9Var.b;
    }

    public static /* synthetic */ uq9 b(vq9 vq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (uq9) ipChange.ipc$dispatch("4414211a", new Object[]{vq9Var});
        }
        return vq9Var.f30176a;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("190410ad", new Object[]{this});
        } else {
            this.f30176a.O().a(new a());
        }
    }
}
