package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class BaseMonthView extends BaseView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int mHeight;
    public int mLineCount;
    public int mMonth;
    public MonthViewPager mMonthViewPager;
    public int mNextDiff;
    public int mYear;

    static {
        t2o.a(444597465);
    }

    public BaseMonthView(Context context) {
        super(context);
    }

    private void initCalendar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2651f5", new Object[]{this});
            return;
        }
        this.mNextDiff = a.h(this.mYear, this.mMonth, this.mDelegate.G());
        int l = a.l(this.mYear, this.mMonth, this.mDelegate.G());
        int g = a.g(this.mYear, this.mMonth);
        List<Calendar> n = a.n(this.mYear, this.mMonth, this.mDelegate);
        this.mItems = n;
        if (n.contains(this.mDelegate.g())) {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.g());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.F);
        }
        if (this.mCurrentItem > 0) {
            this.mDelegate.getClass();
        }
        if (this.mDelegate.y() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((l + g) + this.mNextDiff) / 7;
        }
        invalidate();
    }

    public static /* synthetic */ Object ipc$super(BaseMonthView baseMonthView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1808959798) {
            super.updateItemHeight();
            return null;
        } else if (hashCode == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/widget/calander/BaseMonthView");
        }
    }

    private void onClickCalendarPadding() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba973451", new Object[]{this});
        } else {
            this.mDelegate.getClass();
        }
    }

    public Object getClickCalendarPaddingObject(float f, float f2, Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3869697b", new Object[]{this, new Float(f), new Float(f2), calendar});
        }
        return null;
    }

    public Calendar getIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("73e554c3", new Object[]{this});
        }
        if (!(this.mItemWidth == 0 || this.mItemHeight == 0)) {
            if (this.mX <= this.mDelegate.e() || this.mX >= getWidth() - this.mDelegate.f()) {
                onClickCalendarPadding();
            } else {
                int e = ((int) (this.mX - this.mDelegate.e())) / this.mItemWidth;
                if (e >= 7) {
                    e = 6;
                }
                int i = ((((int) this.mY) / this.mItemHeight) * 7) + e;
                if (i < 0 || i >= this.mItems.size()) {
                    return null;
                }
                return this.mItems.get(i);
            }
        }
        return null;
    }

    public final int getSelectedIndex(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d8a484eb", new Object[]{this, calendar})).intValue();
        }
        return this.mItems.indexOf(calendar);
    }

    public final void initMonthWithDate(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b640d92b", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.mYear = i;
        this.mMonth = i2;
        initCalendar();
        this.mHeight = a.k(i, i2, this.mItemHeight, this.mDelegate.G(), this.mDelegate.y());
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public void onLoopStart(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbf3b4e6", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mLineCount != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void onPreviewHook() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e5f8033", new Object[]{this});
        }
    }

    public final void setSelectedCalendar(Calendar calendar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4000b2", new Object[]{this, calendar});
        } else {
            this.mCurrentItem = this.mItems.indexOf(calendar);
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateCurrentDate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bbd39c5", new Object[]{this});
            return;
        }
        List<Calendar> list = this.mItems;
        if (list != null) {
            if (list.contains(this.mDelegate.g())) {
                for (Calendar calendar : this.mItems) {
                    calendar.setCurrentDay(false);
                }
                this.mItems.get(this.mItems.indexOf(this.mDelegate.g())).setCurrentDay(true);
            }
            invalidate();
        }
    }

    @Override // com.taobao.android.dinamicx.widget.calander.BaseView
    public void updateItemHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("942d76ca", new Object[]{this});
            return;
        }
        super.updateItemHeight();
        this.mHeight = a.k(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.G(), this.mDelegate.y());
    }
}
