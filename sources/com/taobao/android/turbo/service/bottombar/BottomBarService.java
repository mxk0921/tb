package com.taobao.android.turbo.service.bottombar;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.revisionswitch.utils.LocationHelper;
import com.taobao.tao.navigation.NavigationTabIconSourceType;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.taobao.tao.navigation.a;
import com.taobao.tao.navigation.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import tb.a07;
import tb.bud;
import tb.ckf;
import tb.g1a;
import tb.hvd;
import tb.plk;
import tb.qpu;
import tb.r6o;
import tb.rjb;
import tb.spu;
import tb.t2o;
import tb.tjb;
import tb.tpu;
import tb.vi2;
import tb.vpj;
import tb.wwc;
import tb.xhv;
import tb.xwc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class BottomBarService implements tjb, hvd, a.g, vpj {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f9757a;
    public vi2 b;
    public Runnable d;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final plk<rjb> e = new plk<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455505);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455504);
        t2o.a(916455436);
    }

    public static final /* synthetic */ plk r(BottomBarService bottomBarService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plk) ipChange.ipc$dispatch("c8b73e32", new Object[]{bottomBarService});
        }
        return bottomBarService.e;
    }

    public static final /* synthetic */ void x(BottomBarService bottomBarService, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3c10700", new Object[]{bottomBarService, runnable});
        } else {
            bottomBarService.d = runnable;
        }
    }

    @Override // tb.sjb
    public void B(rjb rjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e92383", new Object[]{this, rjbVar});
            return;
        }
        ckf.g(rjbVar, DataReceiveMonitor.CB_LISTENER);
        this.e.a(rjbVar);
    }

    @Override // tb.tjb
    public boolean B0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99c902cd", new Object[]{this})).booleanValue();
        }
        return m0(1);
    }

    @Override // tb.sjb
    public void L(rjb rjbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e57d80", new Object[]{this, rjbVar});
            return;
        }
        ckf.g(rjbVar, DataReceiveMonitor.CB_LISTENER);
        this.e.c(rjbVar);
    }

    @Override // tb.vpj
    public void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2918e2c9", new Object[]{this});
            return;
        }
        this.e.d(BottomBarService$onStyleChanged$1.INSTANCE);
        z0();
    }

    public int c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e38d1a", new Object[]{this})).intValue();
        }
        TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
        if (o != null) {
            return o.getCurrentTab();
        }
        return 0;
    }

    @Override // tb.tjb
    public void e0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c8cc85a", new Object[]{this, new Integer(i)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BottomBarService", "重置Tab bar item cache " + i, null, 4, null);
        com.taobao.tao.navigation.a.M(i);
    }

    @Override // tb.tjb
    public void i1(final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e192cd9", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BottomBarService", "设置底部bar可见，visible=" + z + "，animated=" + z2, null, 4, null);
        Runnable runnable = this.d;
        if (runnable != null) {
            this.c.removeCallbacks(runnable);
        }
        Runnable bottomBarService$setTabBarVisible$2 = new Runnable() { // from class: com.taobao.android.turbo.service.bottombar.BottomBarService$setTabBarVisible$2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltb/rjb;", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "invoke", "(Ltb/rjb;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            /* renamed from: com.taobao.android.turbo.service.bottombar.BottomBarService$setTabBarVisible$2$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
            public static final class AnonymousClass1 extends Lambda implements g1a<rjb, xhv> {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public AnonymousClass1() {
                    super(1);
                }

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/bottombar/BottomBarService$setTabBarVisible$2$1");
                }

                @Override // tb.g1a
                public /* bridge */ /* synthetic */ xhv invoke(rjb rjbVar) {
                    invoke2(rjbVar);
                    return xhv.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(rjb rjbVar) {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("4d790290", new Object[]{this, rjbVar});
                        return;
                    }
                    ckf.g(rjbVar, AdvanceSetting.NETWORK_TYPE);
                    rjbVar.r(z);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                tpu.a aVar2 = tpu.Companion;
                tpu.a.b(aVar2, "BottomBarService", "执行设置底部bar可见，visible=" + z + "，animated=" + z2, null, 4, null);
                if (z2) {
                    a.w(true ^ z);
                } else {
                    a.v(true ^ z);
                }
                BottomBarService.r(BottomBarService.this).d(new AnonymousClass1());
                BottomBarService.x(BottomBarService.this, null);
            }
        };
        this.c.post(bottomBarService$setTabBarVisible$2);
        xhv xhvVar = xhv.INSTANCE;
        this.d = bottomBarService$setTabBarVisible$2;
    }

    public boolean m0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6a6dd5a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (c0() == i) {
            return true;
        }
        return false;
    }

    @Override // tb.tjb
    public void m1(int i, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30078e0b", new Object[]{this, new Integer(i), str, str2, str3});
            return;
        }
        ckf.g(str, "selectIcon");
        ckf.g(str2, "unSelectIcon");
        ckf.g(str3, "title");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BottomBarService", "设置Tab bar item cache " + i + ", " + str + ", " + str2 + ", " + str3, null, 4, null);
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        boolean isEmpty3 = TextUtils.isEmpty(str3);
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            b m = com.taobao.tao.navigation.a.m(i);
            if (!isEmpty && !isEmpty2) {
                r6o.a aVar2 = r6o.Companion;
                spu.a aVar3 = spu.Companion;
                int c = aVar2.c(aVar3.d(), str);
                int c2 = aVar2.c(aVar3.d(), str2);
                ckf.d(m);
                m.L(NavigationTabIconSourceType.DRAWABLE);
                m.J(new Pair(Integer.valueOf(c2), Integer.valueOf(c)));
            }
            if (!isEmpty3) {
                ckf.d(m);
                m.Y(str3);
            }
            com.taobao.tao.navigation.a.k0(i, m);
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        this.f9757a = qpuVar;
        com.taobao.tao.navigation.a.h(this);
        com.taobao.tao.navigation.a.H(this);
        com.taobao.tao.navigation.a.V(this);
        qpu qpuVar2 = this.f9757a;
        if (qpuVar2 != null) {
            this.b = new vi2(qpuVar2, B0());
            qpu qpuVar3 = this.f9757a;
            if (qpuVar3 != null) {
                wwc Y = ((xwc) qpuVar3.getService(xwc.class)).Y();
                vi2 vi2Var = this.b;
                if (vi2Var != null) {
                    Y.x(vi2Var);
                } else {
                    ckf.y("bottomBarColorUpdater");
                    throw null;
                }
            } else {
                ckf.y("turboEngineContext");
                throw null;
            }
        } else {
            ckf.y("turboEngineContext");
            throw null;
        }
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        com.taobao.tao.navigation.a.K(this);
        com.taobao.tao.navigation.a.b0(this);
        com.taobao.tao.navigation.a.V(null);
    }

    @Override // tb.hvd
    public void onTabChanged(int i, String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91f35fc8", new Object[]{this, new Integer(i), str});
            return;
        }
        if (i != 1) {
            i1(true, false);
        }
        vi2 vi2Var = this.b;
        if (vi2Var != null) {
            if (i != 1) {
                z = false;
            }
            vi2Var.e(z);
            this.e.d(new BottomBarService$onTabChanged$1(i, str));
            return;
        }
        ckf.y("bottomBarColorUpdater");
        throw null;
    }

    @Override // tb.tjb
    public boolean p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7179ecd5", new Object[]{this})).booleanValue();
        }
        return com.taobao.tao.navigation.a.y();
    }

    @Override // com.taobao.tao.navigation.a.g
    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        vi2 vi2Var = this.b;
        if (vi2Var != null) {
            vi2Var.d();
            this.e.d(BottomBarService$reset$1.INSTANCE);
            return;
        }
        ckf.y("bottomBarColorUpdater");
        throw null;
    }

    @Override // tb.tjb
    public void u0(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8d6c90f", new Object[]{this, new Integer(i)});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "BottomBarService", "重置Tab bar " + i, null, 4, null);
        if (i == 1) {
            com.taobao.tao.navigation.a.f0("tab2", "content", null);
            com.taobao.tao.navigation.a.i0("tab2", NavigationTabMsgMode.NONE, null);
        }
    }

    public final void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c638fa79", new Object[]{this});
            return;
        }
        boolean d = LocationHelper.d(spu.Companion.d());
        boolean d2 = TBRevisionSwitchManager.c().d(bud.KEY_NEW_DISCOVERY_ENABLE);
        if (d && d2) {
            e0(1);
        }
    }
}
