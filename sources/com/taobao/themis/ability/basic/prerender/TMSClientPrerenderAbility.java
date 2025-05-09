package com.taobao.themis.ability.basic.prerender;

import android.app.Application;
import android.content.Context;
import android.taobao.windvane.export.prerender.TMSPrerenderService;
import android.taobao.windvane.extra.uc.WVUCWebView;
import android.view.View;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility;
import com.taobao.android.abilityidl.ability.ClientPrerenderPrerenderAttachDetail;
import com.taobao.themis.kernel.page.ITMSPage;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import com.taobao.themis.kernel.utils.CommonExtKt;
import kotlin.Metadata;
import tb.bbs;
import tb.ckf;
import tb.dbs;
import tb.h8s;
import tb.jdb;
import tb.kdb;
import tb.mgy;
import tb.nnb;
import tb.su3;
import tb.t2o;
import tb.xky;
import tb.ycd;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\rJ'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/taobao/themis/ability/basic/prerender/TMSClientPrerenderAbility;", "Lcom/taobao/android/abilityidl/ability/AbsClientPrerenderAbility;", "<init>", "()V", "Ltb/kdb;", "context", "Ltb/nnb;", "callback", "Ltb/xhv;", "addPrerenderAttachEventListener", "(Ltb/kdb;Ltb/nnb;)V", "Ltb/jdb;", "removePrerenderAttachEventListener", "(Ltb/kdb;Ltb/jdb;)V", "Ltb/su3;", "params", "reportPrerenderStatus", "(Ltb/kdb;Ltb/su3;Ltb/jdb;)V", "start", "Ltb/mgy;", "prerender", "(Ltb/kdb;Ltb/mgy;Ltb/jdb;)V", "themis_ability_basic_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSClientPrerenderAbility extends AbsClientPrerenderAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a implements xky.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nnb f13446a;

        public a(nnb nnbVar) {
            this.f13446a = nnbVar;
        }

        @Override // tb.xky.b
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8563a495", new Object[]{this, str});
                return;
            }
            ckf.g(str, "url");
            nnb nnbVar = this.f13446a;
            ClientPrerenderPrerenderAttachDetail clientPrerenderPrerenderAttachDetail = new ClientPrerenderPrerenderAttachDetail();
            clientPrerenderPrerenderAttachDetail.url = str;
            nnbVar.Q(clientPrerenderPrerenderAttachDetail);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class b implements ycd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nnb f13447a;

        public b(nnb nnbVar) {
            this.f13447a = nnbVar;
        }

        @Override // tb.ycd
        public void a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8563a495", new Object[]{this, str});
                return;
            }
            ClientPrerenderPrerenderAttachDetail clientPrerenderPrerenderAttachDetail = new ClientPrerenderPrerenderAttachDetail();
            if (str != null) {
                clientPrerenderPrerenderAttachDetail.url = str;
                this.f13447a.Q(clientPrerenderPrerenderAttachDetail);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f13448a;
        public final /* synthetic */ mgy b;
        public final /* synthetic */ TMSSolutionType c;
        public final /* synthetic */ jdb d;

        public c(Application application, mgy mgyVar, TMSSolutionType tMSSolutionType, jdb jdbVar) {
            this.f13448a = application;
            this.b = mgyVar;
            this.c = tMSSolutionType;
            this.d = jdbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Application application = this.f13448a;
            mgy mgyVar = this.b;
            String c = dbs.c(application, mgyVar.f24034a, this.c, mgyVar.c, mgyVar.d);
            dbs.c.a aVar = dbs.c.Companion;
            if (dbs.c.h(c, aVar.e())) {
                this.d.O(ErrorResult.a.e(aVar.e()));
            } else if (dbs.c.h(c, aVar.d())) {
                this.d.O(ErrorResult.a.g(aVar.d()));
            } else if (dbs.c.h(c, aVar.c())) {
                this.d.O(new ErrorResult("PRERENDER_POOL_FULL"));
            } else if (dbs.c.h(c, aVar.b())) {
                this.d.O(new ErrorResult("PRERENDER_INSTANCE_EXIST"));
            } else if (dbs.c.h(c, aVar.a())) {
                this.d.O(new ErrorResult("容器预渲染异常"));
            }
        }
    }

    static {
        t2o.a(830472216);
    }

    public static /* synthetic */ Object ipc$super(TMSClientPrerenderAbility tMSClientPrerenderAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/ability/basic/prerender/TMSClientPrerenderAbility");
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void addPrerenderAttachEventListener(kdb kdbVar, nnb nnbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea6b43bd", new Object[]{this, kdbVar, nnbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(nnbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            nnbVar.O(ErrorResult.a.c(""));
        } else if (h.getInstance().a0() == TMSSolutionType.WEEX) {
            xky xkyVar = (xky) h.getExtension(xky.class);
            if (xkyVar == null) {
                nnbVar.O(ErrorResult.a.b(""));
            } else {
                xkyVar.c(new a(nnbVar));
            }
        } else {
            View k = kdbVar.k();
            if (k instanceof WVUCWebView) {
                ((WVUCWebView) k).getWebViewContext().addPrerenderAttachEventListener(new b(nnbVar));
            } else {
                nnbVar.O(ErrorResult.a.g("failed to addPrerenderAttachEventListener"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void prerender(kdb kdbVar, mgy mgyVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("41355867", new Object[]{this, kdbVar, mgyVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(mgyVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        Application application = null;
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        if (application == null) {
            jdbVar.O(ErrorResult.a.f("application is null"));
        } else if (!ckf.b(mgyVar.b, "WEEX_SINGLE_PAGE")) {
            jdbVar.O(ErrorResult.a.g("solutionType is not supported"));
        } else if (!h8s.e(application).d()) {
            jdbVar.O(ErrorResult.a.g("solutionType is not supported"));
        } else {
            CommonExtKt.b().post(new c(application, mgyVar, TMSSolutionType.WEEX, jdbVar));
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void removePrerenderAttachEventListener(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14591486", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        ITMSPage h = CommonExtKt.h(kdbVar);
        if (h == null) {
            jdbVar.O(ErrorResult.a.c(""));
        } else if (h.getInstance().a0() == TMSSolutionType.WEEX) {
            xky xkyVar = (xky) h.getExtension(xky.class);
            if (xkyVar == null) {
                jdbVar.O(ErrorResult.a.b(""));
            } else {
                xkyVar.b();
            }
        } else {
            View k = kdbVar.k();
            if (k instanceof WVUCWebView) {
                ((WVUCWebView) k).getWebViewContext().removePrerenderAttachEventListener();
            } else {
                jdbVar.O(ErrorResult.a.g("failed to removePrerenderAttachEventListener"));
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void reportPrerenderStatus(kdb kdbVar, su3 su3Var, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07fb2e3", new Object[]{this, kdbVar, su3Var, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(su3Var, "params");
        ckf.g(jdbVar, "callback");
        bbs g = CommonExtKt.g(kdbVar);
        if (g == null) {
            jdbVar.O(ErrorResult.a.c(""));
        } else if (g.a0() == TMSSolutionType.WEEX) {
            dbs.d(g);
        } else {
            View k = kdbVar.k();
            if (!(k instanceof WVUCWebView) || !su3Var.f28276a) {
                jdbVar.O(ErrorResult.a.g("failed to reportPrerenderStatus"));
            } else {
                ((WVUCWebView) k).getWebViewContext().notifyPrerenderSuccess();
            }
        }
    }

    @Override // com.taobao.android.abilityidl.ability.AbsClientPrerenderAbility
    public void start(kdb kdbVar, jdb jdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2a6754", new Object[]{this, kdbVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "context");
        ckf.g(jdbVar, "callback");
        TMSPrerenderService.INSTANCE.f(new TMSClientPrerenderAbility$start$1(jdbVar));
    }
}
