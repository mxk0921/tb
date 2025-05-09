package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.s;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import kotlin.jvm.JvmStatic;
import tb.ub3;
import tb.z7v;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sa3 extends ku<s> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public s b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.sa3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public static final class C1050a extends z7v.c {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f27899a;

            public C1050a(boolean z, String str) {
                this.f27899a = z;
            }

            public static /* synthetic */ Object ipc$super(C1050a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartDXPreloader$Companion$getDXEngineConfig$builder$1");
            }

            @Override // tb.z7v.c
            public void a(DXTemplateItem dXTemplateItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b7fb238b", new Object[]{this, dXTemplateItem});
                } else if (this.f27899a && dXTemplateItem != null && dXTemplateItem.e() != null) {
                    ub3.e(ub3.a.a("hitPreDXDownloadV2" + dXTemplateItem.e()).branch(1).success(false).tag(dXTemplateItem.e()).message(dXTemplateItem.d()).dimension("d1", String.valueOf(ic3.c())).sampling(0.5f));
                }
            }

            @Override // tb.z7v.c
            public void b(Context context, s sVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("c0a5ce96", new Object[]{this, context, sVar});
                }
            }

            @Override // tb.z7v.c
            public void c(DXTemplateItem dXTemplateItem) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("b6d47e47", new Object[]{this, dXTemplateItem});
                } else if (this.f27899a && dXTemplateItem != null) {
                    ub3.e(ub3.a.a("hitPreDXDownloadV2" + dXTemplateItem.e()).branchEntry(true).sampling(0.01f).dimension("d1", String.valueOf(ic3.c())));
                }
            }
        }

        static {
            t2o.a(479199520);
        }

        public a() {
        }

        public static final /* synthetic */ DXEngineConfig.b a(a aVar, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXEngineConfig.b) ipChange.ipc$dispatch("b4cf670c", new Object[]{aVar, new Boolean(z)});
            }
            return aVar.b(z);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final DXEngineConfig.b b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DXEngineConfig.b) ipChange.ipc$dispatch("52b8b121", new Object[]{this, new Boolean(z)});
            }
            DXEngineConfig.b bVar = new DXEngineConfig.b(c9x.CART_BIZ_NAME);
            bVar.U(z);
            oa3 oa3Var = oa3.INSTANCE;
            if (oa3Var.b()) {
                hav.d("CartDXPreloader", "设置DXButter白名单," + oa3Var.c());
                bVar.K(oa3Var.c());
            }
            if (1 == yh.a().f32082a && vav.a(c9x.CART_BIZ_NAME, "enableDowngradeQualityOnLowLevelDevice", true)) {
                bVar.Z(DXEngineConfig.ImageQuality.q50);
            }
            return bVar;
        }

        @JvmStatic
        public final z7v c(Context context, boolean z) {
            boolean z2 = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (z7v) ipChange.ipc$dispatch("48c5ff34", new Object[]{this, context, new Boolean(z)});
            }
            ckf.g(context, "context");
            if (z && vav.a(c9x.CART_BIZ_NAME, "preDownloadDX", true)) {
                z2 = true;
            }
            z7v i = new z7v.b().p(32).q(c9x.CART_BIZ_NAME).m(true).k((s) uc3.b(sa3.class, true)).j((int) fxo.c(context)).n(new C1050a(z2, "hitPreDXDownloadV2")).l(b(z)).i();
            ckf.f(i, "builder.dxConfigBuilder(…er(isTaobaoCart)).build()");
            return i;
        }
    }

    static {
        t2o.a(479199519);
    }

    @JvmStatic
    public static final z7v g(Context context, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7v) ipChange.ipc$dispatch("48c5ff34", new Object[]{context, new Boolean(z)});
        }
        return Companion.c(context, z);
    }

    public static /* synthetic */ Object ipc$super(sa3 sa3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartDXPreloader");
    }

    @Override // tb.ku
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.b = null;
        }
    }

    @Override // tb.ku
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781f8ee3", new Object[]{this, context});
        } else if (this.b == null) {
            this.b = new s(a.a(Companion, true).Q(2).X(32).Y(c9x.CART_BIZ_NAME).g0(true).F());
            hav.d(c9x.CART_BIZ_NAME, "CartDXPreloader预加载成功");
        }
    }

    /* renamed from: f */
    public s b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("ec058be1", new Object[]{this, new Boolean(z)});
        }
        s sVar = this.b;
        if (z) {
            this.b = null;
        }
        return sVar;
    }
}
