package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import com.taobao.infoflow.protocol.subservice.framework.IMainLifecycleService;
import java.lang.ref.WeakReference;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class gnl implements gsd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<h6d> f20111a;
    public WeakReference<zxd> b;
    public final IMainLifecycleService c;
    public final IMainFeedsViewService<?> d;
    public final IMainFeedsLoopStartStopService.a e;
    public h6c.b f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements h6d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.h6d
        public void onActivityResult(int i, int i2, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
            }
        }

        @Override // tb.h6d
        public void onColdStartResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45e9b853", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroy() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onDestroyView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onNewIntent(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4b57eb01", new Object[]{this, intent});
            }
        }

        @Override // tb.h6d
        public void onPause() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            } else if (gnl.d(gnl.this) != null) {
                gnl.d(gnl.this).forceExposure();
            }
        }

        @Override // tb.h6d
        public void onRestart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c630bb7", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onResume() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            } else {
                gnl.c(gnl.this).onStart(IMainFeedsLoopStartStopService.a.PAGE_SWITCH);
            }
        }

        @Override // tb.h6d
        public void onStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onStop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            }
        }

        @Override // tb.h6d
        public void onWillExit() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bc02c16", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements zxd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.zxd
        public void onPageScrolled(float f, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e3dde4", new Object[]{this, new Float(f), new Integer(i)});
            }
        }

        @Override // tb.zxd
        public void onPageSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90abdd0", new Object[]{this});
            } else {
                gnl.c(gnl.this).onStart(IMainFeedsLoopStartStopService.a.TAB_SWITCH);
            }
        }

        @Override // tb.zxd
        public void onPageUnSelected() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1dadaf89", new Object[]{this});
            } else {
                gnl.c(gnl.this).a(IMainFeedsLoopStartStopService.a.TAB_SWITCH);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements h6c.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.h6c.b
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d673366", new Object[]{this});
            }
        }

        @Override // tb.h6c.b
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
            } else if (!mve.a("enableFixInfoFlowUnselectStartSlider", true)) {
                fve.e("PageLevelStartStopDetectorImpl", "!isResponseDataChangeLayoutFinish");
            } else if (gnl.e(gnl.this) != null && !gnl.e(gnl.this).isSelect()) {
                gnl.c(gnl.this).a(IMainFeedsLoopStartStopService.a.TAB_SWITCH);
            }
        }
    }

    static {
        t2o.a(486539548);
        t2o.a(486539555);
    }

    public gnl(cfc cfcVar, IMainFeedsLoopStartStopService.a aVar) {
        this.e = aVar;
        this.c = (IMainLifecycleService) cfcVar.a(IMainLifecycleService.class);
        this.d = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
    }

    public static /* synthetic */ IMainFeedsLoopStartStopService.a c(gnl gnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsLoopStartStopService.a) ipChange.ipc$dispatch("f1562898", new Object[]{gnlVar});
        }
        return gnlVar.e;
    }

    public static /* synthetic */ IMainFeedsViewService d(gnl gnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainFeedsViewService) ipChange.ipc$dispatch("a7e56c1d", new Object[]{gnlVar});
        }
        return gnlVar.d;
    }

    public static /* synthetic */ IMainLifecycleService e(gnl gnlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMainLifecycleService) ipChange.ipc$dispatch("28b6184c", new Object[]{gnlVar});
        }
        return gnlVar.c;
    }

    @Override // tb.gsd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dceb4c", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService != null) {
            m(iMainLifecycleService);
            n(this.c);
            l(this.d);
        }
    }

    @Override // tb.gsd
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd39afac", new Object[]{this});
            return;
        }
        IMainLifecycleService iMainLifecycleService = this.c;
        if (iMainLifecycleService != null) {
            j(iMainLifecycleService);
            k(this.c);
            i(this.d);
        }
    }

    public final h6c.b f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6c.b) ipChange.ipc$dispatch("67dd6bff", new Object[]{this});
        }
        return new c();
    }

    public final h6d g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h6d) ipChange.ipc$dispatch("8602dec9", new Object[]{this});
        }
        return new a();
    }

    public final zxd h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxd) ipChange.ipc$dispatch("34d67fe5", new Object[]{this});
        }
        return new b();
    }

    public final void i(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9ffe201", new Object[]{this, iMainFeedsViewService});
        } else if (iMainFeedsViewService != null) {
            this.f = f();
            iMainFeedsViewService.getLifeCycleRegister().M(this.f);
        }
    }

    @Override // tb.gsd
    public boolean isAllowStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fafee6e", new Object[]{this})).booleanValue();
        }
        return this.c.isVisible();
    }

    public final void j(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf97fab", new Object[]{this, iMainLifecycleService});
            return;
        }
        h6d g = g();
        this.f20111a = new WeakReference<>(g);
        iMainLifecycleService.getPageLifeCycleRegister().a(g);
    }

    public final void k(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8bd358b", new Object[]{this, iMainLifecycleService});
            return;
        }
        zxd h = h();
        iMainLifecycleService.getTabLifeCycleRegister().a(h);
        this.b = new WeakReference<>(h);
    }

    public final void l(IMainFeedsViewService<?> iMainFeedsViewService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("240b3fba", new Object[]{this, iMainFeedsViewService});
        } else if (iMainFeedsViewService != null && this.f != null) {
            iMainFeedsViewService.getLifeCycleRegister().k(this.f);
        }
    }

    public final void m(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e59f06d2", new Object[]{this, iMainLifecycleService});
            return;
        }
        WeakReference<h6d> weakReference = this.f20111a;
        if (weakReference != null && weakReference.get() != null) {
            iMainLifecycleService.getPageLifeCycleRegister().b(this.f20111a.get());
        }
    }

    public final void n(IMainLifecycleService iMainLifecycleService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f46ad84", new Object[]{this, iMainLifecycleService});
            return;
        }
        WeakReference<zxd> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            iMainLifecycleService.getTabLifeCycleRegister().b(this.b.get());
        }
    }
}
