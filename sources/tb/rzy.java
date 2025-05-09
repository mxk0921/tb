package tb;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.view.frameanim.BKAnimBgFrameLayout;
import com.taobao.android.detail2.core.framework.view.frameanim.BKGestureLayout;
import com.taobao.android.detail2.core.framework.view.frameanim.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rzy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements iap {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ w0s f27704a;
        public final /* synthetic */ BKAnimBgFrameLayout b;
        public final /* synthetic */ NewDetailMaskFrameLayout c;

        public a(w0s w0sVar, BKAnimBgFrameLayout bKAnimBgFrameLayout, NewDetailMaskFrameLayout newDetailMaskFrameLayout) {
            this.f27704a = w0sVar;
            this.b = bKAnimBgFrameLayout;
            this.c = newDetailMaskFrameLayout;
        }

        @Override // tb.iap
        public View a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("b8ad126b", new Object[]{this});
            }
            if (!this.f27704a.e()) {
                this.f27704a.run();
            }
            this.b.resetScaleImageView();
            return this.b.getScaleImageView();
        }

        @Override // tb.iap
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f69f5dbe", new Object[]{this});
            } else {
                this.b.initItemWhiteHolderView();
            }
        }

        @Override // tb.iap
        public ImageView c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ImageView) ipChange.ipc$dispatch("6a7699b0", new Object[]{this});
            }
            return this.b.getPageSnapBgView();
        }

        @Override // tb.iap
        public View d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("9e8defa", new Object[]{this});
            }
            return this.b.getItemWhiteHolderView();
        }

        @Override // tb.iap
        public ViewGroup e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewGroup) ipChange.ipc$dispatch("f51a0562", new Object[]{this});
            }
            return this.c;
        }
    }

    static {
        t2o.a(352321987);
    }

    public static xpz a(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("2cc80c5a", new Object[]{aqzVar});
        }
        f0z f0zVar = new f0z(aqzVar.c());
        h0z h0zVar = new h0z();
        f0zVar.c(h0zVar);
        Context d = aqzVar.d();
        FrameLayout frameLayout = new FrameLayout(d);
        frameLayout.setId(aqzVar.d);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        h0zVar.f20353a = frameLayout;
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = new NewDetailMaskFrameLayout(d);
        newDetailMaskFrameLayout.setId(aqzVar.e);
        newDetailMaskFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        newDetailMaskFrameLayout.setBackgroundColor(-1);
        newDetailMaskFrameLayout.addView(aqzVar.c());
        frameLayout.addView(newDetailMaskFrameLayout);
        return f0zVar;
    }

    public static xpz b(aqz aqzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xpz) ipChange.ipc$dispatch("d52e0026", new Object[]{aqzVar});
        }
        f0z f0zVar = new f0z(aqzVar.c());
        h0z h0zVar = new h0z();
        g0z g0zVar = new g0z();
        f0zVar.c(h0zVar);
        f0zVar.b(g0zVar);
        Context d = aqzVar.d();
        vpz b = wpz.b(aqzVar);
        tpz b2 = upz.b(aqzVar);
        rpz c = spz.c(aqzVar);
        qzy.b(aqzVar, b, b2);
        FrameLayout frameLayout = new FrameLayout(d);
        frameLayout.setId(aqzVar.d);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        h0zVar.f20353a = frameLayout;
        NewDetailMaskFrameLayout newDetailMaskFrameLayout = new NewDetailMaskFrameLayout(d);
        newDetailMaskFrameLayout.setAnimParams(aqzVar);
        newDetailMaskFrameLayout.setSupportScaleWhiteBgView(Boolean.TRUE.equals(b.b));
        newDetailMaskFrameLayout.setId(aqzVar.e);
        newDetailMaskFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        BKAnimBgFrameLayout bKAnimBgFrameLayout = new BKAnimBgFrameLayout(d);
        bKAnimBgFrameLayout.setAnimLogHandler(aqzVar.l);
        bKAnimBgFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        bKAnimBgFrameLayout.initAnim();
        newDetailMaskFrameLayout.addView(bKAnimBgFrameLayout);
        w0s w0sVar = new w0s(aqzVar, newDetailMaskFrameLayout, bKAnimBgFrameLayout, c);
        newDetailMaskFrameLayout.getNewDetailMaskFrameLayoutContext().b(w0sVar);
        new Handler(Looper.getMainLooper()).postDelayed(w0sVar, 500L);
        BKGestureLayout bKGestureLayout = new BKGestureLayout(d);
        g0zVar.f19669a = bKGestureLayout;
        xfb xfbVar = aqzVar.f;
        if (xfbVar == null && (d instanceof xfb)) {
            xfbVar = (xfb) d;
        }
        bKGestureLayout.setAnimPageContainer(xfbVar);
        bKGestureLayout.setAnimLogHandler(aqzVar.l);
        bKGestureLayout.setAnimLayoutInterface(new a(w0sVar, bKAnimBgFrameLayout, newDetailMaskFrameLayout));
        bKGestureLayout.setGestureSupportType();
        bKGestureLayout.setContentView(aqzVar.c());
        bKGestureLayout.setGestureLayoutBackground(Color.parseColor("#3311192D"));
        newDetailMaskFrameLayout.addView(bKGestureLayout);
        frameLayout.addView(newDetailMaskFrameLayout);
        return f0zVar;
    }
}
