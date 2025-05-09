package com.taobao.search.mmd.uikit;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.mmd.uikit.iconlist.a;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import tb.c4p;
import tb.o1p;
import tb.p1p;
import tb.t2o;
import tb.vyd;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PriceView extends View implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int AREA_COLOR;
    private static final int AREA_MARGIN = 8;
    private static final float AREA_SIZE = 11.0f;
    private static final int AREA_STYLE = 0;
    private static final int DEC_PRICE_COLOR;
    private static final float DEC_PRICE_SIZE = 10.0f;
    private static final int DEC_PRICE_STYLE = 1;
    private static final int DEC_SALES_MARGIN = 6;
    private static final String DEFAULT_UNIT = "￥";
    private static final int ICON_MARGIN = 4;
    private static final int ICON_SUFFIX_COLOR;
    private static final int ICON_SUFFIX_MARGIN = 4;
    private static final float ICON_SUFFIX_SIZE = 11.0f;
    private static final int INT_PRICE_COLOR;
    private static final float INT_PRICE_SIZE = 18.0f;
    private static final int INT_PRICE_STYLE = 0;
    private static final int LOCAL_PRICE_MARGIN = 6;
    private static final float LOCAL_PRICE_SIZE = 11.0f;
    private static final int ORIGIN_PRICE_COLOR;
    private static final int ORIGIN_PRICE_MARGIN = 4;
    private static final float ORIGIN_PRICE_SIZE = 11.0f;
    private static final int PREFIX_COLOR;
    private static final float PREFIX_SIZE = 11.0f;
    private static final int PREFIX_STYLE = 0;
    private static final int PREFIX_UNIT_MARGIN = 3;
    private static final int SALES_COLOR;
    private static final float SALES_SIZE = 11.0f;
    private static final int SALES_STYLE = 0;
    private static final int SUFFIX_MARGIN = 3;
    private static final float SUFFIX_SIZE = 11.0f;
    private static final int UNIT_COLOR;
    private static final int UNIT_INT_MARGIN = 2;
    private static final float UNIT_SIZE = 10.0f;
    private static final int UNIT_STYLE = 0;
    private int mAreaMargin;
    private String mAreaText;
    private TextPaint mAreaTextPaint;
    private int mCurrentContentHeight;
    private int mCurrentContentWidth;
    private int mDecSalesMargin;
    private String mDecimalPriceText;
    private TextPaint mDecimalPriceTextPaint;
    private boolean mEnableTaobao2021;
    private Drawable mIconDrawable;
    private int mIconHeight;
    private a mIconLoader;
    private int mIconMargin;
    private String mIconSuffix;
    private int mIconSuffixMargin;
    private TextPaint mIconSuffixPaint;
    private String mIconUrl;
    private int mIconWidth;
    private String mIntegerPriceText;
    private TextPaint mIntegerPriceTextPaint;
    private String mLocalPrice;
    private int mLocalPriceMargin;
    private TextPaint mLocalPricePaint;
    private boolean mNeedReLayout;
    private String mOriginPrice;
    private int mOriginPriceMargin;
    private TextPaint mOriginPricePaint;
    private String mPrefixText;
    private TextPaint mPrefixTextPaint;
    private int mPrefixUnitMargin;
    private int mPriceSuffixMargin;
    private String mSalesText;
    private TextPaint mSalesTextPaint;
    private String mSuffixText;
    private TextPaint mSuffixTextPaint;
    private int mUnitIntMargin;
    private String mUnitText;
    private TextPaint mUnitTextPaint;
    private static final String DEFAULT_PREFIX = Localization.q(R.string.app_about);
    private static final int LOCAL_PRICE_COLOR = R.color.tf_D_black;
    private static final int SUFFIX_COLOR = R.color.gray_66;

    static {
        t2o.a(815792563);
        t2o.a(815792570);
        int i = R.color.F_C;
        PREFIX_COLOR = i;
        int i2 = R.color.F_G;
        UNIT_COLOR = i2;
        INT_PRICE_COLOR = i2;
        DEC_PRICE_COLOR = i2;
        SALES_COLOR = i;
        ICON_SUFFIX_COLOR = i2;
        int i3 = R.color.gray_99;
        AREA_COLOR = i3;
        ORIGIN_PRICE_COLOR = i3;
    }

    public PriceView(Context context) {
        super(context);
        this.mIconUrl = "";
        this.mIconMargin = 0;
        this.mPrefixUnitMargin = 0;
        this.mUnitIntMargin = 0;
        this.mDecSalesMargin = 0;
        this.mAreaMargin = 0;
        this.mLocalPriceMargin = 0;
        this.mIconSuffixMargin = 0;
        this.mPriceSuffixMargin = 0;
        this.mIconWidth = 0;
        this.mIconHeight = 0;
        this.mOriginPriceMargin = 0;
        this.mPrefixTextPaint = new TextPaint();
        this.mSuffixTextPaint = new TextPaint();
        this.mUnitTextPaint = new TextPaint();
        this.mIntegerPriceTextPaint = new TextPaint();
        this.mDecimalPriceTextPaint = new TextPaint();
        this.mSalesTextPaint = new TextPaint();
        this.mAreaTextPaint = new TextPaint();
        this.mLocalPricePaint = new TextPaint();
        this.mIconSuffixPaint = new TextPaint();
        this.mOriginPricePaint = new TextPaint();
        this.mPrefixText = "";
        this.mUnitText = "";
        this.mIntegerPriceText = "";
        this.mDecimalPriceText = "";
        this.mSalesText = "";
        this.mAreaText = "";
        this.mLocalPrice = "";
        this.mIconSuffix = "";
        this.mSuffixText = "";
        this.mOriginPrice = "";
        this.mCurrentContentWidth = 0;
        this.mCurrentContentHeight = 0;
        this.mNeedReLayout = true;
        init(context);
    }

    private int getAndSaveContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dce9835c", new Object[]{this})).intValue();
        }
        int contentHeight = getContentHeight();
        this.mCurrentContentHeight = contentHeight;
        return contentHeight;
    }

    private int getAndSaveContentWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("643772a5", new Object[]{this})).intValue();
        }
        int contentWidth = getContentWidth();
        this.mCurrentContentWidth = contentWidth;
        return contentWidth;
    }

    private int getContentHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7283ec4", new Object[]{this})).intValue();
        }
        return Math.round(Math.max(Math.max(Math.max(Math.max(Math.max(this.mPrefixTextPaint.getTextSize(), this.mUnitTextPaint.getTextSize()), this.mIntegerPriceTextPaint.getTextSize()), this.mDecimalPriceTextPaint.getTextSize()), this.mSalesTextPaint.getTextSize()), this.mAreaTextPaint.getTextSize()));
    }

    private int getContentWidth() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("22ffaa3d", new Object[]{this})).intValue();
        }
        float measureText = this.mIntegerPriceTextPaint.measureText(this.mIntegerPriceText);
        float f6 = 0.0f;
        float f7 = this.mIconWidth + 0.0f;
        if (this.mDecimalPriceText.length() != 0) {
            f7 = this.mDecimalPriceTextPaint.measureText(this.mDecimalPriceText);
        }
        if (this.mPrefixText.length() != 0) {
            f = this.mPrefixTextPaint.measureText(this.mPrefixText) + this.mPrefixUnitMargin;
        } else {
            f = 0.0f;
        }
        if (this.mUnitText.length() != 0) {
            f2 = this.mUnitTextPaint.measureText(this.mUnitText) + this.mUnitIntMargin;
        } else {
            f2 = 0.0f;
        }
        if (this.mSalesText.length() != 0) {
            f3 = this.mDecSalesMargin + this.mSalesTextPaint.measureText(this.mSalesText);
        } else {
            f3 = 0.0f;
        }
        if (this.mAreaText.length() != 0) {
            f4 = this.mAreaMargin + this.mAreaTextPaint.measureText(this.mAreaText);
        } else {
            f4 = 0.0f;
        }
        if (this.mLocalPrice.length() != 0) {
            f5 = this.mLocalPriceMargin + this.mLocalPricePaint.measureText(this.mLocalPrice);
        } else {
            f5 = 0.0f;
        }
        if (this.mIconSuffix.length() != 0) {
            f6 = this.mIconSuffixMargin + this.mIconSuffixPaint.measureText(this.mIconSuffix);
        }
        return Math.round(f + f2 + measureText + f7 + f3 + f4 + f5 + f6);
    }

    private void init(Context context) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        if (!(context instanceof vyd) || !((vyd) context).Q()) {
            z = false;
        }
        this.mEnableTaobao2021 = z;
        initPaint(context);
        this.mPrefixUnitMargin = DensityUtil.dip2px(context, 3.0f);
        this.mUnitIntMargin = DensityUtil.dip2px(context, 2.0f);
        this.mDecSalesMargin = DensityUtil.dip2px(context, 6.0f);
        this.mAreaMargin = DensityUtil.dip2px(context, 8.0f);
        this.mLocalPriceMargin = DensityUtil.dip2px(context, 6.0f);
        this.mIconSuffixMargin = DensityUtil.dip2px(context, 4.0f);
        this.mIconMargin = DensityUtil.dip2px(context, 4.0f);
        this.mPriceSuffixMargin = DensityUtil.dip2px(context, 3.0f);
        this.mOriginPriceMargin = DensityUtil.dip2px(context, 4.0f);
    }

    private void initPaint(Context context) {
        Typeface typeface;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f08e06b3", new Object[]{this, context});
            return;
        }
        this.mPrefixTextPaint.setColor(getResources().getColor(PREFIX_COLOR));
        this.mPrefixTextPaint.setTextSize(DensityUtil.dip2px(context, 11.0f));
        this.mPrefixTextPaint.setTypeface(Typeface.defaultFromStyle(0));
        this.mSuffixTextPaint.setColor(getResources().getColor(SUFFIX_COLOR));
        this.mSuffixTextPaint.setTextSize(DensityUtil.dip2px(context, 11.0f));
        this.mUnitTextPaint.setColor(getResources().getColor(UNIT_COLOR));
        this.mUnitTextPaint.setTextSize(DensityUtil.dip2px(context, 10.0f));
        this.mUnitTextPaint.setTypeface(Typeface.defaultFromStyle(0));
        this.mIntegerPriceTextPaint.setColor(getResources().getColor(INT_PRICE_COLOR));
        this.mIntegerPriceTextPaint.setTextSize(DensityUtil.dip2px(context, INT_PRICE_SIZE));
        this.mIntegerPriceTextPaint.setTypeface(Typeface.defaultFromStyle(0));
        this.mDecimalPriceTextPaint.setColor(getResources().getColor(DEC_PRICE_COLOR));
        this.mDecimalPriceTextPaint.setTextSize(DensityUtil.dip2px(context, 10.0f));
        this.mDecimalPriceTextPaint.setTypeface(Typeface.defaultFromStyle(1));
        this.mLocalPricePaint.setColor(getResources().getColor(LOCAL_PRICE_COLOR));
        this.mLocalPricePaint.setTextSize(DensityUtil.dip2px(context, 11.0f));
        this.mSalesTextPaint.setColor(getResources().getColor(SALES_COLOR));
        this.mSalesTextPaint.setTextSize(DensityUtil.dip2px(context, 11.0f));
        this.mSalesTextPaint.setTypeface(Typeface.defaultFromStyle(0));
        this.mAreaTextPaint.setColor(getResources().getColor(AREA_COLOR));
        this.mAreaTextPaint.setTextSize(DensityUtil.dip2px(context, 11.0f));
        this.mAreaTextPaint.setTypeface(Typeface.defaultFromStyle(0));
        this.mIconSuffixPaint.setColor(getResources().getColor(ICON_SUFFIX_COLOR));
        this.mIconSuffixPaint.setTextSize(DensityUtil.dip2px(context, 11.0f));
        this.mIconSuffixPaint.setTypeface(Typeface.defaultFromStyle(0));
        this.mOriginPricePaint.setColor(getResources().getColor(ORIGIN_PRICE_COLOR));
        this.mOriginPricePaint.setTextSize(DensityUtil.dip2px(context, 11.0f));
        this.mOriginPricePaint.setStrikeThruText(true);
        this.mPrefixTextPaint.setAntiAlias(true);
        this.mSuffixTextPaint.setAntiAlias(true);
        this.mUnitTextPaint.setAntiAlias(true);
        this.mIntegerPriceTextPaint.setAntiAlias(true);
        this.mDecimalPriceTextPaint.setAntiAlias(true);
        this.mSalesTextPaint.setAntiAlias(true);
        this.mLocalPricePaint.setAntiAlias(true);
        this.mAreaTextPaint.setAntiAlias(true);
        this.mIconSuffixPaint.setAntiAlias(true);
        this.mOriginPricePaint.setAntiAlias(true);
        if (this.mEnableTaobao2021) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf");
            } catch (Throwable unused) {
                c4p.m("SearchPriceView", "load typeface failed");
                typeface = null;
            }
            if (typeface != null) {
                this.mDecimalPriceTextPaint.setTypeface(typeface);
                this.mIntegerPriceTextPaint.setTypeface(typeface);
                this.mDecimalPriceTextPaint.setFakeBoldText(true);
                this.mIntegerPriceTextPaint.setFakeBoldText(true);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(PriceView priceView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/uikit/PriceView");
    }

    private boolean needRelayout() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f159b0de", new Object[]{this})).booleanValue();
        }
        if (!this.mNeedReLayout) {
            return false;
        }
        if (getContentWidth() == this.mCurrentContentWidth && getContentHeight() == this.mCurrentContentHeight) {
            return false;
        }
        return true;
    }

    private void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            this.mNeedReLayout = true;
        } else if (mode != 1073741824) {
            this.mNeedReLayout = true;
        } else {
            this.mNeedReLayout = false;
        }
    }

    private void syncContentDescription() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19469d45", new Object[]{this});
            return;
        }
        StringBuilder sb = new StringBuilder("价格 ");
        sb.append(this.mIntegerPriceText);
        sb.append(this.mDecimalPriceText);
        sb.append(Localization.q(R.string.app_yuan));
        String str2 = "";
        if (TextUtils.isEmpty(this.mSalesText)) {
            str = str2;
        } else {
            str = " " + this.mSalesText;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(this.mAreaText)) {
            str2 = " " + this.mAreaText;
        }
        sb.append(str2);
        setContentDescription(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.mmd.uikit.PriceView.onDraw(android.graphics.Canvas):void");
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.d
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
            return;
        }
        this.mIconDrawable = bitmapDrawable;
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        setMaxWidth(i);
        setMeasuredDimension(View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + Math.max(getSuggestedMinimumWidth(), getAndSaveContentWidth()), i, 0), View.resolveSizeAndState(getPaddingTop() + getPaddingBottom() + DensityUtil.dip2px(getContext(), 6.0f) + Math.max(getSuggestedMinimumHeight(), getAndSaveContentHeight()), i2, 0));
    }

    public void setAreaColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b689cb48", new Object[]{this, new Integer(i)});
            return;
        }
        this.mAreaTextPaint.setColor(i);
        invalidate();
    }

    public void setAreaText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6075476d", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mAreaText = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
        syncContentDescription();
    }

    public void setDecimalPriceText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64fb0d98", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mDecimalPriceText = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
        syncContentDescription();
    }

    public void setIcon(String str, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ddb25ac", new Object[]{this, str, new Integer(i), new Integer(i2)});
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.mIconUrl = "";
            this.mIconWidth = 0;
            this.mIconHeight = 0;
        } else {
            this.mIconUrl = str;
            this.mIconWidth = o1p.b(i);
            this.mIconHeight = o1p.b(i2);
        }
        this.mIconDrawable = null;
        this.mIconLoader = null;
        invalidate();
    }

    public void setIconSuffixColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84b37225", new Object[]{this, new Integer(i)});
            return;
        }
        this.mIconSuffixPaint.setColor(i);
        invalidate();
    }

    public void setIntegerPriceText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d310220b", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mIntegerPriceText = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
        syncContentDescription();
    }

    public void setLocalPrice(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd175531", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mLocalPrice = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
    }

    public void setOriginPrice(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("986b8542", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mOriginPrice = str;
        this.mOriginPricePaint.setStrikeThruText(!z);
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
    }

    public void setOriginPriceSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd9c34fa", new Object[]{this, new Integer(i)});
        } else {
            this.mOriginPricePaint.setTextSize(p1p.b(i));
        }
    }

    public void setPrefixText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb82c4b2", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mPrefixText = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
    }

    public void setPriceIconSuffix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("898a5a62", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mIconSuffix = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
    }

    public void setPriceTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d568cd", new Object[]{this, new Integer(i)});
            return;
        }
        this.mUnitTextPaint.setColor(i);
        this.mDecimalPriceTextPaint.setColor(i);
        this.mIntegerPriceTextPaint.setColor(i);
        invalidate();
    }

    public void setSalesColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59c72743", new Object[]{this, new Integer(i)});
            return;
        }
        this.mSalesTextPaint.setColor(i);
        invalidate();
    }

    public void setSalesText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62294d68", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mSalesText = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
        syncContentDescription();
    }

    public void setSuffixText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c37a88b1", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mSuffixText = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
    }

    public void setUnitText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccfb79a4", new Object[]{this, str});
            return;
        }
        if (str == null) {
            str = "";
        }
        this.mUnitText = str;
        if (needRelayout()) {
            requestLayout();
        }
        invalidate();
        syncContentDescription();
    }

    public PriceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIconUrl = "";
        this.mIconMargin = 0;
        this.mPrefixUnitMargin = 0;
        this.mUnitIntMargin = 0;
        this.mDecSalesMargin = 0;
        this.mAreaMargin = 0;
        this.mLocalPriceMargin = 0;
        this.mIconSuffixMargin = 0;
        this.mPriceSuffixMargin = 0;
        this.mIconWidth = 0;
        this.mIconHeight = 0;
        this.mOriginPriceMargin = 0;
        this.mPrefixTextPaint = new TextPaint();
        this.mSuffixTextPaint = new TextPaint();
        this.mUnitTextPaint = new TextPaint();
        this.mIntegerPriceTextPaint = new TextPaint();
        this.mDecimalPriceTextPaint = new TextPaint();
        this.mSalesTextPaint = new TextPaint();
        this.mAreaTextPaint = new TextPaint();
        this.mLocalPricePaint = new TextPaint();
        this.mIconSuffixPaint = new TextPaint();
        this.mOriginPricePaint = new TextPaint();
        this.mPrefixText = "";
        this.mUnitText = "";
        this.mIntegerPriceText = "";
        this.mDecimalPriceText = "";
        this.mSalesText = "";
        this.mAreaText = "";
        this.mLocalPrice = "";
        this.mIconSuffix = "";
        this.mSuffixText = "";
        this.mOriginPrice = "";
        this.mCurrentContentWidth = 0;
        this.mCurrentContentHeight = 0;
        this.mNeedReLayout = true;
        init(context);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.PriceView, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.PriceView_prefix_text);
        this.mPrefixText = string;
        if (string == null) {
            this.mPrefixText = DEFAULT_PREFIX;
        }
        String string2 = obtainStyledAttributes.getString(R.styleable.PriceView_unit_text);
        this.mUnitText = string2;
        if (string2 == null) {
            this.mUnitText = DEFAULT_UNIT;
        }
        String string3 = obtainStyledAttributes.getString(R.styleable.PriceView_integer_price_text);
        this.mIntegerPriceText = string3;
        if (string3 == null) {
            this.mIntegerPriceText = "";
        }
        String string4 = obtainStyledAttributes.getString(R.styleable.PriceView_decimal_price_text);
        this.mDecimalPriceText = string4;
        if (string4 == null) {
            this.mDecimalPriceText = "";
        }
        String string5 = obtainStyledAttributes.getString(R.styleable.PriceView_sales_text);
        this.mSalesText = string5;
        if (string5 == null) {
            this.mSalesText = "";
        }
        String string6 = obtainStyledAttributes.getString(R.styleable.PriceView_area_text);
        this.mAreaText = string6;
        if (string6 == null) {
            this.mAreaText = "";
        }
        this.mPrefixTextPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_prefix_size, DensityUtil.dip2px(context, 11.0f)));
        this.mUnitTextPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_unit_size, DensityUtil.dip2px(context, 10.0f)));
        this.mIntegerPriceTextPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_integer_price_size, DensityUtil.dip2px(context, INT_PRICE_SIZE)));
        this.mDecimalPriceTextPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_decimal_price_size, DensityUtil.dip2px(context, 10.0f)));
        this.mSalesTextPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_sales_size, DensityUtil.dip2px(context, 11.0f)));
        this.mAreaTextPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_area_size, DensityUtil.dip2px(context, 11.0f)));
        this.mIconSuffixPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_icon_suffix_size, DensityUtil.dip2px(context, 11.0f)));
        Resources resources = getResources();
        this.mPrefixTextPaint.setColor(obtainStyledAttributes.getColor(R.styleable.PriceView_prefix_color, resources.getColor(PREFIX_COLOR)));
        this.mUnitTextPaint.setColor(obtainStyledAttributes.getColor(R.styleable.PriceView_unit_color, resources.getColor(UNIT_COLOR)));
        this.mIntegerPriceTextPaint.setColor(obtainStyledAttributes.getColor(R.styleable.PriceView_integer_price_color, resources.getColor(INT_PRICE_COLOR)));
        TextPaint textPaint = this.mDecimalPriceTextPaint;
        int i = R.styleable.PriceView_decimal_price_color;
        textPaint.setColor(obtainStyledAttributes.getColor(i, resources.getColor(DEC_PRICE_COLOR)));
        this.mSalesTextPaint.setColor(obtainStyledAttributes.getColor(i, resources.getColor(SALES_COLOR)));
        this.mAreaTextPaint.setColor(obtainStyledAttributes.getColor(R.styleable.PriceView_area_color, resources.getColor(AREA_COLOR)));
        this.mIconSuffixPaint.setColor(resources.getColor(ICON_SUFFIX_COLOR));
        this.mPrefixTextPaint.setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes.getInt(R.styleable.PriceView_prefix_text_style, 0)));
        this.mUnitTextPaint.setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes.getInt(R.styleable.PriceView_unit_text_style, 0)));
        this.mIntegerPriceTextPaint.setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes.getInt(R.styleable.PriceView_integer_price_text_style, 0)));
        TextPaint textPaint2 = this.mDecimalPriceTextPaint;
        int i2 = R.styleable.PriceView_decimal_price_text_style;
        textPaint2.setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes.getInt(i2, 1)));
        this.mSalesTextPaint.setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes.getInt(i2, 0)));
        this.mAreaTextPaint.setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes.getInt(R.styleable.PriceView_area_text_style, 0)));
        this.mPrefixUnitMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_prefix_unit_margin, DensityUtil.dip2px(context, 3.0f));
        this.mUnitIntMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_unit_int_margin, DensityUtil.dip2px(context, 2.0f));
        this.mDecSalesMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_dec_sales_margin, DensityUtil.dip2px(context, 6.0f));
        this.mAreaMargin = obtainStyledAttributes.getDimensionPixelSize(R.styleable.PriceView_area_margin, DensityUtil.dip2px(context, 8.0f));
        obtainStyledAttributes.recycle();
    }
}
