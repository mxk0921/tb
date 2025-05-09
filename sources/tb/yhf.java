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
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class yhf implements aif {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String l = yhf.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final String f32088a;
    public final Context b;
    public FrameLayout c;
    public final whf d;
    public final ukr e;
    public final ConcurrentLinkedQueue<InteractiveComponentRightAnim> f = new ConcurrentLinkedQueue<>();
    public boolean g = false;
    public boolean h = false;
    public final int i;
    public final int j;
    public final int k;

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
                yhf.c(yhf.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InteractiveComponentRightAnim f32090a;
        public final /* synthetic */ Integer b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DXRootView f32091a;

            public a(DXRootView dXRootView) {
                this.f32091a = dXRootView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                b bVar = b.this;
                yhf.n(yhf.this, bVar.f32090a, this.f32091a);
            }
        }

        public b(InteractiveComponentRightAnim interactiveComponentRightAnim, Integer num) {
            this.f32090a = interactiveComponentRightAnim;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (yhf.d(yhf.this) != null) {
                yhf.d(yhf.this).removeAllViews();
                DXRootView b = ll6.b(yhf.g(yhf.this), yhf.h(yhf.this), this.f32090a.dxTemplate);
                if (b != null) {
                    ll6.e(yhf.g(yhf.this), b, this.f32090a.parseJsonComponentRightAnim(), yhf.i(yhf.this));
                    yhf.d(yhf.this).addView(b);
                    yhf.d(yhf.this).setVisibility(0);
                    int measuredWidth = yhf.d(yhf.this).getMeasuredWidth();
                    int measuredHeight = yhf.d(yhf.this).getMeasuredHeight();
                    yhf.d(yhf.this).setPivotX(0.0f);
                    yhf.d(yhf.this).setPivotY(0.0f);
                    yhf.d(yhf.this).setScaleX(0.0f);
                    yhf.d(yhf.this).setScaleY(0.0f);
                    yhf.d(yhf.this).setTranslationX(yhf.j(yhf.this) + measuredWidth);
                    yhf.d(yhf.this).setTranslationY(yhf.k(yhf.this) + (yhf.l(yhf.this) * this.b.intValue()));
                    yhf.d(yhf.this).setAlpha(0.0f);
                    String m = yhf.m();
                    Log.e(m, "出现动画 " + yhf.d(yhf.this).getTranslationX() + "," + yhf.d(yhf.this).getTranslationY() + "   " + yhf.d(yhf.this).getScaleX() + "," + yhf.d(yhf.this).getScaleY());
                    yhf.d(yhf.this).animate().translationX(((float) measuredWidth) * 0.3f).translationY(((float) measuredHeight) * 0.3f).scaleX(0.4f).scaleY(0.4f).alpha(1.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new a(b)).start();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DXRootView f32092a;
        public final /* synthetic */ InteractiveComponentRightAnim b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: tb.yhf$c$a$a  reason: collision with other inner class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class RunnableC1108a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public RunnableC1108a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    c cVar = c.this;
                    yhf.e(yhf.this, cVar.b);
                }
            }

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (yhf.d(yhf.this) != null) {
                    yhf.d(yhf.this).postDelayed(new RunnableC1108a(), c.this.b.apngStayDuration);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class b implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (yhf.d(yhf.this) != null && !TextUtils.isEmpty(c.this.b.additionalAnimation)) {
                    AliUrlImageView aliUrlImageView = new AliUrlImageView(yhf.h(yhf.this));
                    aliUrlImageView.setSkipAutoSize(true);
                    aliUrlImageView.setImageUrl(c.this.b.additionalAnimation);
                    yhf.d(yhf.this).addView(aliUrlImageView, new ViewGroup.LayoutParams(-1, -1));
                }
            }
        }

        public c(DXRootView dXRootView, InteractiveComponentRightAnim interactiveComponentRightAnim) {
            this.f32092a = dXRootView;
            this.b = interactiveComponentRightAnim;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (yhf.d(yhf.this) != null) {
                int measuredWidth = yhf.d(yhf.this).getMeasuredWidth();
                int measuredHeight = yhf.d(yhf.this).getMeasuredHeight();
                String m = yhf.m();
                Log.e(m, "停留动画 " + yhf.d(yhf.this).getTranslationX() + "," + yhf.d(yhf.this).getTranslationY() + "   " + yhf.d(yhf.this).getScaleX() + "," + yhf.d(yhf.this).getScaleY());
                this.f32092a.setPivotX(0.0f);
                this.f32092a.setPivotY(0.0f);
                this.f32092a.animate().translationX(((float) measuredWidth) * 0.25f).translationY(((float) measuredHeight) * 0.25f).scaleX(0.5f).scaleY(0.5f).alpha(1.0f).setStartDelay((long) this.b.stayDuration).setDuration((long) this.b.dxDisAppearDuration).withStartAction(new b()).withEndAction(new a()).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32096a;
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
                    yhf.f(yhf.this);
                }
            }
        }

        public d(int i, Integer num) {
            this.f32096a = i;
            this.b = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (yhf.d(yhf.this) != null) {
                String m = yhf.m();
                Log.e(m, "消失动画 " + yhf.d(yhf.this).getTranslationX() + "," + yhf.d(yhf.this).getTranslationY() + "   " + yhf.d(yhf.this).getScaleX() + "," + yhf.d(yhf.this).getScaleY());
                yhf.d(yhf.this).animate().translationX((float) (yhf.j(yhf.this) + this.f32096a)).translationY((float) (yhf.k(yhf.this) + (yhf.l(yhf.this) * this.b.intValue()))).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).withEndAction(new a()).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                yhf.f(yhf.this);
            }
        }
    }

    static {
        t2o.a(295699981);
        t2o.a(295699992);
    }

    public yhf(String str, Context context, FrameLayout frameLayout, ukr ukrVar, whf whfVar) {
        this.f32088a = str;
        this.b = context;
        this.c = frameLayout;
        this.e = ukrVar;
        this.d = whfVar;
        this.i = iw0.a(context, 28.0f);
        this.k = iw0.a(context, 20.0f);
        this.j = iw0.a(context, 48.0f);
    }

    public static /* synthetic */ void c(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b707dd7", new Object[]{yhfVar});
        } else {
            yhfVar.o();
        }
    }

    public static /* synthetic */ FrameLayout d(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("404dd9a3", new Object[]{yhfVar});
        }
        return yhfVar.c;
    }

    public static /* synthetic */ void e(yhf yhfVar, InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35648811", new Object[]{yhfVar, interactiveComponentRightAnim});
        } else {
            yhfVar.p(interactiveComponentRightAnim);
        }
    }

    public static /* synthetic */ void f(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2381767", new Object[]{yhfVar});
        } else {
            yhfVar.q();
        }
    }

    public static /* synthetic */ ukr g(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ukr) ipChange.ipc$dispatch("a1180338", new Object[]{yhfVar});
        }
        return yhfVar.e;
    }

    public static /* synthetic */ Context h(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e31ce7ac", new Object[]{yhfVar});
        }
        return yhfVar.b;
    }

    public static /* synthetic */ String i(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("909168ad", new Object[]{yhfVar});
        }
        return yhfVar.f32088a;
    }

    public static /* synthetic */ int j(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b6a53e5", new Object[]{yhfVar})).intValue();
        }
        return yhfVar.i;
    }

    public static /* synthetic */ int k(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e9c4b84", new Object[]{yhfVar})).intValue();
        }
        return yhfVar.k;
    }

    public static /* synthetic */ int l(yhf yhfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("31ce4323", new Object[]{yhfVar})).intValue();
        }
        return yhfVar.j;
    }

    public static /* synthetic */ String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("502f6101", new Object[0]);
        }
        return l;
    }

    public static /* synthetic */ void n(yhf yhfVar, InteractiveComponentRightAnim interactiveComponentRightAnim, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bcda4b8", new Object[]{yhfVar, interactiveComponentRightAnim, dXRootView});
        } else {
            yhfVar.r(interactiveComponentRightAnim, dXRootView);
        }
    }

    @Override // tb.aif
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da3cc9c", new Object[]{this});
            return;
        }
        this.g = true;
        o();
    }

    @Override // tb.aif
    public void b(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604173c", new Object[]{this, interactiveComponentRightAnim});
            return;
        }
        if (interactiveComponentRightAnim != null && "lottery".equals(interactiveComponentRightAnim.animationType)) {
            if (this.f.contains(interactiveComponentRightAnim)) {
                this.f.remove(interactiveComponentRightAnim);
                this.f.offer(interactiveComponentRightAnim);
            } else {
                this.f.offer(interactiveComponentRightAnim);
            }
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.postDelayed(new a(), 300L);
        }
    }

    @Override // tb.aif
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.g = false;
        this.f.clear();
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            this.c.clearAnimation();
            this.c.removeAllViews();
            this.c.setVisibility(8);
            this.c = null;
        }
    }

    public final void o() {
        InteractiveComponentRightAnim poll;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a693d82c", new Object[]{this});
        } else if (this.g && !this.f.isEmpty() && !this.h && (poll = this.f.poll()) != null && !s(poll)) {
            o();
        }
    }

    public final void p(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a00f94dd", new Object[]{this, interactiveComponentRightAnim});
        } else if (this.c != null) {
            whf whfVar = this.d;
            Integer k = whfVar != null ? ((RightComponentController) whfVar).k(interactiveComponentRightAnim) : null;
            int measuredWidth = this.c.getMeasuredWidth();
            int measuredHeight = this.c.getMeasuredHeight();
            if (k != null) {
                String str = l;
                Log.e(str, "缩小动画 " + this.c.getTranslationX() + "," + this.c.getTranslationY() + "   " + this.c.getScaleX() + "," + this.c.getScaleY());
                this.c.animate().translationX(((float) measuredWidth) * 0.3f).translationY(((float) measuredHeight) * 0.3f).scaleX(0.4f).scaleY(0.4f).alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new d(measuredWidth, k)).start();
                return;
            }
            this.c.animate().translationX(measuredWidth / 2.0f).translationY(measuredHeight / 2.0f).scaleX(0.0f).scaleY(0.0f).alpha(0.0f).setDuration(400L).withEndAction(new e()).start();
        }
    }

    public final void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c844339", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.c.setVisibility(8);
        }
        this.h = false;
        o();
    }

    public final void r(InteractiveComponentRightAnim interactiveComponentRightAnim, DXRootView dXRootView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11540b6", new Object[]{this, interactiveComponentRightAnim, dXRootView});
        } else if (this.c != null) {
            String str = l;
            Log.e(str, "放大动画 " + this.c.getTranslationX() + "," + this.c.getTranslationY() + "   " + this.c.getScaleX() + "," + this.c.getScaleY());
            this.c.animate().translationX(0.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(100L).setInterpolator(new LinearInterpolator()).withEndAction(new c(dXRootView, interactiveComponentRightAnim)).start();
        }
    }

    public final boolean s(InteractiveComponentRightAnim interactiveComponentRightAnim) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23e1b7df", new Object[]{this, interactiveComponentRightAnim})).booleanValue();
        }
        if (qvs.P() && hjr.E("enableBanShowRightAnim", false)) {
            return false;
        }
        ukr ukrVar = this.e;
        if (!(ukrVar == null || ukrVar.R() == null || this.e.R().w() == null)) {
            this.e.R().w().a("hasShowRightAnim", "true");
        }
        whf whfVar = this.d;
        Integer t = whfVar != null ? ((RightComponentController) whfVar).t(interactiveComponentRightAnim) : null;
        FrameLayout frameLayout = this.c;
        if (frameLayout == null || t == null) {
            return false;
        }
        this.h = true;
        frameLayout.post(new b(interactiveComponentRightAnim, t));
        return true;
    }
}
