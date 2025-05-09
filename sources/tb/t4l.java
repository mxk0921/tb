package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame;
import com.taobao.android.live.plugin.proxy.tbliveinteractive.IInteractiveProxy;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import java.util.HashMap;
import tb.lat;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t4l {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_STAY_TIME = 0;
    public static final long STAY_CHECK_INTERVAL = 10000;

    /* renamed from: a  reason: collision with root package name */
    public BaseFrame f28484a;
    public final BaseFrame b;
    public final ViewGroup c;
    public final n8e d;
    public final Context e;
    public TBLiveDataModel f;
    public boolean g;
    public final jyw h;
    public boolean i;
    public final AliUrlImageView j;
    public long k;
    public long l;
    public boolean m;
    public pat n;
    public ebt o;
    public final ux9 p;
    public lat.a q;
    public IInteractiveProxy.h r;
    public final String s;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements lat.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public BaseFrame a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseFrame) ipChange.ipc$dispatch("5a5b734c", new Object[]{this});
            }
            return t4l.a(t4l.this);
        }

        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f80968ac", new Object[]{this});
            } else {
                t4l.this.w();
            }
        }

        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("106aae78", new Object[]{this});
            } else {
                t4l.this.x();
            }
        }

        public void d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67312941", new Object[]{this, str});
            } else {
                t4l.this.j(str);
            }
        }

        public void e(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1ac1c4", new Object[]{this, baseFrame});
            } else {
                t4l.b(t4l.this, baseFrame);
            }
        }

        public void f(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6a5e429", new Object[]{this, new Boolean(z)});
            } else {
                t4l.this.m = z;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            sjr.g().d(FullScreenFrame.EVENT_ENABLE_LEFTRIGHT_SWITCH);
            sjr.g().d("com.taobao.taolive.room.enable_updown_switch");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoInfo f28487a;

        public c(VideoInfo videoInfo) {
            this.f28487a = videoInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t4l.c(t4l.this, this.f28487a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ VideoInfo f28488a;

        public d(VideoInfo videoInfo) {
            this.f28488a = videoInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                t4l.d(t4l.this, this.f28488a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public BaseFrame f28489a;
        public ViewGroup b;
        public n8e c;
        public Context d;
        public TBLiveDataModel e;
        public boolean f;
        public jyw g;
        public boolean h;
        public AliUrlImageView i;
        public ux9 j;

        static {
            t2o.a(779092917);
        }

        public static /* synthetic */ BaseFrame a(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BaseFrame) ipChange.ipc$dispatch("2199887d", new Object[]{eVar});
            }
            return eVar.f28489a;
        }

        public static /* synthetic */ ViewGroup b(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("96e6bad1", new Object[]{eVar});
            }
            return eVar.b;
        }

        public static /* synthetic */ n8e c(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (n8e) ipChange.ipc$dispatch("ce1e8cb8", new Object[]{eVar});
            }
            return eVar.c;
        }

        public static /* synthetic */ Context d(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("579e123e", new Object[]{eVar});
            }
            return eVar.d;
        }

        public static /* synthetic */ TBLiveDataModel e(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLiveDataModel) ipChange.ipc$dispatch("8b650768", new Object[]{eVar});
            }
            return eVar.e;
        }

        public static /* synthetic */ boolean f(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cec9c7cc", new Object[]{eVar})).booleanValue();
            }
            return eVar.f;
        }

        public static /* synthetic */ jyw g(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (jyw) ipChange.ipc$dispatch("4e859779", new Object[]{eVar});
            }
            return eVar.g;
        }

        public static /* synthetic */ boolean h(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("abd7ea4e", new Object[]{eVar})).booleanValue();
            }
            return eVar.h;
        }

        public static /* synthetic */ AliUrlImageView i(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AliUrlImageView) ipChange.ipc$dispatch("49f002ad", new Object[]{eVar});
            }
            return eVar.i;
        }

        public static /* synthetic */ ux9 j(e eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ux9) ipChange.ipc$dispatch("291390f2", new Object[]{eVar});
            }
            return eVar.j;
        }

        public t4l k() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (t4l) ipChange.ipc$dispatch("a7f63884", new Object[]{this});
            }
            return new t4l(this);
        }

        public e l(ux9 ux9Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("afeb860f", new Object[]{this, ux9Var});
            }
            this.j = ux9Var;
            return this;
        }

        public e m(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("70fb72e", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public e n(AliUrlImageView aliUrlImageView) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("31c698b9", new Object[]{this, aliUrlImageView});
            }
            this.i = aliUrlImageView;
            return this;
        }

        public e o(Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("e36f89c5", new Object[]{this, context});
            }
            this.d = context;
            return this;
        }

        public e p(jyw jywVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("e6a92fd0", new Object[]{this, jywVar});
            }
            this.g = jywVar;
            return this;
        }

        public e q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("9fa5d656", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public e r(TBLiveDataModel tBLiveDataModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("4a2e8ada", new Object[]{this, tBLiveDataModel});
            }
            this.e = tBLiveDataModel;
            return this;
        }

        public e s(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("68f1eb28", new Object[]{this, baseFrame});
            }
            this.f28489a = baseFrame;
            return this;
        }

        public e t(ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("f29b2b0c", new Object[]{this, viewGroup});
            }
            this.b = viewGroup;
            return this;
        }

        public e u(n8e n8eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("594b4ae3", new Object[]{this, n8eVar});
            }
            this.c = n8eVar;
            return this;
        }
    }

    static {
        t2o.a(779092912);
    }

    public t4l(e eVar) {
        this.s = null;
        this.b = e.a(eVar);
        this.c = e.b(eVar);
        this.d = e.c(eVar);
        this.e = e.d(eVar);
        this.f = e.e(eVar);
        this.g = e.f(eVar);
        this.h = e.g(eVar);
        this.i = e.h(eVar);
        this.j = e.i(eVar);
        ux9 j = e.j(eVar);
        this.p = j;
        if (j != null) {
            this.s = j.C();
        }
    }

    public static /* synthetic */ BaseFrame a(t4l t4lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("6f8483e3", new Object[]{t4lVar});
        }
        return t4lVar.f28484a;
    }

    public static /* synthetic */ BaseFrame b(t4l t4lVar, BaseFrame baseFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("4dd8139", new Object[]{t4lVar, baseFrame});
        }
        t4lVar.f28484a = baseFrame;
        return baseFrame;
    }

    public static /* synthetic */ void c(t4l t4lVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e2d5b63", new Object[]{t4lVar, videoInfo});
        } else {
            t4lVar.v(videoInfo);
        }
    }

    public static /* synthetic */ void d(t4l t4lVar, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("515f5302", new Object[]{t4lVar, videoInfo});
        } else {
            t4lVar.u(videoInfo);
        }
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9cda7ac", new Object[]{this})).booleanValue();
        }
        if (this.i || qvs.J0() == 1 || qvs.J0() == 4) {
            return true;
        }
        return false;
    }

    public BaseFrame f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("1b8aa3bc", new Object[]{this});
        }
        return this.f28484a;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf922921", new Object[]{this});
            return;
        }
        if (this.q == null) {
            this.q = new a();
        }
        if (this.n == null) {
            this.n = new pat(this.b, this.c, this.d, this.e, this.f, this.g, this.p, this.q);
        }
        if (this.o == null && (this.g || pvs.E1())) {
            this.o = new ebt(this.b, this.c, this.d, this.e, this.f, this.g, this.p, this.q);
        }
        if ((this.e instanceof Activity) && pvs.S()) {
            d7r.a((Activity) this.e);
        } else if (!pvs.S() && !vc.i(this.e)) {
            ((Activity) this.e).setRequestedOrientation(1);
        }
    }

    public final void h(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f5d80d", new Object[]{this, videoInfo});
            return;
        }
        y(z9u.CALC_ENTER, videoInfo);
        jyw jywVar = this.h;
        if (jywVar != null) {
            jywVar.sendEmptyMessageDelayed(0, 10000L);
            this.l = System.currentTimeMillis();
            ux9 ux9Var = this.p;
            if (ux9Var instanceof air) {
                ((air) ux9Var).d0 = System.currentTimeMillis();
            }
        }
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be5eecf0", new Object[]{this})).booleanValue();
        }
        if (!vc.a()) {
            return true;
        }
        return true ^ this.g;
    }

    public void j(String str) {
        AliUrlImageView aliUrlImageView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ab3ac5c", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (aliUrlImageView = this.j) != null) {
            aliUrlImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.j.setImageUrl(str);
            this.j.setVisibility(0);
        }
    }

    public void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b75a74", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        pat patVar = this.n;
        if (patVar != null) {
            patVar.g = z;
        }
        ebt ebtVar = this.o;
        if (ebtVar != null) {
            ebtVar.g = z;
        }
    }

    public final void l(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95cfaaeb", new Object[]{this, new Boolean(z)});
            return;
        }
        up6.O0(z, this.p);
        ux9 ux9Var = this.p;
        if (ux9Var != null) {
            ux9Var.c = z;
        }
        if (z) {
            if (((Activity) this.e).getRequestedOrientation() == 1) {
                ((Activity) this.e).setRequestedOrientation(0);
            }
        } else if (((Activity) this.e).getRequestedOrientation() == 0) {
            ((Activity) this.e).setRequestedOrientation(1);
        }
    }

    public void m(IInteractiveProxy.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7fa82ec", new Object[]{this, hVar});
        } else {
            this.r = hVar;
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb6904c", new Object[]{this, new Boolean(z)});
        } else {
            this.i = z;
        }
    }

    public void o(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db1c448", new Object[]{this, tBLiveDataModel});
            return;
        }
        this.f = tBLiveDataModel;
        pat patVar = this.n;
        if (patVar != null) {
            patVar.d(tBLiveDataModel);
        }
        ebt ebtVar = this.o;
        if (ebtVar != null) {
            ebtVar.d(tBLiveDataModel);
        }
    }

    public void q(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26c4794", new Object[]{this, videoInfo});
        } else if (or.a(this.p, OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_CustomizedSimpleLive)) {
            sjr.g().e("com.taobao.taolive.room.live.end.without.replay", null);
        } else {
            h(videoInfo);
            n8e n8eVar = this.d;
            if (n8eVar != null) {
                n8eVar.d();
            }
            t(videoInfo);
        }
    }

    public void r(VideoInfo videoInfo) {
        AccountInfo accountInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae0915b4", new Object[]{this, videoInfo});
            return;
        }
        y(z9u.CALC_PRELIVE_ENTER, videoInfo);
        if (videoInfo != null && (accountInfo = videoInfo.broadCaster) != null && !TextUtils.isEmpty(accountInfo.accountId)) {
            String b2 = u90.b(videoInfo.broadCaster.accountId);
            if (!TextUtils.isEmpty(videoInfo.broadCaster.accountInfoNewUrl)) {
                b2 = videoInfo.broadCaster.accountInfoNewUrl;
            }
            rbu.f0(this.p);
            voj.a(this.e, b2);
            this.p.h().c("com.taobao.taolive.room.killself", null, this.s);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(com.taobao.taolive.sdk.model.common.VideoInfo r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.t4l.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "394ccbb6"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            r6 = 3
            r4[r6] = r8
            r2.ipc$dispatch(r3, r4)
            return
        L_0x001b:
            java.lang.String r2 = "ReplayEnter"
            r5.y(r2, r6)
            tb.n8e r2 = r5.d
            if (r2 == 0) goto L_0x0027
            r2.s(r6, r7, r8)
        L_0x0027:
            tb.ux9 r7 = r5.p
            boolean r7 = tb.pvs.Z0(r7)
            if (r7 == 0) goto L_0x003b
            tb.ux9 r7 = r5.p
            boolean r2 = r7 instanceof tb.cdr
            if (r2 == 0) goto L_0x003b
            tb.cdr r7 = (tb.cdr) r7
            r7.e1(r0)
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            boolean r7 = r5.i
            if (r7 != 0) goto L_0x0099
            boolean r7 = r6.landScape
            if (r7 == 0) goto L_0x0077
            boolean r7 = r6.publishCommentsUseMtop
            if (r7 == 0) goto L_0x0077
            boolean r7 = r6.fetchCommentsUseMtop
            if (r7 == 0) goto L_0x0077
            tb.ebt r7 = r5.o
            if (r7 == 0) goto L_0x0061
            tb.lat$a r8 = r5.q
            tb.ebt r7 = r7.i(r8)
            tb.ebt r7 = r7.n()
            tb.ebt r7 = r7.h()
            r7.e()
        L_0x0061:
            tb.n8e r7 = r5.d
            if (r7 == 0) goto L_0x0099
            if (r0 != 0) goto L_0x006b
            r7.r()
            goto L_0x0099
        L_0x006b:
            tb.ebt r8 = r5.o
            if (r8 == 0) goto L_0x0099
            com.taobao.alilive.aliliveframework.frame.BaseFrame r8 = r8.b()
            r7.E(r8, r6, r1)
            goto L_0x0099
        L_0x0077:
            tb.pat r7 = r5.n
            tb.lat r7 = r7.i()
            r7.e()
            tb.n8e r7 = r5.d
            if (r7 == 0) goto L_0x0099
            if (r0 == 0) goto L_0x0090
            tb.pat r8 = r5.n
            com.taobao.alilive.aliliveframework.frame.BaseFrame r8 = r8.b()
            r7.t(r8, r6, r1)
            goto L_0x0099
        L_0x0090:
            tb.pat r0 = r5.n
            com.taobao.alilive.aliliveframework.frame.BaseFrame r0 = r0.b()
            r7.k(r0, r6, r8)
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.t4l.s(com.taobao.taolive.sdk.model.common.VideoInfo, java.lang.String, java.lang.String):void");
    }

    public final void t(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47d4fafd", new Object[]{this, videoInfo});
            return;
        }
        sj9.D("showLive info.status " + videoInfo.status);
        if (e()) {
            return;
        }
        if (!videoInfo.landScape || videoInfo.fullScreen || !i()) {
            this.n.h().e();
            return;
        }
        if (this.o == null && pvs.V()) {
            this.o = new ebt(this.b, this.c, this.d, this.e, this.f, this.g, this.p, this.q);
        }
        ebt ebtVar = this.o;
        if (ebtVar != null) {
            ebtVar.i(this.q).m().h().e();
        }
    }

    public final void y(String str, VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5511abef", new Object[]{this, str, videoInfo});
        } else if (videoInfo != null) {
            this.k = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            int i = videoInfo.roomType;
            if (up6.w0(videoInfo, this.p)) {
                i = 13;
            }
            String str2 = "0";
            if (videoInfo.broadCaster != null) {
                hashMap.put("accountType", cxg.a(videoInfo.broadCaster.type) + "");
                hashMap.put(z9u.KEY_ACCOUNT_ID, videoInfo.broadCaster.accountId);
                hashMap.put(z9u.KEY_IS_FANS, videoInfo.broadCaster.follow ? "1" : str2);
            }
            ux9 ux9Var = this.p;
            haa q = ux9Var instanceof air ? ((air) ux9Var).j().k().q() : null;
            hashMap.put("feedId", videoInfo.liveId);
            hashMap.put("feed_id", videoInfo.liveId);
            hashMap.put(z9u.KEY_FEED_TYPE, videoInfo.type + "");
            if (q != null) {
                hashMap.put("from", q.E());
                hashMap.put("livesource", q.L());
                hashMap.put("trackInfo", q.H());
            }
            hashMap.put(yj4.PARAM_ENTRY_SOURCE, iba.q(vx9.f(this.p)));
            hashMap.put("roomtype2=", i + "");
            if (videoInfo.landScape) {
                str2 = "1";
            }
            hashMap.put("landscape", str2);
            hashMap.put("deviceLevel", xj7.a() + "");
            hashMap.put(yj4.PARAM_TRACK_LIVEOPRT_ID, up6.K(this.p));
            rbu.K(this.p, str, hashMap);
        }
    }

    public void z() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b012b3", new Object[]{this});
            return;
        }
        VideoInfo e2 = cxg.e(this.f);
        ux9 ux9Var = this.p;
        haa q = ux9Var instanceof air ? ((air) ux9Var).j().k().q() : null;
        if (e2 != null && e2.broadCaster != null && "1".equals(e2.roomStatus)) {
            int i = e2.roomType;
            if (up6.w0(e2, this.p)) {
                i = 13;
            }
            rbu.L(this.p, z9u.CALC_STAY_TIME, "duration=" + ((System.currentTimeMillis() - this.l) / 1000));
            if (q != null) {
                str = q.E();
            } else {
                str = "";
            }
            rbu.L(this.p, "TaoLiveLeave", "from=" + str, "livesource=" + iba.B(vx9.f(this.p)), "entrySource=" + iba.q(vx9.f(this.p)), "duration=" + (System.currentTimeMillis() - this.k), "deviceLevel=" + xj7.a(), "roomtype2=" + i, "feed_id=" + e2.liveId, "feedtype=" + e2.type);
        }
    }

    public void p(VideoInfo videoInfo, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9cf115b", new Object[]{this, videoInfo, str, str2, str3});
            return;
        }
        h(videoInfo);
        n8e n8eVar = this.d;
        if (n8eVar != null) {
            n8eVar.F(videoInfo, str, str2, str3);
        }
        int i = videoInfo.status;
        if (i == 0) {
            sj9.D("showLive info.status LIVE_STATUS_LIVE " + this.d);
        } else if (i == 3) {
            sj9.D("showLive info.status LIVE_STATUS_PAUSE " + this.d);
            rc.f(this.e, this.p);
        }
        o3s.b(PlayerController2.TAG, "showLive info.status " + videoInfo.status);
        t(videoInfo);
    }

    public void x() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e625511", new Object[]{this});
            return;
        }
        sjr.g().c(uyg.EVENT_GIFT_ROOM_SCREEN_ORIENTATION_CHANGED, "portrait", this.s);
        m09.e().j();
        VideoInfo e2 = cxg.e(this.f);
        if (e2 != null) {
            up6.O0(false, this.p);
            ux9 ux9Var = this.p;
            if (ux9Var != null) {
                ux9Var.c = false;
            }
            if (vc.a()) {
                k(false);
            }
            this.h.postDelayed(new b(), 300L);
            n8e n8eVar = this.d;
            if (n8eVar != null) {
                n8eVar.b();
            }
            if (e2.landScape && !this.m) {
                if (pvs.a3()) {
                    l(false);
                }
                if (!pvs.a3() || (viewGroup = this.c) == null) {
                    v(e2);
                } else {
                    viewGroup.post(new c(e2));
                }
            } else if (vc.i(this.e)) {
                u(e2);
            }
            e7w.b(this.p);
            e7w.c(this.p);
        }
    }

    public final void u(VideoInfo videoInfo) {
        pat patVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a711886e", new Object[]{this, videoInfo});
            return;
        }
        if ("1".equals(videoInfo.roomStatus)) {
            this.n.h().e();
            ux9 ux9Var = this.p;
            e7w.l(ux9Var, ux9Var.p(), this.f);
        } else if ("2".equals(videoInfo.roomStatus) && (patVar = this.n) != null) {
            patVar.i().e();
            ux9 ux9Var2 = this.p;
            if ((ux9Var2 instanceof cdr) && ((cdr) ux9Var2).Y0() && this.d != null) {
                o3s.b("OpenShowByStatus", "isHitReplayUpdate_showScreenFull_handleFullReplayPlayer");
                this.d.t(this.n.b(), videoInfo, true);
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        IInteractiveProxy.h hVar = this.r;
        if (hVar != null && hVar.d() != null) {
            this.r.c();
        }
    }

    public final void v(VideoInfo videoInfo) {
        ebt ebtVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc80b04a", new Object[]{this, videoInfo});
            return;
        }
        if ("1".equals(videoInfo.roomStatus)) {
            ebt ebtVar2 = this.o;
            if (ebtVar2 != null) {
                ebtVar2.i(this.q).m().h().e();
            }
            ux9 ux9Var = this.p;
            e7w.l(ux9Var, ux9Var.p(), this.f);
        } else if ("2".equals(videoInfo.roomStatus) && (ebtVar = this.o) != null) {
            ebtVar.i(this.q).n().h().e();
            ux9 ux9Var2 = this.p;
            if ((ux9Var2 instanceof cdr) && ((cdr) ux9Var2).Y0() && this.d != null) {
                o3s.b("OpenShowByStatus", "isHitReplayUpdate_showScreenHalf_handleFullReplayPlayer");
                this.d.E(this.o.b(), videoInfo, true);
            }
        }
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        IInteractiveProxy.h hVar = this.r;
        if (hVar != null && hVar.d() != null) {
            this.r.c();
        }
    }

    public void w() {
        ViewGroup viewGroup;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9069533", new Object[]{this});
            return;
        }
        sjr.g().c(uyg.EVENT_GIFT_ROOM_SCREEN_ORIENTATION_CHANGED, "landscape", this.s);
        m09.e().j();
        VideoInfo e2 = cxg.e(this.f);
        if (e2 != null) {
            up6.O0(true, this.p);
            ux9 ux9Var = this.p;
            if (ux9Var != null) {
                ux9Var.c = true;
            }
            sjr.g().d(FullScreenFrame.EVENT_DISABLE_LEFTRIGHT_SWITCH);
            if (!vc.a() || (!vc.i(this.e) && !vc.d(this.e))) {
                sjr.g().d("com.taobao.taolive.room.disable_updown_switch");
            } else {
                sjr.g().d("com.taobao.taolive.room.enable_updown_switch");
            }
            if (vc.a()) {
                k(true);
            }
            if ((e2.landScape && this.m) || vc.h(this.e)) {
                if (pvs.a3() && (!pvs.S() || (e2.landScape && this.m))) {
                    l(true);
                }
                if (!pvs.a3() || (viewGroup = this.c) == null) {
                    u(e2);
                } else {
                    viewGroup.post(new d(e2));
                }
                rbu.L(this.p, z9u.CROSS_SCREEN, new String[0]);
                if (!vc.h(this.e)) {
                    sjr.g().d("com.taobao.taolive.room.need_back");
                }
            }
            e7w.b(this.p);
            e7w.c(this.p);
        }
        n8e n8eVar = this.d;
        if (n8eVar != null) {
            n8eVar.q();
        }
        n8e n8eVar2 = this.d;
        if (n8eVar2 != null) {
            n8eVar2.q();
        }
    }
}
