package tb;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alibaba.poplayer.PopLayer;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.TriggerActionsModel;
import com.taobao.tbpoplayer.nativerender.dsl.VideoModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import com.taobao.tbpoplayer.view.nativepop.PopLayerNativeView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import tb.yam;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class him extends ubm<VideoModel> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int e = 0;
    public volatile boolean f;
    public volatile boolean g;
    public s h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f20669a;

        public a(FrameLayout frameLayout) {
            this.f20669a = frameLayout;
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
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
                return;
            }
            wdm.g("pageLifeCycle", him.this.f29277a.j().s(), "PopVideoComponent.onMediaComplete");
            try {
                him himVar = him.this;
                sfu.b(himVar.f29277a, "playEnd", true, ((VideoModel) himVar.b).triggerActions);
            } catch (Throwable th) {
                wdm.h("PopVideoComponent.onVideoComplete.error", th);
            }
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
                return;
            }
            String s = him.this.f29277a.j().s();
            wdm.g("pageLifeCycle", s, "PopVideoComponent.onVideoInfo. what = " + j + " extra = " + j2);
            if (j == 3) {
                try {
                    him.F(him.this, true);
                    him himVar = him.this;
                    him.G(himVar, himVar.c);
                    StyleModel f = him.this.f();
                    if (!TextUtils.isEmpty(f.opacity)) {
                        this.f20669a.setAlpha(Float.parseFloat(f.opacity));
                    } else {
                        this.f20669a.setAlpha(1.0f);
                    }
                } catch (Throwable th) {
                    wdm.h("PopVideoComponent.onMediaInfo.error", th);
                }
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
                return;
            }
            wdm.g("pageLifeCycle", him.this.f29277a.j().s(), "PopVideoComponent.onMediaPrepared");
            try {
                him.E(him.this, true);
                him.this.f29277a.p();
            } catch (Throwable th) {
                wdm.h("PopVideoComponent.onImageLoaded.error", th);
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            wdm.g("pageLifeCycle", him.this.f29277a.j().s(), "PopVideoComponent.onVideoError");
            try {
                him himVar = him.this;
                if (!sfu.b(himVar.f29277a, "loadFail", true, ((VideoModel) himVar.b).triggerActions) && !him.this.f29277a.j().A() && him.this.f29277a.j().E()) {
                    him.this.f29277a.b("VideoLoadFail", String.valueOf(i), false, null);
                }
            } catch (Throwable th) {
                wdm.h("PopVideoComponent.onVideoError.error", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements View.OnAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d337638", new Object[]{this, view});
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7f64d55b", new Object[]{this, view});
                return;
            }
            try {
                him.H(him.this).h();
                wdm.g("pageLifeCycle", him.this.f29277a.j().s(), "PopVideoComponent.onViewDetachedFromWindow.destroy");
            } catch (Throwable th) {
                wdm.h("PopVideoComponent.onViewDetachedFromWindow.error", th);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements ViewTreeObserver.OnGlobalLayoutListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout f20671a;

        public c(FrameLayout frameLayout) {
            this.f20671a = frameLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("df7e7eb3", new Object[]{this});
                return;
            }
            try {
                int width = this.f20671a.getWidth();
                int height = this.f20671a.getHeight();
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("width", Integer.valueOf(width));
                hashMap.put("height", Integer.valueOf(height));
                him.H(him.this).c("setFrame", hashMap);
                him.G(him.this, this.f20671a);
                String s = him.this.f29277a.j().s();
                wdm.g("pageLifeCycle", s, "PopVideoComponent.onGlobalLayout.width=" + width + ".height=" + height);
                if (him.this.f29277a.j().A()) {
                    him.H(him.this).F();
                    wdm.g("pageLifeCycle", him.this.f29277a.j().s(), "PopVideoComponent.onGlobalLayout.start");
                } else {
                    him.H(him.this).v();
                    wdm.g("pageLifeCycle", him.this.f29277a.j().s(), "PopVideoComponent.onGlobalLayout.prepareToFirstFrame");
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    static {
        t2o.a(790626480);
    }

    public him(oe8 oe8Var, VideoModel videoModel, boolean z) {
        super(oe8Var, videoModel, z);
    }

    public static /* synthetic */ boolean E(him himVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8abbee8c", new Object[]{himVar, new Boolean(z)})).booleanValue();
        }
        himVar.f = z;
        return z;
    }

    public static /* synthetic */ boolean F(him himVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91e4d0cd", new Object[]{himVar, new Boolean(z)})).booleanValue();
        }
        himVar.g = z;
        return z;
    }

    public static /* synthetic */ void G(him himVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4aefd706", new Object[]{himVar, view});
        } else {
            himVar.R(view);
        }
    }

    public static /* synthetic */ s H(him himVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("3c7312d0", new Object[]{himVar});
        }
        return himVar.h;
    }

    public static /* synthetic */ Object ipc$super(him himVar, String str, Object... objArr) {
        if (str.hashCode() == -454357687) {
            super.o();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/render/component/PopVideoComponent");
    }

    public final <T extends View> T I(View view, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ((View) ipChange.ipc$dispatch("d41fffc8", new Object[]{this, view, cls}));
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (cls.isInstance(parent)) {
                return (T) ((View) parent);
            }
        }
        return null;
    }

    public final int[] J(View view, Class<?> cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b857247", new Object[]{this, view, cls});
        }
        View I = I(view, cls);
        if (I == null) {
            return null;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        I.getLocationOnScreen(iArr2);
        return new int[]{iArr[0] - iArr2[0], iArr[1] - iArr2[1]};
    }

    public final /* synthetic */ void L(TriggerActionsModel triggerActionsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b77c58", new Object[]{this, triggerActionsModel});
            return;
        }
        try {
            if (!this.f) {
                this.f29277a.l(this.b, "loadOutOfTime", triggerActionsModel.action, triggerActionsModel.actions);
            }
        } catch (Throwable th) {
            wdm.h("PopVideoComponent.outOfTime.error", th);
        }
    }

    public final /* synthetic */ void M(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2a02c09", new Object[]{this, view});
            return;
        }
        yam f = this.f29277a.f();
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        f.e(oe8Var, "click", ((VideoModel) componentBaseModel).animation, this.c, componentBaseModel, new yam.f() { // from class: tb.fim
            @Override // tb.yam.f
            public final void onAnimationEnd() {
                him.this.P();
            }
        });
    }

    public final /* synthetic */ void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70cd5262", new Object[]{this});
            return;
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "click", ((VideoModel) componentBaseModel).action, ((VideoModel) componentBaseModel).actions);
    }

    public final /* synthetic */ void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("738309a4", new Object[]{this});
            return;
        }
        try {
            s sVar = this.h;
            if (sVar != null) {
                sVar.F();
            }
            wdm.g("pageLifeCycle", this.f29277a.j().s(), "PopVideoComponent.start");
        } catch (Throwable th) {
            wdm.h("PopVideoComponent.start.error", th);
        }
    }

    @Override // tb.ubm
    public View c(Context context) {
        final TriggerActionsModel triggerActionsModel;
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("79a2c742", new Object[]{this, context});
        }
        final FrameLayout frameLayout = new FrameLayout(context);
        i(frameLayout, ((VideoModel) this.b).style);
        hst.c(new Runnable() { // from class: tb.aim
            @Override // java.lang.Runnable
            public final void run() {
                him.this.K(frameLayout);
            }
        });
        List<TriggerActionsModel> list = ((VideoModel) this.b).triggerActions;
        if (list != null && !list.isEmpty()) {
            Iterator<TriggerActionsModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    triggerActionsModel = null;
                    l = null;
                    break;
                }
                triggerActionsModel = it.next();
                if (triggerActionsModel.isValid() && "loadOutOfTime".equals(triggerActionsModel.trigger.getString("type"))) {
                    l = Long.valueOf(triggerActionsModel.trigger.getLongValue("timeLimit"));
                    break;
                }
            }
            if (l != null && l.longValue() > 0) {
                frameLayout.postDelayed(new Runnable() { // from class: tb.bim
                    @Override // java.lang.Runnable
                    public final void run() {
                        him.this.L(triggerActionsModel);
                    }
                }, l.longValue());
            }
        }
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.cim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                him.this.M(view);
            }
        });
        frameLayout.setOnLongClickListener(new View.OnLongClickListener() { // from class: tb.dim
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean N;
                N = him.this.N(view);
                return N;
            }
        });
        return frameLayout;
    }

    @Override // tb.ubm
    public StyleModel f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StyleModel) ipChange.ipc$dispatch("14e3d48a", new Object[]{this});
        }
        T t = this.b;
        if (t != 0) {
            return ((VideoModel) t).style;
        }
        return null;
    }

    @Override // tb.ubm
    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4eb0d49", new Object[]{this});
            return;
        }
        super.o();
        wdm.g("pageLifeCycle", this.f29277a.j().s(), "PopVideoComponent.onDisplayed");
        hst.c(new Runnable() { // from class: tb.gim
            @Override // java.lang.Runnable
            public final void run() {
                him.this.Q();
            }
        });
    }

    public final /* synthetic */ boolean N(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aea1baec", new Object[]{this, view})).booleanValue();
        }
        oe8 oe8Var = this.f29277a;
        ComponentBaseModel componentBaseModel = this.b;
        oe8Var.l(componentBaseModel, "longClick", ((VideoModel) componentBaseModel).action, ((VideoModel) componentBaseModel).actions);
        return true;
    }

    public final /* synthetic */ void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a30bdf", new Object[]{this});
            return;
        }
        try {
            this.e++;
            wdm.g("pageLifeCycle", this.f29277a.j().s(), "PopVideoComponent.onLoopCompletion.mLoopCount=" + this.e);
            T t = this.b;
            if (((VideoModel) t).loopTimes > 0 && this.e == ((VideoModel) t).loopTimes - 1) {
                this.h.C(1011, 0L);
                wdm.g("pageLifeCycle", this.f29277a.j().s(), "PopVideoComponent.onLoopCompletion.stopLoop");
            }
        } catch (Throwable th) {
            wdm.h("PopVideoComponent.onLoopCompletion.error", th);
        }
    }

    public final void R(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1ff4798", new Object[]{this, view});
            return;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            wdm.d("PopVideoComponent.setClickArea.notReady.width=" + width + ".height=" + height, new Object[0]);
        } else if (!this.g) {
            wdm.d("PopVideoComponent.setClickArea.mFirstFramePlayed=false", new Object[0]);
        } else {
            int[] J = J(view, PopLayerNativeView.class);
            if (J != null) {
                Rect rect = new Rect();
                int i = J[0];
                rect.left = i;
                int i2 = J[1];
                rect.top = i2;
                rect.right = i + width;
                rect.bottom = i2 + height;
                this.f29277a.a(rect);
            }
            String s = this.f29277a.j().s();
            wdm.g("pageLifeCycle", s, "PopVideoComponent.setClickArea.width=" + width + ".height=" + height);
        }
    }

    public final /* synthetic */ void K(FrameLayout frameLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f6caa29", new Object[]{this, frameLayout});
            return;
        }
        try {
            s.d dVar = new s.d();
            dVar.g = PopLayer.getReference().internalGetCurrentActivity();
            dVar.i = true;
            dVar.r = 2;
            dVar.n = "Pop";
            dVar.o = "Pop4";
            dVar.S = false;
            if (!TextUtils.isEmpty(((VideoModel) this.b).videoId)) {
                dVar.m = a1n.g(this.f29277a, ((VideoModel) this.b).videoId);
                dVar.j = "TBVideo";
            } else {
                dVar.l = a1n.g(this.f29277a, ((VideoModel) this.b).url);
                dVar.j = "NonTBVideo";
            }
            T t = this.b;
            if (((VideoModel) t).loopTimes == 1) {
                dVar.A = false;
            } else if (((VideoModel) t).loopTimes >= 0) {
                dVar.A = true;
            }
            if (((VideoModel) t).style == null || !((VideoModel) t).style.objectFit.equals("cover")) {
                dVar.q = DWAspectRatio.DW_FIT_CENTER;
            } else {
                dVar.q = DWAspectRatio.DW_CENTER_CROP;
            }
            dVar.I = new aub() { // from class: tb.eim
                @Override // tb.aub
                public final void onLoopCompletion() {
                    him.this.O();
                }
            };
            dVar.t = new a(frameLayout);
            s c2 = s.c.c("", dVar);
            this.h = c2;
            frameLayout.addView(c2.o(), -1, -1);
            frameLayout.setAlpha(0.0f);
            wdm.g("pageLifeCycle", this.f29277a.j().s(), "PopVideoComponent.addView");
            frameLayout.addOnAttachStateChangeListener(new b());
            frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new c(frameLayout));
            wdm.g("pageLifeCycle", this.f29277a.j().s(), "PopVideoComponent.onGlobalLayout.initDone");
        } catch (Throwable th) {
            wdm.h("PopVideoComponent.create.error", th);
        }
    }
}
