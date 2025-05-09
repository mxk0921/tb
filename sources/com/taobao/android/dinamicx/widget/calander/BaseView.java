package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.fv9;
import tb.pb6;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseView extends View implements View.OnClickListener, View.OnLongClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CALENDAR_INFO_TEXT_SIZE = 11;
    public static final int CURRENT_DAY_TEXT_SIZE = 16;
    public static final int TEXT_SIZE = 14;
    public boolean isClick;
    public Paint mCurMonthTextPaint;
    public Paint mCurrentDayUnSelectedBgPaint;
    public int mCurrentItem;
    public CalendarViewDelegate mDelegate;
    public int mItemHeight;
    public int mItemWidth;
    public List<Calendar> mItems;
    public Paint mSelectTextPaint;
    public Paint mSelectedPaint;
    public float mTextBaseLine;
    public int mWeekStartWidth;
    public float mX;
    public float mY;
    private Typeface typeface;

    static {
        t2o.a(444597466);
    }

    public BaseView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Object ipc$super(BaseView baseView, String str, Object... objArr) {
        if (str.hashCode() == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/BaseView");
    }

    public void initCommonPaint(Paint paint, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ee63bbf", new Object[]{this, paint, new Integer(i), new Integer(i2)});
            return;
        }
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(i);
        paint.setFakeBoldText(true);
        paint.setTextSize(a.c(getContext(), i2));
    }

    public void initCommonPaintWithTypeFace(Paint paint, int i, int i2) {
        CalendarViewDelegate calendarViewDelegate;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c399b63c", new Object[]{this, paint, new Integer(i), new Integer(i2)});
            return;
        }
        initCommonPaint(paint, i, i2);
        try {
            if (this.typeface == null && (calendarViewDelegate = this.mDelegate) != null && !TextUtils.isEmpty(calendarViewDelegate.j())) {
                this.typeface = fv9.c().b(this.mDelegate.j(), 0);
            }
            if (this.typeface != null) {
                paint.setFakeBoldText(false);
                paint.setTypeface(this.typeface);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void initPaint() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b778ab5", new Object[]{this});
            return;
        }
        initCommonPaintWithTypeFace(this.mCurMonthTextPaint, -15658735, 14);
        initCommonPaintWithTypeFace(this.mSelectTextPaint, -1, 14);
        initCommonPaintWithTypeFace(this.mCurrentDayUnSelectedBgPaint, -43776, 14);
        Paint paint = this.mSelectTextPaint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.mSelectedPaint.setStyle(style);
        this.mCurrentDayUnSelectedBgPaint.setStyle(Paint.Style.STROKE);
        this.mCurrentDayUnSelectedBgPaint.setStrokeWidth(pb6.c(getContext(), 0.75f));
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    public final boolean isInRange(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5159e209", new Object[]{this, calendar})).booleanValue();
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || !a.q(calendar, calendarViewDelegate)) {
            return false;
        }
        return true;
    }

    public boolean isSelected(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cc6b5ea0", new Object[]{this, calendar})).booleanValue();
        }
        List<Calendar> list = this.mItems;
        if (list == null || list.indexOf(calendar) != this.mCurrentItem) {
            return false;
        }
        return true;
    }

    public final boolean onCalendarIntercept(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39bff3c0", new Object[]{this, calendar})).booleanValue();
        }
        this.mDelegate.getClass();
        return false;
    }

    public abstract void onDestroy();

    public void onPreviewHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5f8033", new Object[]{this});
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
            this.isClick = true;
        } else if (action == 1) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
        } else if (action == 2 && this.isClick) {
            if (Math.abs(motionEvent.getY() - this.mY) > 50.0f) {
                z = false;
            }
            this.isClick = z;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setup(CalendarViewDelegate calendarViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2667438a", new Object[]{this, calendarViewDelegate});
            return;
        }
        this.mDelegate = calendarViewDelegate;
        this.mWeekStartWidth = calendarViewDelegate.G();
        initPaint();
        updateStyle();
        updateItemHeight();
    }

    public final void update() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee4a30d0", new Object[]{this});
        } else {
            invalidate();
        }
    }

    public abstract void updateCurrentDate();

    public void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        this.mItemHeight = this.mDelegate.d();
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
    }

    public void updateStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3631aef", new Object[]{this});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            this.mCurMonthTextPaint.setColor(calendarViewDelegate.i());
            this.mSelectTextPaint.setColor(this.mDelegate.B());
            this.mCurMonthTextPaint.setTextSize(this.mDelegate.l());
            this.mSelectTextPaint.setTextSize(this.mDelegate.l());
            this.mSelectedPaint.setStyle(Paint.Style.FILL);
        }
    }

    public BaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mCurrentDayUnSelectedBgPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.isClick = true;
        this.mCurrentItem = -1;
    }
}
