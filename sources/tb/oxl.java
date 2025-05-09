package tb;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.lifecycle.ILifecycleService;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class oxl implements o6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean e = akt.p2("ShortVideo.reportPerformanceOnce", true);

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f25729a;
    public final Context b;
    public boolean c = false;
    public final jxl d = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements jxl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.oxl$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1021a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ eyl f25731a;

            public RunnableC1021a(eyl eylVar) {
                this.f25731a = eylVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                String b = pto.b(oxl.k(oxl.this));
                ryr.b(oxl.l(oxl.this), b, "gg_videoTab_page_fever");
                HashMap hashMap = new HashMap();
                hashMap.put("category", Integer.valueOf(this.f25731a.f18894a));
                hashMap.put(m09.TASK_TYPE_LEVEL, this.f25731a.c);
                hashMap.put("value", this.f25731a.d);
                hashMap.put("process", this.f25731a.g);
                hashMap.put("type", Integer.valueOf(this.f25731a.b));
                hashMap.put("profileType", this.f25731a.f);
                hashMap.put("score", Integer.valueOf(this.f25731a.e));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("energy", JSON.toJSONString(hashMap));
                ryr.d(oxl.l(oxl.this), b, "gg_videoTab_page_fever", hashMap2);
            }
        }

        public a() {
        }

        @Override // tb.jxl
        public int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cb1881df", new Object[]{this})).intValue();
            }
            return 4;
        }

        @Override // tb.jxl
        public int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fb96a19b", new Object[]{this})).intValue();
            }
            return 402;
        }

        @Override // tb.jxl
        public boolean c(eyl eylVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f29d0f9", new Object[]{this, eylVar})).booleanValue();
            }
            if (!oxl.a() || !oxl.b(oxl.this)) {
                oxl.j(oxl.this, true);
                nwv.y0(new RunnableC1021a(eylVar));
            }
            return false;
        }
    }

    static {
        t2o.a(468713853);
        t2o.a(468714445);
    }

    public oxl(FluidContext fluidContext) {
        this.f25729a = fluidContext;
        ((ILifecycleService) fluidContext.getService(ILifecycleService.class)).addPageLifecycleListener(this);
        this.b = fluidContext.getContext();
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return e;
    }

    public static /* synthetic */ boolean b(oxl oxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cca39dc6", new Object[]{oxlVar})).booleanValue();
        }
        return oxlVar.c;
    }

    public static /* synthetic */ boolean j(oxl oxlVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fcb2bf94", new Object[]{oxlVar, new Boolean(z)})).booleanValue();
        }
        oxlVar.c = z;
        return z;
    }

    public static /* synthetic */ FluidContext k(oxl oxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("169799e5", new Object[]{oxlVar});
        }
        return oxlVar.f25729a;
    }

    public static /* synthetic */ Context l(oxl oxlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("bcf7c63c", new Object[]{oxlVar});
        }
        return oxlVar.b;
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41b86567", new Object[]{this});
            return;
        }
        ir9.b("PerformanceMonitor", "endTrackPerformance");
        p7o.d(this.d);
    }

    public final void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8eff976e", new Object[]{this});
            return;
        }
        ir9.b("PerformanceMonitor", "startTrackPerformance");
        p7o.a(this.d);
    }

    @Override // tb.o6d
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        } else {
            m();
        }
    }

    @Override // tb.o6d
    public void onRealStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e496e44c", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onRealStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("274986c6", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            n();
        }
    }

    @Override // tb.o6d
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }

    @Override // tb.o6d
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
        }
    }
}
