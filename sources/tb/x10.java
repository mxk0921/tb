package tb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.rdc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class x10 implements rdc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Animation f31061a;
    public Animation b;
    public WeakReference<View> e;
    public WeakReference<View> f;
    public WeakReference<View> g;
    public WeakReference<Bitmap> h;
    public final rdc.a i;
    public final WeakReference<Context> j;
    public boolean c = false;
    public int k = 0;
    public final ViewGroup d = k();
    public final Handler l = new Handler(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f31062a;

        public a(boolean z) {
            this.f31062a = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x10.a(x10.this);
            x10.b(x10.this, 0);
            x10.c(x10.this, this.f31062a);
            x10.d(x10.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ nxa f31063a;
        public final /* synthetic */ View b;
        public final /* synthetic */ int[] c;
        public final /* synthetic */ Rect d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public b(nxa nxaVar, View view, int[] iArr, Rect rect, int i, int i2) {
            this.f31063a = nxaVar;
            this.b = view;
            this.c = iArr;
            this.d = rect;
            this.e = i;
            this.f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                x10.this.z(this.f31063a, this.b, this.c, this.d, this.e, this.f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (x10.this.d.getParent() != null) {
                x10.this.g();
                fve.e("IIconGuideAnime", "动画执行超时移除动画");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(x10 x10Var) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            fve.e("IIconGuideAnime", "缩放动画执行完成");
            x10.this.u();
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
            } else {
                fve.e("IIconGuideAnime", "开始执行缩放动画");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f31067a;

        public g(ViewGroup viewGroup) {
            this.f31067a = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            x10.this.d.removeAllViews();
            this.f31067a.removeView(x10.this.d);
        }
    }

    static {
        t2o.a(491782368);
        t2o.a(491782378);
    }

    public x10(Context context, rdc.a aVar) {
        this.j = new WeakReference<>(context);
        this.i = aVar;
    }

    public static /* synthetic */ void a(x10 x10Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a017497d", new Object[]{x10Var});
        } else {
            x10Var.h();
        }
    }

    public static /* synthetic */ int b(x10 x10Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ed26da9c", new Object[]{x10Var, new Integer(i)})).intValue();
        }
        x10Var.k = i;
        return i;
    }

    public static /* synthetic */ void c(x10 x10Var, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e1def9", new Object[]{x10Var, new Boolean(z)});
        } else {
            x10Var.o(z);
        }
    }

    public static /* synthetic */ void d(x10 x10Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c4db41a", new Object[]{x10Var});
        } else {
            x10Var.n();
        }
    }

    public void e() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18337bd3", new Object[]{this});
            return;
        }
        this.c = true;
        WeakReference<View> weakReference = this.f;
        if (weakReference != null && weakReference.get() != null && (view = this.e.get()) != null) {
            if (this.d.getChildCount() != 0) {
                this.d.removeAllViews();
            }
            ViewGroup q = q();
            if (q != null) {
                i();
                this.d.addView(view, new ViewGroup.LayoutParams(-1, -1));
                q.addView(this.d, new ViewGroup.LayoutParams(-1, -1));
            }
        }
    }

    public final void f(View view, int[] iArr, Rect rect, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c44da8d5", new Object[]{this, view, iArr, rect, new Integer(i), new Integer(i2)});
            return;
        }
        this.g = new WeakReference<>(view);
        Context context = view.getContext();
        fve.e("IIconGuideAnime", "addHighlightViewToRoot, x=" + iArr[0] + " , y=" + iArr[1]);
        int max = Math.max(pb6.c(context, 61.0f), rect.width());
        int max2 = Math.max(pb6.c(context, 71.0f), rect.height());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(max, max2);
        layoutParams.leftMargin = (int) (((float) iArr[0]) - (((float) (max - i)) / 2.0f));
        layoutParams.topMargin = (int) (iArr[1] - ((max2 - i2) / 2.0f));
        view.setVisibility(4);
        this.d.addView(view, layoutParams);
        fve.e("IIconGuideAnime", "build highlight view");
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("707fe601", new Object[]{this});
            return;
        }
        Animation animation = this.f31061a;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.b;
        if (animation2 != null) {
            animation2.cancel();
        }
        v();
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5da83", new Object[]{this});
        } else {
            this.l.postDelayed(new d(), r());
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8773bbd", new Object[]{this});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page", (Object) "Page_Home");
        jSONObject.put("eventId", (Object) "2201");
        jSONObject.put("arg1", (Object) "Page_MiniApp_Show-zoom-animation");
        jSONObject.put("args", JSON.toJSON(this.i));
        vve.m(jSONObject, null);
    }

    public Animation j(long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("675044c7", new Object[]{this, new Long(j), new Boolean(z)});
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
        translateAnimation.setDuration(200L);
        return translateAnimation;
    }

    public final ViewGroup k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("6c431919", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(this.j.get());
        frameLayout.setOnTouchListener(new e(this));
        return frameLayout;
    }

    public final Animation.AnimationListener l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation.AnimationListener) ipChange.ipc$dispatch("40885b2f", new Object[]{this});
        }
        return new f();
    }

    public final Animation m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("67986b3", new Object[]{this});
        }
        AnimationSet animationSet = new AnimationSet(true);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(2);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300L);
        alphaAnimation2.setStartOffset(600L);
        animationSet.addAnimation(alphaAnimation2);
        return animationSet;
    }

    public final void n() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f41422", new Object[]{this});
        } else if (p() && this.i.j() && this.i.g()) {
            WeakReference<View> weakReference = this.f;
            if (weakReference == null) {
                view = null;
            } else {
                view = weakReference.get();
            }
            if (view != null) {
                this.k++;
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                view.getGlobalVisibleRect(rect);
                int width = view.getWidth();
                int height = view.getHeight();
                nxa nxaVar = new nxa();
                this.h = new WeakReference<>(nxaVar.d(view));
                view.postDelayed(new b(nxaVar, view, iArr, rect, width, height), 400L);
            }
        }
    }

    public final void o(boolean z) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a63ba388", new Object[]{this, new Boolean(z)});
            return;
        }
        Animation j = j(this.i.c(), z);
        this.f31061a = j;
        j.setAnimationListener(l());
        WeakReference<View> weakReference = this.e;
        if (weakReference != null && (view = weakReference.get()) != null) {
            this.k++;
            view.startAnimation(this.f31061a);
        }
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e4b843ad", new Object[]{this})).booleanValue();
        }
        return mve.a("enableIconBackHighlightAnime", true);
    }

    public final ViewGroup q() {
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("7511afe2", new Object[]{this});
        }
        Context context = this.j.get();
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
            return (ViewGroup) window.findViewById(16908290);
        }
        return null;
    }

    public final long r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2762118e", new Object[]{this})).longValue();
        }
        try {
            return Long.parseLong(mve.d("iconBackAnimExecuteTimeout", "3000"));
        } catch (Exception e2) {
            fve.c("IIconGuideAnime", "parse timeout error", e2);
            return 3000L;
        }
    }

    public rdc.a s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rdc.a) ipChange.ipc$dispatch("fc0e69b8", new Object[]{this});
        }
        return this.i;
    }

    public boolean t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fd7f7aa8", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be8d1f04", new Object[]{this});
            return;
        }
        ViewGroup q = q();
        if (q != null) {
            q.post(new g(q));
            this.l.removeCallbacksAndMessages(null);
        }
    }

    public void w(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2522ce8a", new Object[]{this, view});
        } else {
            this.e = new WeakReference<>(view);
        }
    }

    public void x(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa0c0d43", new Object[]{this, view});
        } else {
            this.f = new WeakReference<>(view);
        }
    }

    public void y(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d671019", new Object[]{this, new Boolean(z), new Long(j)});
        } else {
            this.d.postDelayed(new a(z), j);
        }
    }

    public void z(nxa nxaVar, View view, int[] iArr, Rect rect, int i, int i2) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa3b6fc0", new Object[]{this, nxaVar, view, iArr, rect, new Integer(i), new Integer(i2)});
            return;
        }
        ViewGroup c2 = nxaVar.c(view);
        if (iArr[0] == 0 || iArr[1] == 0) {
            view.getLocationOnScreen(iArr);
        }
        f(c2, iArr, rect, i, i2);
        WeakReference<View> weakReference = this.g;
        Bitmap bitmap = null;
        if (weakReference == null) {
            view2 = null;
        } else {
            view2 = weakReference.get();
        }
        if (view2 == null) {
            u();
            return;
        }
        WeakReference<Bitmap> weakReference2 = this.h;
        if (weakReference2 != null) {
            bitmap = weakReference2.get();
        }
        if (bitmap == null) {
            bitmap = nxaVar.d(view);
        }
        View a2 = nxaVar.a(view, bitmap);
        if (a2 == null) {
            u();
            return;
        }
        c2.addView(a2);
        Animation m = m();
        this.b = m;
        m.setAnimationListener(new c(view2));
        view2.startAnimation(this.b);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae2f8fe", new Object[]{this});
            return;
        }
        int i = this.k - 1;
        this.k = i;
        if (i == 0) {
            v();
            fve.e("IIconGuideAnime", "全部动画执行完成");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f31064a;

        public c(View view) {
            this.f31064a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            fve.e("IIconGuideAnime", "高亮动画执行完成");
            x10.this.u();
            int[] iArr = new int[2];
            this.f31064a.getLocationOnScreen(iArr);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31064a.getLayoutParams();
            fve.e("IIconGuideAnime", "高亮动画执行完成loc, x=" + iArr[0] + " , y=" + iArr[1] + " , left=" + layoutParams.leftMargin + " , top=" + layoutParams.topMargin);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                return;
            }
            fve.e("IIconGuideAnime", "开始执行高亮动画");
            this.f31064a.setVisibility(0);
            int[] iArr = new int[2];
            this.f31064a.getLocationOnScreen(iArr);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f31064a.getLayoutParams();
            fve.e("IIconGuideAnime", "开始执行高亮动画loc, x=" + iArr[0] + " , y=" + iArr[1] + " , left=" + layoutParams.leftMargin + " , top=" + layoutParams.topMargin);
        }
    }
}
