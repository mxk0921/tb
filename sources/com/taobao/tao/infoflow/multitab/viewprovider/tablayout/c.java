package com.taobao.tao.infoflow.multitab.viewprovider.tablayout;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.MultiTabLayout;
import com.taobao.tao.infoflow.multitab.viewprovider.tablayout.g;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import tb.i2b;
import tb.p2b;
import tb.s8d;
import tb.srs;
import tb.t2o;
import tb.trs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BUBBLE_TAG = "bubbleTag";
    public static final String TAB_TAG = "tabTag";
    public static final String TAG_LABEL = "labelTag";
    public static final String TAG_TEXT = "textTag";

    /* renamed from: a  reason: collision with root package name */
    public final srs f12452a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f12453a;
        public final /* synthetic */ FrameLayout b;
        public final /* synthetic */ int c;

        public a(c cVar, b bVar, FrameLayout frameLayout, int i) {
            this.f12453a = bVar;
            this.b = frameLayout;
            this.c = i;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            b bVar = this.f12453a;
            if (bVar != null) {
                ((g.a) bVar).a(this.b, this.c);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface b {
    }

    static {
        t2o.a(729809507);
    }

    public c(srs srsVar) {
        this.f12452a = srsVar;
    }

    public View a(MultiTabLayout multiTabLayout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b1d7c0ef", new Object[]{this, multiTabLayout});
        }
        MultiTabLayout.d indicatorConfig = multiTabLayout.getIndicatorConfig();
        View view = new View(multiTabLayout.getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(indicatorConfig.d);
        gradientDrawable.setColor(indicatorConfig.e);
        view.setBackground(gradientDrawable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(indicatorConfig.b, indicatorConfig.f12450a);
        view.setPadding(0, 0, 0, indicatorConfig.c);
        view.setLayoutParams(layoutParams);
        return view;
    }

    public final TUrlImageView b(String str, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("ec33b797", new Object[]{this, str, context});
        }
        TUrlImageView tUrlImageView = new TUrlImageView(context);
        if (TextUtils.isEmpty(str)) {
            return tUrlImageView;
        }
        if (str.endsWith("apng") || str.endsWith("gif")) {
            tUrlImageView.setSkipAutoSize(true);
            tUrlImageView.setWhenNullClearImg(false);
        }
        p2b.q(tUrlImageView, str, "homepage-ads", i2b.IMAGE_STRATEGY_CONFIG);
        tUrlImageView.setImageUrl(str);
        tUrlImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        return tUrlImageView;
    }

    public final FrameLayout c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("73f7274d", new Object[]{this, context});
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        return frameLayout;
    }

    public final View d(Context context, FrameLayout frameLayout, String str, int i, boolean z, ViewGroup.LayoutParams layoutParams, b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("d7e21883", new Object[]{this, context, frameLayout, str, new Integer(i), new Boolean(z), layoutParams, bVar});
        }
        this.f12452a.B(str);
        TUrlImageView b2 = b(str, context);
        layoutParams.width = (int) (trs.a(context, this.f12452a.k) * this.f12452a.i(i, z));
        layoutParams.height = trs.a(context, this.f12452a.k);
        b2.succListener(new a(this, bVar, frameLayout, i));
        return b2;
    }

    public final FrameLayout.LayoutParams e(Context context, int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("791beea1", new Object[]{this, context, new Integer(i)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int a2 = trs.a(context, this.f12452a.n);
        int a3 = trs.a(context, this.f12452a.o);
        if (this.f12452a.z()) {
            layoutParams.leftMargin = 0;
        } else {
            if (i == 0) {
                i2 = a3;
            }
            layoutParams.leftMargin = i2;
        }
        layoutParams.gravity = 8388627;
        layoutParams.rightMargin = a2 * 2;
        return layoutParams;
    }

    public final FrameLayout.LayoutParams i(int i, int i2, boolean z) {
        int i3;
        int i4 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout.LayoutParams) ipChange.ipc$dispatch("d6a045a", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.width = i;
        layoutParams.height = i2;
        if (z) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        layoutParams.leftMargin = i3;
        if (z) {
            i4 = 0;
        }
        layoutParams.rightMargin = i4;
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public final View f(Context context, int i, boolean z, srs.b bVar) {
        int i2;
        boolean z2;
        float f;
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("9dba4b9d", new Object[]{this, context, new Integer(i), new Boolean(z), bVar});
        }
        LinearLayout linearLayout = new LinearLayout(context);
        new LinearLayout.LayoutParams(-2, -1).setLayoutDirection(0);
        srs srsVar = this.f12452a;
        if (z) {
            i2 = srsVar.i;
        } else {
            i2 = srsVar.h;
        }
        int a2 = trs.a(context, i2);
        srs srsVar2 = this.f12452a;
        if (z) {
            z2 = srsVar2.F;
        } else {
            z2 = srsVar2.G;
        }
        linearLayout.addView(g(context, this.f12452a.o(z), bVar.f28239a, z2, a2));
        String y = this.f12452a.y(i, z);
        if (z) {
            f = bVar.A * 24.0f;
        } else {
            f = bVar.v * 21.0f;
        }
        int a3 = trs.a(context, f);
        boolean equals = TextUtils.equals(bVar.u, "right");
        if (z) {
            i3 = trs.a(context, 24.0f);
        } else {
            i3 = trs.a(context, 21.0f);
        }
        FrameLayout.LayoutParams i4 = i(a3, i3, equals);
        TUrlImageView b2 = b(y, context);
        if (!TextUtils.isEmpty(y) && (y.endsWith("apng") || y.endsWith("gif"))) {
            b2.setSkipAutoSize(true);
            b2.setWhenNullClearImg(false);
        }
        b2.setLayoutParams(i4);
        b2.setTag(TAG_LABEL);
        b2.setVisibility(TextUtils.isEmpty(y) ? 8 : 0);
        if (equals) {
            linearLayout.addView(b2);
        } else {
            linearLayout.addView(b2, 0);
        }
        return linearLayout;
    }

    public final TextView g(Context context, int i, String str, boolean z, int i2) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("74feb86f", new Object[]{this, context, new Integer(i), str, new Boolean(z), new Integer(i2)});
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 16;
        TextView textView = new TextView(context);
        textView.setTextColor(i);
        textView.setTextSize(0, i2);
        textView.setText(str);
        if (z) {
            typeface = Typeface.defaultFromStyle(1);
        } else {
            typeface = Typeface.defaultFromStyle(0);
        }
        textView.setTypeface(typeface);
        textView.setMaxLines(1);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setLayoutParams(layoutParams);
        textView.setTag(TAG_TEXT);
        return textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.view.ViewGroup$LayoutParams, android.widget.FrameLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.ViewGroup$LayoutParams, android.widget.FrameLayout$LayoutParams] */
    /* JADX WARN: Unknown variable types count: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.dqz h(android.content.Context r18, int r19, int r20, boolean r21, com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.b r22) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c.h(android.content.Context, int, int, boolean, com.taobao.tao.infoflow.multitab.viewprovider.tablayout.c$b):tb.dqz");
    }
}
