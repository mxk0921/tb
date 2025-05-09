package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.megadesign.FlowLayout.MegaFlowLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u28 extends nu<MegaFlowLayout, a> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXMEGAFLOWLAYOUT_MEGAFLOWLAYOUT = 6736851137374474016L;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends an6 {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final long DXFLOWLAYOUT_HORIZONTALSPACING = -6251594311741365728L;
        public static final long DXFLOWLAYOUT_VERTICALSPACING = -5056928570775932882L;

        /* renamed from: a  reason: collision with root package name */
        public int f29084a;
        public int b;

        public static /* synthetic */ int i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("f73e1d19", new Object[]{aVar})).intValue();
            }
            return aVar.f29084a;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 111792625) {
                super.d(((Number) objArr[0]).longValue(), ((Number) objArr[1]).intValue());
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DxNanoFlowLayout$DXNanoFlowLayoutProps");
        }

        public static /* synthetic */ int j(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("25ef8738", new Object[]{aVar})).intValue();
            }
            return aVar.b;
        }

        @Override // tb.an6, tb.fae
        public void d(long j, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a9d1f1", new Object[]{this, new Long(j), new Integer(i)});
                return;
            }
            super.d(j, i);
            if (j == DXFLOWLAYOUT_HORIZONTALSPACING) {
                this.f29084a = i;
            } else if (j == DXFLOWLAYOUT_VERTICALSPACING) {
                this.b = i;
            }
        }
    }

    public static /* synthetic */ Object ipc$super(u28 u28Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/DxNanoFlowLayout");
    }

    @Override // tb.nu
    public lrb c(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lrb) ipChange.ipc$dispatch("bf1820b2", new Object[]{this, tn6Var});
        }
        return null;
    }

    @Override // tb.nu
    public wij d(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wij) ipChange.ipc$dispatch("83bb1c71", new Object[]{this, tn6Var});
        }
        return null;
    }

    @Override // tb.nu
    public void h(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98922cf0", new Object[]{this, tn6Var});
        }
    }

    @Override // tb.nu
    public void i(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("255ebac0", new Object[]{this, tn6Var});
        }
    }

    /* renamed from: m */
    public a e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("b8903496", new Object[]{this});
        }
        return new a();
    }

    /* renamed from: n */
    public MegaFlowLayout f(tn6 tn6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MegaFlowLayout) ipChange.ipc$dispatch("a6e9ec8d", new Object[]{this, tn6Var});
        }
        return new MegaFlowLayout(tn6Var.a());
    }

    /* renamed from: o */
    public void l(tn6 tn6Var, MegaFlowLayout megaFlowLayout, a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e19db396", new Object[]{this, tn6Var, megaFlowLayout, aVar, aVar2});
        } else if (aVar2 != null && aVar2 != aVar && megaFlowLayout != null) {
            megaFlowLayout.setColumnSpacing(a.i(aVar2));
            megaFlowLayout.setRowSpacing(a.j(aVar2));
        }
    }
}
