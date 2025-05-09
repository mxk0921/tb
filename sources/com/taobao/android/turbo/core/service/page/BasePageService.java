package com.taobao.android.turbo.core.service.page;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.autosize.OnScreenChangedListener;
import com.taobao.android.autosize.TBAutoSizeConfig;
import java.util.Map;
import tb.a07;
import tb.b7d;
import tb.ckf;
import tb.d7d;
import tb.ieb;
import tb.k7d;
import tb.mnv;
import tb.p6d;
import tb.plk;
import tb.qpu;
import tb.t2o;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class BasePageService implements b7d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "PageService";

    /* renamed from: a  reason: collision with root package name */
    public qpu f9749a;
    public int b = -1;
    public final plk<p6d> c = new plk<>();
    public final plk<ieb> d = new plk<>();
    public final plk<k7d> e = new plk<>();
    public final plk<d7d> f = new plk<>();
    public Map<String, String> g;
    public OnScreenChangedListener h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(919601300);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(919601299);
        t2o.a(919601325);
    }

    public static final /* synthetic */ plk K1(BasePageService basePageService) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (plk) ipChange.ipc$dispatch("86ae5c7c", new Object[]{basePageService});
        }
        return basePageService.f;
    }

    public final boolean L1(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2df6bcab", new Object[]{this, new Integer(i)})).booleanValue();
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, TAG, "currentState:" + this.b + "  newState:" + i, null, 4, null);
        if (i != 0) {
            if (i == 1) {
                int i2 = this.b;
                if (i2 == 0 || i2 == 4) {
                    return true;
                }
                return false;
            } else if (i == 2) {
                int i3 = this.b;
                if (i3 == 1 || i3 == 3) {
                    return true;
                }
                return false;
            } else if (i != 3) {
                if (i == 4) {
                    int i4 = this.b;
                    if (i4 == 3 || i4 == 1) {
                        return true;
                    }
                    return false;
                } else if (i != 5) {
                    return false;
                } else {
                    int i5 = this.b;
                    if (i5 == 4 || i5 == -1) {
                        return true;
                    }
                    return false;
                }
            } else if (this.b == 2) {
                return true;
            } else {
                return false;
            }
        } else if (this.b == -1) {
            return true;
        } else {
            return false;
        }
    }

    @Override // tb.jeb
    public void M(ieb iebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c133c2a", new Object[]{this, iebVar});
            return;
        }
        ckf.g(iebVar, DataReceiveMonitor.CB_LISTENER);
        this.d.a(iebVar);
    }

    public final void M1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf1edb87", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchBeforePageCreated$1.INSTANCE);
        }
    }

    public final void N1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1984c38", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchBeforePageDestroyed$1.INSTANCE);
        }
    }

    public final void O1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("caa3679d", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchBeforePagePaused$1.INSTANCE);
        }
    }

    public final void P1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7d48af6", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchBeforePageResumed$1.INSTANCE);
        }
    }

    public final void Q1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8adf28a0", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchBeforePageStarted$1.INSTANCE);
        }
    }

    @Override // tb.b7d
    public Map<String, String> R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e4b78c7f", new Object[]{this});
        }
        Map<String, String> map = this.g;
        if (map != null) {
            return map;
        }
        mnv.a aVar = mnv.Companion;
        qpu qpuVar = this.f9749a;
        if (qpuVar != null) {
            return aVar.e(Uri.parse(qpuVar.a().n()));
        }
        ckf.y("context");
        throw null;
    }

    public final void R1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("341f3ec", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchBeforePageStopped$1.INSTANCE);
        }
    }

    public final void S1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebe66586", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchPageCreated$1.INSTANCE);
        }
    }

    @Override // tb.r6d
    public void T0(p6d p6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eab94283", new Object[]{this, p6dVar});
            return;
        }
        ckf.g(p6dVar, DataReceiveMonitor.CB_LISTENER);
        this.c.c(p6dVar);
    }

    public final void T1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa55277", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchPageDestroyed$1.INSTANCE);
        }
    }

    public final void U1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3d321be", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchPagePaused$1.INSTANCE);
        }
    }

    public final void V1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49c14f5", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchPageResumed$1.INSTANCE);
        }
    }

    public final void W1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a6b29f", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchPageStarted$1.INSTANCE);
        }
    }

    public final void X1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30097deb", new Object[]{this});
        } else {
            this.c.d(BasePageService$dispatchPageStopped$1.INSTANCE);
        }
    }

    public final void Y1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57549641", new Object[]{this});
            return;
        }
        OnScreenChangedListener basePageService$registerOnScreenChangedListener$listener$1 = new OnScreenChangedListener() { // from class: com.taobao.android.turbo.core.service.page.BasePageService$registerOnScreenChangedListener$listener$1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onActivityChanged(Activity activity, int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("994f466c", new Object[]{this, activity, new Integer(i), configuration});
                    return;
                }
                ckf.g(activity, "activity");
                ckf.g(configuration, "newConfig");
            }

            @Override // com.taobao.android.autosize.OnScreenChangedListener
            public void onScreenChanged(int i, Configuration configuration) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("cfdcd1d", new Object[]{this, new Integer(i), configuration});
                    return;
                }
                ckf.g(configuration, "newConfig");
                BasePageService.K1(BasePageService.this).d(BasePageService$registerOnScreenChangedListener$listener$1$onScreenChanged$1.INSTANCE);
            }
        };
        TBAutoSizeConfig.x().d0(basePageService$registerOnScreenChangedListener$listener$1);
        this.h = basePageService$registerOnScreenChangedListener$listener$1;
    }

    public final void Z1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46327908", new Object[]{this});
            return;
        }
        OnScreenChangedListener onScreenChangedListener = this.h;
        if (onScreenChangedListener != null) {
            TBAutoSizeConfig.x().h0(onScreenChangedListener);
            this.h = null;
        }
    }

    @Override // tb.r6d
    public void e1(p6d p6dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87f82a20", new Object[]{this, p6dVar});
            return;
        }
        ckf.g(p6dVar, DataReceiveMonitor.CB_LISTENER);
        this.c.a(p6dVar);
    }

    @Override // tb.e7d
    public void g1(d7d d7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd471fba", new Object[]{this, d7dVar});
            return;
        }
        ckf.g(d7dVar, DataReceiveMonitor.CB_LISTENER);
        this.f.a(d7dVar);
    }

    @Override // tb.b7d
    public int getPageState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("450b8306", new Object[]{this})).intValue();
        }
        return this.b;
    }

    @Override // tb.ieb
    public void onActivityResult(int i, int i2, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4af7346f", new Object[]{this, new Integer(i), new Integer(i2), intent});
        } else {
            this.d.d(new BasePageService$onActivityResult$1(i, i2, intent));
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
        this.f9749a = qpuVar;
        Y1();
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        Z1();
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        } else {
            this.b = 0;
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        } else {
            this.b = 5;
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        } else {
            this.b = 3;
        }
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
        } else {
            this.b = 2;
        }
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        } else {
            this.b = 1;
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        } else {
            this.b = 4;
        }
    }

    @Override // tb.jeb
    public void r(ieb iebVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e617e7", new Object[]{this, iebVar});
            return;
        }
        ckf.g(iebVar, DataReceiveMonitor.CB_LISTENER);
        this.d.c(iebVar);
    }

    @Override // tb.b7d
    public void w1(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b8d5fdd", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, "url");
        ckf.g(map, "query");
        tpu.a.b(tpu.Companion, TAG, "updatePageUrl:".concat(str), null, 4, null);
        this.g = map;
        this.e.d(new BasePageService$updatePageUrl$1(str, map));
    }

    @Override // tb.l7d
    public void x(k7d k7dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3b2b608", new Object[]{this, k7dVar});
            return;
        }
        ckf.g(k7dVar, DataReceiveMonitor.CB_LISTENER);
        this.e.a(k7dVar);
    }
}
