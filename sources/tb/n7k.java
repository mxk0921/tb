package tb;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alipay.android.msp.biz.substitute.SubstituteConstants;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import com.taobao.uikit.feature.features.RoundRectFeature;
import kotlin.collections.a;
import tb.at4;
import tb.f2e;
import tb.r6o;
import tb.spu;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class n7k extends i32 implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LinearLayout e;

    static {
        t2o.a(916455496);
    }

    public static /* synthetic */ Object ipc$super(n7k n7kVar, String str, Object... objArr) {
        if (str.hashCode() == -1865040893) {
            super.h();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/poplayer/msgbox/normal/NormalPop");
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
            f2e f2eVar = (f2e) c().getService(f2e.class);
            Object obj = d().b().get("utParams");
            if (obj == null) {
                obj = a.h();
            }
            f2e.a.c(f2eVar, "Page_GuangGuang", "PopMessage", v3i.f(jpu.a("utLogMap", obj)), "a2141.1", "tabbar.PopMessage", false, 32, null);
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
        tpu.a.b(tpu.Companion, "BasePop", "onClick normalPop", null, 4, null);
        f2e f2eVar = (f2e) c().getService(f2e.class);
        Object obj = d().b().get("utParams");
        if (obj == null) {
            obj = a.h();
        }
        f2e.a.a(f2eVar, "Page_GuangGuang", "PopMessage", v3i.f(jpu.a("utLogMap", obj)), "a2141.1", "tabbar.PopMessage", false, 32, null);
        azc azcVar = (azc) c().getService(azc.class);
        Context context = c().getContext();
        Object obj2 = d().b().get(rg0.JUMP_URL);
        if (obj2 != null) {
            azcVar.e(context, (String) obj2, null);
            a();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
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
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, at4.a.c(aVar, context, 72, false, 4, null));
        layoutParams2.gravity = 17;
        linearLayout.setLayoutParams(layoutParams2);
        int c = at4.a.c(aVar, context, 12, false, 4, null);
        linearLayout.setPadding(c, c, c, c);
        linearLayout.setBackgroundDrawable(rx7.Companion.a(Color.argb(204, 17, 25, 45), Color.argb(10, 255, 255, 255), at4.a.c(aVar, context, 1, false, 4, null), at4.a.c(aVar, context, 36, false, 4, null)));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setOnClickListener(this);
        frameLayout.addView(linearLayout);
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        int c2 = at4.a.c(aVar, context, 48, false, 4, null);
        tUrlImageView.setLayoutParams(new LinearLayout.LayoutParams(c2, c2));
        Object obj = cgmVar.b().get(SubstituteConstants.KEY_SUBSTITUTE_PAY_AVATAR);
        if (obj != null) {
            tUrlImageView.setImageUrl((String) obj);
            RoundRectFeature roundRectFeature = new RoundRectFeature();
            roundRectFeature.setRadiusX(at4.a.c(aVar, context, 24, false, 4, null));
            roundRectFeature.setRadiusY(at4.a.c(aVar, context, 24, false, 4, null));
            tUrlImageView.setBackgroundColor(-1);
            tUrlImageView.addFeature(roundRectFeature);
            TextView textView = new TextView(context);
            int c3 = at4.a.c(aVar, context, 26, false, 4, null);
            int c4 = at4.a.c(aVar, context, 12, false, 4, null);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.leftMargin = c4;
            textView.setLayoutParams(layoutParams3);
            textView.setTextColor(-1);
            textView.setTypeface(null, 1);
            textView.setSingleLine();
            textView.setTextSize(0, c3);
            Object obj2 = cgmVar.b().get("text");
            if (obj2 != null) {
                textView.setText((String) obj2);
                TUrlImageView tUrlImageView2 = new TUrlImageView(context);
                int c5 = at4.a.c(aVar, context, 16, false, 4, null);
                int c6 = at4.a.c(aVar, context, 24, false, 4, null);
                int c7 = at4.a.c(aVar, context, 1, false, 4, null);
                int c8 = at4.a.c(aVar, context, Double.valueOf(0.5d), false, 4, null);
                int c9 = at4.a.c(aVar, context, 10, false, 4, null);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(c5, c6);
                layoutParams4.leftMargin = c7;
                layoutParams4.topMargin = c8;
                layoutParams4.rightMargin = c9;
                tUrlImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01omnZ5i1MejDYGjDLB_!!6000000001460-2-tps-32-48.png");
                linearLayout.addView(tUrlImageView);
                linearLayout.addView(textView);
                linearLayout.addView(tUrlImageView2);
                this.e = linearLayout;
                return frameLayout;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
