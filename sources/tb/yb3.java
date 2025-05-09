package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.opencart.weex.DismissPopWeexModule;
import com.taobao.android.opencart.weex.JoinGroupContainerView;
import com.taobao.android.weex_framework.MUSEngine;
import com.taobao.themis.external.embed.TMSEmbed;
import com.taobao.themis.external.embed.Weex2StartParams;
import com.uc.webview.export.media.MessageID;
import kotlin.Metadata;
import tb.xb3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class yb3 implements wad {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static boolean e;

    /* renamed from: a  reason: collision with root package name */
    public boolean f31952a;
    public TMSEmbed b;
    public JoinGroupContainerView c;
    public final Activity d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements JoinGroupContainerView.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    yb3.this.dismiss();
                }
            }
        }

        public b() {
        }

        @Override // com.taobao.android.opencart.weex.JoinGroupContainerView.a
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cc8de75", new Object[]{this});
            } else {
                yb3.this.dismiss();
            }
        }

        @Override // com.taobao.android.opencart.weex.JoinGroupContainerView.a
        public View b() {
            nce nceVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("a52cd2b3", new Object[]{this});
            }
            TMSEmbed a2 = yb3.a(yb3.this);
            if (a2 == null || (nceVar = (nce) a2.g(nce.class)) == null) {
                return null;
            }
            return nceVar.W0();
        }

        @Override // com.taobao.android.opencart.weex.JoinGroupContainerView.a
        public void onDetachedFromWindow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3896b092", new Object[]{this});
            } else {
                pav.i(new a(), 0L);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class c extends TMSEmbed.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ xb3 b;

        public c(xb3 xb3Var) {
            this.b = xb3Var;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1799497502) {
                super.c((String) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == -302283915) {
                super.n();
                return null;
            } else if (hashCode == 2123836685) {
                super.l((String) objArr[0], (String) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/opencart/joingroup/pop/impl/CartJoinGroupWeex2Pop$prepare$2");
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public boolean b(boolean z, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("17a6ad2f", new Object[]{this, new Boolean(z), str, str2})).booleanValue();
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.b(z, str, str2);
            }
            return true;
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void c(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("94bdd8e2", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.c(str, str2);
            hav.a("CartJoinGroupWeex2Pop", "onJSException," + str + ',' + str2);
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.c(str, str2);
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0577fac", new Object[]{this});
                return;
            }
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.d();
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("43750d97", new Object[]{this});
                return;
            }
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.e();
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3809a779", new Object[]{this});
                return;
            }
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.f();
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void l(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
                return;
            }
            ckf.g(str, "errorCode");
            ckf.g(str2, "errorMsg");
            super.l(str, str2);
            hav.a("CartJoinGroupWeex2Pop", "onRenderFailed," + str + ',' + str2);
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.l(str, str2);
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c832df14", new Object[]{this});
                return;
            }
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.m();
            }
        }

        @Override // com.taobao.themis.external.embed.TMSEmbed.a
        public void n() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edfb8375", new Object[]{this});
                return;
            }
            super.n();
            yb3.d(yb3.this, true);
            TMSEmbed.a c = this.b.c();
            if (c != null) {
                c.n();
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/opencart/joingroup/pop/impl/CartJoinGroupWeex2Pop$show$1$1", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ JoinGroupContainerView f31956a;
        public final /* synthetic */ yb3 b;
        public final /* synthetic */ xb3 c;

        public d(JoinGroupContainerView joinGroupContainerView, yb3 yb3Var, xb3 xb3Var) {
            this.f31956a = joinGroupContainerView;
            this.b = yb3Var;
            this.c = xb3Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!yb3.b(this.b)) {
                hav.a("CartJoinGroupWeex2Pop", "timeout dismiss");
                this.b.dismiss();
            } else {
                yb3.c(this.b, this.c, this.f31956a);
            }
        }
    }

    public yb3(Activity activity) {
        ckf.g(activity, "activity");
        this.d = activity;
    }

    public static final /* synthetic */ TMSEmbed a(yb3 yb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TMSEmbed) ipChange.ipc$dispatch("ce5d9f8b", new Object[]{yb3Var});
        }
        return yb3Var.b;
    }

    public static final /* synthetic */ boolean b(yb3 yb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce7a1ea8", new Object[]{yb3Var})).booleanValue();
        }
        return yb3Var.f31952a;
    }

    public static final /* synthetic */ void c(yb3 yb3Var, xb3 xb3Var, JoinGroupContainerView joinGroupContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6224d03", new Object[]{yb3Var, xb3Var, joinGroupContainerView});
        } else {
            yb3Var.g(xb3Var, joinGroupContainerView);
        }
    }

    public static final /* synthetic */ void d(yb3 yb3Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ce32d68", new Object[]{yb3Var, new Boolean(z)});
        } else {
            yb3Var.f31952a = z;
        }
    }

    @Override // tb.wad
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        try {
            JoinGroupContainerView joinGroupContainerView = this.c;
            ViewParent parent = joinGroupContainerView != null ? joinGroupContainerView.getParent() : null;
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(this.c);
            }
            TMSEmbed tMSEmbed = this.b;
            if (tMSEmbed != null) {
                tMSEmbed.d();
            }
            jgm.INSTANCE.c(this.d);
            this.b = null;
            this.c = null;
        } catch (Throwable th) {
            xh8 c2 = xh8.a("Ultron").c("CartJoinGroupWeex2Pop#dismiss");
            String message = th.getMessage();
            if (message == null) {
                message = "出错了";
            }
            f9v.q(c2.message(message));
        }
    }

    public View e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3268c19", new Object[]{this});
        }
        return this.c;
    }

    public final void f(xb3 xb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25700f08", new Object[]{this, xb3Var});
            return;
        }
        if (!e) {
            MUSEngine.registerModule(DismissPopWeexModule.MODULE_NAME, DismissPopWeexModule.class);
            e = true;
        }
        if (this.c == null) {
            jgm.INSTANCE.a(this);
            JoinGroupContainerView joinGroupContainerView = new JoinGroupContainerView(this.d);
            this.c = joinGroupContainerView;
            joinGroupContainerView.setAlphaTouchEventListener(new b());
            JoinGroupContainerView joinGroupContainerView2 = this.c;
            if (joinGroupContainerView2 != null) {
                joinGroupContainerView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            TMSEmbed tMSEmbed = new TMSEmbed(this.d);
            this.b = tMSEmbed;
            tMSEmbed.r(new c(xb3Var));
        }
    }

    public final void g(xb3 xb3Var, JoinGroupContainerView joinGroupContainerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc291824", new Object[]{this, xb3Var, joinGroupContainerView});
            return;
        }
        hav.d("CartJoinGroupWeex2Pop", "prepareToShow");
        xb3.a a2 = xb3Var.a();
        if (a2 != null) {
            a2.a(joinGroupContainerView);
        }
    }

    @Override // tb.wad
    public Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.d;
    }

    public boolean h(xb3 xb3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2e45d6", new Object[]{this, xb3Var})).booleanValue();
        }
        ckf.g(xb3Var, "params");
        if (n7v.a()) {
            hav.g("CartJoinGroupWeex2Pop", "show,url=", xb3Var.d(), ",delayMills=" + xb3Var.b());
        }
        try {
            f(xb3Var);
            JoinGroupContainerView joinGroupContainerView = this.c;
            if (joinGroupContainerView != null) {
                hav.d("CartJoinGroupWeex2Pop", MessageID.onPrepared);
                xb3.a a2 = xb3Var.a();
                if (a2 != null) {
                    a2.b(joinGroupContainerView);
                }
                Window window = this.d.getWindow();
                View view = null;
                View decorView = window != null ? window.getDecorView() : null;
                if (!(decorView instanceof ViewGroup)) {
                    decorView = null;
                }
                ViewGroup viewGroup = (ViewGroup) decorView;
                if (viewGroup != null) {
                    if (viewGroup.indexOfChild(joinGroupContainerView) == -1) {
                        viewGroup.addView(joinGroupContainerView);
                    }
                    Weex2StartParams weex2StartParams = new Weex2StartParams();
                    weex2StartParams.setUrl(xb3Var.d());
                    TMSEmbed tMSEmbed = this.b;
                    if (tMSEmbed != null) {
                        tMSEmbed.i(weex2StartParams);
                    }
                    TMSEmbed tMSEmbed2 = this.b;
                    if (tMSEmbed2 != null) {
                        view = tMSEmbed2.h();
                    }
                    joinGroupContainerView.addView(view, new ViewGroup.LayoutParams(-1, -1));
                    TMSEmbed tMSEmbed3 = this.b;
                    if (tMSEmbed3 != null) {
                        tMSEmbed3.u();
                    }
                    if (xb3Var.b() > 0) {
                        pav.i(new d(joinGroupContainerView, this, xb3Var), xb3Var.b());
                    } else {
                        g(xb3Var, joinGroupContainerView);
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            hav.a("CartJoinGroupWeex2Pop#show", th.getMessage());
            return false;
        }
    }
}
