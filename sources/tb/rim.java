package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.sf.BaseResultActivity;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.JvmStatic;
import tb.rim;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class rim {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);
    public static final int j = o1p.a(10.0f);
    public static final LinkedList<u4p> k = new LinkedList<>();

    /* renamed from: a  reason: collision with root package name */
    public final b12<?, ?, ?, ?, ?> f27405a;
    public final BaseResultActivity b;
    public final int c;
    public final int d;
    public final int e;
    public final View f;
    public final boolean g;
    public final View h;
    public final int i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793368);
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }

        public static final void f(u4p u4pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d93da270", new Object[]{u4pVar});
                return;
            }
            while (!rim.b().isEmpty()) {
                ((u4p) rim.b().pollFirst()).finish();
            }
            if (u4pVar != null) {
                u4pVar.z0();
            }
        }

        @JvmStatic
        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d498fd59", new Object[]{this});
                return;
            }
            final u4p u4pVar = (u4p) rim.b().pollLast();
            Iterator it = rim.b().iterator();
            ckf.f(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                ckf.f(next, "next(...)");
                ((u4p) next).u();
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: tb.dkz
                @Override // java.lang.Runnable
                public final void run() {
                    rim.b.f(u4p.this);
                }
            });
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9b0a9a2d", new Object[]{this})).intValue();
            }
            return rim.a();
        }

        @JvmStatic
        public final void c(u4p u4pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ad440731", new Object[]{this, u4pVar});
                return;
            }
            ckf.g(u4pVar, "activity");
            rim.b().add(u4pVar);
        }

        @JvmStatic
        public final void d(u4p u4pVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6d1b189b", new Object[]{this, u4pVar});
                return;
            }
            ckf.g(u4pVar, "activity");
            rim.b().remove(u4pVar);
        }

        public b() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AnimatorListenerAdapter f27406a;

        public f(AnimatorListenerAdapter animatorListenerAdapter) {
            this.f27406a = animatorListenerAdapter;
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/PopupSrpHelper$startAdjustAnimation$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            AnimatorListenerAdapter animatorListenerAdapter = this.f27406a;
            if (animatorListenerAdapter != null) {
                animatorListenerAdapter.onAnimationEnd(null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class h extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;

        public h(boolean z) {
            this.b = z;
        }

        public static /* synthetic */ Object ipc$super(h hVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/PopupSrpHelper$startAnimation$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            if (!this.b) {
                rim.this.l().C4();
                rim.this.l().overridePendingTransition(0, 0);
            }
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [android.view.View, java.lang.Object] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAnimationStart(android.animation.Animator r5) {
            /*
                r4 = this;
                r0 = 0
                com.android.alibaba.ip.runtime.IpChange r1 = tb.rim.h.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x0015
                java.lang.String r2 = "3a405721"
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r0] = r4
                r0 = 1
                r3[r0] = r5
                r1.ipc$dispatch(r2, r3)
                return
            L_0x0015:
                java.lang.String r1 = "animation"
                tb.ckf.g(r5, r1)
                tb.rim r5 = tb.rim.this
                tb.b12 r5 = r5.p()
                android.view.View r5 = r5.getView()
                tb.ckf.d(r5)
                r5.setVisibility(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.rim.h.onAnimationStart(android.animation.Animator):void");
        }
    }

    static {
        t2o.a(815793367);
    }

    public rim(b12<?, ?, ?, ?, ?> b12Var, BaseResultActivity baseResultActivity) {
        ckf.g(b12Var, "widget");
        ckf.g(baseResultActivity, "activity");
        this.f27405a = b12Var;
        this.b = baseResultActivity;
        this.c = DensityUtil.dip2px(baseResultActivity, 44.0f);
        this.d = DensityUtil.dip2px(baseResultActivity, 24.0f);
        View view = new View(baseResultActivity);
        this.f = view;
        int i = R.id.fl_top_header;
        this.h = baseResultActivity.findViewById(i);
        int statusBarHeight = baseResultActivity.isImmersiveStatus() ? SystemBarDecorator.getStatusBarHeight(baseResultActivity) : 0;
        this.i = statusBarHeight;
        ViewProxy.setOnClickListener(view, new View.OnClickListener() { // from class: tb.xjz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rim.v(rim.this, view2);
            }
        });
        tnd f2 = ((acx) b12Var.getModel()).f();
        ckf.e(f2, "null cannot be cast to non-null type com.taobao.search.sf.context.CommonSearchContext");
        float popupHeight = ((CommonSearchContext) f2).getPopupHeight();
        int i2 = j;
        if (popupHeight > 0.0f) {
            this.c = ((int) ((1.0f - popupHeight) * zuo.d())) + i2;
        }
        this.e = this.c;
        Intent intent = baseResultActivity.getIntent();
        ckf.f(intent, "getIntent(...)");
        if (sim.a(intent)) {
            View findViewById = baseResultActivity.findViewById(i);
            if (findViewById != null) {
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                ckf.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = this.c;
            }
            this.c = -(statusBarHeight - i2);
            this.g = true;
        }
    }

    public static final void A(ColorDrawable colorDrawable, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87003fca", new Object[]{colorDrawable, valueAnimator});
            return;
        }
        Object animatedValue = valueAnimator.getAnimatedValue();
        ckf.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        colorDrawable.setAlpha(((Integer) animatedValue).intValue());
        colorDrawable.invalidateSelf();
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("262891b8", new Object[0])).intValue();
        }
        return j;
    }

    public static final /* synthetic */ LinkedList b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("62fc8ab9", new Object[0]);
        }
        return k;
    }

    @JvmStatic
    public static final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d498fd59", new Object[0]);
        } else {
            Companion.a();
        }
    }

    @JvmStatic
    public static final void q(u4p u4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad440731", new Object[]{u4pVar});
        } else {
            Companion.c(u4pVar);
        }
    }

    @JvmStatic
    public static final void r(u4p u4pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d1b189b", new Object[]{u4pVar});
        } else {
            Companion.d(u4pVar);
        }
    }

    public static final void v(rim rimVar, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("454bc6ba", new Object[]{rimVar, view});
            return;
        }
        ckf.g(rimVar, "this$0");
        View decorView = rimVar.b.getWindow().getDecorView();
        ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) decorView).removeView(rimVar.f);
        Companion.a();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(android.view.ViewGroup.MarginLayoutParams r4, tb.rim r5, android.animation.ValueAnimator r6) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rim.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "3f3a06ea"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r6
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0018:
            java.lang.String r0 = "$layoutParams"
            tb.ckf.g(r4, r0)
            java.lang.String r0 = "this$0"
            tb.ckf.g(r5, r0)
            java.lang.Object r6 = r6.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            tb.ckf.e(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r4.topMargin = r6
            tb.b12<?, ?, ?, ?, ?> r4 = r5.f27405a
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            r4.requestLayout()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rim.y(android.view.ViewGroup$MarginLayoutParams, tb.rim, android.animation.ValueAnimator):void");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void z(tb.rim r4, android.animation.ValueAnimator r5) {
        /*
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rim.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "af1d2270"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r0.ipc$dispatch(r1, r2)
            return
        L_0x0015:
            java.lang.String r0 = "this$0"
            tb.ckf.g(r4, r0)
            java.lang.Object r5 = r5.getAnimatedValue()
            boolean r0 = r5 instanceof java.lang.Float
            if (r0 == 0) goto L_0x0026
            java.lang.Float r5 = (java.lang.Float) r5
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r5 == 0) goto L_0x0040
            float r5 = r5.floatValue()
            tb.b12<?, ?, ?, ?, ?> r0 = r4.f27405a
            android.view.View r0 = r0.getView()
            tb.ckf.d(r0)
            r0.setTranslationY(r5)
            android.view.View r4 = r4.h
            if (r4 == 0) goto L_0x0040
            r4.setTranslationY(r5)
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rim.z(tb.rim, android.animation.ValueAnimator):void");
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d0861c0", new Object[]{this});
        } else if (this.g) {
            View decorView = this.b.getWindow().getDecorView();
            ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView).addView(this.f, new ViewGroup.LayoutParams(-1, this.e));
        } else {
            View decorView2 = this.b.getWindow().getDecorView();
            ckf.e(decorView2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) decorView2).addView(this.f, new ViewGroup.LayoutParams(-1, (this.c + this.i) - j));
        }
    }

    public final void g(AnimatorListenerAdapter animatorListenerAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3b707ac", new Object[]{this, animatorListenerAdapter});
            return;
        }
        ckf.g(animatorListenerAdapter, "adapter");
        if (this.g) {
            animatorListenerAdapter.onAnimationEnd(null);
        } else {
            s(true, animatorListenerAdapter);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        View decorView = this.b.getWindow().getDecorView();
        ckf.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) decorView).removeView(this.f);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(boolean r4) {
        /*
            r3 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rim.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001a
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r4)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r2 = 0
            r4[r2] = r3
            r2 = 1
            r4[r2] = r1
            java.lang.String r1 = "455d22d4"
            r0.ipc$dispatch(r1, r4)
            return
        L_0x001a:
            tb.b12<?, ?, ?, ?, ?> r0 = r3.f27405a
            android.view.View r0 = r0.getView()
            tb.ckf.d(r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            tb.ckf.e(r0, r1)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r3.c
            r0.topMargin = r1
            tb.b12<?, ?, ?, ?, ?> r0 = r3.f27405a
            android.view.View r0 = r0.getView()
            tb.ckf.d(r0)
            r1 = 4
            r0.setVisibility(r1)
            if (r4 == 0) goto L_0x0054
            tb.b12<?, ?, ?, ?, ?> r4 = r3.f27405a
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            tb.yjz r0 = new tb.yjz
            r0.<init>()
            r4.post(r0)
            goto L_0x0065
        L_0x0054:
            tb.b12<?, ?, ?, ?, ?> r4 = r3.f27405a
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            tb.zjz r0 = new tb.zjz
            r0.<init>()
            r4.post(r0)
        L_0x0065:
            r3.f()
            tb.b12<?, ?, ?, ?, ?> r4 = r3.f27405a
            android.view.View r4 = r4.getView()
            boolean r4 = r4 instanceof tb.onb
            if (r4 == 0) goto L_0x00bb
            tb.b12<?, ?, ?, ?, ?> r4 = r3.f27405a
            android.view.View r4 = r4.getView()
            java.lang.String r0 = "null cannot be cast to non-null type com.taobao.android.searchbaseframe.business.srp.page.uikit.IClipLayout"
            tb.ckf.e(r4, r0)
            tb.onb r4 = (tb.onb) r4
            int r1 = r3.d
            r4.setTopRadius(r1)
            int r1 = r3.i
            int r2 = tb.rim.j
            int r1 = r1 - r2
            r4.setTopOffset(r1)
            tb.b12<?, ?, ?, ?, ?> r4 = r3.f27405a
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            android.graphics.drawable.Drawable r4 = r4.getBackground()
            boolean r4 = r4 instanceof tb.onb
            if (r4 == 0) goto L_0x00bb
            tb.b12<?, ?, ?, ?, ?> r4 = r3.f27405a
            android.view.View r4 = r4.getView()
            tb.ckf.d(r4)
            android.graphics.drawable.Drawable r4 = r4.getBackground()
            tb.ckf.e(r4, r0)
            tb.onb r4 = (tb.onb) r4
            int r0 = r3.d
            r4.setTopRadius(r0)
            int r0 = r3.i
            int r0 = r0 - r2
            r4.setTopOffset(r0)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rim.j(boolean):void");
    }

    public final void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122ee2fa", new Object[]{this});
        } else {
            t(false, 300L);
        }
    }

    public final BaseResultActivity l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseResultActivity) ipChange.ipc$dispatch("3dedb5f8", new Object[]{this});
        }
        return this.b;
    }

    public final int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ab7db0c", new Object[]{this})).intValue();
        }
        return this.i - j;
    }

    public final b12<?, ?, ?, ?, ?> p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b12) ipChange.ipc$dispatch("2da1962c", new Object[]{this});
        }
        return this.f27405a;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(boolean r5, android.animation.AnimatorListenerAdapter r6) {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.rim.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001d
            java.lang.Boolean r1 = new java.lang.Boolean
            r1.<init>(r5)
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r2 = 0
            r5[r2] = r4
            r2 = 1
            r5[r2] = r1
            r1 = 2
            r5[r1] = r6
            java.lang.String r6 = "db73bbe"
            r0.ipc$dispatch(r6, r5)
            return
        L_0x001d:
            tb.b12<?, ?, ?, ?, ?> r0 = r4.f27405a
            android.view.View r0 = r0.getView()
            tb.ckf.d(r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            tb.ckf.e(r0, r1)
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r0.topMargin
            int r2 = r4.c
            if (r1 >= r2) goto L_0x0041
            if (r5 == 0) goto L_0x0041
            if (r6 == 0) goto L_0x0040
            r5 = 0
            r6.onAnimationEnd(r5)
        L_0x0040:
            return
        L_0x0041:
            if (r5 == 0) goto L_0x004e
            int r1 = tb.rim.j
            int[] r1 = new int[]{r2, r1}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
            goto L_0x0058
        L_0x004e:
            int r1 = tb.rim.j
            int[] r1 = new int[]{r1, r2}
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofInt(r1)
        L_0x0058:
            tb.ckz r2 = new tb.ckz
            r2.<init>()
            r1.addUpdateListener(r2)
            tb.rim$f r0 = new tb.rim$f
            r0.<init>(r6)
            r1.addListener(r0)
            r2 = 150(0x96, double:7.4E-322)
            r1.setDuration(r2)
            r1.start()
            if (r5 == 0) goto L_0x008a
            com.taobao.search.sf.BaseResultActivity r5 = r4.b
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup"
            tb.ckf.e(r5, r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r6 = r4.f
            r5.removeView(r6)
            goto L_0x008d
        L_0x008a:
            r4.f()
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rim.s(boolean, android.animation.AnimatorListenerAdapter):void");
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v17, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(boolean r8, long r9) {
        /*
            r7 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.rim.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0022
            java.lang.Boolean r4 = new java.lang.Boolean
            r4.<init>(r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r9)
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r2] = r7
            r9[r1] = r4
            r9[r0] = r8
            java.lang.String r8 = "d6bc68f9"
            r3.ipc$dispatch(r8, r9)
            return
        L_0x0022:
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r4 = 0
            if (r8 == 0) goto L_0x0043
            tb.b12<?, ?, ?, ?, ?> r5 = r7.f27405a
            android.view.View r5 = r5.getView()
            tb.ckf.d(r5)
            int r5 = r5.getMeasuredHeight()
            float r5 = (float) r5
            float[] r6 = new float[r0]
            r6[r2] = r5
            r6[r1] = r4
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r6)
            goto L_0x005b
        L_0x0043:
            tb.b12<?, ?, ?, ?, ?> r5 = r7.f27405a
            android.view.View r5 = r5.getView()
            tb.ckf.d(r5)
            int r5 = r5.getMeasuredHeight()
            float r5 = (float) r5
            float[] r6 = new float[r0]
            r6[r2] = r4
            r6[r1] = r5
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r6)
        L_0x005b:
            tb.akz r5 = new tb.akz
            r5.<init>()
            r4.addUpdateListener(r5)
            tb.rim$h r5 = new tb.rim$h
            r5.<init>(r8)
            r4.addListener(r5)
            if (r8 == 0) goto L_0x007c
            com.taobao.search.sf.BaseResultActivity r5 = r7.b
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5.setBackgroundColor(r6)
        L_0x007c:
            com.taobao.search.sf.BaseResultActivity r5 = r7.b
            android.view.Window r5 = r5.getWindow()
            android.view.View r5 = r5.getDecorView()
            android.graphics.drawable.Drawable r5 = r5.getBackground()
            boolean r6 = r5 instanceof android.graphics.drawable.ColorDrawable
            if (r6 == 0) goto L_0x0091
            android.graphics.drawable.ColorDrawable r5 = (android.graphics.drawable.ColorDrawable) r5
            goto L_0x0092
        L_0x0091:
            r5 = 0
        L_0x0092:
            if (r5 == 0) goto L_0x00c0
            if (r8 == 0) goto L_0x0099
            r5.setAlpha(r2)
        L_0x0099:
            r6 = 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00a6
            int[] r8 = new int[]{r2, r6}
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofInt(r8)
            goto L_0x00ae
        L_0x00a6:
            int[] r8 = new int[]{r6, r2}
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofInt(r8)
        L_0x00ae:
            tb.bkz r6 = new tb.bkz
            r6.<init>()
            r8.addUpdateListener(r6)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r4
            r0[r1] = r8
            r3.playTogether(r0)
            goto L_0x00c7
        L_0x00c0:
            android.animation.Animator[] r8 = new android.animation.Animator[r1]
            r8[r2] = r4
            r3.playTogether(r8)
        L_0x00c7:
            r3.setDuration(r9)
            r3.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.rim.t(boolean, long):void");
    }

    public static final void w(rim rimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("690388bf", new Object[]{rimVar});
            return;
        }
        ckf.g(rimVar, "this$0");
        rimVar.t(true, 300L);
    }

    public static final void x(rim rimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7068bdde", new Object[]{rimVar});
            return;
        }
        ckf.g(rimVar, "this$0");
        rimVar.t(true, 0L);
    }
}
