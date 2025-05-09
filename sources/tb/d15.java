package tb;

import android.view.View;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.xvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d15 implements xvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Animation f17494a;
    public final String b;
    public final View c;
    public boolean d = false;
    public final List<xvg.a> e = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            d15.a(d15.this, false);
            for (int i = 0; i < d15.b(d15.this).size(); i++) {
                xvg.a aVar = (xvg.a) d15.b(d15.this).get(i);
                if (aVar != null) {
                    aVar.a(d15.this);
                }
            }
            h4s.d(d15.this.getAnimationName(), d15.this.hashCode());
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
                return;
            }
            d15.a(d15.this, true);
            for (int i = 0; i < d15.b(d15.this).size(); i++) {
                xvg.a aVar = (xvg.a) d15.b(d15.this).get(i);
                if (aVar != null) {
                    aVar.b(d15.this);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements xvg.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Animation.AnimationListener f17496a;
        public final Animation b;

        static {
            t2o.a(806355069);
            t2o.a(806355071);
        }

        public b(Animation.AnimationListener animationListener, Animation animation) {
            this.f17496a = animationListener;
            this.b = animation;
        }

        @Override // tb.xvg.a
        public void a(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c223d18e", new Object[]{this, xvgVar});
                return;
            }
            Animation.AnimationListener animationListener = this.f17496a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(this.b);
            }
        }

        @Override // tb.xvg.a
        public void b(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f1b83e7", new Object[]{this, xvgVar});
                return;
            }
            Animation.AnimationListener animationListener = this.f17496a;
            if (animationListener != null) {
                animationListener.onAnimationStart(this.b);
            }
        }

        @Override // tb.xvg.a
        public void c(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c3c3fd3", new Object[]{this, xvgVar});
            }
        }

        @Override // tb.xvg.a
        public void d(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c294424", new Object[]{this, xvgVar});
                return;
            }
            Animation.AnimationListener animationListener = this.f17496a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(this.b);
            }
        }

        @Override // tb.xvg.a
        public void e(xvg xvgVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfb09f52", new Object[]{this, xvgVar});
            }
        }
    }

    static {
        t2o.a(806355067);
        t2o.a(806355070);
    }

    public d15(View view, Animation animation, String str) {
        this.c = view;
        this.f17494a = animation;
        this.b = str;
        animation.setAnimationListener(new a());
    }

    public static /* synthetic */ boolean a(d15 d15Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dfca69d5", new Object[]{d15Var, new Boolean(z)})).booleanValue();
        }
        d15Var.getClass();
        return z;
    }

    public static /* synthetic */ List b(d15 d15Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("169f40c3", new Object[]{d15Var});
        }
        return d15Var.e;
    }

    @Override // tb.xvg
    public void addAnimationListener(xvg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f42599", new Object[]{this, aVar});
        } else {
            ((ArrayList) this.e).add(aVar);
        }
    }

    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6d5aae0", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    @Override // tb.xvg
    public String getAnimationGroup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e86a3148", new Object[]{this});
        }
        return xr9.NO_GROUP;
    }

    @Override // tb.xvg
    public String getAnimationName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("43b88020", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.xvg
    public boolean isDirectExecution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e29500b0", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.xvg
    public boolean isQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de7cef12", new Object[]{this})).booleanValue();
        }
        return vwl.e().c();
    }

    @Override // tb.xvg
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        h4s.a(getAnimationName(), hashCode());
        this.c.startAnimation(this.f17494a);
    }
}
