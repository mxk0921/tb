package tb;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundRectFeature;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import tb.at4;
import tb.f2e;
import tb.mqu;
import tb.r6o;
import tb.spu;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class m2h extends i32 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LinearLayout e;
    public View f;
    public LottieAnimationView g;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m2h.k(m2h.this);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                m2h.j(m2h.this);
            }
        }
    }

    static {
        t2o.a(916455493);
    }

    public static /* synthetic */ Object ipc$super(m2h m2hVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1865040893) {
            super.h();
            return null;
        } else if (hashCode == -893949262) {
            super.g();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/poplayer/msgbox/live/LivePop");
        }
    }

    public static final /* synthetic */ void j(m2h m2hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d7c1b92", new Object[]{m2hVar});
        } else {
            m2hVar.l();
        }
    }

    public static final /* synthetic */ void k(m2h m2hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f2a8f79", new Object[]{m2hVar});
        } else {
            m2hVar.m();
        }
    }

    @Override // tb.cz1
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3710f6a7", new Object[]{this})).intValue();
        }
        r6o.a aVar = r6o.Companion;
        spu.a aVar2 = spu.Companion;
        return aVar.g(aVar2.d()) + aVar.a(aVar2.d());
    }

    @Override // tb.cz1
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
            return;
        }
        super.g();
        LottieAnimationView lottieAnimationView = this.g;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
            View view = this.f;
            if (view != null) {
                view.clearAnimation();
            } else {
                ckf.y("icon");
                throw null;
            }
        } else {
            ckf.y("lottie");
            throw null;
        }
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700a0b93", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.animate().scaleX(0.875f).scaleY(0.875f).setDuration(640L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new a()).start();
        } else {
            ckf.y("icon");
            throw null;
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d231238c", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(640L).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new b()).start();
        } else {
            ckf.y("icon");
            throw null;
        }
    }

    @Override // tb.cz1
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.h();
        LinearLayout linearLayout = this.e;
        if (linearLayout != null) {
            linearLayout.setAlpha(0.0f);
            linearLayout.setScaleX(0.8f);
            linearLayout.setScaleY(0.8f);
            linearLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            l();
            f2e f2eVar = (f2e) c().getService(f2e.class);
            Pair a2 = jpu.a("spm-cnt", "a2141.1");
            Object obj = d().b().get("utParams");
            if (obj == null) {
                obj = kotlin.collections.a.h();
            }
            f2e.a.c(f2eVar, "Page_GuangGuang", "LivePopMessage", kotlin.collections.a.j(a2, jpu.a("utLogMap", obj)), "a2141.1", "tabbar.LivePopMessage", false, 32, null);
            return;
        }
        ckf.y("container");
        throw null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        tpu.a.b(tpu.Companion, "BasePop", "onClick livePop", null, 4, null);
        f2e f2eVar = (f2e) c().getService(f2e.class);
        Pair a2 = jpu.a("spm-cnt", "a2141.1");
        Object obj = d().b().get("utParams");
        if (obj == null) {
            obj = kotlin.collections.a.h();
        }
        f2e.a.a(f2eVar, "Page_GuangGuang", "LivePopMessage", kotlin.collections.a.j(a2, jpu.a("utLogMap", obj)), "a2141.1", "tabbar.LivePopMessage", false, 32, null);
        Object obj2 = d().b().get(rg0.JUMP_URL);
        if (obj2 instanceof String) {
            String str = (String) obj2;
            HashMap hashMap = null;
            if (tsq.I(str, "https://h5.m.taobao.com/guangguang/index.htm", false, 2, null)) {
                vmd vmdVar = (vmd) c().getService(vmd.class);
                Map<String, String> e = mnv.Companion.e(Uri.parse(str));
                mqu.a aVar = mqu.Companion;
                String i = aVar.i(e.get("tabid"), null);
                Map<String, Object> h = aVar.h(e.get("extParams"), null);
                if (h != null) {
                    hashMap = new HashMap(h);
                }
                vmdVar.Z(new nuo(nuo.MSG_URL_REFRESH, i, hashMap, Integer.MAX_VALUE, e));
            } else {
                ((azc) c().getService(azc.class)).e(c().getContext(), str, null);
            }
        }
        a();
    }

    @Override // tb.cz1
    public View f(Context context, cgm cgmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("24081090", new Object[]{this, context, cgmVar});
        }
        ckf.g(context, "context");
        ckf.g(cgmVar, "msg");
        FrameLayout frameLayout = new FrameLayout(context);
        at4.a aVar = at4.Companion;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar.b(context, 750, false), at4.a.c(aVar, context, 114, false, 4, null));
        layoutParams.gravity = 48;
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setClipChildren(false);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, at4.a.c(aVar, context, 72, false, 4, null));
        layoutParams2.gravity = 17;
        linearLayout.setLayoutParams(layoutParams2);
        int c = at4.a.c(aVar, context, 12, false, 4, null);
        linearLayout.setPadding(c, c, c, c);
        linearLayout.setBackgroundDrawable(rx7.Companion.a(Color.argb(204, 17, 25, 45), Color.argb(10, 255, 255, 255), at4.a.c(aVar, context, 1, false, 4, null), at4.a.c(aVar, context, 37, false, 4, null)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setOnClickListener(this);
        linearLayout.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        frameLayout.addView(linearLayout);
        int c2 = at4.a.c(aVar, context, 48, false, 4, null);
        FrameLayout frameLayout2 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(c2, c2);
        layoutParams3.rightMargin = at4.a.c(aVar, context, 10, false, 4, null);
        xhv xhvVar = xhv.INSTANCE;
        frameLayout2.setLayoutParams(layoutParams3);
        frameLayout2.setClipChildren(false);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(c2, c2);
        layoutParams4.gravity = 17;
        tUrlImageView.setLayoutParams(layoutParams4);
        Object obj = cgmVar.b().get(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR);
        if (obj != null) {
            tUrlImageView.setImageUrl((String) obj);
            RoundRectFeature roundRectFeature = new RoundRectFeature();
            roundRectFeature.setRadiusX(at4.a.c(aVar, context, 24, false, 4, null));
            roundRectFeature.setRadiusY(at4.a.c(aVar, context, 24, false, 4, null));
            tUrlImageView.setBackgroundColor(-1);
            tUrlImageView.addFeature(roundRectFeature);
            this.f = tUrlImageView;
            LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
            int c3 = at4.a.c(aVar, context, 60, false, 4, null);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(c3, c3);
            layoutParams5.gravity = 17;
            lottieAnimationView.setLayoutParams(layoutParams5);
            lottieAnimationView.setAnimationFromUrl("https://g.alicdn.com/ani-assets/778312cdf060fc9ff5902622d93fc1ef/0.0.1/lottie.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.playAnimation();
            this.g = lottieAnimationView;
            frameLayout2.addView(tUrlImageView);
            frameLayout2.addView(lottieAnimationView);
            linearLayout.addView(frameLayout2);
            boolean b2 = mqu.Companion.b(cgmVar.b().get("atextSwitch"), false);
            int c4 = at4.a.c(aVar, context, 26, false, 4, null);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
            if (b2) {
                TextView textView = new TextView(context);
                textView.setLayoutParams(layoutParams6);
                textView.setTextColor(-1);
                textView.setTypeface(null, 1);
                textView.setSingleLine();
                float f = c4;
                textView.setTextSize(0, f);
                Object obj2 = cgmVar.b().get("nick");
                if (obj2 != null) {
                    textView.setText((String) obj2);
                    TextView textView2 = new TextView(context);
                    textView2.setLayoutParams(layoutParams6);
                    textView2.setTextColor(-1);
                    textView2.setTypeface(null, 1);
                    textView2.setSingleLine();
                    textView2.setTextSize(0, f);
                    Object obj3 = cgmVar.b().get("text");
                    if (obj3 != null) {
                        textView2.setText((String) obj3);
                        linearLayout.addView(textView);
                        linearLayout.addView(textView2);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                TextView textView3 = new TextView(context);
                textView3.setLayoutParams(layoutParams6);
                textView3.setTextColor(-1);
                textView3.setTypeface(null, 1);
                textView3.setSingleLine();
                textView3.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView3.setTextSize(0, c4);
                textView3.setMaxWidth(at4.a.c(aVar, context, 212, false, 4, null));
                Object obj4 = cgmVar.b().get("text");
                if (obj4 != null) {
                    textView3.setText((String) obj4);
                    linearLayout.addView(textView3);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            TUrlImageView tUrlImageView2 = new TUrlImageView(context);
            int c5 = at4.a.c(aVar, context, 16, false, 4, null);
            int c6 = at4.a.c(aVar, context, 24, false, 4, null);
            int c7 = at4.a.c(aVar, context, 1, false, 4, null);
            int c8 = at4.a.c(aVar, context, Double.valueOf(0.5d), false, 4, null);
            int c9 = at4.a.c(aVar, context, 8, false, 4, null);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(c5, c6);
            layoutParams7.leftMargin = c7;
            layoutParams7.topMargin = c8;
            layoutParams7.rightMargin = c9;
            tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
            tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01omnZ5i1MejDYGjDLB_!!6000000001460-2-tps-32-48.png");
            linearLayout.addView(tUrlImageView2);
            this.e = linearLayout;
            return frameLayout;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
