package com.taobao.themis.pub_kit.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.pub_kit.widget.IActionViewTheme;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xcs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/taobao/themis/pub_kit/widget/PubBackActionView;", "Landroid/widget/FrameLayout;", "Lcom/taobao/themis/pub_kit/widget/IActionViewTheme;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;", "theme", "Ltb/xhv;", "setTheme", "(Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;)V", "Landroid/widget/TextView;", "mBackIconFontView", "Landroid/widget/TextView;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubBackActionView extends FrameLayout implements IActionViewTheme {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final GradientDrawable backgroundDrawable;
    private final TextView mBackIconFontView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(845152405);
            int[] iArr = new int[IActionViewTheme.Theme.values().length];
            iArr[IActionViewTheme.Theme.LIGHT.ordinal()] = 1;
            iArr[IActionViewTheme.Theme.DARK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(845152404);
        t2o.a(845152399);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubBackActionView(Context context) {
        super(context);
        ckf.g(context, "context");
        TextView textView = new TextView(context);
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "uik_iconfont.ttf"));
        textView.setText(context.getString(R.string.uik_icon_tb_Back));
        textView.setTextSize(1, 20.0f);
        IActionViewTheme.a aVar = IActionViewTheme.Companion;
        textView.setTextColor(aVar.g());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xcs.a(context, 20.0f), xcs.a(context, 20.0f));
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        this.mBackIconFontView = textView;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(aVar.a());
        gradientDrawable.setStroke(xcs.a(context, 0.6f), aVar.c());
        gradientDrawable.setCornerRadius(xcs.a(context, 4.0f));
        this.backgroundDrawable = gradientDrawable;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(xcs.a(context, 28.0f), xcs.a(context, 28.0f));
        layoutParams2.setMargins(xcs.a(context, 12.0f), 0, 0, 0);
        setLayoutParams(layoutParams2);
        setBackground(gradientDrawable);
        setContentDescription("返回");
        addView(textView);
    }

    public static /* synthetic */ Object ipc$super(PubBackActionView pubBackActionView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/widget/PubBackActionView");
    }

    public void setTheme(IActionViewTheme.Theme theme) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98afbc8f", new Object[]{this, theme});
            return;
        }
        ckf.g(theme, "theme");
        int i = a.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1) {
            TextView textView = this.mBackIconFontView;
            IActionViewTheme.a aVar = IActionViewTheme.Companion;
            textView.setTextColor(aVar.h());
            this.backgroundDrawable.setColor(aVar.b());
            this.backgroundDrawable.setStroke(xcs.a(getContext(), 0.6f), aVar.d());
        } else if (i == 2) {
            TextView textView2 = this.mBackIconFontView;
            IActionViewTheme.a aVar2 = IActionViewTheme.Companion;
            textView2.setTextColor(aVar2.g());
            this.backgroundDrawable.setColor(aVar2.a());
            this.backgroundDrawable.setStroke(xcs.a(getContext(), 0.6f), aVar2.c());
        }
    }
}
