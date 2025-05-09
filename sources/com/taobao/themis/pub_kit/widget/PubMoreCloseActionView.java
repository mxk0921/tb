package com.taobao.themis.pub_kit.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.themis.pub_kit.widget.IActionViewTheme;
import com.taobao.uikit.actionbar.TBActionView;
import kotlin.Metadata;
import tb.ckf;
import tb.t2o;
import tb.xcs;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n \u001a*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/taobao/themis/pub_kit/widget/PubMoreCloseActionView;", "Landroid/widget/RelativeLayout;", "Lcom/taobao/themis/pub_kit/widget/IActionViewTheme;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;", "theme", "Ltb/xhv;", "setTheme", "(Lcom/taobao/themis/pub_kit/widget/IActionViewTheme$Theme;)V", "Lcom/taobao/uikit/actionbar/TBActionView;", "getTBActionView", "()Lcom/taobao/uikit/actionbar/TBActionView;", "Landroid/widget/TextView;", "getBackHomeView", "()Landroid/widget/TextView;", "mPubBackHomeIconFontView", "Landroid/widget/TextView;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/view/View;", "pubMoreCloseBg", "Landroid/view/View;", "kotlin.jvm.PlatformType", "dividerView", "tbActionView", "Lcom/taobao/uikit/actionbar/TBActionView;", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubMoreCloseActionView extends RelativeLayout implements IActionViewTheme {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final GradientDrawable backgroundDrawable;
    private final View dividerView;
    private final TextView mPubBackHomeIconFontView;
    private final View pubMoreCloseBg;
    private final TBActionView tbActionView;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(845152413);
            int[] iArr = new int[IActionViewTheme.Theme.values().length];
            iArr[IActionViewTheme.Theme.LIGHT.ordinal()] = 1;
            iArr[IActionViewTheme.Theme.DARK.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(845152412);
        t2o.a(845152399);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PubMoreCloseActionView(Context context) {
        super(context);
        ckf.g(context, "context");
        View.inflate(context, R.layout.pub_more_close_view, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(xcs.a(context, 68.0f), xcs.a(context, 44.0f));
        layoutParams.setMargins(xcs.a(context, 8.0f), 0, xcs.a(context, 12.0f), 0);
        setLayoutParams(layoutParams);
        View findViewById = findViewById(R.id.back_home_btn);
        TextView textView = (TextView) findViewById;
        textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), "uik_iconfont.ttf"));
        textView.setText(context.getString(R.string.uik_icon_tb_Turnoff));
        textView.setTextSize(1, 20.0f);
        IActionViewTheme.a aVar = IActionViewTheme.Companion;
        textView.setTextColor(aVar.g());
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 != null) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams2;
            layoutParams3.leftMargin = xcs.a(context, 8.0f);
            layoutParams3.rightMargin = xcs.a(context, 4.0f);
            textView.setLayoutParams(layoutParams3);
            ckf.f(findViewById, "findViewById<TextView>(R…text, 4F)\n        }\n    }");
            this.mPubBackHomeIconFontView = (TextView) findViewById;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(aVar.a());
            gradientDrawable.setStroke(xcs.a(context, 0.6f), aVar.c());
            gradientDrawable.setCornerRadius(xcs.a(context, 4.0f));
            this.backgroundDrawable = gradientDrawable;
            int i = R.id.pub_more_close_bg;
            View findViewById2 = findViewById(i);
            findViewById2.setId(i);
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, xcs.a(context, 28.0f));
            layoutParams4.addRule(15);
            layoutParams4.addRule(21);
            layoutParams4.leftMargin = xcs.a(context, 4.0f);
            findViewById2.setLayoutParams(layoutParams4);
            findViewById2.setBackground(gradientDrawable);
            this.pubMoreCloseBg = findViewById2;
            this.dividerView = findViewById(R.id.vertical_bar_view);
            TBActionView tBActionView = (TBActionView) findViewById(R.id.more_btn);
            ViewGroup.LayoutParams layoutParams5 = tBActionView.getLayoutParams();
            if (layoutParams5 != null) {
                RelativeLayout.LayoutParams layoutParams6 = (RelativeLayout.LayoutParams) layoutParams5;
                layoutParams6.rightMargin = xcs.a(context, 8.0f);
                tBActionView.setLayoutParams(layoutParams6);
                this.tbActionView = tBActionView;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    public static /* synthetic */ Object ipc$super(PubMoreCloseActionView pubMoreCloseActionView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/pub_kit/widget/PubMoreCloseActionView");
    }

    public final TextView getBackHomeView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("43a6bd1c", new Object[]{this});
        }
        return this.mPubBackHomeIconFontView;
    }

    public final TBActionView getTBActionView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBActionView) ipChange.ipc$dispatch("fe79f39c", new Object[]{this});
        }
        TBActionView tBActionView = this.tbActionView;
        ckf.f(tBActionView, "tbActionView");
        return tBActionView;
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
            View view = this.dividerView;
            if (view != null) {
                view.setBackgroundColor(IActionViewTheme.Companion.f());
            }
            TBActionView tBActionView = this.tbActionView;
            IActionViewTheme.a aVar = IActionViewTheme.Companion;
            tBActionView.setIconColor(aVar.h());
            this.mPubBackHomeIconFontView.setTextColor(aVar.h());
            this.backgroundDrawable.setColor(aVar.b());
            this.backgroundDrawable.setStroke(xcs.a(getContext(), 0.6f), aVar.d());
        } else if (i == 2) {
            View view2 = this.dividerView;
            if (view2 != null) {
                view2.setBackgroundColor(IActionViewTheme.Companion.e());
            }
            TBActionView tBActionView2 = this.tbActionView;
            IActionViewTheme.a aVar2 = IActionViewTheme.Companion;
            tBActionView2.setIconColor(aVar2.g());
            this.mPubBackHomeIconFontView.setTextColor(aVar2.g());
            this.backgroundDrawable.setColor(aVar2.a());
            this.backgroundDrawable.setStroke(xcs.a(getContext(), 0.6f), aVar2.c());
        }
    }
}
