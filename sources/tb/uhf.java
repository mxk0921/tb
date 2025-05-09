package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.InteractiveComponentRightAnim;
import com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.view.right_component.RightComponentController;
import tb.xvg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class uhf implements xvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f29374a;
    public final ukr b;
    public final Context c;
    public final String d;
    public final whf e;
    public InteractiveComponentRightAnim f;
    public final int g;
    public final int h;
    public final int i;
    public xvg.a j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InteractiveComponentRightAnim f29375a;
        public final /* synthetic */ Integer b;

        /* compiled from: Taobao */
        /* renamed from: tb.uhf$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1069a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXRootView f29376a;

            public RunnableC1069a(DXRootView dXRootView) {
                this.f29376a = dXRootView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                a aVar = a.this;
                uhf.h(uhf.this, aVar.f29375a, this.f29376a);
            }
        }

        public a(InteractiveComponentRightAnim interactiveComponentRightAnim, Integer num) {
            this.f29375a = interactiveComponentRightAnim;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (uhf.a(uhf.this) != null) {
                uhf.a(uhf.this).removeAllViews();
                DXRootView b = ll6.b(uhf.b(uhf.this), uhf.c(uhf.this), this.f29375a.dxTemplate);
                if (b != null) {
                    ll6.e(uhf.b(uhf.this), b, this.f29375a.parseJsonComponentRightAnim(), uhf.d(uhf.this));
                    uhf.a(uhf.this).addView(b);
                    uhf.a(uhf.this).setVisibility(0);
                    int measuredWidth = uhf.a(uhf.this).getMeasuredWidth();
                    int measuredHeight = uhf.a(uhf.this).getMeasuredHeight();
                    uhf.a(uhf.this).setPivotX(0.0f);
                    uhf.a(uhf.this).setPivotY(0.0f);
                    uhf.a(uhf.this).setScaleX(0.0f);
                    uhf.a(uhf.this).setScaleY(0.0f);
                    uhf.a(uhf.this).setTranslationX(uhf.e(uhf.this) + measuredWidth);
                    uhf.a(uhf.this).setTranslationY(uhf.f(uhf.this) + (uhf.g(uhf.this) * this.b.intValue()));
                    uhf.a(uhf.this).setAlpha(0.0f);
                    Log.e("InteractiveRightAnim", "出现动画 " + uhf.a(uhf.this).getTranslationX() + "," + uhf.a(uhf.this).getTranslationY() + "   " + uhf.a(uhf.this).getScaleX() + "," + uhf.a(uhf.this).getScaleY());
                    uhf.a(uhf.this).animate().translationX(((float) measuredWidth) * 0.3f).translationY(((float) measuredHeight) * 0.3f).scaleX(0.4f).scaleY(0.4f).alpha(1.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new RunnableC1069a(b)).start();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f29377a;
        public final /* synthetic */ InteractiveComponentRightAnim b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.uhf$b$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC1070a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC1070a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    b bVar = b.this;
                    uhf.i(uhf.this, bVar.b);
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (uhf.a(uhf.this) != null) {
                    uhf.a(uhf.this).postDelayed(new RunnableC1070a(), b.this.b.apngStayDuration);
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.uhf$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class RunnableC1071b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1071b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (uhf.a(uhf.this) != null && !TextUtils.isEmpty(b.this.b.additionalAnimation)) {
                    AliUrlImageView aliUrlImageView = new AliUrlImageView(uhf.c(uhf.this));
                    aliUrlImageView.setSkipAutoSize(true);
                    aliUrlImageView.setImageUrl(b.this.b.additionalAnimation);
                    uhf.a(uhf.this).addView(aliUrlImageView, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        }

        public b(DXRootView dXRootView, InteractiveComponentRightAnim interactiveComponentRightAnim) {
            this.f29377a = dXRootView;
            this.b = interactiveComponentRightAnim;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (uhf.a(uhf.this) != null) {
                int measuredWidth = uhf.a(uhf.this).getMeasuredWidth();
                int measuredHeight = uhf.a(uhf.this).getMeasuredHeight();
                Log.e("InteractiveRightAnim", "停留动画 " + uhf.a(uhf.this).getTranslationX() + "," + uhf.a(uhf.this).getTranslationY() + "   " + uhf.a(uhf.this).getScaleX() + "," + uhf.a(uhf.this).getScaleY());
                this.f29377a.setPivotX(0.0f);
                this.f29377a.setPivotY(0.0f);
                this.f29377a.animate().translationX(((float) measuredWidth) * 0.25f).translationY(((float) measuredHeight) * 0.25f).scaleX(0.5f).scaleY(0.5f).alpha(1.0f).setStartDelay((long) this.b.stayDuration).setDuration((long) this.b.dxDisAppearDuration).withStartAction(new RunnableC1071b()).withEndAction(new a()).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f29381a;
        public final /* synthetic */ Integer b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    uhf.j(uhf.this);
                }
            }
        }

        public c(int i, Integer num) {
            this.f29381a = i;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (uhf.a(uhf.this) != null) {
                Log.e("InteractiveRightAnim", "消失动画 " + uhf.a(uhf.this).getTranslationX() + "," + uhf.a(uhf.this).getTranslationY() + "   " + uhf.a(uhf.this).getScaleX() + "," + uhf.a(uhf.this).getScaleY());
                uhf.a(uhf.this).animate().translationX((float) (uhf.e(uhf.this) + this.f29381a)).translationY((float) (uhf.f(uhf.this) + (uhf.g(uhf.this) * this.b.intValue()))).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new a()).start();
            }
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
            } else {
                uhf.j(uhf.this);
            }
        }
    }

    static {
        t2o.a(295699970);
        t2o.a(806355070);
    }

    public uhf(FrameLayout frameLayout, ukr ukrVar, Context context, String str, whf whfVar) {
        this.f29374a = frameLayout;
        this.b = ukrVar;
        this.c = context;
        this.d = str;
        this.e = whfVar;
        this.g = iw0.a(context, 28.0f);
        this.i = iw0.a(context, 20.0f);
        this.h = iw0.a(context, 48.0f);
    }

    public static /* synthetic */ FrameLayout a(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b69ea426", new Object[]{uhfVar});
        }
        return uhfVar.f29374a;
    }

    public static /* synthetic */ ukr b(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukr) ipChange.ipc$dispatch("142052fb", new Object[]{uhfVar});
        }
        return uhfVar.b;
    }

    public static /* synthetic */ Context c(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("7da4b989", new Object[]{uhfVar});
        }
        return uhfVar.c;
    }

    public static /* synthetic */ String d(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("429df2b0", new Object[]{uhfVar});
        }
        return uhfVar.d;
    }

    public static /* synthetic */ int e(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3a900242", new Object[]{uhfVar})).intValue();
        }
        return uhfVar.g;
    }

    public static /* synthetic */ int f(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0a624a1", new Object[]{uhfVar})).intValue();
        }
        return uhfVar.i;
    }

    public static /* synthetic */ int g(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("26bc4700", new Object[]{uhfVar})).intValue();
        }
        return uhfVar.h;
    }

    public static /* synthetic */ void h(uhf uhfVar, InteractiveComponentRightAnim interactiveComponentRightAnim, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d3c2b36", new Object[]{uhfVar, interactiveComponentRightAnim, dXRootView});
        } else {
            uhfVar.n(interactiveComponentRightAnim, dXRootView);
        }
    }

    public static /* synthetic */ void i(uhf uhfVar, InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbbb5bd4", new Object[]{uhfVar, interactiveComponentRightAnim});
        } else {
            uhfVar.l(interactiveComponentRightAnim);
        }
    }

    public static /* synthetic */ void j(uhf uhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88feae2a", new Object[]{uhfVar});
        } else {
            uhfVar.m();
        }
    }

    @Override // tb.xvg
    public void addAnimationListener(xvg.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6f42599", new Object[]{this, aVar});
        } else {
            this.j = aVar;
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
        return "AnimationLifeCycle/InteractiveRightAnim";
    }

    @Override // tb.xvg
    public boolean isDirectExecution() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e29500b0", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xvg
    public boolean isQueue() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("de7cef12", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.j = null;
        FrameLayout frameLayout = this.f29374a;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            this.f29374a.clearAnimation();
            this.f29374a.removeAllViews();
            this.f29374a.setVisibility(8);
            this.f29374a = null;
        }
    }

    public final void l(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00f94dd", new Object[]{this, interactiveComponentRightAnim});
        } else if (this.f29374a != null) {
            whf whfVar = this.e;
            Integer k = whfVar != null ? ((RightComponentController) whfVar).k(interactiveComponentRightAnim) : null;
            int measuredWidth = this.f29374a.getMeasuredWidth();
            int measuredHeight = this.f29374a.getMeasuredHeight();
            if (k != null) {
                Log.e("InteractiveRightAnim", "缩小动画 " + this.f29374a.getTranslationX() + "," + this.f29374a.getTranslationY() + "   " + this.f29374a.getScaleX() + "," + this.f29374a.getScaleY());
                this.f29374a.animate().translationX(((float) measuredWidth) * 0.3f).translationY(((float) measuredHeight) * 0.3f).scaleX(0.4f).scaleY(0.4f).alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new c(measuredWidth, k)).start();
                return;
            }
            this.f29374a.animate().translationX(measuredWidth / 2.0f).translationY(measuredHeight / 2.0f).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(400L).withEndAction(new d()).start();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c844339", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.f29374a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.f29374a.setVisibility(8);
        }
        xvg.a aVar = this.j;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final void n(InteractiveComponentRightAnim interactiveComponentRightAnim, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11540b6", new Object[]{this, interactiveComponentRightAnim, dXRootView});
        } else if (this.f29374a != null) {
            Log.e("InteractiveRightAnim", "放大动画 " + this.f29374a.getTranslationX() + "," + this.f29374a.getTranslationY() + "   " + this.f29374a.getScaleX() + "," + this.f29374a.getScaleY());
            this.f29374a.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new b(dXRootView, interactiveComponentRightAnim)).start();
        }
    }

    public void o(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16386fe", new Object[]{this, interactiveComponentRightAnim});
        } else {
            this.f = interactiveComponentRightAnim;
        }
    }

    @Override // tb.xvg
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        InteractiveComponentRightAnim interactiveComponentRightAnim = this.f;
        if (interactiveComponentRightAnim == null) {
            return;
        }
        if (p(interactiveComponentRightAnim)) {
            xvg.a aVar = this.j;
            if (aVar != null) {
                aVar.b(this);
                return;
            }
            return;
        }
        xvg.a aVar2 = this.j;
        if (aVar2 != null) {
            aVar2.a(this);
        }
    }

    public final boolean p(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23e1b7df", new Object[]{this, interactiveComponentRightAnim})).booleanValue();
        }
        ukr ukrVar = this.b;
        if (!(ukrVar == null || ukrVar.R() == null || this.b.R().w() == null)) {
            this.b.R().w().a("hasShowRightAnim", "true");
        }
        whf whfVar = this.e;
        Integer t = whfVar != null ? ((RightComponentController) whfVar).t(interactiveComponentRightAnim) : null;
        FrameLayout frameLayout = this.f29374a;
        if (frameLayout == null || t == null) {
            return false;
        }
        frameLayout.post(new a(interactiveComponentRightAnim, t));
        return true;
    }
}
