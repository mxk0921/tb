package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.kmp.kernel.serviceinterface.KSUTCommitAction;
import com.taobao.kmp.kernel.serviceinterface.KSUTStatus;
import com.taobao.nanocompose.megability.ability.UTCommitAction;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import tb.zhc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class hyr extends u1<aic> implements aic {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            t2o.a(1002438782);
            int[] iArr = new int[KSUTCommitAction.values().length];
            try {
                iArr[KSUTCommitAction.click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KSUTCommitAction.componentExposure.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KSUTCommitAction.pageExposure.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KSUTCommitAction.custom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KSUTStatus.values().length];
            try {
                iArr2[KSUTStatus.UT_H5_IN_WebView.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        t2o.a(1002438781);
        t2o.a(1002438832);
    }

    public hyr(asb asbVar) {
        super(asbVar);
    }

    public static final xhv a0(c1g c1gVar, hyr hyrVar, g1a g1aVar, final g1a g1aVar2, k0v k0vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("bd8e10ce", new Object[]{c1gVar, hyrVar, g1aVar, g1aVar2, k0vVar});
        }
        ckf.g(k0vVar, "$this$commitEvent");
        k0vVar.q(c1gVar.f());
        k0vVar.j(c1gVar.a());
        k0vVar.k(c1gVar.b());
        k0vVar.l(c1gVar.c());
        k0vVar.m(c1gVar.d());
        k0vVar.n(c1gVar.e());
        k0vVar.r(c1gVar.g());
        k0vVar.p(new g1a() { // from class: tb.fyr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv b0;
                b0 = hyr.b0(g1a.this, (p2v) obj);
                return b0;
            }
        });
        k0vVar.o(hyrVar.N(g1aVar));
        return xhv.INSTANCE;
    }

    public static final xhv b0(final g1a g1aVar, final p2v p2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("1179fb4c", new Object[]{g1aVar, p2vVar});
        }
        ckf.g(p2vVar, Constants.SEND_TYPE_RES);
        cvs.Companion.e(new d1a() { // from class: tb.gyr
            @Override // tb.d1a
            public final Object invoke() {
                xhv c0;
                c0 = hyr.c0(g1a.this, p2vVar);
                return c0;
            }
        });
        return xhv.INSTANCE;
    }

    public static final xhv c0(g1a g1aVar, p2v p2vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e2cb9200", new Object[]{g1aVar, p2vVar});
        }
        if (g1aVar != null) {
            g1aVar.invoke(p2vVar.a());
        }
        return xhv.INSTANCE;
    }

    public static final xhv d0(String str, String str2, Map map, c1g c1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("98c39a18", new Object[]{str, str2, map, c1gVar});
        }
        ckf.g(c1gVar, "$this$commitEvent");
        c1gVar.m(str);
        c1gVar.h(str2);
        c1gVar.k(map);
        return xhv.INSTANCE;
    }

    public static final xhv e0(String str, String str2, String str3, String str4, Map map, Integer num, c1g c1gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("d05dc08e", new Object[]{str, str2, str3, str4, map, num, c1gVar});
        }
        ckf.g(c1gVar, "$this$commitEvent");
        c1gVar.m(str);
        c1gVar.h(str2);
        c1gVar.i(str3);
        c1gVar.j(str4);
        c1gVar.k(map);
        c1gVar.l(num);
        return xhv.INSTANCE;
    }

    public static /* synthetic */ Object ipc$super(hyr hyrVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/kernel/serviceimp/TBUTService");
    }

    @Override // tb.zrb
    public ewe B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ewe) ipChange.ipc$dispatch("cc717fdf", new Object[]{this});
        }
        return ewe.Companion.t();
    }

    @Override // tb.zhc
    public void K(final String str, final String str2, final String str3, final String str4, final Map<String, String> map, final Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("432c4c5d", new Object[]{this, str, str2, str3, str4, map, num});
            return;
        }
        ckf.g(str2, "arg1");
        zhc.a.a(this, KSUTCommitAction.custom, new g1a() { // from class: tb.cyr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv e0;
                String str5 = str4;
                Map map2 = map;
                e0 = hyr.e0(str, str2, str3, str5, map2, num, (c1g) obj);
                return e0;
            }
        }, null, null, 12, null);
    }

    public final UTCommitAction f0(KSUTCommitAction kSUTCommitAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTCommitAction) ipChange.ipc$dispatch("3306533d", new Object[]{this, kSUTCommitAction});
        }
        int i = a.$EnumSwitchMapping$0[kSUTCommitAction.ordinal()];
        if (i == 1) {
            return UTCommitAction.click;
        }
        if (i == 2) {
            return UTCommitAction.componentExposure;
        }
        if (i == 3) {
            return UTCommitAction.pageExposure;
        }
        if (i == 4) {
            return UTCommitAction.custom;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // tb.zhc
    public void track4Click(final String str, final String str2, final Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b70f26b", new Object[]{this, str, str2, map});
            return;
        }
        ckf.g(str2, "arg1");
        zhc.a.a(this, KSUTCommitAction.click, new g1a() { // from class: tb.dyr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv d0;
                d0 = hyr.d0(str, str2, map, (c1g) obj);
                return d0;
            }
        }, null, null, 12, null);
    }

    @Override // tb.zhc
    public void u(KSUTCommitAction kSUTCommitAction, g1a<? super c1g, xhv> g1aVar, final g1a<? super Boolean, xhv> g1aVar2, final g1a<? super n0g, xhv> g1aVar3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c121ba88", new Object[]{this, kSUTCommitAction, g1aVar, g1aVar2, g1aVar3});
            return;
        }
        ckf.g(kSUTCommitAction, "action");
        final c1g c1gVar = new c1g();
        if (g1aVar != null) {
            g1aVar.invoke(c1gVar);
        }
        xyu.INSTANCE.d(f0(kSUTCommitAction), new g1a() { // from class: tb.eyr
            @Override // tb.g1a
            public final Object invoke(Object obj) {
                xhv a0;
                hyr hyrVar = this;
                g1a g1aVar4 = g1aVar3;
                a0 = hyr.a0(c1g.this, hyrVar, g1aVar4, g1aVar2, (k0v) obj);
                return a0;
            }
        });
    }
}
