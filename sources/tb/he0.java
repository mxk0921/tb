package tb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import com.taobao.android.detail.ttdetail.animation.addCartAnimation.AdvAddCartAnimController;
import com.taobao.android.detail.ttdetail.component.module.DinamicXComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class he0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public AnimatorSet f20571a;
    public AnimatorSet b;
    public Runnable c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(912261225);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f20572a;
        public final /* synthetic */ View b;
        public final /* synthetic */ AdvAddCartAnimController c;
        public final /* synthetic */ View d;

        public b(View view, View view2, AdvAddCartAnimController advAddCartAnimController, View view3) {
            this.f20572a = view;
            this.b = view2;
            this.c = advAddCartAnimController;
            this.d = view3;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/animation/addCartAnimation/AddCartAnimUtils$continueAnimNav$$inlined$apply$lambda$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                this.c.e(this.d, this.f20572a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;
        public final /* synthetic */ JSONObject c;
        public final /* synthetic */ String d;
        public final /* synthetic */ DinamicXComponent e;
        public final /* synthetic */ AdvAddCartAnimController f;

        /* compiled from: Taobao */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Ltb/xhv;", "run", "()V", "com/taobao/android/detail/ttdetail/animation/addCartAnimation/AddCartAnimUtils$startAnimBottom$1$4$onAnimationEnd$2", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final /* synthetic */ Ref$ObjectRef b;
            public final /* synthetic */ Ref$ObjectRef c;

            public a(Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2) {
                this.b = ref$ObjectRef;
                this.c = ref$ObjectRef2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                JSONObject jSONObject = (JSONObject) this.b.element;
                if (jSONObject != null) {
                    jSONObject.put((JSONObject) "imageUrl", (String) this.c.element);
                    c.this.e.updateComponent();
                }
                c cVar = c.this;
                AdvAddCartAnimController.f(cVar.f, cVar.b, null, 2, null);
            }
        }

        public c(View view, int[] iArr, JSONObject jSONObject, String str, DinamicXComponent dinamicXComponent, AdvAddCartAnimController advAddCartAnimController) {
            this.b = view;
            this.c = jSONObject;
            this.d = str;
            this.e = dinamicXComponent;
            this.f = advAddCartAnimController;
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/animation/addCartAnimation/AddCartAnimUtils$startAnimBottom$$inlined$apply$lambda$1");
        }

        /* JADX WARN: Type inference failed for: r1v9, types: [T, com.alibaba.fastjson.JSONObject] */
        /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.String] */
        /* JADX WARN: Unknown variable types count: 1 */
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onAnimationEnd(android.animation.Animator r6) {
            /*
                r5 = this;
                r0 = 2
                com.android.alibaba.ip.runtime.IpChange r1 = tb.he0.c.$ipChange
                boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
                if (r2 == 0) goto L_0x0015
                java.lang.String r2 = "8024e25a"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r3 = 0
                r0[r3] = r5
                r3 = 1
                r0[r3] = r6
                r1.ipc$dispatch(r2, r0)
                return
            L_0x0015:
                android.view.View r6 = r5.b
                r1 = 4
                r6.setVisibility(r1)
                kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                r6.<init>()
                r1 = 0
                r6.element = r1
                kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
                r2.<init>()
                r2.element = r1
                com.alibaba.fastjson.JSONObject r1 = r5.c
                java.lang.String r3 = "leftButtons"
                com.alibaba.fastjson.JSONArray r1 = r1.getJSONArray(r3)
                if (r1 == 0) goto L_0x0059
                java.lang.Object r0 = r1.get(r0)
                if (r0 == 0) goto L_0x0059
                boolean r1 = r0 instanceof com.alibaba.fastjson.JSONObject
                if (r1 == 0) goto L_0x0059
                r1 = r0
                com.alibaba.fastjson.JSONObject r1 = (com.alibaba.fastjson.JSONObject) r1
                java.lang.String r3 = "imageUrl"
                java.lang.String r4 = r1.getString(r3)
                r6.element = r4
                java.util.Map r0 = (java.util.Map) r0
                java.lang.String r4 = r5.d
                r0.put(r3, r4)
                r2.element = r1
                com.taobao.android.detail.ttdetail.component.module.DinamicXComponent r0 = r5.e
                r0.updateComponent()
            L_0x0059:
                tb.he0 r0 = tb.he0.this
                tb.he0$c$a r1 = new tb.he0$c$a
                r1.<init>(r2, r6)
                tb.he0.c(r0, r1)
                android.os.Handler r6 = new android.os.Handler
                android.os.Looper r0 = android.os.Looper.getMainLooper()
                r6.<init>(r0)
                tb.he0 r0 = tb.he0.this
                java.lang.Runnable r0 = tb.he0.b(r0)
                r1 = 300(0x12c, double:1.48E-321)
                r6.postDelayed(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: tb.he0.c.onAnimationEnd(android.animation.Animator):void");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;
        public final /* synthetic */ View d;
        public final /* synthetic */ AdvAddCartAnimController e;

        public d(View view, int[] iArr, View view2, View view3, AdvAddCartAnimController advAddCartAnimController) {
            this.b = view;
            this.c = view2;
            this.d = view3;
            this.e = advAddCartAnimController;
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/animation/addCartAnimation/AddCartAnimUtils$startAnimNav$$inlined$apply$lambda$1");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                he0.a(he0.this, this.b, this.d, this.c, this.e);
            }
        }
    }

    static {
        t2o.a(912261224);
    }

    public static final /* synthetic */ void a(he0 he0Var, View view, View view2, View view3, AdvAddCartAnimController advAddCartAnimController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f537504", new Object[]{he0Var, view, view2, view3, advAddCartAnimController});
        } else {
            he0Var.d(view, view2, view3, advAddCartAnimController);
        }
    }

    public static final /* synthetic */ Runnable b(he0 he0Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7383cb28", new Object[]{he0Var});
        }
        return he0Var.c;
    }

    public static final /* synthetic */ void c(he0 he0Var, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e65b776", new Object[]{he0Var, runnable});
        } else {
            he0Var.c = runnable;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        AnimatorSet animatorSet = this.f20571a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.b;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        Runnable runnable = this.c;
        if (runnable != null) {
            new Handler(Looper.getMainLooper()).removeCallbacks(runnable);
        }
        this.f20571a = null;
        this.b = null;
        this.c = null;
    }

    public final void d(View view, View view2, View view3, AdvAddCartAnimController advAddCartAnimController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ebfa86", new Object[]{this, view, view2, view3, advAddCartAnimController});
            return;
        }
        view2.setVisibility(0);
        view.setVisibility(4);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view2, "scaleX", 2.2f), ObjectAnimator.ofFloat(view2, "scaleY", 2.2f));
        animatorSet2.setDuration(150L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(view2, "scaleX", 2.0f), ObjectAnimator.ofFloat(view2, "scaleY", 2.0f));
        animatorSet3.setDuration(150L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(ObjectAnimator.ofFloat(view2, "scaleX", 1.0f), ObjectAnimator.ofFloat(view2, "scaleY", 1.0f), ObjectAnimator.ofFloat(view2, "alpha", 0.0f), ObjectAnimator.ofFloat(view3, "scaleX", 1.2f), ObjectAnimator.ofFloat(view3, "scaleY", 1.2f), ObjectAnimator.ofFloat(view3, "alpha", 1.0f));
        animatorSet4.setDuration(150L);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playTogether(ObjectAnimator.ofFloat(view3, "scaleX", 1.0f), ObjectAnimator.ofFloat(view3, "scaleY", 1.0f));
        animatorSet5.setDuration(150L);
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet4, animatorSet5);
        animatorSet.addListener(new b(view2, view3, advAddCartAnimController, view));
        animatorSet.start();
        this.b = animatorSet;
    }

    public final void f(View view, DinamicXComponent dinamicXComponent, JSONObject jSONObject, String str, int[] iArr, AdvAddCartAnimController advAddCartAnimController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cff3b10", new Object[]{this, view, dinamicXComponent, jSONObject, str, iArr, advAddCartAnimController});
            return;
        }
        ckf.h(view, "animView");
        ckf.h(dinamicXComponent, "component");
        ckf.h(jSONObject, "fields");
        ckf.h(str, "imageUrl");
        ckf.h(iArr, "cartLocation");
        ckf.h(advAddCartAnimController, DataReceiveMonitor.CB_LISTENER);
        tgh.b(AdvAddCartAnimController.TAG, "开始底部bar购物车加购动画");
        view.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 9.2f), ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 9.2f));
        animatorSet2.setDuration(150L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(ObjectAnimator.ofFloat(view, "scaleX", 6.1f), ObjectAnimator.ofFloat(view, "scaleX", 7.1f), ObjectAnimator.ofFloat(view, "scaleX", 6.9f));
        animatorSet4.setDuration(150L);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(ObjectAnimator.ofFloat(view, "scaleY", 6.1f), ObjectAnimator.ofFloat(view, "scaleY", 7.1f), ObjectAnimator.ofFloat(view, "scaleY", 6.9f));
        animatorSet5.setDuration(150L);
        animatorSet3.playTogether(animatorSet4, animatorSet5);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 1.0f), ObjectAnimator.ofFloat(view, "scaleY", 1.0f), ObjectAnimator.ofFloat(view, "translationX", iArr[0]), ObjectAnimator.ofFloat(view, "translationY", iArr[1]));
        animatorSet6.setDuration(300L);
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet6);
        animatorSet.addListener(new c(view, iArr, jSONObject, str, dinamicXComponent, advAddCartAnimController));
        animatorSet.start();
        this.f20571a = animatorSet;
    }

    public final void g(View view, View view2, View view3, int[] iArr, AdvAddCartAnimController advAddCartAnimController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11a1960f", new Object[]{this, view, view2, view3, iArr, advAddCartAnimController});
            return;
        }
        ckf.h(view, "animView");
        ckf.h(view2, "maskView");
        ckf.h(view3, "cartView");
        ckf.h(iArr, "cartLocation");
        ckf.h(advAddCartAnimController, DataReceiveMonitor.CB_LISTENER);
        tgh.b(AdvAddCartAnimController.TAG, "开始导航栏的购物车加购动画");
        view.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f), ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 7.0f), ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 7.0f));
        animatorSet2.setDuration(150L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playSequentially(ObjectAnimator.ofFloat(view, "scaleX", 4.6f), ObjectAnimator.ofFloat(view, "scaleX", 5.4f), ObjectAnimator.ofFloat(view, "scaleX", 5.2f));
        animatorSet4.setDuration(150L);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playSequentially(ObjectAnimator.ofFloat(view, "scaleY", 4.6f), ObjectAnimator.ofFloat(view, "scaleY", 5.4f), ObjectAnimator.ofFloat(view, "scaleY", 5.2f));
        animatorSet5.setDuration(150L);
        animatorSet3.playTogether(animatorSet4, animatorSet5);
        AnimatorSet animatorSet6 = new AnimatorSet();
        animatorSet6.playTogether(ObjectAnimator.ofFloat(view, "scaleX", 0.5f), ObjectAnimator.ofFloat(view, "scaleY", 0.5f), ObjectAnimator.ofFloat(view, "translationX", iArr[0]), ObjectAnimator.ofFloat(view, "translationY", iArr[1]), ObjectAnimator.ofFloat(view3, "alpha", 0.0f), ObjectAnimator.ofFloat(view3, "scaleX", 0.0f), ObjectAnimator.ofFloat(view3, "scaleY", 0.0f));
        animatorSet6.setDuration(300L);
        animatorSet.playSequentially(animatorSet2, animatorSet3, animatorSet6);
        animatorSet.addListener(new d(view, iArr, view3, view2, advAddCartAnimController));
        animatorSet.start();
        this.f20571a = animatorSet;
    }
}
