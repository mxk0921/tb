package com.taobao.search.common.uikit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.List;
import tb.p1p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SummaryTipsView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mHeight;
    private Paint mPaint;
    private StringBuilder mShowingIndexBuilder;
    private List<String> mSummaryTips;
    private int mWidth;
    private static final int TIP_MARGIN = p1p.a(5.0f);
    private static final int DIVIDE_WIDTH = p1p.a(1.0f);
    private static final int DIVIDE_HEIGHT = p1p.a(12.0f);
    private static final int DEFAULT_TEXT_SIZE = p1p.a(11.0f);

    static {
        t2o.a(815792202);
    }

    public SummaryTipsView(Context context) {
        this(context, null);
    }

    private int calTextBaseline() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5fd065fa", new Object[]{this})).intValue();
        }
        Paint.FontMetricsInt fontMetricsInt = this.mPaint.getFontMetricsInt();
        int i = fontMetricsInt.descent;
        int i2 = i - fontMetricsInt.ascent;
        int i3 = this.mHeight;
        if (i3 < i2) {
            return i3 - i;
        }
        return (i3 - ((i3 - i2) / 2)) - i;
    }

    private void init(AttributeSet attributeSet) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92cba817", new Object[]{this, attributeSet});
            return;
        }
        this.mPaint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.SummaryTipsView, 0, 0);
            this.mPaint.setTextSize(obtainStyledAttributes.getDimensionPixelSize(R.styleable.SummaryTipsView_text_size, DEFAULT_TEXT_SIZE));
            this.mPaint.setColor(obtainStyledAttributes.getColor(R.styleable.SummaryTipsView_text_color, Color.parseColor("#999999")));
            return;
        }
        this.mPaint.setTextSize(DEFAULT_TEXT_SIZE);
        this.mPaint.setColor(Color.parseColor("#999999"));
    }

    public static /* synthetic */ Object ipc$super(SummaryTipsView summaryTipsView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else if (hashCode == 1389530587) {
            super.onSizeChanged(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/search/common/uikit/SummaryTipsView");
        }
    }

    public String getShowingIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d82c1056", new Object[]{this});
        }
        return this.mShowingIndexBuilder.toString();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        List<String> list = this.mSummaryTips;
        if (!(list == null || list.isEmpty() || this.mWidth == 0 || this.mHeight == 0)) {
            int calTextBaseline = calTextBaseline();
            int i = (this.mHeight - DIVIDE_HEIGHT) / 2;
            float f = 0.0f;
            for (int i2 = 0; i2 < this.mSummaryTips.size(); i2++) {
                String str = this.mSummaryTips.get(i2);
                float measureText = this.mPaint.measureText(str);
                int i3 = TIP_MARGIN;
                int i4 = DIVIDE_WIDTH;
                if (f + measureText + i3 + i4 + i3 <= this.mWidth) {
                    if (f > 0.0f) {
                        float f2 = f + i3;
                        canvas.drawRect(f2, i, f2 + i4, DIVIDE_HEIGHT + i, this.mPaint);
                        f = f2 + i4 + i3;
                    }
                    canvas.drawText(str, f, calTextBaseline, this.mPaint);
                    f += measureText;
                    if (this.mShowingIndexBuilder.length() > 0) {
                        this.mShowingIndexBuilder.append(",");
                    }
                    this.mShowingIndexBuilder.append(i2);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onMeasure(i, i2);
        int i3 = getLayoutParams().width;
        StringBuilder sb = this.mShowingIndexBuilder;
        sb.delete(0, sb.length());
        List<String> list = this.mSummaryTips;
        if (!(list == null || list.isEmpty())) {
            float f = 0.0f;
            for (int i4 = 0; i4 < this.mSummaryTips.size(); i4++) {
                float measureText = this.mPaint.measureText(this.mSummaryTips.get(i4));
                int i5 = TIP_MARGIN;
                float f2 = f + measureText + i5;
                int i6 = DIVIDE_WIDTH;
                if (f2 + i6 + i5 <= i3) {
                    if (f > 0.0f) {
                        f = f + i5 + i6 + i5;
                    }
                    f += measureText;
                    if (this.mShowingIndexBuilder.length() > 0) {
                        this.mShowingIndexBuilder.append(",");
                    }
                    this.mShowingIndexBuilder.append(i4);
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d28ddb", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.mWidth = i;
        this.mHeight = i2;
    }

    public void setColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("666e7bdb", new Object[]{this, new Integer(i)});
            return;
        }
        this.mPaint.setColor(i);
        invalidate();
    }

    public void setSummaryTips(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b01c93b4", new Object[]{this, list});
            return;
        }
        this.mSummaryTips = list;
        invalidate();
    }

    public SummaryTipsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new Paint();
        this.mWidth = 0;
        this.mHeight = 0;
        this.mShowingIndexBuilder = new StringBuilder();
        init(attributeSet);
    }
}
