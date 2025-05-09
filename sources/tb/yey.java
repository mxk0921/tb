package tb;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Map;
import kotlin.Pair;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class yey<DATA> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final String TAG = "BasePop";
    private final Context context;
    public DATA data;
    private cuy dialog;
    public g1a<? super Map<String, ? extends Object>, xhv> dismissCallback;
    private yey<DATA>.b popAnimation;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963150);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Animation f32031a;
        public Animation b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public static final class a implements Animation.AnimationListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Animation.AnimationListener f32032a;

            public a(Animation.AnimationListener animationListener) {
                this.f32032a = animationListener;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                    return;
                }
                ckf.g(animation, "animation");
                Animation.AnimationListener animationListener = this.f32032a;
                if (animationListener != null) {
                    animationListener.onAnimationEnd(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
                    return;
                }
                ckf.g(animation, "animation");
                Animation.AnimationListener animationListener = this.f32032a;
                if (animationListener != null) {
                    animationListener.onAnimationRepeat(animation);
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                    return;
                }
                ckf.g(animation, "animation");
                Animation.AnimationListener animationListener = this.f32032a;
                if (animationListener != null) {
                    animationListener.onAnimationStart(animation);
                }
            }
        }

        static {
            t2o.a(689963151);
        }

        public b(yey yeyVar, Animation animation, Animation animation2) {
            ckf.g(animation, "inAnimation");
            ckf.g(animation2, "outAnimation");
            Animation createInAnimation = yeyVar.createInAnimation("bottom");
            ckf.d(createInAnimation);
            this.f32031a = createInAnimation;
            Animation createOutAnimation = yeyVar.createOutAnimation("bottom");
            ckf.d(createOutAnimation);
            this.b = createOutAnimation;
            d(animation);
            e(animation2);
        }

        public final void a(View view, Animation animation, Animation.AnimationListener animationListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be633d3a", new Object[]{this, view, animation, animationListener});
            } else if (view != null) {
                animation.setAnimationListener(new a(animationListener));
                view.clearAnimation();
                view.startAnimation(animation);
            }
        }

        public final void b(View view, Animation.AnimationListener animationListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("646dab5e", new Object[]{this, view, animationListener});
                return;
            }
            ckf.g(view, "mContentView");
            a(view, this.b, animationListener);
        }

        public final void c(View view, Animation.AnimationListener animationListener) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a92632af", new Object[]{this, view, animationListener});
                return;
            }
            ckf.g(view, "mContentView");
            a(view, this.f32031a, animationListener);
        }

        public final void d(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f0d6dde4", new Object[]{this, animation});
            } else {
                this.f32031a = animation;
            }
        }

        public final void e(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2e6428df", new Object[]{this, animation});
            } else {
                this.b = animation;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class c implements DialogInterface.OnShowListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
            } else {
                yey.this.onShow();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class d implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            } else {
                yey.this.onDismiss();
            }
        }
    }

    static {
        t2o.a(689963149);
    }

    public yey(Context context) {
        ckf.g(context, "context");
        this.context = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.animation.Animation createInAnimation(java.lang.String r11) {
        /*
            r10 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.yey.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = "3e0af402"
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r10
            r3 = 1
            r2[r3] = r11
            java.lang.Object r11 = r0.ipc$dispatch(r1, r2)
            android.view.animation.Animation r11 = (android.view.animation.Animation) r11
            return r11
        L_0x0018:
            if (r11 != 0) goto L_0x001c
            goto L_0x0085
        L_0x001c:
            int r0 = r11.hashCode()
            r8 = 1
            switch(r0) {
                case -1383228885: goto L_0x006e;
                case 115029: goto L_0x0056;
                case 3317767: goto L_0x003e;
                case 108511772: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0085
        L_0x0026:
            java.lang.String r0 = "right"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r7 = 0
            r9 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            r1 = r11
            r2 = r8
            r4 = r8
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0086
        L_0x003e:
            java.lang.String r0 = "left"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r7 = 0
            r9 = 0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 0
            r1 = r11
            r2 = r8
            r4 = r8
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0086
        L_0x0056:
            java.lang.String r0 = "top"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r9 = 0
            r3 = 0
            r5 = 0
            r1 = r11
            r2 = r8
            r4 = r8
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0086
        L_0x006e:
            java.lang.String r0 = "bottom"
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r11 = new android.view.animation.TranslateAnimation
            r7 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r3 = 0
            r5 = 0
            r1 = r11
            r2 = r8
            r4 = r8
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0086
        L_0x0085:
            r11 = 0
        L_0x0086:
            if (r11 == 0) goto L_0x008d
            r0 = 300(0x12c, double:1.48E-321)
            r11.setDuration(r0)
        L_0x008d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yey.createInAnimation(java.lang.String):android.view.animation.Animation");
    }

    public final void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
            return;
        }
        vgh.c(this, "BasePop", "dismiss " + this);
        cuy cuyVar = this.dialog;
        if (cuyVar == null) {
            ckf.y("dialog");
            throw null;
        } else if (cuyVar == null) {
        } else {
            if (cuyVar != null) {
                cuyVar.dismiss();
            } else {
                ckf.y("dialog");
                throw null;
            }
        }
    }

    public boolean enableDim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a5eb4e10", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public final Context getContext() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.context;
    }

    public final DATA getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DATA) ipChange.ipc$dispatch("4ca84d6b", new Object[]{this});
        }
        DATA data = this.data;
        if (data != null) {
            return data;
        }
        ckf.y("data");
        throw null;
    }

    public final g1a<Map<String, ? extends Object>, xhv> getDismissCallback() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g1a) ipChange.ipc$dispatch("d448679c", new Object[]{this});
        }
        g1a g1aVar = this.dismissCallback;
        if (g1aVar != null) {
            return g1aVar;
        }
        ckf.y("dismissCallback");
        throw null;
    }

    public Pair<Animation, Animation> onCreateAnimations() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("34513a7a", new Object[]{this});
        }
        return null;
    }

    public abstract View onCreateView(Context context, DATA data);

    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        vgh.c(this, "BasePop", "onDismiss " + this);
    }

    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        vgh.c(this, "BasePop", "onShow " + this);
    }

    public final void setData(DATA data) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, data});
            return;
        }
        ckf.g(data, "<set-?>");
        this.data = data;
    }

    public final void setDismissCallback(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3781bfa", new Object[]{this, g1aVar});
            return;
        }
        ckf.g(g1aVar, "<set-?>");
        this.dismissCallback = g1aVar;
    }

    public final void show(DATA data, g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59a31da6", new Object[]{this, data, g1aVar});
            return;
        }
        ckf.g(data, "data");
        ckf.g(g1aVar, "dismissCallback");
        this.data = data;
        this.dismissCallback = g1aVar;
        Context context = this.context;
        if (enableDim()) {
            i = R.style.interact_popup_dialog_dim_style;
        } else {
            i = R.style.interact_popup_dialog_style;
        }
        cuy cuyVar = new cuy(context, i);
        this.dialog = cuyVar;
        cuyVar.setCanceledOnTouchOutside(true);
        cuy cuyVar2 = this.dialog;
        if (cuyVar2 != null) {
            cuyVar2.setContentView(onCreateView(this.context, data));
            cuy cuyVar3 = this.dialog;
            if (cuyVar3 != null) {
                Window window = cuyVar3.getWindow();
                ckf.d(window);
                Pair<Animation, Animation> onCreateAnimations = onCreateAnimations();
                if (onCreateAnimations != null) {
                    yey<DATA>.b bVar = new b(this, onCreateAnimations.getFirst(), onCreateAnimations.getSecond());
                    this.popAnimation = bVar;
                    cuy cuyVar4 = this.dialog;
                    if (cuyVar4 != null) {
                        cuyVar4.b(bVar);
                    } else {
                        ckf.y("dialog");
                        throw null;
                    }
                } else {
                    window.setWindowAnimations(R.style.InteractivePopLayer);
                }
                cuy cuyVar5 = this.dialog;
                if (cuyVar5 != null) {
                    cuyVar5.setOnShowListener(new c());
                    cuy cuyVar6 = this.dialog;
                    if (cuyVar6 != null) {
                        cuyVar6.setOnDismissListener(new d());
                        cuy cuyVar7 = this.dialog;
                        if (cuyVar7 != null) {
                            cuyVar7.show();
                            Context context2 = this.context;
                            if (context2 instanceof Activity) {
                                duy.a((Activity) context2, window);
                                return;
                            }
                            return;
                        }
                        ckf.y("dialog");
                        throw null;
                    }
                    ckf.y("dialog");
                    throw null;
                }
                ckf.y("dialog");
                throw null;
            }
            ckf.y("dialog");
            throw null;
        }
        ckf.y("dialog");
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.animation.Animation createOutAnimation(java.lang.String r12) {
        /*
            r11 = this;
            r0 = 1
            com.android.alibaba.ip.runtime.IpChange r1 = tb.yey.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "5befb573"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r11
            r3[r0] = r12
            java.lang.Object r12 = r1.ipc$dispatch(r2, r3)
            android.view.animation.Animation r12 = (android.view.animation.Animation) r12
            return r12
        L_0x0018:
            if (r12 != 0) goto L_0x001c
            goto L_0x0085
        L_0x001c:
            int r1 = r12.hashCode()
            r9 = 1
            switch(r1) {
                case -1383228885: goto L_0x006e;
                case 115029: goto L_0x0056;
                case 3317767: goto L_0x003e;
                case 108511772: goto L_0x0026;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x0085
        L_0x0026:
            java.lang.String r1 = "right"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r12 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = 0
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            r2 = r12
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0086
        L_0x003e:
            java.lang.String r1 = "left"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r12 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = 0
            r4 = 0
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r12
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0086
        L_0x0056:
            java.lang.String r1 = "top"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r12 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r6 = 0
            r2 = r12
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0086
        L_0x006e:
            java.lang.String r1 = "bottom"
            boolean r12 = r12.equals(r1)
            if (r12 == 0) goto L_0x0085
            android.view.animation.TranslateAnimation r12 = new android.view.animation.TranslateAnimation
            r8 = 0
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r6 = 0
            r2 = r12
            r3 = r9
            r5 = r9
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0086
        L_0x0085:
            r12 = 0
        L_0x0086:
            if (r12 == 0) goto L_0x0090
            r1 = 300(0x12c, double:1.48E-321)
            r12.setDuration(r1)
            r12.setFillAfter(r0)
        L_0x0090:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yey.createOutAnimation(java.lang.String):android.view.animation.Animation");
    }
}
