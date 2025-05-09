package tb;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.at4;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class mr3 extends xv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final b Companion = new b(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                mr3.l(mr3.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b {
        static {
            t2o.a(916455675);
        }

        public b() {
        }

        public /* synthetic */ b(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455674);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr3(qpu qpuVar) {
        super(qpuVar);
        ckf.g(qpuVar, "turboEngineContext");
    }

    public static /* synthetic */ Object ipc$super(mr3 mr3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/turbo/service/topbar/component/ChildTipBarComponent");
    }

    public static final /* synthetic */ void l(mr3 mr3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c04da08", new Object[]{mr3Var});
        } else {
            mr3Var.m();
        }
    }

    public final void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c79264c7", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "ChildTipBarComponent", "处理点击", null, 4, null);
        ((azc) k().getService(azc.class)).e(getContext(), "https://market.m.taobao.com/app/customer-experience-improvement/modeSwitcher/home?wh_weex=true&bizScene=homeLite", null);
    }

    public final void n(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87974137", new Object[]{this, view});
            return;
        }
        view.setVisibility(8);
        setShowing(false);
    }

    @Override // com.taobao.android.turbo.core.component.BaseComponent
    public FrameLayout createViewImpl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b62bb851", new Object[]{this});
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        n(frameLayout);
        TUrlImageView tUrlImageView = new TUrlImageView(getContext());
        at4.a aVar = at4.Companion;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(at4.a.c(aVar, getContext(), 18, false, 4, null), at4.a.c(aVar, getContext(), 9, false, 4, null));
        layoutParams.setMarginStart(at4.a.c(aVar, getContext(), 265, false, 4, null));
        tUrlImageView.setLayoutParams(layoutParams);
        tUrlImageView.setImageUrl("https://img.alicdn.com/imgextra/i4/O1CN01I69I6a1spmQcgEtif_!!6000000005816-2-tps-52-26.png");
        frameLayout.addView(tUrlImageView);
        LinearLayout linearLayout = new LinearLayout(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(at4.a.c(aVar, getContext(), 390, false, 4, null), at4.a.c(aVar, getContext(), 72, false, 4, null));
        layoutParams2.topMargin = at4.a.c(aVar, getContext(), 9, false, 4, null);
        linearLayout.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#f2212121"));
        gradientDrawable.setCornerRadius(at4.a.c(aVar, getContext(), 36, false, 4, null));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new a());
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setText("已开启未成年人模式");
        textView.setTextColor(-1);
        textView.setTextSize(0, at4.a.c(aVar, getContext(), 26, false, 4, null));
        linearLayout.addView(textView);
        TUrlImageView tUrlImageView2 = new TUrlImageView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(at4.a.c(aVar, getContext(), 2, false, 4, null), at4.a.c(aVar, getContext(), 30, false, 4, null));
        layoutParams3.setMarginStart(at4.a.c(aVar, getContext(), 15, false, 4, null));
        layoutParams3.setMarginEnd(at4.a.c(aVar, getContext(), 15, false, 4, null));
        tUrlImageView2.setLayoutParams(layoutParams3);
        tUrlImageView2.setImageUrl("https://img.alicdn.com/imgextra/i1/O1CN01u9u3ZP206uY688CXP_!!6000000006801-2-tps-3-33.png");
        linearLayout.addView(tUrlImageView2);
        TextView textView2 = new TextView(getContext());
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView2.setText("关闭");
        textView2.setTextColor(tkt.DEFAULT_SHADOW_COLOR);
        textView2.setTextSize(0, at4.a.c(aVar, getContext(), 26, false, 4, null));
        linearLayout.addView(textView2);
        TUrlImageView tUrlImageView3 = new TUrlImageView(getContext());
        tUrlImageView3.setLayoutParams(new LinearLayout.LayoutParams(at4.a.c(aVar, getContext(), 34, false, 4, null), at4.a.c(aVar, getContext(), 34, false, 4, null)));
        tUrlImageView3.setImageUrl("https://img.alicdn.com/imgextra/i2/O1CN01jq6NVI1TQiM5aLlYG_!!6000000002377-2-tps-48-48.png");
        linearLayout.addView(tUrlImageView3);
        return frameLayout;
    }
}
