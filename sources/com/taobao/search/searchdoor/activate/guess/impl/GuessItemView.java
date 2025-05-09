package com.taobao.search.searchdoor.activate.guess.impl;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.search.searchdoor.activate.guess.ActivateGuessBean;
import com.taobao.search.sf.RpxConfigVM;
import tb.a07;
import tb.ckf;
import tb.dgw;
import tb.ilt;
import tb.kw1;
import tb.nnh;
import tb.o1p;
import tb.sfe;
import tb.t2o;
import tb.vfe;
import tb.ytk;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class GuessItemView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private float currentViewHeight;
    private int currentViewHeightConverted;
    private boolean hasIcon;
    private ActivateGuessBean lastBean;
    private final b rpxListener;
    private String showText;
    private float showTextLength;
    private boolean tb2024;
    private String watchText;
    private int watchTextColor;
    private float watchTextFontSize;
    public static final a Companion = new a(null);
    private static final float textSize2024 = 13.0f;
    private static final float viewHeight2024 = textSize2024;
    private static final float textSize = 14.0f;
    private static final float viewHeight = textSize;
    private static final float iconSize2024 = 12.0f;
    private static final float iconSize = textSize;
    private static final int textColor2024 = Color.parseColor("#11192D");
    private static final int textColor = Color.parseColor("#333333");
    private static final int iconMargin = o1p.a(2.0f);
    private static final int watchTextMargin = o1p.a(2.0f);
    private final sfe icon = new sfe(this, vfe.INSTANCE, true);
    private final TextPaint paint = new TextPaint(1);
    private final TextPaint watchPaint = new TextPaint(1);
    private float currentTextSize = textSize;
    private float currentIconSize = iconSize;
    private int currentIconSizeConverted = o1p.a(this.currentIconSize);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(815792986);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b implements ytk {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // tb.ytk
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b567900f", new Object[]{this});
                return;
            }
            TextPaint access$getPaint$p = GuessItemView.access$getPaint$p(GuessItemView.this);
            RpxConfigVM.a aVar = RpxConfigVM.Companion;
            Context context = this.b;
            ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
            access$getPaint$p.setTextSize(aVar.f((Activity) context, GuessItemView.access$getCurrentTextSize$p(GuessItemView.this)));
            GuessItemView guessItemView = GuessItemView.this;
            GuessItemView.access$setCurrentIconSizeConverted$p(guessItemView, aVar.f((Activity) this.b, GuessItemView.access$getCurrentIconSize$p(guessItemView)));
            if (GuessItemView.access$getHasIcon$p(GuessItemView.this) && GuessItemView.access$getLastBean$p(GuessItemView.this) != null) {
                sfe access$getIcon$p = GuessItemView.access$getIcon$p(GuessItemView.this);
                ActivateGuessBean access$getLastBean$p = GuessItemView.access$getLastBean$p(GuessItemView.this);
                ckf.d(access$getLastBean$p);
                ActivateGuessBean.PreIconInfo preIconInfo = access$getLastBean$p.preIconInfo;
                ckf.d(preIconInfo);
                access$getIcon$p.j(preIconInfo.url, GuessItemView.access$getCurrentIconSizeConverted$p(GuessItemView.this), GuessItemView.access$getCurrentIconSizeConverted$p(GuessItemView.this));
            }
            GuessItemView guessItemView2 = GuessItemView.this;
            Context context2 = this.b;
            ckf.e(context2, "null cannot be cast to non-null type android.app.Activity");
            GuessItemView.access$setCurrentViewHeightConverted$p(guessItemView2, aVar.f((Activity) context2, GuessItemView.access$getCurrentViewHeight$p(GuessItemView.this)));
            GuessItemView.this.requestLayout();
        }
    }

    static {
        t2o.a(815792985);
    }

    public GuessItemView(Context context) {
        super(context);
        setTag(dgw.APM_VIEW_TOKEN, dgw.APM_VIEW_VALID);
        float f = viewHeight;
        this.currentViewHeight = f;
        this.currentViewHeightConverted = o1p.a(f);
        this.rpxListener = new b(context);
    }

    public static final /* synthetic */ float access$getCurrentIconSize$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f033bfc0", new Object[]{guessItemView})).floatValue();
        }
        return guessItemView.currentIconSize;
    }

    public static final /* synthetic */ int access$getCurrentIconSizeConverted$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9c0a005b", new Object[]{guessItemView})).intValue();
        }
        return guessItemView.currentIconSizeConverted;
    }

    public static final /* synthetic */ float access$getCurrentTextSize$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8dc4d774", new Object[]{guessItemView})).floatValue();
        }
        return guessItemView.currentTextSize;
    }

    public static final /* synthetic */ float access$getCurrentViewHeight$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("91fbc992", new Object[]{guessItemView})).floatValue();
        }
        return guessItemView.currentViewHeight;
    }

    public static final /* synthetic */ boolean access$getHasIcon$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e07eb54", new Object[]{guessItemView})).booleanValue();
        }
        return guessItemView.hasIcon;
    }

    public static final /* synthetic */ sfe access$getIcon$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sfe) ipChange.ipc$dispatch("c85cf894", new Object[]{guessItemView});
        }
        return guessItemView.icon;
    }

    public static final /* synthetic */ ActivateGuessBean access$getLastBean$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivateGuessBean) ipChange.ipc$dispatch("2a37b45b", new Object[]{guessItemView});
        }
        return guessItemView.lastBean;
    }

    public static final /* synthetic */ TextPaint access$getPaint$p(GuessItemView guessItemView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextPaint) ipChange.ipc$dispatch("e02272fb", new Object[]{guessItemView});
        }
        return guessItemView.paint;
    }

    public static final /* synthetic */ void access$setCurrentIconSizeConverted$p(GuessItemView guessItemView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b6e110f", new Object[]{guessItemView, new Integer(i)});
        } else {
            guessItemView.currentIconSizeConverted = i;
        }
    }

    public static final /* synthetic */ void access$setCurrentViewHeightConverted$p(GuessItemView guessItemView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c17aef61", new Object[]{guessItemView, new Integer(i)});
        } else {
            guessItemView.currentViewHeightConverted = i;
        }
    }

    public static /* synthetic */ Object ipc$super(GuessItemView guessItemView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/searchdoor/activate/guess/impl/GuessItemView");
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        ActivateGuessBean activateGuessBean = this.lastBean;
        if (activateGuessBean != null) {
            if (this.hasIcon) {
                sfe sfeVar = this.icon;
                ActivateGuessBean.PreIconInfo preIconInfo = activateGuessBean.preIconInfo;
                ckf.d(preIconInfo);
                String str = preIconInfo.url;
                int i = this.currentIconSizeConverted;
                sfeVar.j(str, i, i);
            }
            RpxConfigVM.a aVar = RpxConfigVM.Companion;
            Context context = getContext();
            ckf.f(context, "getContext(...)");
            aVar.i(context, this.rpxListener);
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        if (this.hasIcon) {
            this.icon.k();
        }
        RpxConfigVM.a aVar = RpxConfigVM.Companion;
        Context context = getContext();
        ckf.f(context, "getContext(...)");
        aVar.j(context, this.rpxListener);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        float f = 0.0f;
        if (this.hasIcon) {
            float f2 = this.currentIconSizeConverted + 0.0f + iconMargin;
            float height = (getHeight() - this.currentIconSizeConverted) / 2.0f;
            canvas.translate(0.0f, height);
            this.icon.h(canvas);
            canvas.translate(0.0f, -height);
            f = f2;
        }
        String str = this.showText;
        if (str != null) {
            kw1.a(canvas, this.paint, f, str, 0.0f, getHeight());
            if (!TextUtils.isEmpty(this.watchText)) {
                String str2 = this.watchText;
                ckf.d(str2);
                kw1.a(canvas, this.watchPaint, f + this.showTextLength + watchTextMargin, str2, 0.0f, getHeight());
            }
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8f105166", new Object[]{this, drawable})).booleanValue();
        }
        return true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        setMeasuredDimension(size, this.currentViewHeightConverted + getPaddingTop() + getPaddingBottom());
        ActivateGuessBean activateGuessBean = this.lastBean;
        if (activateGuessBean != null) {
            if (TextUtils.isEmpty(activateGuessBean.showtext)) {
                this.showText = "";
                return;
            }
            float measureText = this.paint.measureText(activateGuessBean.showtext);
            if (this.hasIcon) {
                size = (size - this.currentIconSizeConverted) - iconMargin;
            }
            if (!TextUtils.isEmpty(this.watchText)) {
                size = (size - ((int) ilt.Companion.a(this.watchText, this.watchPaint))) - watchTextMargin;
            }
            float f = size;
            if (measureText <= f) {
                this.showTextLength = measureText;
                str = activateGuessBean.showtext;
            } else {
                ilt.a aVar = ilt.Companion;
                int breakText = this.paint.breakText(activateGuessBean.showtext, true, f - aVar.a("...", this.paint), null);
                String str2 = activateGuessBean.showtext;
                ckf.f(str2, "showtext");
                String substring = str2.substring(0, breakText);
                ckf.f(substring, "substring(...)");
                str = substring.concat("...");
                this.showTextLength = aVar.a(str, this.paint);
            }
            this.showText = str;
        }
    }

    public final void bind(ActivateGuessBean activateGuessBean, boolean z) {
        float f;
        int i;
        float f2;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c45bedc", new Object[]{this, activateGuessBean, new Boolean(z)});
            return;
        }
        ckf.g(activateGuessBean, "bean");
        if (activateGuessBean != this.lastBean) {
            this.tb2024 = z;
            if (z) {
                f = viewHeight2024;
            } else {
                f = viewHeight;
            }
            this.currentViewHeight = f;
            RpxConfigVM.a aVar = RpxConfigVM.Companion;
            Context context = getContext();
            ckf.e(context, "null cannot be cast to non-null type android.app.Activity");
            this.currentViewHeightConverted = aVar.f((Activity) context, this.currentViewHeight);
            this.lastBean = activateGuessBean;
            ActivateGuessBean.PreIconInfo preIconInfo = activateGuessBean.preIconInfo;
            String str = null;
            this.hasIcon = true ^ TextUtils.isEmpty(preIconInfo != null ? preIconInfo.url : null);
            this.currentTextSize = z ? textSize2024 : textSize;
            Context context2 = getContext();
            ckf.e(context2, "null cannot be cast to non-null type android.app.Activity");
            this.paint.setTextSize(aVar.g((Activity) context2, this.currentTextSize, this.rpxListener));
            TextPaint textPaint = this.paint;
            if (z) {
                i = textColor2024;
            } else {
                i = textColor;
            }
            textPaint.setColor(i);
            if (z) {
                f2 = iconSize2024;
            } else {
                f2 = iconSize;
            }
            this.currentIconSize = f2;
            Context context3 = getContext();
            ckf.e(context3, "null cannot be cast to non-null type android.app.Activity");
            this.currentIconSizeConverted = aVar.g((Activity) context3, this.currentIconSize, this.rpxListener);
            if (this.hasIcon) {
                sfe sfeVar = this.icon;
                ActivateGuessBean.PreIconInfo preIconInfo2 = activateGuessBean.preIconInfo;
                ckf.d(preIconInfo2);
                String str2 = preIconInfo2.url;
                int i3 = this.currentIconSizeConverted;
                sfeVar.j(str2, i3, i3);
            }
            JSONObject jSONObject = activateGuessBean.justWatchInfo;
            this.watchText = jSONObject != null ? jSONObject.getString("text") : null;
            try {
                JSONObject jSONObject2 = activateGuessBean.justWatchInfo;
                this.watchTextFontSize = jSONObject2 != null ? jSONObject2.getFloatValue("fontSize") : 0.0f;
            } catch (Exception unused) {
            }
            float f3 = this.watchTextFontSize;
            if (f3 <= 0.0f) {
                this.watchPaint.setTextSize(this.paint.getTextSize());
            } else if (ScreenType.IS_PAD || ScreenType.IS_FOLDABLE) {
                this.watchPaint.setTextSize(o1p.a(f3 / 2));
            } else {
                TextPaint textPaint2 = this.watchPaint;
                Context context4 = getContext();
                ckf.e(context4, "null cannot be cast to non-null type android.app.Activity");
                textPaint2.setTextSize(f3 * (((Activity) context4).getWindow().getDecorView().getMeasuredWidth() / 750.0f));
            }
            JSONObject jSONObject3 = activateGuessBean.justWatchInfo;
            if (jSONObject3 != null) {
                str = jSONObject3.getString("color");
            }
            Integer a2 = nnh.a(str);
            if (a2 != null) {
                i2 = a2.intValue();
            }
            this.watchTextColor = i2;
            if (i2 != 0) {
                this.watchPaint.setColor(i2);
            } else {
                this.watchPaint.setColor(this.paint.getColor());
            }
            setContentDescription(activateGuessBean.showtext);
            requestLayout();
        }
    }
}
