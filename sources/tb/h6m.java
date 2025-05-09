package tb;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import anetwork.channel.monitor.NetworkQualityMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.framework.card.cards.video.layer.cover.VideoCoverImageView;
import com.taobao.android.fluid.framework.card.cards.video.manager.playhint.ProgressAnimationView;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class h6m implements trc, f9e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int p = (int) (akt.t2("ShortVideo.checkNetworkTaskDelay", 2.0f) * 1000.0f);
    public static final long q = akt.z2("ShortVideo.toastInterval", 120) * 1000;
    public static final boolean r = akt.p2("ShortVideo.showPoorNetworkToast", true);
    public static long s;

    /* renamed from: a  reason: collision with root package name */
    public final prp f20439a;
    public final ViewGroup b;
    public final ImageView c;
    public final View d;
    public TUrlImageView e;
    public ProgressAnimationView f;
    public atb g;
    public String h;
    public boolean i;
    public int k;
    public int l;
    public boolean j = true;
    public final Handler m = new a(Looper.getMainLooper());
    public int n = -1;
    public final int o = eps.o();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/card/cards/video/manager/playhint/PlayHintManager$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    h6m.d(h6m.this);
                }
            } else if (h6m.c(h6m.this, message.arg1, message.arg2)) {
                h6m.this.D();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            h6m.e(h6m.this);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            h6m.e(h6m.this);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (h6m.f(h6m.this) != null) {
                ir9.b("PlayHintManager", "hideEmptyIconHintView");
                ViewGroup viewGroup = (ViewGroup) h6m.f(h6m.this).getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(h6m.f(h6m.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(h6m h6mVar) {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (succPhenixEvent.getDrawable() instanceof cy0) {
                ((cy0) succPhenixEvent.getDrawable()).B(0);
            }
            return true;
        }
    }

    static {
        t2o.a(468714082);
        t2o.a(468714525);
        t2o.a(468714535);
    }

    public h6m(prp prpVar, ViewGroup viewGroup, ImageView imageView, View view) {
        this.b = viewGroup;
        this.c = imageView;
        this.f20439a = prpVar;
        if (imageView instanceof TUrlImageView) {
            ((TUrlImageView) imageView).succListener(new b());
        } else if (imageView instanceof VideoCoverImageView) {
            ((VideoCoverImageView) imageView).succListener(new c());
        }
        this.d = view;
        v(prpVar, viewGroup);
        q(prpVar);
    }

    public static /* synthetic */ boolean c(h6m h6mVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ff9d874", new Object[]{h6mVar, new Integer(i), new Integer(i2)})).booleanValue();
        }
        return h6mVar.h(i, i2);
    }

    public static /* synthetic */ void d(h6m h6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f359891", new Object[]{h6mVar});
        } else {
            h6mVar.g();
        }
    }

    public static /* synthetic */ void e(h6m h6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64e0f512", new Object[]{h6mVar});
        } else {
            h6mVar.l();
        }
    }

    public static /* synthetic */ TUrlImageView f(h6m h6mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("3cd7789", new Object[]{h6mVar});
        }
        return h6mVar.e;
    }

    public final void F(boolean z, boolean z2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("730c9b0", new Object[]{this, new Boolean(z), new Boolean(z2)});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - s > q) {
            if (z) {
                i = R.string.fluid_sdk_error_network_hint;
            } else if (z2 && r) {
                i = R.string.fluid_sdk_poor_network_hint;
            }
            if (i != 0) {
                h1u.a(p91.a(), p91.a().getString(i));
                s = currentTimeMillis;
            }
        }
    }

    public final void G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef32437", new Object[]{this});
        } else {
            h1u.a(p91.a(), p91.a().getString(R.string.fluid_sdk_error_video_common_hint));
        }
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65a66408", new Object[]{this});
            return;
        }
        if (this.f == null) {
            this.f = new ProgressAnimationView(this.b.getContext());
        }
        if (!this.f.isVisible()) {
            ir9.b("PlayHintManager", "showSeekHintView");
            this.f.showProgressAnimation(this.d);
            M();
        }
    }

    public final void I(atb atbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d31f6e", new Object[]{this, atbVar, str});
            return;
        }
        ir9.b("PlayHintManager", "startMonitor:" + str);
        this.g = atbVar;
        this.h = str;
        m();
        y();
        int i = this.o;
        if (i > 0) {
            x(i);
        } else {
            g();
        }
    }

    public final void M() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94b26696", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("videoId", this.h);
        hashMap.put("netSpeed", String.valueOf(NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth()));
        int i = this.k;
        if (i > 0) {
            hashMap.put("errorCode", String.valueOf(i));
            hashMap.put("errorExtra", String.valueOf(this.l));
        }
        if (!gwj.e(this.b.getContext())) {
            str = "noNetwork";
        } else {
            str = gwj.d(this.b.getContext());
        }
        hashMap.put("networkType", str);
        hashMap.put("networkQuality", String.valueOf(NetworkQualityMonitor.getGlobalNetworkQuality()));
        FluidSDK.getUTAdapter().trackCustom("Page_videointeract", 19997, "playhint", "", "", hashMap);
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0d048d7", new Object[]{this});
        } else if (o()) {
            A();
        }
    }

    public final boolean h(int i, int i2) {
        boolean z;
        boolean z2;
        atb atbVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("298e08f8", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        boolean e2 = gwj.e(this.b.getContext());
        boolean z3 = !e2;
        int globalNetworkQuality = NetworkQualityMonitor.getGlobalNetworkQuality();
        if (globalNetworkQuality == 1) {
            z = true;
        } else {
            z = false;
        }
        ir9.b("PlayHintManager", "checkLoadingHintStatus, noNetwork: " + z3 + " quality:" + globalNetworkQuality + " bandwidth:" + NetworkQualityMonitor.getInstance().getGlobalCurrentBandwidth() + " errorCode:" + i + " extra:" + i2);
        if (!akt.p2("ShortVideo.checkPlayError", true) || i == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean p2 = akt.p2("ShortVideo.checkPlayDelay", true);
        if ((e2 && !z && !z2 && !p2) || (atbVar = this.g) == null || atbVar.getVideoState() == 2) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bddabd1d", new Object[]{this})).booleanValue();
        }
        return akt.p2("ShortVideo.checkPositionChange", true);
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bc492b7", new Object[]{this});
            return;
        }
        TUrlImageView tUrlImageView = this.e;
        if (tUrlImageView != null && tUrlImageView.getParent() != null) {
            ir9.b("PlayHintManager", "hideEmptyIconHintView");
            nwv.y0(new d());
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21263c4d", new Object[]{this});
            return;
        }
        ProgressAnimationView progressAnimationView = this.f;
        if (progressAnimationView != null && progressAnimationView.isVisible()) {
            ir9.b("PlayHintManager", "hideSeekHintView");
            this.f.hideProgressAnimation();
        }
    }

    public final boolean o() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9c736fe", new Object[]{this})).booleanValue();
        }
        ImageView imageView = this.c;
        if (imageView == null || imageView.getDrawable() == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.i;
        if (!z || z2) {
            return false;
        }
        return true;
    }

    @Override // tb.trc
    public void onDataUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18deb5ea", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onLoopCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a263b7", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onPauseMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460321a5", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onPreCompletion(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b35d58", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onRecyclePlayer(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b871be7", new Object[]{this, uq9Var, new Boolean(z)});
        }
    }

    @Override // tb.trc
    public void onRequestMediaPlayer(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac0a2eed", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onShowCover(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86b0cef3", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.trc
    public void onShowFirstCover(uq9 uq9Var, int i, int i2, Drawable drawable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e7e3629", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), drawable, str});
        }
    }

    @Override // tb.trc
    public void onStartMedia(uq9 uq9Var, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b4fe1f9", new Object[]{this, uq9Var, new Boolean(z), new Boolean(z2)});
        } else {
            I(this.f20439a.getDWInstance(), this.f20439a.H1());
        }
    }

    @Override // tb.trc
    public void onStopMedia(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd05673b", new Object[]{this, uq9Var});
        } else {
            J(this.f20439a.getDWInstance());
        }
    }

    @Override // tb.trc
    public void onUTPairsUpdate(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55533c7c", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoClose(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b040494", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoComplete(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8488480d", new Object[]{this, uq9Var});
        }
    }

    @Override // tb.f9e
    public void onVideoInfo(uq9 uq9Var, Object obj, long j, long j2, long j3, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da67d842", new Object[]{this, uq9Var, obj, new Long(j), new Long(j2), new Long(j3), obj2});
        }
    }

    @Override // tb.f9e
    public void onVideoPause(uq9 uq9Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15aa0002", new Object[]{this, uq9Var, new Boolean(z)});
            return;
        }
        ir9.b("PlayHintManager", "onVideoPause");
        m();
        l();
    }

    @Override // tb.f9e
    public void onVideoPlay(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1229548", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("PlayHintManager", "onVideoPlay");
        y();
    }

    @Override // tb.f9e
    public void onVideoPrepared(uq9 uq9Var, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2371c7ad", new Object[]{this, uq9Var, obj});
        }
    }

    @Override // tb.f9e
    public void onVideoScreenChanged(uq9 uq9Var, DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b0fc2b5", new Object[]{this, uq9Var, dWVideoScreenType});
        }
    }

    @Override // tb.f9e
    public void onVideoSeekTo(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("160bdd7c", new Object[]{this, uq9Var, new Integer(i)});
            return;
        }
        ir9.b("PlayHintManager", "onVideoSeekTo " + i);
        y();
    }

    @Override // tb.f9e
    public void onVideoStateChanged(uq9 uq9Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b4492ac", new Object[]{this, uq9Var, new Integer(i)});
        }
    }

    public final void q(prp prpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85cae6b3", new Object[]{this, prpVar});
        } else {
            prpVar.E0().addMediaLifecycleListener(this);
        }
    }

    public final void v(prp prpVar, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8894863", new Object[]{this, prpVar, viewGroup});
        } else {
            prpVar.F0().addVideoPlayerListener(this);
        }
    }

    public final void x(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a02f59b", new Object[]{this, new Integer(i)});
            return;
        }
        this.m.removeMessages(1);
        this.m.sendEmptyMessageDelayed(1, i);
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cc270ce", new Object[]{this});
            return;
        }
        this.m.removeMessages(0);
        if (this.g != null) {
            this.m.sendEmptyMessageDelayed(0, p);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d35f07dc", new Object[]{this});
        } else if (!p91.l()) {
            if (this.e == null) {
                TUrlImageView tUrlImageView = new TUrlImageView(this.b.getContext());
                this.e = tUrlImageView;
                tUrlImageView.setSkipAutoSize(true);
                this.e.setImageUrl(uuo.p("videosdk_error_loading_icon.apng"));
                this.e.succListener(new e(this));
            }
            if (this.e.getParent() != null) {
                ((ViewGroup) this.e.getParent()).removeView(this.e);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(b65.a(54.0f), b65.a(43.5f));
            layoutParams.gravity = 17;
            this.b.addView(this.e, layoutParams);
            ir9.b("PlayHintManager", "showEmptyIconHintView");
        }
    }

    @Override // tb.f9e
    public void onVideoError(uq9 uq9Var, Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bdec3e0", new Object[]{this, uq9Var, obj, new Integer(i), new Integer(i2)});
            return;
        }
        ir9.b("PlayHintManager", "onVideoError, code:" + i + " extra:" + i2);
        this.k = i;
        this.l = i2;
        this.m.removeCallbacksAndMessages(null);
        if (this.g != null) {
            Message.obtain(this.m, 0, i, i2).sendToTarget();
        }
        if (this.j) {
            this.j = false;
        } else if (gwj.e(this.b.getContext())) {
            G();
        }
    }

    @Override // tb.f9e
    public void onVideoStart(uq9 uq9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8634a87e", new Object[]{this, uq9Var});
            return;
        }
        ir9.b("PlayHintManager", "onVideoStart");
        this.i = true;
    }

    public void D() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("285d82bf", new Object[]{this});
            return;
        }
        ir9.b("PlayHintManager", "showLoadingHintStatus");
        boolean z2 = !gwj.e(this.b.getContext());
        if (NetworkQualityMonitor.getGlobalNetworkQuality() == 1) {
            z = true;
        }
        F(z2, z);
        H();
    }

    public final void J(atb atbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386aa44", new Object[]{this, atbVar});
            return;
        }
        ir9.b("PlayHintManager", "stopMonitor");
        this.g = null;
        this.j = true;
        this.i = false;
        this.k = 0;
        this.l = 0;
        m();
        this.m.removeCallbacksAndMessages(null);
    }

    @Override // tb.f9e
    public void onVideoProgressChanged(uq9 uq9Var, int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d709a20", new Object[]{this, uq9Var, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        this.k = 0;
        this.l = 0;
        this.i = true;
        if (i != this.n || !i()) {
            y();
            m();
            l();
        } else {
            ir9.b("PlayHintManager", "position not changed");
        }
        this.n = i;
    }
}
