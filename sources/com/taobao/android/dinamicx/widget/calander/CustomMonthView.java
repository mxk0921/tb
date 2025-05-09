package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.calander.Calendar;
import com.taobao.taobao.R;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CustomMonthView extends MonthView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Drawable dateBookedDrawable;
    public Paint mBackgroundPaint;
    public Paint mCalendarInfoPaint;
    private Paint mCurDaySelectPaint;
    private Paint mCurDayUnSelectPaint;
    public float mCurrentDayTextBaseLine;
    public float mOutRangeTextBaseLine;
    public Paint mOutRangeTextPaint;
    private int mSelectedCircleRadius;

    static {
        t2o.a(444597483);
    }

    public CustomMonthView(Context context) {
        super(context);
    }

    private float[] getRoundRectRadius(float f, boolean z, boolean z2, boolean z3, boolean z4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (float[]) ipChange.ipc$dispatch("ee4aa376", new Object[]{this, new Float(f), new Boolean(z), new Boolean(z2), new Boolean(z3), new Boolean(z4)});
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = f;
            fArr[1] = f;
        }
        if (z2) {
            fArr[2] = f;
            fArr[3] = f;
        }
        if (z3) {
            fArr[4] = f;
            fArr[5] = f;
        }
        if (z4) {
            fArr[6] = f;
            fArr[7] = f;
        }
        return fArr;
    }

    public static /* synthetic */ Object ipc$super(CustomMonthView customMonthView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1808959798) {
            super.updateItemHeight();
            return null;
        } else if (hashCode == -1285350673) {
            super.updateStyle();
            return null;
        } else if (hashCode == 192383669) {
            super.initPaint();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/calander/CustomMonthView");
        }
    }

    public float getTextBaseLintByPaint(Paint paint) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5bc08c9c", new Object[]{this, paint})).floatValue();
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (this.mDelegate.b() == CalendarDateTextGravity.Top) {
            if (this.mSelectedCircleRadius == 0) {
                onPreviewHook();
            }
            float f = fontMetrics.bottom;
            float f2 = fontMetrics.top;
            return this.mDelegate.p() + ((this.mSelectedCircleRadius + ((f - f2) / 2.0f)) - fontMetrics.descent) + ((f2 - fontMetrics.ascent) / 2.0f);
        }
        float f3 = fontMetrics.bottom;
        float f4 = fontMetrics.top;
        return (((this.mItemHeight / 2.0f) + ((f3 - f4) / 2.0f)) - fontMetrics.descent) + ((f4 - fontMetrics.ascent) / 2.0f);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        super.initPaint();
        this.mOutRangeTextPaint = new Paint();
        this.mCurDaySelectPaint = new Paint();
        this.mCurDayUnSelectPaint = new Paint();
        this.mCalendarInfoPaint = new Paint();
        initCommonPaintWithTypeFace(this.mOutRangeTextPaint, -3355444, 14);
        initCommonPaintWithTypeFace(this.mCurDaySelectPaint, -1, 16);
        initCommonPaintWithTypeFace(this.mCurDayUnSelectPaint, -15658735, 16);
        initCommonPaint(this.mCalendarInfoPaint, -43776, 11);
        Paint paint = new Paint();
        this.mBackgroundPaint = paint;
        paint.setAntiAlias(true);
        this.mBackgroundPaint.setColor(-2062);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawCalendarInfo(Canvas canvas, Calendar calendar, int i, int i2) {
        String str;
        boolean z;
        boolean z2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7805bfbf", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2)});
            return;
        }
        Calendar.a calendarInfo = calendar.getCalendarInfo();
        if (calendarInfo != null && !TextUtils.isEmpty(calendarInfo.f7423a)) {
            if (!TextUtils.isEmpty(calendarInfo.b)) {
                try {
                    this.mBackgroundPaint.setColor(Color.parseColor(calendar.getCalendarInfo().b));
                } catch (Throwable unused) {
                }
            }
            int c = pb6.c(getContext(), 6.0f);
            if (calendar.roundRectType == Calendar.RoundRectType.ALL) {
                float f = c;
                canvas.drawRoundRect(new RectF(i, i2, this.mItemWidth + i, this.mItemHeight + i2), f, f, this.mBackgroundPaint);
            } else {
                Path path = new Path();
                Calendar.RoundRectType roundRectType = calendar.roundRectType;
                if (roundRectType == Calendar.RoundRectType.LEFT) {
                    z = true;
                } else {
                    z = false;
                }
                if (roundRectType == Calendar.RoundRectType.RIGHT) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                path.addRoundRect(new RectF(i, i2, this.mItemWidth + i, this.mItemHeight + i2), getRoundRectRadius(c, z, z2, z2, z), Path.Direction.CW);
                canvas.drawPath(path, this.mBackgroundPaint);
            }
            float f2 = i + (this.mItemWidth / 2.0f);
            float o = ((this.mItemHeight + i2) - this.mDelegate.o()) - (this.mCalendarInfoPaint.getFontMetrics().descent / 2.0f);
            if (calendarInfo.f7423a.length() > 4) {
                str = calendarInfo.f7423a.substring(0, 4);
            } else {
                str = calendarInfo.f7423a;
            }
            canvas.drawText(str, f2, o, this.mCalendarInfoPaint);
        }
        if (calendar.isBooked()) {
            if (this.dateBookedDrawable == null) {
                Drawable drawable = getResources().getDrawable(R.drawable.calendar_date_booked);
                this.dateBookedDrawable = drawable;
                drawable.setBounds(0, 0, pb6.c(getContext(), 11.0f), pb6.c(getContext(), 10.0f));
            }
            canvas.save();
            canvas.translate(((this.mItemWidth + i) - this.dateBookedDrawable.getBounds().width()) - pb6.c(getContext(), 3.0f), this.mDelegate.p() + i2 + pb6.c(getContext(), 1.0f));
            this.dateBookedDrawable.draw(canvas);
            canvas.restore();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawCurrentDayUnSelected(Canvas canvas, Calendar calendar, int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0f78c94", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2)});
            return;
        }
        int i4 = i + (this.mItemWidth / 2);
        if (this.mDelegate.b() == CalendarDateTextGravity.Top) {
            i2 += this.mSelectedCircleRadius;
            i3 = this.mDelegate.p();
        } else {
            i3 = this.mItemHeight / 2;
        }
        canvas.drawCircle(i4, i2 + i3, this.mSelectedCircleRadius, this.mCurrentDayUnSelectedBgPaint);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c906c4c4", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        int i4 = i + (this.mItemWidth / 2);
        if (this.mDelegate.b() == CalendarDateTextGravity.Top) {
            i2 += this.mSelectedCircleRadius;
            i3 = this.mDelegate.p();
        } else {
            i3 = this.mItemHeight / 2;
        }
        int i5 = i2 + i3;
        int i6 = this.mSelectedCircleRadius;
        float f = i5;
        this.mSelectedPaint.setShader(new LinearGradient(i4 - i6, f, i6 + i4, f, Color.parseColor("#FF8100"), Color.parseColor("#FE560A"), Shader.TileMode.REPEAT));
        canvas.drawCircle(i4, f, this.mSelectedCircleRadius, this.mSelectedPaint);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.MonthView
    public void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2) {
        String str;
        float f;
        Paint paint;
        float f2;
        Paint paint2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b08663e", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2), new Boolean(z), new Boolean(z2)});
            return;
        }
        float f3 = i + (this.mItemWidth / 2.0f);
        if (calendar.isCurrentDay()) {
            str = "今";
        } else {
            str = String.valueOf(calendar.getDay());
        }
        if (calendar.isCurrentDay()) {
            if (!isInRange(calendar)) {
                f2 = this.mOutRangeTextBaseLine;
            } else {
                f2 = this.mCurrentDayTextBaseLine;
            }
            float f4 = f2 + i2;
            if (!isInRange(calendar)) {
                paint2 = this.mOutRangeTextPaint;
            } else if (!z2) {
                paint2 = this.mCurDayUnSelectPaint;
            } else {
                paint2 = this.mCurDaySelectPaint;
            }
            canvas.drawText(str, f3, f4, paint2);
            return;
        }
        if (!isInRange(calendar)) {
            f = this.mOutRangeTextBaseLine;
        } else {
            f = this.mTextBaseLine;
        }
        float f5 = f + i2;
        if (z2) {
            paint = this.mSelectTextPaint;
        } else if (!isInRange(calendar)) {
            paint = this.mOutRangeTextPaint;
        } else {
            paint = this.mCurMonthTextPaint;
        }
        canvas.drawText(str, f3, f5, paint);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseMonthView
    public void onLoopStart(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf3b4e6", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseMonthView, com.taobao.android.dinamicx.widget.calander.BaseView
    public void onPreviewHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5f8033", new Object[]{this});
        } else if (this.mDelegate.b() == CalendarDateTextGravity.Top) {
            this.mSelectedCircleRadius = pb6.c(getContext(), 12.0f);
        } else {
            this.mSelectedCircleRadius = (Math.min(this.mItemWidth, this.mItemHeight) / 5) * 2;
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseMonthView, com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        super.updateItemHeight();
        this.mTextBaseLine = getTextBaseLintByPaint(this.mCurMonthTextPaint);
        this.mOutRangeTextBaseLine = getTextBaseLintByPaint(this.mOutRangeTextPaint);
        this.mCurrentDayTextBaseLine = getTextBaseLintByPaint(this.mCurDaySelectPaint);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        super.updateStyle();
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            this.mOutRangeTextPaint.setTextSize(calendarViewDelegate.l());
            if (this.mDelegate.h() > 0) {
                this.mCurDaySelectPaint.setTextSize(this.mDelegate.h());
                this.mCurDayUnSelectPaint.setTextSize(this.mDelegate.h());
            }
            this.mSelectTextPaint.setColor(this.mDelegate.B());
            this.mCurDaySelectPaint.setColor(this.mDelegate.B());
            this.mCurDayUnSelectPaint.setColor(this.mDelegate.i());
        }
    }
}
