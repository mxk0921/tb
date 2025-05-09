package com.taobao.search.mmd.uikit.iconlist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.common.dynamic.bean.SearchDomBean;
import com.taobao.search.mmd.datasource.bean.IconBean;
import com.taobao.search.mmd.uikit.iconlist.a;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import java.util.ArrayList;
import java.util.List;
import tb.b4p;
import tb.pec;
import tb.srl;
import tb.t2o;
import tb.vyd;
import tb.war;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class IconListView extends View implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final float DARK_MODE_BG_ALPHA = 0.1f;
    public static final float DARK_MODE_BORDER_ALPHA = 0.5f;
    private static final float DEFAULT_TEXT_SIZE = 10.0f;
    private static final String LOG_TAG = "IconListView";
    private static final String TYPE_IMAGE = "img";
    private static final String TYPE_TEXT = "text";
    public final int ICON_HEIGHT;
    private final int MARGIN;
    private final int PADDING;
    private final int RADIUS;
    private final int TEXT_TRANSLATE;
    private Paint mBackgroundPaint;
    private Paint mBoraderPaint;
    private SparseArray<Drawable> mDrawables;
    private SparseArray<LinearGradient> mIconGradients;
    private List<IconBean> mIconList;
    private SparseIntArray mIconStart;
    private SparseIntArray mIconWidth;
    private boolean mIsDarkMode;
    private int mLastHeight;
    private int mLastHeightSpec;
    private int mLastWidth;
    private int mLastWidthSpec;
    private SparseArray<a> mLoaders;
    private int mMaxIconNum;
    private int mMaxWidth;
    private boolean mNeedReLayout;
    private int mStrokeWidth;
    private boolean mTaobao2021;
    private TextPaint mTextPaint;
    private final RectF mTmpRectF;
    private int mVisibleIconEndIndex;
    private boolean mVisibleIconEndIndexValid;

    static {
        t2o.a(815792565);
        t2o.a(815792570);
    }

    public IconListView(Context context) {
        this(context, null);
    }

    private int calImgIconWidth(SearchDomBean searchDomBean, IconBean iconBean) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eeb7207c", new Object[]{this, searchDomBean, iconBean})).intValue();
        }
        int i2 = searchDomBean.width;
        if (i2 <= 0 || (i = searchDomBean.height) <= 0) {
            return -1;
        }
        return (this.ICON_HEIGHT * i2) / i;
    }

    private int calTextIconWidth(SearchDomBean searchDomBean, IconBean iconBean) {
        int i;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b2a12002", new Object[]{this, searchDomBean, iconBean})).intValue();
        }
        setTextPaintSize(searchDomBean);
        float measureText = this.mTextPaint.measureText(iconBean.text);
        if (!TextUtils.isEmpty(iconBean.prefix)) {
            measureText += this.mTextPaint.measureText(iconBean.prefix);
            int i2 = searchDomBean.separatorWidth;
            if (i2 > 0 && (i = searchDomBean.separatorHeight) > 0) {
                measureText += (this.ICON_HEIGHT / i) * i2;
            }
        }
        if (srl.c(searchDomBean.backgroundColor, 0) == 0 && !hasGradientConfig(searchDomBean)) {
            z = false;
        }
        if (!TextUtils.isEmpty(searchDomBean.borderColor) || z) {
            return ((int) measureText) + (this.PADDING * 2);
        }
        return (int) measureText;
    }

    private boolean hasGradientConfig(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7860ce7", new Object[]{this, searchDomBean})).booleanValue();
        }
        if (TextUtils.isEmpty(searchDomBean.backgroundGradientStart) || TextUtils.isEmpty(searchDomBean.backgroundGradientEnd)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ Object ipc$super(IconListView iconListView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/mmd/uikit/iconlist/IconListView");
    }

    private void setBackgroundPaintColor(IconBean iconBean, int i) {
        SearchDomBean searchDomBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63518635", new Object[]{this, iconBean, new Integer(i)});
            return;
        }
        SearchDomBean searchDomBean2 = iconBean.searchDomBean;
        if (this.mIsDarkMode && (searchDomBean = iconBean.darkDomBean) != null) {
            searchDomBean2 = searchDomBean;
        }
        if (hasGradientConfig(searchDomBean2)) {
            LinearGradient linearGradient = this.mIconGradients.get(i);
            if (linearGradient != null) {
                this.mBackgroundPaint.setColor(-16711936);
                this.mBackgroundPaint.setShader(linearGradient);
                return;
            }
            return;
        }
        this.mBackgroundPaint.setShader(null);
        int c = srl.c(searchDomBean2.backgroundColor, 0);
        if (this.mIsDarkMode && iconBean.darkDomBean == null) {
            c = srl.a(25, c);
        }
        this.mBackgroundPaint.setColor(c);
    }

    private boolean setBoarderPaintColor(IconBean iconBean) {
        SearchDomBean searchDomBean;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5502d2f3", new Object[]{this, iconBean})).booleanValue();
        }
        SearchDomBean searchDomBean2 = iconBean.searchDomBean;
        if (this.mIsDarkMode && (searchDomBean = iconBean.darkDomBean) != null) {
            searchDomBean2 = searchDomBean;
        }
        if (TextUtils.isEmpty(searchDomBean2.borderColor)) {
            return false;
        }
        int c = srl.c(searchDomBean2.borderColor, 0);
        if (this.mIsDarkMode && iconBean.darkDomBean == null) {
            c = srl.a(127, c);
        }
        this.mBoraderPaint.setColor(c);
        return true;
    }

    private void setMaxWidth(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e63498", new Object[]{this, new Integer(i)});
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            this.mNeedReLayout = true;
        } else if (mode != 1073741824) {
            this.mNeedReLayout = true;
            size = -1;
        } else {
            this.mNeedReLayout = false;
        }
        this.mMaxWidth = size;
    }

    private void setTextPaintColor(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef799fb", new Object[]{this, searchDomBean});
        } else {
            this.mTextPaint.setColor(srl.c(searchDomBean.textColor, -1));
        }
    }

    private void setTextPaintSize(SearchDomBean searchDomBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd577f9f", new Object[]{this, searchDomBean});
        } else if (searchDomBean.textSize > 0.0f) {
            this.mTextPaint.setTextSize(DensityUtil.dip2px(getContext(), searchDomBean.textSize));
        } else {
            this.mTextPaint.setTextSize(DensityUtil.dip2px(getContext(), DEFAULT_TEXT_SIZE));
        }
    }

    public int getMaxIconNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("dadf5739", new Object[]{this})).intValue();
        }
        return this.mMaxIconNum;
    }

    public void invalidateMeasureCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d2ce6a6", new Object[]{this});
            return;
        }
        this.mLastHeightSpec = -1;
        this.mLastWidthSpec = -1;
        this.mLastWidth = -1;
        this.mLastHeight = -1;
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.d
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
            return;
        }
        this.mDrawables.put(i, bitmapDrawable);
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        int i6 = this.mLastHeightSpec;
        if (i6 == -1 || i6 != i2 || (i3 = this.mLastWidthSpec) == -1 || i3 != i || (i4 = this.mLastHeight) == -1 || (i5 = this.mLastWidth) == -1) {
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            setMaxWidth(i);
            this.mVisibleIconEndIndex = 0;
            this.mIconStart.clear();
            this.mIconWidth.clear();
            this.mIconGradients.clear();
            int resolveSizeAndState = View.resolveSizeAndState(getPaddingLeft() + getPaddingRight() + Math.max(suggestedMinimumWidth, arrangeIcon(this.mMaxWidth)), i, 0);
            int paddingTop = getPaddingTop() + getPaddingBottom() + Math.max(getSuggestedMinimumHeight(), this.ICON_HEIGHT);
            int resolveSizeAndState2 = View.resolveSizeAndState(paddingTop, i2, 0);
            if (resolveSizeAndState2 >= paddingTop) {
                paddingTop = resolveSizeAndState2;
            }
            this.mLastWidthSpec = i;
            this.mLastHeightSpec = i2;
            this.mLastWidth = resolveSizeAndState;
            this.mLastHeight = paddingTop;
            setMeasuredDimension(resolveSizeAndState, paddingTop);
            return;
        }
        setMeasuredDimension(i5, i4);
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mLoaders.size(); i++) {
            this.mLoaders.valueAt(i).e();
        }
    }

    public void render(List<IconBean> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd0be0e", new Object[]{this, list});
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        this.mIconList.clear();
        this.mIconList.addAll(list);
        this.mDrawables.clear();
        for (int i = 0; i < this.mLoaders.size(); i++) {
            this.mLoaders.valueAt(i).b();
        }
        this.mLoaders.clear();
        if (this.mNeedReLayout) {
            requestLayout();
        } else {
            this.mIconStart.clear();
            this.mIconWidth.clear();
            this.mIconGradients.clear();
            this.mVisibleIconEndIndex = 0;
            arrangeIcon(this.mMaxWidth);
        }
        invalidate();
        invalidateMeasureCache();
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
            return;
        }
        for (int i = 0; i < this.mLoaders.size(); i++) {
            this.mLoaders.valueAt(i).f();
        }
    }

    public void setMaxIconNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7e29df1", new Object[]{this, new Integer(i)});
        } else {
            this.mMaxIconNum = i;
        }
    }

    public IconListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTextPaint = new TextPaint();
        this.mBackgroundPaint = new Paint();
        this.mBoraderPaint = new Paint();
        this.mIsDarkMode = war.b(Globals.getApplication());
        this.mLoaders = new SparseArray<>(2);
        this.mDrawables = new SparseArray<>(2);
        this.mIconList = new ArrayList();
        this.mIconStart = new SparseIntArray(5);
        this.mIconWidth = new SparseIntArray(5);
        this.mIconGradients = new SparseArray<>(5);
        this.mVisibleIconEndIndex = 0;
        this.mVisibleIconEndIndexValid = false;
        this.mMaxWidth = -1;
        this.mMaxIconNum = Integer.MAX_VALUE;
        this.mNeedReLayout = true;
        this.mTmpRectF = new RectF();
        this.mLastWidthSpec = -1;
        this.mLastHeightSpec = -1;
        this.mLastWidth = -1;
        this.mLastHeight = -1;
        this.mTaobao2021 = (context instanceof vyd) && ((vyd) context).Q();
        this.mTextPaint.setAntiAlias(true);
        this.mBoraderPaint.setStyle(Paint.Style.STROKE);
        int dip2px = DensityUtil.dip2px(context, 0.5f);
        this.mStrokeWidth = dip2px;
        if (dip2px == 0) {
            this.mStrokeWidth = DensityUtil.dip2px(context, 1.0f);
        }
        this.mBoraderPaint.setStrokeWidth(this.mStrokeWidth);
        this.mBoraderPaint.setAntiAlias(true);
        this.mBackgroundPaint.setAntiAlias(true);
        if (!(context instanceof pec) || !((pec) context).x0()) {
            this.ICON_HEIGHT = DensityUtil.dip2px(context, 12.0f);
            this.TEXT_TRANSLATE = 0;
        } else {
            this.ICON_HEIGHT = DensityUtil.dip2px(context, 14.0f);
            this.TEXT_TRANSLATE = DensityUtil.dip2px(context, 1.0f);
        }
        this.PADDING = DensityUtil.dip2px(context, 3.0f);
        this.MARGIN = this.mTaobao2021 ? DensityUtil.dip2px(context, 4.0f) : DensityUtil.dip2px(context, 2.0f);
        this.RADIUS = this.mTaobao2021 ? DensityUtil.dip2px(context, 2.0f) : DensityUtil.dip2px(context, 3.0f);
    }

    private int arrangeIcon(int i) {
        int i2;
        int i3;
        int i4 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2972842a", new Object[]{this, new Integer(i)})).intValue();
        }
        this.mVisibleIconEndIndexValid = this.mMaxWidth > 0;
        StringBuilder sb = new StringBuilder();
        int paddingRight = (i - getPaddingRight()) - getPaddingLeft();
        int paddingLeft = getPaddingLeft();
        int size = this.mIconList.size();
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 < size && i6 < this.mMaxIconNum) {
            IconBean iconBean = this.mIconList.get(i5);
            if (iconBean == null) {
                b4p.b(LOG_TAG, "icon 不存在");
            } else {
                SearchDomBean searchDomBean = iconBean.searchDomBean;
                if (searchDomBean == null) {
                    this.mIconStart.put(i5, -1);
                    this.mIconWidth.put(i5, -1);
                    this.mIconGradients.put(i5, null);
                    this.mVisibleIconEndIndex += i4;
                    b4p.b(LOG_TAG, "icon 样式不存在:" + iconBean.domClass);
                } else {
                    if ("text".equals(iconBean.type)) {
                        i3 = calTextIconWidth(searchDomBean, iconBean);
                    } else {
                        i3 = "img".equals(iconBean.type) ? calImgIconWidth(searchDomBean, iconBean) : 0;
                    }
                    if (i3 <= 0) {
                        this.mIconStart.put(i5, -1);
                        this.mIconWidth.put(i5, -1);
                        this.mIconGradients.put(i5, null);
                        this.mVisibleIconEndIndex++;
                    } else {
                        i6++;
                        int i7 = i5 > 0 ? this.MARGIN : 0;
                        if (i <= 0 || paddingLeft + i3 + i7 <= paddingRight) {
                            paddingLeft += i7 + i3;
                            this.mIconStart.put(i5, paddingLeft - i3);
                            this.mIconWidth.put(i5, i3);
                            if (hasGradientConfig(searchDomBean)) {
                                int c = srl.c(searchDomBean.backgroundGradientStart, 0);
                                int c2 = srl.c(searchDomBean.backgroundGradientEnd, 0);
                                if (this.mIsDarkMode && iconBean.darkDomBean == null) {
                                    c = srl.a(25, c);
                                    c2 = srl.a(25, c2);
                                }
                                this.mIconGradients.put(i5, new LinearGradient(0.0f, 0.0f, i3, 0.0f, c, c2, Shader.TileMode.CLAMP));
                            } else {
                                this.mIconGradients.put(i5, null);
                            }
                            this.mVisibleIconEndIndex++;
                            if ("text".equals(iconBean.type)) {
                                sb.append(iconBean.text);
                                sb.append(" ");
                            }
                            i2 = 1;
                            z = true;
                            i5 += i2;
                            i4 = 1;
                        } else {
                            this.mIconStart.put(i5, -1);
                            this.mIconWidth.put(i5, -1);
                            this.mIconGradients.put(i5, null);
                            this.mVisibleIconEndIndex++;
                            i2 = 1;
                            z = true;
                            i5 += i2;
                            i4 = 1;
                        }
                    }
                }
            }
            i2 = 1;
            i5 += i2;
            i4 = 1;
        }
        setContentDescription(sb.toString());
        if (!z) {
            setVisibility(4);
        }
        return paddingLeft;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int size;
        int i;
        int i2;
        SearchDomBean searchDomBean;
        int i3;
        SearchDomBean searchDomBean2;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        int width = getWidth() - getPaddingRight();
        if (this.mVisibleIconEndIndexValid) {
            size = this.mVisibleIconEndIndex;
        } else {
            size = this.mIconList.size();
        }
        int i5 = 0;
        while (i5 < size) {
            int i6 = this.mIconStart.get(i5);
            int i7 = this.mIconWidth.get(i5);
            if (i6 > width) {
                b4p.b(LOG_TAG, "超出view的宽度");
            } else if (i7 == -1) {
                b4p.b(LOG_TAG, "wrong iconWidth");
            } else {
                IconBean iconBean = this.mIconList.get(i5);
                if (iconBean == null) {
                    b4p.b(LOG_TAG, "icon is null");
                } else {
                    SearchDomBean searchDomBean3 = (!this.mIsDarkMode || (searchDomBean2 = iconBean.darkDomBean) == null) ? iconBean.searchDomBean : searchDomBean2;
                    if (searchDomBean3 == null) {
                        b4p.b(LOG_TAG, "icon dom is null");
                    } else {
                        this.mTmpRectF.set(0.0f, 0.0f, i7, this.ICON_HEIGHT);
                        canvas.save();
                        canvas.translate(i6, 0.0f);
                        canvas.clipRect(this.mTmpRectF);
                        if ("text".equals(iconBean.type)) {
                            if (searchDomBean3.borderRadius > 0) {
                                i2 = DensityUtil.dip2px(getContext(), searchDomBean3.borderRadius);
                            } else {
                                i2 = this.RADIUS;
                            }
                            setBackgroundPaintColor(iconBean, i5);
                            boolean boarderPaintColor = setBoarderPaintColor(iconBean);
                            if (boarderPaintColor) {
                                RectF rectF = this.mTmpRectF;
                                int i8 = this.mStrokeWidth;
                                rectF.inset(i8 / 2.0f, i8 / 2.0f);
                            }
                            float f = i2;
                            canvas.drawRoundRect(this.mTmpRectF, f, f, this.mBackgroundPaint);
                            if (boarderPaintColor) {
                                canvas.drawRoundRect(this.mTmpRectF, f, f, this.mBoraderPaint);
                            }
                            int i9 = (boarderPaintColor || this.mBackgroundPaint.getColor() != 0) ? this.PADDING : 0;
                            setTextPaintSize(searchDomBean3);
                            if (!TextUtils.isEmpty(iconBean.prefix)) {
                                float measureText = this.mTextPaint.measureText(iconBean.prefix);
                                int i10 = searchDomBean3.separatorWidth;
                                int i11 = (i10 <= 0 || (i3 = searchDomBean3.separatorHeight) <= 0) ? 0 : (this.ICON_HEIGHT / i3) * i10;
                                if (!TextUtils.isEmpty(searchDomBean3.prefixBgColor)) {
                                    int c = srl.c(searchDomBean3.prefixBgColor, i4);
                                    if (this.mIsDarkMode && iconBean.darkDomBean == null) {
                                        c = srl.a(25, c);
                                    }
                                    this.mBackgroundPaint.setColor(c);
                                    this.mBackgroundPaint.setShader(null);
                                    this.mTmpRectF.set(0.0f, 0.0f, i2 * 2, this.ICON_HEIGHT);
                                    if (boarderPaintColor) {
                                        RectF rectF2 = this.mTmpRectF;
                                        int i12 = this.mStrokeWidth;
                                        rectF2.inset(i12, i12);
                                    }
                                    canvas.drawRoundRect(this.mTmpRectF, f, f, this.mBackgroundPaint);
                                    this.mTmpRectF.set(f, 0.0f, i9 + measureText + (i11 > 0 ? i11 / 2 : 0), this.ICON_HEIGHT);
                                    if (boarderPaintColor) {
                                        RectF rectF3 = this.mTmpRectF;
                                        int i13 = this.mStrokeWidth;
                                        rectF3.inset(i13, i13);
                                    }
                                    canvas.drawRect(this.mTmpRectF, this.mBackgroundPaint);
                                }
                                this.mTextPaint.setColor(srl.c(searchDomBean3.prefixColor, -16777216));
                                float f2 = i9;
                                canvas.drawText(iconBean.prefix, f2, (this.ICON_HEIGHT - this.mTextPaint.descent()) - this.TEXT_TRANSLATE, this.mTextPaint);
                                int i14 = (int) (f2 + measureText);
                                if (TextUtils.isEmpty(searchDomBean3.separatorImg) || i11 <= 0) {
                                    width = width;
                                    searchDomBean = searchDomBean3;
                                    i9 = i14;
                                } else {
                                    Drawable drawable = this.mDrawables.get(i5);
                                    int i15 = boarderPaintColor ? this.mStrokeWidth : 0;
                                    if (drawable != null) {
                                        width = width;
                                        searchDomBean = searchDomBean3;
                                        drawable.setBounds(i14, i15, i14 + i11, this.ICON_HEIGHT - i15);
                                        drawable.draw(canvas);
                                    } else if (this.mLoaders.get(i5) == null) {
                                        width = width;
                                        searchDomBean = searchDomBean3;
                                        a aVar = new a(getContext(), this, i11, this.ICON_HEIGHT, i5);
                                        aVar.h(searchDomBean.separatorImg);
                                        this.mLoaders.put(i5, aVar);
                                        Drawable drawable2 = this.mDrawables.get(i5);
                                        if (drawable2 != null) {
                                            drawable2.setBounds(i14, i15, i14 + i11, this.ICON_HEIGHT - i15);
                                            drawable2.draw(canvas);
                                        }
                                    } else {
                                        width = width;
                                        searchDomBean = searchDomBean3;
                                    }
                                    i9 = i14 + i11;
                                }
                            } else {
                                width = width;
                                searchDomBean = searchDomBean3;
                            }
                            setTextPaintColor(searchDomBean);
                            canvas.drawText(iconBean.text, i9, (this.ICON_HEIGHT - this.mTextPaint.descent()) - this.TEXT_TRANSLATE, this.mTextPaint);
                        } else {
                            width = width;
                            if ("img".equals(iconBean.type)) {
                                Drawable drawable3 = this.mDrawables.get(i5);
                                if (drawable3 != null) {
                                    drawable3.setBounds(0, 0, i7, this.ICON_HEIGHT);
                                    drawable3.draw(canvas);
                                } else if (this.mLoaders.get(i5) == null) {
                                    a aVar2 = new a(getContext(), this, (this.ICON_HEIGHT * searchDomBean3.width) / searchDomBean3.height, this.ICON_HEIGHT, i5);
                                    aVar2.h(searchDomBean3.image);
                                    this.mLoaders.put(i5, aVar2);
                                    Drawable drawable4 = this.mDrawables.get(i5);
                                    if (drawable4 != null) {
                                        drawable4.setBounds(0, 0, i7, this.ICON_HEIGHT);
                                        drawable4.draw(canvas);
                                    }
                                }
                                canvas.restore();
                                i = 1;
                                i5 += i;
                                i4 = 0;
                            }
                        }
                        canvas.restore();
                        i = 1;
                        i5 += i;
                        i4 = 0;
                    }
                }
            }
            width = width;
            i = 1;
            i5 += i;
            i4 = 0;
        }
    }
}
