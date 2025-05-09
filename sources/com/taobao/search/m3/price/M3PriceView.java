package com.taobao.search.m3.price;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.m3.BaseItemView;
import com.taobao.search.m3.price.M3PriceView;
import com.taobao.tao.Globals;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import tb.a07;
import tb.c04;
import tb.ckf;
import tb.lwm;
import tb.mwm;
import tb.nwm;
import tb.o1p;
import tb.pwm;
import tb.qwm;
import tb.swm;
import tb.t2o;
import tb.tfe;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class M3PriceView extends BaseItemView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Typeface priceTypeface;
    private final swm comment;
    private final qwm commentPart;
    private pwm currentPrice;
    private boolean hasBackground;
    private boolean hasIcon;
    private final nwm icon;
    private final qwm iconPart;
    private final swm location;
    private final qwm locationPart;
    private int measureHeight;
    private final swm originPrice;
    private final qwm originPricePart;
    private final swm preText;
    private final qwm preTextPart;
    private final lwm price;
    private final qwm pricePart;
    private final swm sold;
    private final qwm soldPart;
    private final swm subText;
    private final qwm subTextPart;
    private final swm suffixText;
    private final qwm suffixTextPart;
    private int textHeight;
    private final boolean waterfall;
    public static final a Companion = new a(null);
    private static final int itemMargin = o1p.a(4.5f);
    private static final float commonTextSize = o1p.a(12.0f);
    private static final int commonTextColor = Color.parseColor("#999999");
    private static final int textPaddingBottom = o1p.a(0.5f);
    private static final int rightPadding = o1p.a(11.0f);
    private static final int leftPadding = o1p.a(5.0f);
    private static final int soldColor2024 = Color.parseColor("#50607A");
    private static final int priceHeightWithBackground = o1p.a(25.0f);
    private final ArrayList<qwm> drawList = new ArrayList<>(9);
    private ArrayList<qwm> drawListWithPriority = new ArrayList<>(9);
    private final tfe backgroundImage = new tfe(this, null, 2, null);
    private String currentBackgroundUrl = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792426);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final Typeface a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Typeface) ipChange.ipc$dispatch("b8826d87", new Object[]{this});
            }
            return M3PriceView.access$getPriceTypeface$cp();
        }

        public final int b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bc0c34b3", new Object[]{this})).intValue();
            }
            return M3PriceView.access$getTextPaddingBottom$cp();
        }

        public a() {
        }
    }

    static {
        t2o.a(815792425);
        Typeface createFromAsset = Typeface.createFromAsset(Globals.getApplication().getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
        ckf.f(createFromAsset, "createFromAsset(...)");
        priceTypeface = createFromAsset;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3PriceView(Context context, boolean z) {
        super(context);
        ckf.g(context, "context");
        this.waterfall = z;
        nwm nwmVar = new nwm(this);
        this.icon = nwmVar;
        this.iconPart = new qwm(nwmVar, 3, false);
        swm swmVar = new swm(this);
        this.preText = swmVar;
        this.preTextPart = new qwm(swmVar, 99, false);
        lwm lwmVar = new lwm(this);
        this.price = lwmVar;
        this.pricePart = new qwm(lwmVar, 100, true);
        swm swmVar2 = new swm(this);
        this.suffixText = swmVar2;
        this.suffixTextPart = new qwm(swmVar2, 2, false);
        swm swmVar3 = new swm(this);
        this.subText = swmVar3;
        this.subTextPart = new qwm(swmVar3, 4, false);
        swm swmVar4 = new swm(this);
        this.originPrice = swmVar4;
        this.originPricePart = new qwm(swmVar4, 0, false);
        swm swmVar5 = new swm(this);
        this.sold = swmVar5;
        this.soldPart = new qwm(swmVar5, 5, false);
        swm swmVar6 = new swm(this);
        this.comment = swmVar6;
        this.commentPart = new qwm(swmVar6, 2, false);
        swm swmVar7 = new swm(this);
        this.location = swmVar7;
        this.locationPart = new qwm(swmVar7, 1, false);
    }

    public static final /* synthetic */ Typeface access$getPriceTypeface$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("d95dea44", new Object[0]);
        }
        return priceTypeface;
    }

    public static final /* synthetic */ int access$getTextPaddingBottom$cp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1fc5a172", new Object[0])).intValue();
        }
        return textPaddingBottom;
    }

    private final void addToDrawList(qwm qwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47af34f3", new Object[]{this, qwmVar});
            return;
        }
        this.drawList.add(qwmVar);
        this.drawListWithPriority.add(qwmVar);
    }

    private final void commit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c9f3a3e", new Object[]{this});
        } else {
            c04.u(this.drawListWithPriority, new Comparator() { // from class: tb.qbz
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int commit$lambda$0;
                    commit$lambda$0 = M3PriceView.commit$lambda$0((qwm) obj, (qwm) obj2);
                    return commit$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int commit$lambda$0(qwm qwmVar, qwm qwmVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6fcf5af6", new Object[]{qwmVar, qwmVar2})).intValue();
        }
        return qwmVar2.b() - qwmVar.b();
    }

    public static /* synthetic */ Object ipc$super(M3PriceView m3PriceView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        } else if (hashCode == 1626033557) {
            super.onAttachedToWindow();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/m3/price/M3PriceView");
        }
    }

    private final void loadIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2076bf86", new Object[]{this});
            return;
        }
        pwm pwmVar = this.currentPrice;
        if (pwmVar != null && this.hasIcon) {
            nwm nwmVar = this.icon;
            ckf.d(pwmVar);
            nwmVar.a(pwmVar);
        }
    }

    private final void releaseIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("470471a7", new Object[]{this});
        } else if (this.hasIcon) {
            this.icon.release();
        }
    }

    private final void renderBackgroundImage(boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("998d9536", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.hasBackground = false;
        } else {
            if (this.waterfall) {
                pwm pwmVar = this.currentPrice;
                ckf.d(pwmVar);
                str = pwmVar.q();
            } else {
                pwm pwmVar2 = this.currentPrice;
                ckf.d(pwmVar2);
                str = pwmVar2.d();
            }
            this.currentBackgroundUrl = str;
            this.hasBackground = !TextUtils.isEmpty(str);
        }
    }

    private final void renderComment(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45d1e163", new Object[]{this, pwmVar});
        } else if (!TextUtils.isEmpty(pwmVar.a())) {
            swm swmVar = this.comment;
            String a2 = pwmVar.a();
            ckf.d(a2);
            swmVar.b(a2, commonTextColor, commonTextSize);
            addToDrawList(this.commentPart);
        }
    }

    private final void renderIcon(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0ec3129", new Object[]{this, pwmVar});
        } else if (pwmVar.c() != null) {
            this.hasIcon = true;
            this.icon.a(pwmVar);
            addToDrawList(this.iconPart);
        }
    }

    private final void renderLocation(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6eba3e65", new Object[]{this, pwmVar});
        } else if (!TextUtils.isEmpty(pwmVar.e())) {
            swm swmVar = this.location;
            String e = pwmVar.e();
            ckf.d(e);
            swmVar.b(e, commonTextColor, commonTextSize);
            addToDrawList(this.locationPart);
        }
    }

    private final void renderOriginPrice(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd887ac7", new Object[]{this, pwmVar});
        } else if (!TextUtils.isEmpty(pwmVar.f())) {
            swm swmVar = this.originPrice;
            String f = pwmVar.f();
            ckf.d(f);
            swmVar.c(f, commonTextColor, commonTextSize, pwmVar.g());
            addToDrawList(this.originPricePart);
        }
    }

    private final void renderPreText(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1ecb034", new Object[]{this, pwmVar});
        } else if (!TextUtils.isEmpty(pwmVar.h()) && !TextUtils.isEmpty(pwmVar.h())) {
            swm swmVar = this.preText;
            String h = pwmVar.h();
            ckf.d(h);
            swmVar.b(h, commonTextColor, commonTextSize);
            addToDrawList(this.preTextPart);
        }
    }

    private final void renderPrice(pwm pwmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6761a4d", new Object[]{this, pwmVar});
        } else if (pwmVar.i() != null) {
            this.price.e(pwmVar.i());
            addToDrawList(this.pricePart);
        }
    }

    private final void renderSale(pwm pwmVar, boolean z) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63f0e3d", new Object[]{this, pwmVar, new Boolean(z)});
        } else if (!TextUtils.isEmpty(pwmVar.l())) {
            swm swmVar = this.sold;
            String l = pwmVar.l();
            ckf.d(l);
            if (z) {
                i = soldColor2024;
            } else {
                i = commonTextColor;
            }
            swmVar.b(l, i, commonTextSize);
            addToDrawList(this.soldPart);
        }
    }

    private final void renderSubText(pwm pwmVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7af111", new Object[]{this, pwmVar});
        } else if (!TextUtils.isEmpty(pwmVar.m())) {
            swm swmVar = this.subText;
            String m = pwmVar.m();
            ckf.d(m);
            Integer n = pwmVar.n();
            if (n != null) {
                i = n.intValue();
            } else {
                i = commonTextColor;
            }
            swmVar.b(m, i, commonTextSize);
            addToDrawList(this.subTextPart);
        }
    }

    private final void renderSuffix(pwm pwmVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e94e881", new Object[]{this, pwmVar});
        } else if (!TextUtils.isEmpty(pwmVar.p())) {
            swm swmVar = this.suffixText;
            String p = pwmVar.p();
            ckf.d(p);
            Integer o = pwmVar.o();
            if (o != null) {
                i = o.intValue();
            } else {
                i = commonTextColor;
            }
            swmVar.b(p, i, commonTextSize);
            addToDrawList(this.suffixTextPart);
        }
    }

    @Override // com.taobao.search.m3.BaseItemView
    public int getFixedHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2531fe7f", new Object[]{this})).intValue();
        }
        return this.measureHeight;
    }

    public final int getTextHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43444424", new Object[]{this})).intValue();
        }
        return this.textHeight;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        loadIcon();
        if (this.hasBackground && this.measureHeight > 0) {
            tfe tfeVar = this.backgroundImage;
            String str = this.currentBackgroundUrl;
            ckf.d(str);
            tfeVar.d(str, getMeasuredWidth(), this.measureHeight);
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
        releaseIcon();
        if (this.hasBackground) {
            this.backgroundImage.e();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        ckf.g(canvas, "canvas");
        if (this.hasBackground) {
            this.backgroundImage.c(canvas);
        }
        boolean z = this.hasBackground;
        if (z) {
            f = (this.measureHeight - this.textHeight) / 2.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            canvas.translate(leftPadding, f);
        }
        Iterator<qwm> it = this.drawList.iterator();
        ckf.f(it, "iterator(...)");
        float f2 = 0.0f;
        while (it.hasNext()) {
            qwm next = it.next();
            ckf.f(next, "next(...)");
            qwm qwmVar = next;
            if (qwmVar.c()) {
                qwmVar.a().draw(canvas);
                float f3 = itemMargin;
                canvas.translate(qwmVar.a().getWidth() + f3, 0.0f);
                f2 += qwmVar.a().getWidth() + f3;
            }
        }
        if (this.hasBackground) {
            canvas.translate(-leftPadding, -f);
        }
        canvas.translate(-f2, 0.0f);
    }

    @Override // com.taobao.search.m3.BaseItemView
    public void onWidthChanged() {
        int width;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ee6394", new Object[]{this});
        } else if (this.currentPrice != null) {
            int measuredWidth = getMeasuredWidth();
            if (this.waterfall) {
                measuredWidth -= rightPadding;
            }
            if (this.hasBackground) {
                measuredWidth -= leftPadding;
            }
            int size = this.drawListWithPriority.size();
            for (int i2 = 0; i2 < size; i2++) {
                qwm qwmVar = this.drawListWithPriority.get(i2);
                ckf.f(qwmVar, "get(...)");
                qwm qwmVar2 = qwmVar;
                qwmVar2.d(false);
                if (i2 == 0) {
                    qwmVar2.d(true);
                    mwm a2 = qwmVar2.a();
                    pwm pwmVar = this.currentPrice;
                    ckf.d(pwmVar);
                    a2.a(pwmVar);
                    width = measuredWidth - qwmVar2.a().getWidth();
                    i = itemMargin;
                } else if (measuredWidth >= qwmVar2.a().getWidth()) {
                    qwmVar2.d(true);
                    mwm a3 = qwmVar2.a();
                    pwm pwmVar2 = this.currentPrice;
                    ckf.d(pwmVar2);
                    a3.a(pwmVar2);
                    width = measuredWidth - qwmVar2.a().getWidth();
                    i = itemMargin;
                } else {
                    qwmVar2.a().release();
                }
                measuredWidth = width - i;
            }
            this.measureHeight = this.price.d();
            this.textHeight = this.price.d();
            if (this.hasBackground) {
                this.measureHeight = priceHeightWithBackground;
                tfe tfeVar = this.backgroundImage;
                String str = this.currentBackgroundUrl;
                ckf.d(str);
                tfeVar.d(str, getMeasuredWidth(), this.measureHeight);
            } else {
                this.backgroundImage.e();
            }
            setMeasuredDimension(getMeasuredWidth(), this.measureHeight);
        }
    }

    public final void update(pwm pwmVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c268f1", new Object[]{this, pwmVar, new Boolean(z)});
            return;
        }
        ckf.g(pwmVar, "priceInfo");
        if (pwmVar != this.currentPrice) {
            reset();
            this.hasIcon = false;
            this.currentPrice = pwmVar;
            releaseIcon();
            this.drawList.clear();
            this.drawListWithPriority.clear();
            renderIcon(pwmVar);
            renderPreText(pwmVar);
            renderPrice(pwmVar);
            renderSuffix(pwmVar);
            renderSubText(pwmVar);
            renderOriginPrice(pwmVar);
            renderSale(pwmVar, z);
            renderComment(pwmVar);
            renderLocation(pwmVar);
            renderBackgroundImage(z);
            commit();
            requestLayout();
        }
    }
}
