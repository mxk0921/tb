package tb;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.back.IBackEventService;
import com.taobao.android.fluid.framework.data.datamodel.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class v4w extends xu1 implements bib {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public a.d d;
    public boolean e;
    public final Handler f = new a(Looper.getMainLooper());

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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/containerframe/frames/VideoBaseFrame$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else {
                v4w.e(v4w.this, false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            v4w.this.a();
            v4w.f(v4w.this).removeMessages(0);
            v4w.f(v4w.this).sendEmptyMessageDelayed(0, 150L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    static {
        t2o.a(468713489);
        t2o.a(468713877);
    }

    public v4w(FluidContext fluidContext) {
        super(fluidContext, fluidContext.getContext());
    }

    public static /* synthetic */ boolean e(v4w v4wVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("745e2aae", new Object[]{v4wVar, new Boolean(z)})).booleanValue();
        }
        v4wVar.e = z;
        return z;
    }

    public static /* synthetic */ Handler f(v4w v4wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("21fad97d", new Object[]{v4wVar});
        }
        return v4wVar.f;
    }

    public static /* synthetic */ Object ipc$super(v4w v4wVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/containerframe/frames/VideoBaseFrame");
    }

    public Animation g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("3d687b25", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public Animation h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("7ca7afc4", new Object[]{this});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
        translateAnimation.setDuration(250L);
        return translateAnimation;
    }

    public abstract boolean i();

    public void j(a.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c726b4", new Object[]{this, dVar});
            return;
        }
        this.d = dVar;
        View view = this.c;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70bc3c97", new Object[]{this});
        } else if (!this.e && this.c != null) {
            Animation h = h();
            h.setAnimationListener(new b());
            this.c.startAnimation(h);
            ((IBackEventService) this.f31608a.getService(IBackEventService.class)).getBackKeyEventDetector().c(this);
            this.e = true;
            this.f.sendEmptyMessageDelayed(0, 550L);
        }
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c645e4d2", new Object[]{this});
            return;
        }
        d();
        View view = this.c;
        if (view != null) {
            view.startAnimation(g());
        }
        if (i()) {
            ((IBackEventService) this.f31608a.getService(IBackEventService.class)).getBackKeyEventDetector().d(this);
        }
    }

    public boolean onHandleBackKeyEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8cb96814", new Object[]{this})).booleanValue();
        }
        k();
        return true;
    }

    public void onLoseFocus() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4485122b", new Object[]{this});
        } else {
            k();
        }
    }
}
