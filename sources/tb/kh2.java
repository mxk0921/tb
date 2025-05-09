package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.bootimage.arch.flow.view.SkipStyle;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.popupcenter.strategy.PopStrategy;
import com.taobao.taobao.R;
import com.taobao.taobaoavsdk.widget.media.TaoLiveVideoView;
import com.uc.webview.export.media.MessageID;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.rib;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class kh2 implements rib, rib.a, xad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ImageView f22659a;
    public ViewGroup b;
    public TextView c;
    public TextView d;
    public ci2 e;
    public View f;
    public RelativeLayout g;
    public ImageView h;
    public ImageView i;
    public TextView j;
    public ImageView k;
    public RelativeLayout l;
    public TaoLiveVideoView m;
    public View n;
    public boolean o;
    public ei2 p;
    public BootImageInfo q;
    public FrameLayout r;
    public ViewGroup s;
    public s t;
    public final AtomicBoolean u = new AtomicBoolean(false);
    public final AtomicBoolean v = new AtomicBoolean(false);
    public final IMediaPlayer.OnInfoListener w = new a();
    public final IMediaPlayer.OnErrorListener x = new b();
    public final IMediaPlayer.OnCompletionListener y = new IMediaPlayer.OnCompletionListener() { // from class: tb.jh2
        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener
        public final void onCompletion(IMediaPlayer iMediaPlayer) {
            kh2.this.J(iMediaPlayer);
        }
    };
    public final asc z = new c();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements IMediaPlayer.OnInfoListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("db02504e", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            if (j == 3) {
                tm1.a("2ARCH_BootImageBaseView", "MEDIA_INFO_VIDEO_RENDERING_START:");
                kh2.r(kh2.this).w(wzi.VIDEO_PLAY_START);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements IMediaPlayer.OnErrorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c383d1b6", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            tm1.a("2ARCH_BootImageBaseView", "onError");
            kh2.r(kh2.this).v(wzi.VIDEO_PLAY_START, i, i2);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
            } else {
                kh2.r(kh2.this).v(wzi.VIDEO_NEW_PLAY_START, i, i2);
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            } else {
                tm1.a("2ARCH_BootImageBaseView", "new player show video: onMediaPlay");
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            } else if (!kh2.t(kh2.this).get()) {
                kh2.t(kh2.this).set(true);
                tm1.a("2ARCH_BootImageBaseView", "new player show video: onComplete:");
                kh2.r(kh2.this).u(wzi.VIDEO_NEW_PLAY_SUCCESS);
            }
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            } else if (j == 3 && !kh2.s(kh2.this).get()) {
                kh2.s(kh2.this).set(true);
                tm1.a("2ARCH_BootImageBaseView", "new player show video: on started");
                kh2.r(kh2.this).w(wzi.VIDEO_NEW_PLAY_START);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/bootimage/arch/flow/view/BootImageBaseView$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            if (kh2.u(kh2.this) != null) {
                kh2.u(kh2.this).setAlpha(1.0f);
            }
            if (kh2.v(kh2.this) != null) {
                kh2.v(kh2.this).setVisibility(8);
            }
        }
    }

    static {
        t2o.a(736100421);
        t2o.a(736100434);
        t2o.a(736100435);
    }

    public static /* synthetic */ ci2 r(kh2 kh2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ci2) ipChange.ipc$dispatch("8d5a4189", new Object[]{kh2Var});
        }
        return kh2Var.e;
    }

    public static /* synthetic */ AtomicBoolean s(kh2 kh2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("38e88073", new Object[]{kh2Var});
        }
        return kh2Var.u;
    }

    public static /* synthetic */ AtomicBoolean t(kh2 kh2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("624ff952", new Object[]{kh2Var});
        }
        return kh2Var.v;
    }

    public static /* synthetic */ View u(kh2 kh2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fa531833", new Object[]{kh2Var});
        }
        return kh2Var.n;
    }

    public static /* synthetic */ ImageView v(kh2 kh2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageView) ipChange.ipc$dispatch("c51b6fc0", new Object[]{kh2Var});
        }
        return kh2Var.f22659a;
    }

    public ei2 A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ei2) ipChange.ipc$dispatch("1fa7b3f5", new Object[]{this});
        }
        return this.p;
    }

    public int B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df9c6d16", new Object[]{this})).intValue();
        }
        ci2 ci2Var = this.e;
        if (ci2Var == null) {
            return 205;
        }
        return ci2Var.o();
    }

    public final int D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("55a7a775", new Object[]{this})).intValue();
        }
        TaoLiveVideoView taoLiveVideoView = this.m;
        if (taoLiveVideoView == null) {
            tm1.a("2ARCH_BootImageBaseView", "getSeekTime videoView null");
            return 0;
        }
        int currentPosition = taoLiveVideoView.getCurrentPosition();
        if (currentPosition != 0 || this.m.isPlaying()) {
            tm1.a("2ARCH_BootImageBaseView", "getSeekTime state error:" + this.m.isPlaying());
            return currentPosition;
        }
        int duration = this.m.getDuration();
        tm1.a("2ARCH_BootImageBaseView", "getSeekTime mPlayService duration:" + duration);
        return duration;
    }

    public final List<q5d> E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8bb14dcd", new Object[]{this});
        }
        tm1.a("2ARCH_BootImageBaseView", "pageBizCallback  getPageBizCallback");
        return usg.d().b().h();
    }

    public final FrameLayout F(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6ca82ccb", new Object[]{this, activity});
        }
        tm1.a("2ARCH_BootImageBaseView", "getRootFrame: ");
        View findViewById = activity.findViewById(16908290);
        while (true) {
            ViewParent parent = findViewById.getParent();
            if (!(parent instanceof View)) {
                break;
            }
            findViewById = (ViewGroup) parent;
        }
        if (findViewById instanceof FrameLayout) {
            return (FrameLayout) findViewById;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        this.s = viewGroup;
        View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
        if (!(childAt instanceof FrameLayout)) {
            childAt = new FrameLayout(activity);
            this.s.addView(childAt, new ViewGroup.LayoutParams(-1, -1));
        }
        return (FrameLayout) childAt;
    }

    public int G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("758475d5", new Object[]{this})).intValue();
        }
        if (nh2.h()) {
            return C();
        }
        return D();
    }

    public final /* synthetic */ void J(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5856e2f8", new Object[]{this, iMediaPlayer});
            return;
        }
        tm1.a("2ARCH_BootImageBaseView", MessageID.onCompletion);
        this.e.u(wzi.VIDEO_PLAY_SUCCESS);
    }

    public ei2 K(Activity activity, BootImageInfo bootImageInfo, int i, rib.a.AbstractC1047a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ei2) ipChange.ipc$dispatch("e624298c", new Object[]{this, activity, bootImageInfo, new Integer(i), aVar});
        }
        this.q = bootImageInfo;
        ci2 ci2Var = new ci2(bootImageInfo, this);
        this.e = ci2Var;
        this.p = ci2Var.n(activity, i, aVar);
        for (q5d q5dVar : E()) {
            q5dVar.onCreate();
        }
        return this.p;
    }

    public void L() {
        Object obj;
        FrameLayout frameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("225ba19f", new Object[]{this});
            return;
        }
        nh2.n("");
        ci2 ci2Var = this.e;
        if (ci2Var != null) {
            ci2Var.x();
            StringBuilder sb = new StringBuilder("notifyTerminate: ");
            ci2 ci2Var2 = this.e;
            if (ci2Var2 != null) {
                obj = Integer.valueOf(ci2Var2.o());
            } else {
                obj = "bootImagePresenter=null";
            }
            sb.append(obj);
            tm1.a("2ARCH_BootImageBaseView", sb.toString());
            z();
            View view = this.f;
            if (view != null) {
                view.setVisibility(8);
            }
            R();
            if (!nh2.g() && (frameLayout = this.r) != null) {
                try {
                    View view2 = this.f;
                    if (!(view2 == null || frameLayout.indexOfChild(view2) == -1)) {
                        tm1.a("2ARCH_BootImageBaseView", "notifyTerminate rootView remove baseView: ");
                        this.r.removeView(this.f);
                    }
                    ViewGroup viewGroup = this.s;
                    if (!(viewGroup == null || viewGroup.indexOfChild(this.r) == -1)) {
                        tm1.a("2ARCH_BootImageBaseView", "notifyTerminate decorRootView remove rootView: ");
                        this.s.removeView(this.r);
                    }
                    this.r = null;
                    tm1.a("2ARCH_BootImageBaseView", "notifyTerminate rootView set null: ");
                } catch (Exception e) {
                    tm1.b("2ARCH_BootImageBaseView", "notifyTerminate remove error : ", e);
                }
            }
        }
    }

    public void M(rib.a.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ff4e2c3", new Object[]{this, bVar});
            return;
        }
        x();
        this.e.B(bVar);
        nh2.n(this.q.sceneType);
        for (q5d q5dVar : E()) {
            q5dVar.a(this.q.sceneType);
        }
    }

    public final void N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58c638ae", new Object[]{this});
            return;
        }
        s sVar = this.t;
        if (sVar != null) {
            long m = sVar.m(1500);
            tm1.a("2ARCH_BootImageBaseView", "new player playVideo.videoState: " + m);
            if (m != 1) {
                tm1.a("2ARCH_BootImageBaseView", "new player playVideo.start: ");
                this.t.F();
            }
        }
    }

    public final void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702b8075", new Object[]{this});
        } else if (this.m != null) {
            tm1.a("2ARCH_BootImageBaseView", "PlayService.start: ");
            this.m.start();
        }
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc2d4fe1", new Object[]{this});
            return;
        }
        if (this.t != null) {
            tm1.a("2ARCH_BootImageBaseView", "new player releasePlayService:");
            this.t.h();
            this.t = null;
        }
        if (this.n != null) {
            this.n = null;
        }
    }

    public final void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f39297a8", new Object[]{this});
            return;
        }
        TaoLiveVideoView taoLiveVideoView = this.m;
        if (taoLiveVideoView != null) {
            taoLiveVideoView.release();
            this.m = null;
        }
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3ac5de1", new Object[]{this});
        } else if (nh2.h()) {
            P();
        } else {
            Q();
        }
    }

    @Override // tb.rib
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("637e8bf9", new Object[]{this});
            return;
        }
        RelativeLayout relativeLayout = this.g;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
    }

    @Override // tb.rib
    public void b(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c30a5c", new Object[]{this, bitmapDrawable});
        } else if (this.f22659a != null) {
            tm1.a("2ARCH_BootImageBaseView", "loadDefaultImage: ");
            this.f22659a.setImageDrawable(bitmapDrawable);
        }
    }

    @Override // tb.rib
    public boolean c(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98d66dd7", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        tm1.a("2ARCH_BootImageBaseView", "initVideoView: ");
        String h = ph2.h(this.q.sceneType, str);
        if (TextUtils.isEmpty(h)) {
            tm1.a("2ARCH_BootImageBaseView", "initPlayService localVideoPath null, videoUrl =" + str);
            return false;
        }
        tm1.a("2ARCH_BootImageBaseView", "initPlayService file.getAbsolutePath(): " + h);
        if (nh2.h()) {
            return H(h, z);
        }
        return I(h, z);
    }

    @Override // tb.rib
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ab35b86", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // tb.rib
    public void e(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a8942a8", new Object[]{this, onClickListener});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(onClickListener);
        }
    }

    @Override // tb.rib
    public ei2 g(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ei2) ipChange.ipc$dispatch("3a597b98", new Object[]{this, activity});
        }
        w();
        this.r = F(activity);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.bootimage_base, (ViewGroup) this.r, false);
        this.f = inflate;
        this.b = (ViewGroup) inflate.findViewById(R.id.ll_close);
        this.d = (TextView) this.f.findViewById(R.id.tv_countdown);
        this.c = (TextView) this.f.findViewById(R.id.tv_close);
        this.f22659a = (ImageView) this.f.findViewById(R.id.iv_main);
        this.g = (RelativeLayout) this.f.findViewById(R.id.rv_title);
        ViewGroup viewGroup = (ViewGroup) this.f.findViewById(R.id.fl_animation_view);
        this.l = (RelativeLayout) this.f.findViewById(R.id.ll_container);
        this.h = (ImageView) this.f.findViewById(R.id.iv_left_top_tb_logo);
        this.i = (ImageView) this.f.findViewById(R.id.iv_ipv6_logo);
        this.k = (ImageView) this.f.findViewById(R.id.iv_bottom_tb_logo);
        this.j = (TextView) this.f.findViewById(R.id.tv_wifi_loaded);
        x();
        this.r.addView(this.f);
        this.f.setVisibility(8);
        return new ei2(this.f22659a, viewGroup, this.g, this.k, this.f.findViewById(R.id.iv_bg_view));
    }

    @Override // tb.rib
    public void j(BitmapDrawable bitmapDrawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bfa7a5b4", new Object[]{this, bitmapDrawable});
        } else if (this.f22659a != null) {
            tm1.a("2ARCH_BootImageBaseView", "loadFirstFrameImage: ");
            this.f22659a.setImageDrawable(bitmapDrawable);
        }
    }

    @Override // tb.rib
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27484d21", new Object[]{this});
        } else {
            y();
        }
    }

    @Override // tb.xad
    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea8707e9", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.xad
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f996fc7", new Object[]{this});
        }
        return PopStrategy.IDENTIFIER_SPLASH;
    }

    @Override // tb.rib
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fe590d", new Object[]{this, str});
            return;
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // tb.rib
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_BootImageBaseView", "PlayService.playVideo: ");
        if (nh2.h()) {
            N();
        } else {
            O();
        }
    }

    public final void x() {
        BootImageInfo bootImageInfo;
        SkipStyle skipStyle;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691fe2d7", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.b;
        if (viewGroup != null && this.c != null && this.d != null && (bootImageInfo = this.q) != null && (skipStyle = bootImageInfo.skipStyle) != null) {
            if (skipStyle.isHide) {
                viewGroup.setVisibility(8);
                return;
            }
            int i = skipStyle.background;
            if (i != -1) {
                viewGroup.setBackgroundResource(i);
            }
            if (!TextUtils.isEmpty(skipStyle.skipText)) {
                this.c.setText(skipStyle.skipText);
            }
            int i2 = skipStyle.skipTextSize;
            if (i2 != 0) {
                this.c.setTextSize(i2);
            }
            int i3 = skipStyle.countTimeTextSize;
            if (i3 != 0) {
                this.d.setTextSize(i3);
            }
            this.c.setTextColor(skipStyle.skipTextColor);
            this.d.setTextColor(skipStyle.countTimeTextColor);
            this.d.setTypeface(Typeface.defaultFromStyle(skipStyle.countTimeTextIsBold ? 1 : 0));
            this.c.setTypeface(Typeface.defaultFromStyle(skipStyle.skipTextIsBold ? 1 : 0));
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7684138", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ImageView imageView = this.f22659a;
        if (imageView != null) {
            arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f));
        }
        View view = this.n;
        if (view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, "alpha", 0.5f, 1.0f));
        }
        animatorSet.addListener(new d());
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(nh2.l());
        animatorSet.start();
    }

    public final int C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("374716ae", new Object[]{this})).intValue();
        }
        s sVar = this.t;
        if (sVar == null) {
            tm1.a("2ARCH_BootImageBaseView", "new player instance is null");
            return 0;
        }
        int m = (int) sVar.m(1501);
        tm1.a("2ARCH_BootImageBaseView", "new player: current position = " + m);
        return m;
    }

    @Override // tb.rib
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc3f724", new Object[]{this});
        } else if (this.i != null) {
            tm1.a("2ARCH_BootImageBaseView", "showIPV6Icon: ");
            this.i.setVisibility(0);
        }
    }

    @Override // tb.rib
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5115058", new Object[]{this});
        } else if (this.j != null) {
            tm1.a("2ARCH_BootImageBaseView", "showWifiLoadIcon: ");
            this.j.setVisibility(0);
        }
    }

    @Override // tb.rib
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a0c8a31", new Object[]{this});
        } else if (this.h != null) {
            tm1.a("2ARCH_BootImageBaseView", "showLeftTopTbLogo: ");
            this.h.setVisibility(0);
        }
    }

    @Override // tb.xad
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        StringBuilder sb = new StringBuilder("popCenter isShown ");
        sb.append(!this.o);
        tm1.a("2ARCH_BootImageBaseView", sb.toString());
        return true ^ this.o;
    }

    @Override // tb.rib
    public void m() {
        RelativeLayout relativeLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11322e8", new Object[]{this});
        } else if (this.k != null && (relativeLayout = this.l) != null) {
            relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
            tm1.a("2ARCH_BootImageBaseView", "showBottomTbLogo: ");
            this.k.setVisibility(0);
        }
    }

    @Override // tb.rib
    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddc7e08", new Object[]{this});
        } else if (this.f22659a != null) {
            tm1.a("2ARCH_BootImageBaseView", "videoPlayFailShowFirstFrameImage: ");
            this.f22659a.setVisibility(0);
        }
    }

    @Override // tb.xad
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        tm1.a("2ARCH_BootImageBaseView", "popCenter show");
        this.o = true;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2af325e", new Object[]{this});
        } else if (!this.o) {
            tm1.a("2ARCH_BootImageBaseView", "notifyViewShown PopCenter  addPopOperation ");
            this.o = true;
            wcm.a("com.taobao.tao.homepage.HomepageFragment").b(this);
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32c52250", new Object[]{this});
        } else if (this.o) {
            this.o = false;
            tm1.a("2ARCH_BootImageBaseView", "notifyTerminate PopCenter  finishPopOperation ");
            wcm.a("com.taobao.tao.homepage.HomepageFragment").a(this);
            for (q5d q5dVar : E()) {
                q5dVar.onClose();
            }
        }
    }

    public final boolean I(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("904752af", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        tm1.a("2ARCH_BootImageBaseView", "initOldPlayer");
        TaoLiveVideoView taoLiveVideoView = new TaoLiveVideoView(this.l.getContext());
        this.m = taoLiveVideoView;
        taoLiveVideoView.disableAutoPlayForBackground();
        this.m.setMuted(!z);
        r7t r7tVar = new r7t("tbbootimage");
        r7tVar.d = 2;
        r7tVar.e = 2;
        r7tVar.f = 1;
        this.m.setConfigAdapter(new tcw());
        this.m.initConfig(r7tVar);
        this.m.setVideoPath(str);
        this.m.registerOnInfoListener(this.w);
        this.m.registerOnErrorListener(this.x);
        this.m.registerOnCompletionListener(this.y);
        this.l.addView(this.m);
        this.f22659a.bringToFront();
        this.e.m(wzi.OLD_VIDEO_PLAYER, null);
        this.m.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        return true;
    }

    public final boolean H(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("828a55d6", new Object[]{this, str, new Boolean(z)})).booleanValue();
        }
        tm1.a("2ARCH_BootImageBaseView", "initNewPlayer");
        this.u.set(false);
        this.v.set(false);
        s.d dVar = new s.d();
        dVar.g = (Activity) this.l.getContext();
        dVar.n = "tbbootimage";
        DisplayMetrics displayMetrics = uy3.a().getResources().getDisplayMetrics();
        int j = di2.j(uy3.a());
        dVar.q = DWAspectRatio.DW_CENTER_CROP;
        dVar.y = displayMetrics.heightPixels + j;
        dVar.i = !z;
        dVar.x = displayMetrics.widthPixels;
        dVar.k = 2;
        dVar.r = 2;
        dVar.b0 = true;
        dVar.l = str;
        dVar.t = this.z;
        s c2 = s.c.c("", dVar);
        this.t = c2;
        View o = c2.o();
        this.n = o;
        o.bringToFront();
        this.n.setAlpha(0.0f);
        if (this.n == null) {
            tm1.a("2ARCH_BootImageBaseView", "new player: mPlayerView error.");
            return false;
        }
        this.l.addView(this.n, 0, new RelativeLayout.LayoutParams(-1, -1));
        this.e.m(wzi.NEW_VIDEO_PLAYER, null);
        return true;
    }
}
