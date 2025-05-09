package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.infoflow.protocol.subservice.biz.IVideoPlayControllerService;
import java.util.HashMap;
import java.util.Map;
import tb.imc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class swg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Boolean f28317a;
    public imc b;
    public final xwg c;
    public imc.a f;
    public final IVideoPlayControllerService.c g;
    public Handler i;
    public DXRuntimeContext j;
    public boolean d = false;
    public boolean e = false;
    public final Handler h = new Handler(Looper.getMainLooper());
    public final Runnable k = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("LiveCardPlayControlByService", "executePlayRunnable");
            if (swg.a(swg.this) && !swg.b(swg.this)) {
                swg swgVar = swg.this;
                swg.d(swgVar, swg.c(swgVar));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f28319a;

        public b(DXRuntimeContext dXRuntimeContext) {
            this.f28319a = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (swg.a(swg.this) && !swg.b(swg.this)) {
                swg.d(swg.this, this.f28319a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f28320a;

        public c(DXRuntimeContext dXRuntimeContext) {
            this.f28320a = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            fve.e("LiveCardPlayControlByService", "stopVideo , real run stop . ");
            try {
                swg.e(swg.this, this.f28320a);
            } catch (Exception e) {
                fve.c("LiveCardPlayControlByService", "directStopPlayer with Error", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements imc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRuntimeContext f28321a;
        public final /* synthetic */ IVideoPlayControllerService.b b;

        public d(DXRuntimeContext dXRuntimeContext, IVideoPlayControllerService.b bVar) {
            this.f28321a = dXRuntimeContext;
            this.b = bVar;
        }

        @Override // tb.imc.a
        public void a(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1f16e847", new Object[]{this, new Integer(i), str});
            } else if (i == 1 || i == 2 || i == 3) {
                swg.f(swg.this, this.f28321a);
                swg.g(swg.this, this.b);
                swg.h(swg.this, i, str);
            }
        }
    }

    static {
        t2o.a(491782221);
    }

    public swg(xwg xwgVar, IVideoPlayControllerService.c cVar) {
        this.c = xwgVar;
        this.g = cVar;
    }

    public static /* synthetic */ boolean a(swg swgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("85e22bf8", new Object[]{swgVar})).booleanValue();
        }
        return swgVar.d;
    }

    public static /* synthetic */ boolean b(swg swgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a21b7f57", new Object[]{swgVar})).booleanValue();
        }
        return swgVar.e;
    }

    public static /* synthetic */ DXRuntimeContext c(swg swgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXRuntimeContext) ipChange.ipc$dispatch("40fc6c15", new Object[]{swgVar});
        }
        return swgVar.j;
    }

    public static /* synthetic */ void d(swg swgVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f260fc2", new Object[]{swgVar, dXRuntimeContext});
        } else {
            swgVar.v(dXRuntimeContext);
        }
    }

    public static /* synthetic */ void e(swg swgVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f25a54e1", new Object[]{swgVar, dXRuntimeContext});
        } else {
            swgVar.k(dXRuntimeContext);
        }
    }

    public static /* synthetic */ void f(swg swgVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c58e9a00", new Object[]{swgVar, dXRuntimeContext});
        } else {
            swgVar.x(dXRuntimeContext);
        }
    }

    public static /* synthetic */ void g(swg swgVar, IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ce64f4b", new Object[]{swgVar, bVar});
        } else {
            swgVar.r(bVar);
        }
    }

    public static /* synthetic */ void h(swg swgVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("decac160", new Object[]{swgVar, new Integer(i), str});
        } else {
            swgVar.i(i, str);
        }
    }

    public final imc.a j(IVideoPlayControllerService.b bVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imc.a) ipChange.ipc$dispatch("367a1b1c", new Object[]{this, bVar, dXRuntimeContext});
        }
        if (this.f == null) {
            this.f = new d(dXRuntimeContext, bVar);
        }
        return this.f;
    }

    public final void k(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0705304", new Object[]{this, dXRuntimeContext});
        } else {
            n(dXRuntimeContext).a(dXRuntimeContext);
        }
    }

    public final boolean l(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e71f442", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        if (!o(dXRuntimeContext) || !this.c.w()) {
            return false;
        }
        return true;
    }

    public final Map<String, String> m(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("838d975", new Object[]{this, dXRuntimeContext});
        }
        HashMap hashMap = new HashMap(8);
        DXTemplateItem p = dXRuntimeContext == null ? null : dXRuntimeContext.p();
        if (p != null) {
            hashMap.put("template", p.f7343a + "_" + p.b);
        }
        return hashMap;
    }

    public final imc n(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (imc) ipChange.ipc$dispatch("ec66243d", new Object[]{this, dXRuntimeContext});
        }
        imc imcVar = this.b;
        if (imcVar != null) {
            return imcVar;
        }
        this.j = dXRuntimeContext;
        if (l(dXRuntimeContext)) {
            this.b = new f2h(dXRuntimeContext);
        } else {
            this.b = new lyg();
        }
        return this.b;
    }

    public final boolean o(DXRuntimeContext dXRuntimeContext) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("907b7477", new Object[]{this, dXRuntimeContext})).booleanValue();
        }
        Boolean bool = this.f28317a;
        if (bool != null) {
            return bool.booleanValue();
        }
        cfc c2 = j18.c(dXRuntimeContext);
        if (c2 == null) {
            fve.e("LiveCardPlayControlByService", "isEnableVideoPlayControl infoFlowContext == null");
            Boolean bool2 = Boolean.TRUE;
            this.f28317a = bool2;
            return bool2.booleanValue();
        }
        IVideoPlayControllerService iVideoPlayControllerService = (IVideoPlayControllerService) c2.a(IVideoPlayControllerService.class);
        if (iVideoPlayControllerService == null || !iVideoPlayControllerService.isEnable()) {
            z = false;
        }
        this.f28317a = Boolean.valueOf(z);
        fve.e("LiveCardPlayControlByService", "isEnableVideoPlayControl:" + this.f28317a);
        return this.f28317a.booleanValue();
    }

    public void p(IVideoPlayControllerService.b bVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacfd89a", new Object[]{this, bVar, dXRuntimeContext});
        } else if (!l(dXRuntimeContext)) {
            fve.e("LiveCardPlayControlByService", "不是播控场景以下事件不需要响应");
        } else {
            t(bVar, dXRuntimeContext);
            v(dXRuntimeContext);
            ((y9w) bVar).I(this.g);
        }
    }

    public final void r(IVideoPlayControllerService.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4e310b9", new Object[]{this, bVar});
            return;
        }
        ((y9w) bVar).G(this.g);
        fve.e("LiveCardPlayControlByService", "播放器出现错误");
    }

    public void s(IVideoPlayControllerService.b bVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e7831e9", new Object[]{this, bVar, dXRuntimeContext});
        } else if (!l(dXRuntimeContext)) {
            fve.e("LiveCardPlayControlByService", "不是播控场景以下事件不需要响应");
        } else {
            w(dXRuntimeContext);
            x(dXRuntimeContext);
        }
    }

    public final void t(IVideoPlayControllerService.b bVar, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6301a0d6", new Object[]{this, bVar, dXRuntimeContext});
        } else {
            u(dXRuntimeContext, j(bVar, dXRuntimeContext));
        }
    }

    public final void u(DXRuntimeContext dXRuntimeContext, imc.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37b0fa92", new Object[]{this, dXRuntimeContext, aVar});
        } else {
            n(dXRuntimeContext).c(aVar);
        }
    }

    public final void v(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c78abcb1", new Object[]{this, dXRuntimeContext});
        } else {
            n(dXRuntimeContext).b(dXRuntimeContext, this.c);
        }
    }

    public final void w(DXRuntimeContext dXRuntimeContext) {
        Intent intent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("323e511", new Object[]{this, dXRuntimeContext});
            return;
        }
        int c2 = mve.c("key_live_transition_delay_default_time", 300);
        if (c2 > 0 && dXRuntimeContext != null && (dXRuntimeContext.h() instanceof Activity) && (intent = ((Activity) dXRuntimeContext.h()).getIntent()) != null) {
            long j = c2;
            if (System.currentTimeMillis() - intent.getLongExtra("transition_jump_start_time", -1L) < j) {
                if (this.i == null) {
                    this.i = new Handler(Looper.getMainLooper());
                }
                fve.e("LiveCardPlayControlByService", "stopVideo , hit transition_jump_start_time.");
                this.i.postDelayed(new c(dXRuntimeContext), j);
                return;
            }
        }
        k(dXRuntimeContext);
    }

    public final void x(DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d60deb2", new Object[]{this, dXRuntimeContext});
        } else {
            u(dXRuntimeContext, null);
        }
    }

    public final void i(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("670b98f", new Object[]{this, new Integer(i), str});
            return;
        }
        fve.e("LiveCardPlayControlByService", "errorCode : " + i + ", errorMsg : " + str);
        if (i == 1) {
            Map<String, String> m = m(this.j);
            m.put("errorMsg", str);
            tve.a("live", "live_prepareToPlayFail", "", "Page_Home_VideoPlayer_Count", "", m);
        } else if (i == 2) {
            tve.b("live", "live_playFail", "", "Page_Home_VideoPlayer", "", m(this.j), String.valueOf(i), str);
        } else if (i == 4) {
            tve.b("live", "live_playMediaFail", "", "Page_Home_VideoPlayer", "", m(this.j), String.valueOf(i), str);
        }
    }

    public void q(DXEvent dXEvent, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b62d42b5", new Object[]{this, dXEvent, dXRuntimeContext});
        } else if (l(dXRuntimeContext)) {
            fve.e("LiveCardPlayControlByService", "播控场景以下事件不需要响应");
        } else {
            long eventId = dXEvent.getEventId();
            if (eventId == 7952648158329995189L) {
                fve.e("LiveCardPlayControlByService", "receive on scroll start event");
                this.e = true;
            } else if (eventId == -7968002352509477560L) {
                fve.e("LiveCardPlayControlByService", "receive on scroll stop event");
                this.e = false;
            } else if (eventId == 5288671110273408574L) {
                fve.e("LiveCardPlayControlByService", "receive on appear event");
                this.d = true;
            } else if (eventId == 5388973340095122049L) {
                fve.e("LiveCardPlayControlByService", "receive on disappear event");
                this.d = false;
                w(dXRuntimeContext);
            }
            fve.e("LiveCardPlayControlByService", "postMainThread isOnRefreshControl:" + o7p.a().c());
            if (o7p.a().c()) {
                this.j = dXRuntimeContext;
                o7p.a().f(this.k);
                o7p.a().e(this.k);
                return;
            }
            this.h.removeCallbacksAndMessages(null);
            this.h.post(new b(dXRuntimeContext));
        }
    }
}
