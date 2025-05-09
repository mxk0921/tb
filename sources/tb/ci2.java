package tb;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.BootImageDataMgr;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.phenix.intf.PhenixCreator;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.rib;
import tb.yfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ci2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BootImageInfo f17069a;
    public final rib b;
    public int c;
    public rib.a.b d;
    public int e;
    public String g = "ColdStart";
    public int h = 200;
    public final epo i = new a(Looper.getMainLooper());
    public final wzi f = usg.d().e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends epo {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/arch/flow/view/BootImagePresenter$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (message.what == 1002) {
                tm1.a("2ARCH_Presenter", "handleMessage: 跳过点击");
                ci2.a(ci2.this, 201);
                ci2.this.m(wzi.EXPOSE_SUCCESS, null);
                ci2.b(ci2.this);
            }
            if (message.what == 1000) {
                ci2.e(ci2.this);
                ci2.f(ci2.this).currentCountdownTime = ci2.d(ci2.this);
                ci2 ci2Var = ci2.this;
                ci2.g(ci2Var, String.valueOf(ci2.d(ci2Var)));
                if (ci2.d(ci2.this) < 1) {
                    tm1.a("2ARCH_Presenter", "handleMessage: 倒计时结束");
                    ci2.a(ci2.this, 200);
                    ci2.this.m(wzi.EXPOSE_SUCCESS, null);
                    ci2.b(ci2.this);
                    return;
                }
                sendEmptyMessageDelayed(1000, 1000L);
            }
            if (message.what == 1001) {
                ci2.h(ci2.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            tm1.a("2ARCH_Presenter", "loadFirstFrameImage success: ");
            ci2.i(ci2.this).j(succPhenixEvent.getDrawable());
            ci2.j(ci2.this);
            ci2.k(ci2.this);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            tm1.a("2ARCH_Presenter", "onClick: skip");
            ci2.a(ci2.this, 201);
            ci2.c(ci2.this).sendEmptyMessage(1002);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f17073a;

        public e(boolean z) {
            this.f17073a = z;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            tm1.a("2ARCH_Presenter", "loadDefaultImage success playVideo: " + this.f17073a);
            ci2.i(ci2.this).b(succPhenixEvent.getDrawable());
            ci2.j(ci2.this);
            ci2.k(ci2.this);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class f implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rib.a.AbstractC1047a f17074a;

        public f(rib.a.AbstractC1047a aVar) {
            this.f17074a = aVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            tm1.a("2ARCH_Presenter", "loadDefaultImage fail: " + failPhenixEvent.getResultCode());
            ci2.a(ci2.this, 203);
            ci2.b(ci2.this);
            ((zx4) this.f17074a).g("loadDefaultImage fail");
            return false;
        }
    }

    static {
        t2o.a(736100426);
    }

    public ci2(BootImageInfo bootImageInfo, rib ribVar) {
        this.f17069a = bootImageInfo;
        this.b = ribVar;
        tm1.a("2ARCH_Presenter", "BootImagePresenter data: " + bootImageInfo.toString());
    }

    public static /* synthetic */ int a(ci2 ci2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("891cc3f6", new Object[]{ci2Var, new Integer(i)})).intValue();
        }
        ci2Var.h = i;
        return i;
    }

    public static /* synthetic */ void b(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2839d23f", new Object[]{ci2Var});
        } else {
            ci2Var.s();
        }
    }

    public static /* synthetic */ epo c(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (epo) ipChange.ipc$dispatch("328d250d", new Object[]{ci2Var});
        }
        return ci2Var.i;
    }

    public static /* synthetic */ int d(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1bc95673", new Object[]{ci2Var})).intValue();
        }
        return ci2Var.c;
    }

    public static /* synthetic */ int e(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b007c612", new Object[]{ci2Var})).intValue();
        }
        int i = ci2Var.c;
        ci2Var.c = i - 1;
        return i;
    }

    public static /* synthetic */ BootImageInfo f(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInfo) ipChange.ipc$dispatch("d9123767", new Object[]{ci2Var});
        }
        return ci2Var.f17069a;
    }

    public static /* synthetic */ void g(ci2 ci2Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71488c4c", new Object[]{ci2Var, str});
        } else {
            ci2Var.A(str);
        }
    }

    public static /* synthetic */ void h(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f677e343", new Object[]{ci2Var});
        } else {
            ci2Var.z();
        }
    }

    public static /* synthetic */ rib i(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rib) ipChange.ipc$dispatch("fbe2b47f", new Object[]{ci2Var});
        }
        return ci2Var.b;
    }

    public static /* synthetic */ void j(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd96ebc5", new Object[]{ci2Var});
        } else {
            ci2Var.t();
        }
    }

    public static /* synthetic */ void k(ci2 ci2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1267006", new Object[]{ci2Var});
        } else {
            ci2Var.E();
        }
    }

    public static /* synthetic */ void l(ci2 ci2Var, rib.a.AbstractC1047a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99c10f40", new Object[]{ci2Var, aVar, new Boolean(z)});
        } else {
            ci2Var.p(aVar, z);
        }
    }

    public final void A(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1536436d", new Object[]{this, str});
            return;
        }
        tm1.a("2ARCH_Presenter", "setCountDownText: ");
        this.b.p(str);
    }

    public void B(rib.a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c2ac80d", new Object[]{this, bVar});
            return;
        }
        this.d = bVar;
        t();
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5fbedc", new Object[]{this});
        } else {
            this.b.e(new d());
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ff6ecf", new Object[]{this});
            return;
        }
        BootImageInfo bootImageInfo = this.f17069a;
        if (!bootImageInfo.hideTBLogo && ph2.d(bootImageInfo.bizType)) {
            this.b.i();
        }
        if (ph2.b(this.f17069a.bizType)) {
            this.b.m();
        }
        if (ph2.c(this.f17069a.bizType)) {
            this.b.f();
        }
        if (ph2.e(this.f17069a.bizType)) {
            this.b.h();
        }
    }

    public final void E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3ad916", new Object[]{this});
            return;
        }
        this.c = this.f17069a.waitTime;
        C();
        tm1.a("2ARCH_Presenter", "startCountDown: " + this.c);
        this.b.p(String.valueOf(this.c));
        this.i.sendEmptyMessageDelayed(1000, 1000L);
    }

    public void m(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9057d33e", new Object[]{this, str, str2});
            return;
        }
        wzi wziVar = this.f;
        BootImageInfo bootImageInfo = this.f17069a;
        wziVar.d(bootImageInfo.sceneType, this.g, str, bootImageInfo.bizType, str2, null);
    }

    public int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df9c6d16", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public final void p(rib.a.AbstractC1047a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87293b20", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        tm1.a("2ARCH_Presenter", "loadDefaultImage: " + this.f17069a.imgUrl);
        r(this.f17069a.imgUrl, new e(z), new f(aVar));
    }

    public final void q(rib.a.AbstractC1047a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b36bfbdc", new Object[]{this, aVar});
            return;
        }
        tm1.a("2ARCH_Presenter", "loadFirstFrameImage: " + this.f17069a.firstFrameImageUrl);
        r(this.f17069a.firstFrameImageUrl, new b(), new c(aVar));
    }

    public final void r(String str, s8d<SuccPhenixEvent> s8dVar, s8d<FailPhenixEvent> s8dVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10c5ccac", new Object[]{this, str, s8dVar, s8dVar2});
            return;
        }
        String g = k9h.g(str);
        tm1.a("2ARCH_Presenter", "loadImage originalUrl:" + str + ",suffixImageUrl: " + g);
        if (!TextUtils.isEmpty(g)) {
            str = g;
        }
        PhenixCreator U = s0m.B().U(BootImageDataMgr.IMAGE_MODULE_NAME, str);
        U.onlyCache();
        U.succListener(s8dVar);
        U.failListener(s8dVar2);
        U.fetch();
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225ba19f", new Object[]{this});
            return;
        }
        x();
        this.b.a();
        rib.a.b bVar = this.d;
        if (bVar != null) {
            ((yfw.a) bVar).a();
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f9408b2", new Object[]{this});
            return;
        }
        D();
        this.b.d();
        if (this.e == 0) {
            tm1.a("2ARCH_Presenter", "notifyViewShow playVideo: ");
            y();
        }
    }

    public void u(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81d14c9", new Object[]{this, str});
            return;
        }
        tm1.a("2ARCH_Presenter", "show video: onComplete:" + System.currentTimeMillis());
        m(str, null);
    }

    public void v(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("789a771a", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        this.b.n();
        tm1.a("2ARCH_Presenter", "onError: what " + i + " , extra " + i2);
        m(str, String.valueOf(i));
    }

    public void w(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df8b6b3", new Object[]{this, str});
            return;
        }
        BootImageInfo bootImageInfo = this.f17069a;
        long j = bootImageInfo == null ? 1000L : bootImageInfo.removeBGDelayMs;
        tm1.a("2ARCH_Presenter", "show video: on started:" + j);
        this.i.sendEmptyMessageDelayed(1001, j);
        m(str, null);
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea470ec9", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_Presenter", "onTerminate: ");
        this.i.removeCallbacksAndMessages(null);
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_Presenter", "playVideo: ");
        this.b.playVideo();
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27484d21", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_Presenter", "removeFirstImage: ");
        if (this.h == 204) {
            tm1.a("2ARCH_Presenter", "LOAD_VIDEO_FAIL not removeFirstImage: ");
        } else {
            this.b.k();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ rib.a.AbstractC1047a f17071a;

        public c(rib.a.AbstractC1047a aVar) {
            this.f17071a = aVar;
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            tm1.a("2ARCH_Presenter", "loadFirstFrameImage fail: ");
            ci2.l(ci2.this, this.f17071a, true);
            return false;
        }
    }

    public ei2 n(Activity activity, int i, rib.a.AbstractC1047a aVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ei2) ipChange.ipc$dispatch("66f79de5", new Object[]{this, activity, new Integer(i), aVar});
        }
        if (i == 1000) {
            str = "ColdStart";
        } else {
            str = "HotStart";
        }
        this.g = str;
        if (activity == null) {
            this.h = 202;
            m(wzi.EXPOSE_ERROR, "activity null");
            return new ei2();
        }
        ei2 g = this.b.g(activity);
        if (g == null) {
            this.h = 202;
            m(wzi.EXPOSE_ERROR, "baseView null");
            return new ei2();
        } else if (TextUtils.isEmpty(this.f17069a.bizType)) {
            m(wzi.EXPOSE_ERROR, "bizType null");
            this.h = 202;
            return new ei2();
        } else {
            int l = ph2.l(this.f17069a.bizType);
            this.e = l;
            if (l == 2) {
                tm1.a("2ARCH_Presenter", "createView: OTHER");
                m(wzi.EXPOSE_ERROR, "viewType Other error");
                return new ei2();
            } else if (l == 1) {
                tm1.a("2ARCH_Presenter", "createView: IMAGE");
                if (!k9h.b(this.f17069a.imgUrl)) {
                    this.h = 203;
                    return new ei2();
                }
                p(aVar, false);
                return g;
            } else {
                if (l == 0) {
                    tm1.a("2ARCH_Presenter", "createView: VIDEO");
                    if (k9h.b(this.f17069a.imgUrl) || k9h.b(this.f17069a.firstFrameImageUrl)) {
                        q(aVar);
                        if (TextUtils.isEmpty(this.f17069a.videoUrl)) {
                            tm1.a("2ARCH_Presenter", "createView: videoUrl null loadFirstFrame");
                            return g;
                        }
                        rib ribVar = this.b;
                        BootImageInfo bootImageInfo = this.f17069a;
                        if (!ribVar.c(bootImageInfo.videoUrl, bootImageInfo.haveVoice)) {
                            this.h = 204;
                        }
                    } else {
                        this.h = 203;
                        return new ei2();
                    }
                }
                return g;
            }
        }
    }
}
