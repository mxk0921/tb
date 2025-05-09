package com.etao.feimagesearch.circlesearch;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.FEISBaseActivity;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a07;
import tb.a8m;
import tb.acq;
import tb.agh;
import tb.ckf;
import tb.d2m;
import tb.hfn;
import tb.hs3;
import tb.kkh;
import tb.p1p;
import tb.t2o;
import tb.trl;
import tb.ulh;
import tb.wxi;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class CSGestureActivity extends FEISBaseActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final f Companion = new f(null);
    public View c;
    public View d;
    public View e;
    public View f;
    public View g;
    public LottieAnimationView h;
    public View i;
    public LottieAnimationView j;
    public View k;
    public String b = "";
    public Map<String, String> D0 = new LinkedHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Animator.AnimatorListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.etao.feimagesearch.circlesearch.CSGestureActivity$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC0236a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ CSGestureActivity f4723a;

            public RunnableC0236a(CSGestureActivity cSGestureActivity) {
                this.f4723a = cSGestureActivity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                View p3 = CSGestureActivity.p3(this.f4723a);
                if (p3 != null) {
                    p3.setVisibility(8);
                } else {
                    ckf.y("errHintView");
                    throw null;
                }
            }
        }

        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("90a3af63", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4388ea84", new Object[]{this, animator});
            } else {
                ckf.g(animator, "animation");
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3a405721", new Object[]{this, animator});
                return;
            }
            ckf.g(animator, "animation");
            View p3 = CSGestureActivity.p3(CSGestureActivity.this);
            if (p3 != null) {
                p3.setVisibility(0);
                View p32 = CSGestureActivity.p3(CSGestureActivity.this);
                if (p32 != null) {
                    p32.postDelayed(new RunnableC0236a(CSGestureActivity.this), 1000L);
                } else {
                    ckf.y("errHintView");
                    throw null;
                }
            } else {
                ckf.y("errHintView");
                throw null;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class f {
        static {
            t2o.a(730857600);
        }

        public /* synthetic */ f(a07 a07Var) {
            this();
        }

        public f() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class g implements ulh {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // tb.ulh
        public final void onCompositionLoaded(kkh kkhVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e0909eda", new Object[]{this, kkhVar});
                return;
            }
            LottieAnimationView r3 = CSGestureActivity.r3(CSGestureActivity.this);
            if (r3 != null) {
                r3.playAnimation();
            } else {
                ckf.y("topHintAnimView");
                throw null;
            }
        }
    }

    static {
        t2o.a(730857599);
    }

    public static /* synthetic */ Object ipc$super(CSGestureActivity cSGestureActivity, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 514894248) {
            super.attachBaseContext((Context) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/etao/feimagesearch/circlesearch/CSGestureActivity");
        }
    }

    public static final /* synthetic */ void l3(CSGestureActivity cSGestureActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9fdbec6c", new Object[]{cSGestureActivity});
        } else {
            cSGestureActivity.t3();
        }
    }

    public static final /* synthetic */ void m3(CSGestureActivity cSGestureActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3747b549", new Object[]{cSGestureActivity});
        } else {
            cSGestureActivity.u3();
        }
    }

    public static final /* synthetic */ View n3(CSGestureActivity cSGestureActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("164a08f0", new Object[]{cSGestureActivity});
        }
        return cSGestureActivity.f;
    }

    public static final /* synthetic */ LottieAnimationView o3(CSGestureActivity cSGestureActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("d9d2edf6", new Object[]{cSGestureActivity});
        }
        return cSGestureActivity.j;
    }

    public static final /* synthetic */ View p3(CSGestureActivity cSGestureActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("5f1b46d5", new Object[]{cSGestureActivity});
        }
        return cSGestureActivity.k;
    }

    public static final /* synthetic */ View q3(CSGestureActivity cSGestureActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("850d0a6e", new Object[]{cSGestureActivity});
        }
        return cSGestureActivity.c;
    }

    public static final /* synthetic */ LottieAnimationView r3(CSGestureActivity cSGestureActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LottieAnimationView) ipChange.ipc$dispatch("d5ac3f34", new Object[]{cSGestureActivity});
        }
        return cSGestureActivity.h;
    }

    public static final /* synthetic */ void s3(CSGestureActivity cSGestureActivity, RectF rectF) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77cf0108", new Object[]{cSGestureActivity, rectF});
        } else {
            cSGestureActivity.w3(rectF);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        d2m.Companion.a();
    }

    public final void v3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4518f2c", new Object[]{this});
            return;
        }
        View view = this.c;
        if (view != null) {
            view.post(new b());
        } else {
            ckf.y("topContainer");
            throw null;
        }
    }

    public final void x3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d292d53b", new Object[]{this});
            return;
        }
        Window window = getWindow();
        window.setStatusBarColor(0);
        if (Build.VERSION.SDK_INT >= 23) {
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & (-8193));
        }
    }

    public final void y3(ImageView imageView, Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34b4c03b", new Object[]{this, imageView, bitmap});
            return;
        }
        Matrix matrix = new Matrix();
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        int width2 = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        matrix.setTranslate(0.0f, 0.0f);
        imageView.setImageMatrix(matrix);
        imageView.setCropToPadding(true);
        imageView.setPadding(0, 0, width2 - width, height2 - height);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0206  */
    @Override // com.etao.feimagesearch.FEISBaseActivity, com.etao.feimagesearch.ISBaseActivity, com.taobao.baseactivity.CustomBaseActivity, com.taobao.tao.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etao.feimagesearch.circlesearch.CSGestureActivity.onCreate(android.os.Bundle):void");
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            float b = p1p.b(300.0f);
            float b2 = p1p.b(434.0f);
            View q3 = CSGestureActivity.q3(CSGestureActivity.this);
            if (q3 != null) {
                float f = -b;
                q3.setTranslationY(f);
                View n3 = CSGestureActivity.n3(CSGestureActivity.this);
                if (n3 != null) {
                    n3.setTranslationY(b2);
                    AnimatorSet animatorSet = new AnimatorSet();
                    View q32 = CSGestureActivity.q3(CSGestureActivity.this);
                    if (q32 != null) {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(q32, "translationY", f, 0.0f);
                        View n32 = CSGestureActivity.n3(CSGestureActivity.this);
                        if (n32 != null) {
                            animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(n32, "translationY", b2, 0.0f));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            return;
                        }
                        ckf.y("bottomContainer");
                        throw null;
                    }
                    ckf.y("topContainer");
                    throw null;
                }
                ckf.y("bottomContainer");
                throw null;
            }
            ckf.y("topContainer");
            throw null;
        }
    }

    public final void w3(RectF rectF) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4572341b", new Object[]{this, rectF});
            return;
        }
        Bitmap a2 = hs3.INSTANCE.a(this.b, true);
        if (a2 != null) {
            z = false;
        }
        agh.h("CircleSearch", ckf.p("cache frame valid:", Boolean.valueOf(z)));
        if (a2 == null) {
            finish();
            return;
        }
        agh.h("CircleSearch", ckf.p("targetFrame:", trl.f(rectF)));
        int width = a2.getWidth();
        int height = a2.getHeight();
        int c = hfn.c((int) rectF.left, 0);
        int c2 = hfn.c((int) rectF.top, 0);
        int f2 = hfn.f((int) rectF.right, width);
        int f3 = hfn.f((int) rectF.bottom, height);
        int i = f2 - c;
        int i2 = f3 - c2;
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        sb.append(',');
        sb.append(c);
        sb.append(',');
        sb.append(f2);
        sb.append(',');
        sb.append(f3);
        agh.h("CircleSearch", sb.toString());
        if (i <= 0 || i2 <= 0) {
            finish();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        float f4 = width;
        sb2.append(c / f4);
        sb2.append(',');
        sb2.append(f2 / f4);
        sb2.append(',');
        float f5 = c2;
        float f6 = height;
        sb2.append(f5 / f6);
        sb2.append(',');
        sb2.append(f3 / f6);
        String sb3 = sb2.toString();
        agh.h("CircleSearch", ckf.p("assignRegion:", sb3));
        String str = "circle_search";
        IrpParamModel irpParamModel = new IrpParamModel(str);
        PhotoFrom.Values values = PhotoFrom.Values.CIRCLE_SEARCH;
        irpParamModel.setPhotoFrom(values);
        irpParamModel.updateSessionId();
        String p = ckf.p("plt://", this.b);
        long sessionId = irpParamModel.getSessionId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("assignFirstBoxRegion", sb3);
        xhv xhvVar = xhv.INSTANCE;
        a8m.d(a2, p, irpParamModel, sessionId, linkedHashMap);
        d2m.a aVar = d2m.Companion;
        JSONObject jSONObject = new JSONObject();
        String str2 = this.D0.get("spm-cnt");
        if (str2 != null) {
            str = str2;
        }
        jSONObject.put((JSONObject) "pssource", str);
        jSONObject.put((JSONObject) wxi.KEY_PHOTO_FROM, values.getValue());
        jSONObject.put((JSONObject) "assignFirstBoxRegion", sb3);
        jSONObject.put((JSONObject) "sessionId", (String) Long.valueOf(irpParamModel.getSessionId()));
        aVar.c(this, jSONObject);
        finish();
    }

    public final void t3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dfc2fb5", new Object[]{this});
            return;
        }
        float b2 = p1p.b(300.0f);
        float b3 = p1p.b(434.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.d;
        if (view != null) {
            float f2 = -b2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f2, 0.0f);
            View view2 = this.g;
            if (view2 != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationY", f2, 0.0f);
                View view3 = this.e;
                if (view3 != null) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "translationY", b3, 0.0f);
                    LottieAnimationView lottieAnimationView = this.j;
                    if (lottieAnimationView != null) {
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(lottieAnimationView, "translationY", b3, 0.0f);
                        View view4 = this.i;
                        if (view4 != null) {
                            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view4, "alpha", 0.0f, 1.0f));
                            animatorSet.addListener(new a());
                            animatorSet.setDuration(600L);
                            animatorSet.start();
                            return;
                        }
                        ckf.y("hintTv");
                        throw null;
                    }
                    ckf.y("closeBtn");
                    throw null;
                }
                ckf.y("bottomHintBg");
                throw null;
            }
            ckf.y("topHintAnimContainer");
            throw null;
        }
        ckf.y("topHintBg");
        throw null;
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ae0778", new Object[]{this});
            return;
        }
        float b2 = p1p.b(300.0f);
        float b3 = p1p.b(434.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.d;
        if (view != null) {
            float f2 = -b2;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, f2);
            View view2 = this.g;
            if (view2 != null) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationY", 0.0f, f2);
                View view3 = this.e;
                if (view3 != null) {
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view3, "translationY", 0.0f, b3);
                    LottieAnimationView lottieAnimationView = this.j;
                    if (lottieAnimationView != null) {
                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(lottieAnimationView, "translationY", 0.0f, b3);
                        View view4 = this.i;
                        if (view4 != null) {
                            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(view4, "alpha", 1.0f, 0.0f));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            return;
                        }
                        ckf.y("hintTv");
                        throw null;
                    }
                    ckf.y("closeBtn");
                    throw null;
                }
                ckf.y("bottomHintBg");
                throw null;
            }
            ckf.y("topHintAnimContainer");
            throw null;
        }
        ckf.y("topHintBg");
        throw null;
    }
}
