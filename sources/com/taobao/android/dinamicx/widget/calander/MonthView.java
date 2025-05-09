package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.calander.CalendarView;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class MonthView extends BaseMonthView {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444597486);
    }

    public MonthView(Context context) {
        super(context);
    }

    private void draw(Canvas canvas, Calendar calendar, int i, int i2, int i3) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e383be39", new Object[]{this, canvas, calendar, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        int e = (i2 * this.mItemWidth) + this.mDelegate.e();
        int i4 = i * this.mItemHeight;
        onLoopStart(e, i4);
        if (i3 == this.mCurrentItem) {
            z = true;
        } else {
            z = false;
        }
        if (calendar.containHighLightCalendarInfo()) {
            onDrawCalendarInfo(canvas, calendar, e, i4);
        }
        if (z) {
            onDrawSelected(canvas, calendar, e, i4, false);
        } else if (calendar.isCurrentDay() && this.mDelegate.L()) {
            onDrawCurrentDayUnSelected(canvas, calendar, e, i4);
        }
        onDrawText(canvas, calendar, e, i4, false, z);
    }

    public static /* synthetic */ Object ipc$super(MonthView monthView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/MonthView");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar index;
        MonthViewPager monthViewPager;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!this.isClick || (index = getIndex()) == null) {
        } else {
            if (this.mDelegate.y() == 1 && !index.isCurrentMonth()) {
                return;
            }
            if (onCalendarIntercept(index)) {
                this.mDelegate.getClass();
                throw null;
            } else if (!isInRange(index)) {
                CalendarView.b bVar = this.mDelegate.A;
                if (bVar != null) {
                    bVar.a(index);
                }
            } else {
                CalendarView.c cVar = this.mDelegate.B;
                if (cVar != null) {
                    ((CalendarView.a) cVar).a(index, true);
                }
                CalendarView.b bVar2 = this.mDelegate.A;
                if (bVar2 != null) {
                    bVar2.b(index, true);
                }
                this.mCurrentItem = this.mItems.indexOf(index);
                if (this.mDelegate.K() && !index.isCurrentMonth() && (monthViewPager = this.mMonthViewPager) != null) {
                    int currentItem = monthViewPager.getCurrentItem();
                    if (this.mCurrentItem < 7) {
                        i = currentItem - 1;
                    } else {
                        i = currentItem + 1;
                    }
                    this.mMonthViewPager.setCurrentItem(i);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r7.isCurrentMonth() == false) goto L_0x0064;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.dinamicx.widget.calander.MonthView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "bd69fddb"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r14
            r1[r2] = r15
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0015:
            int r3 = r14.mLineCount
            if (r3 != 0) goto L_0x001a
            return
        L_0x001a:
            int r3 = r14.getWidth()
            com.taobao.android.dinamicx.widget.calander.CalendarViewDelegate r4 = r14.mDelegate
            int r4 = r4.e()
            int r3 = r3 - r4
            com.taobao.android.dinamicx.widget.calander.CalendarViewDelegate r4 = r14.mDelegate
            int r4 = r4.f()
            int r3 = r3 - r4
            r4 = 7
            int r3 = r3 / r4
            r14.mItemWidth = r3
            r14.onPreviewHook()
            int r3 = r14.mLineCount
            int r3 = r3 * 7
            r5 = 0
            r11 = 0
        L_0x0039:
            int r6 = r14.mLineCount
            if (r11 >= r6) goto L_0x007f
            r12 = r5
            r13 = 0
        L_0x003f:
            if (r13 >= r4) goto L_0x007c
            java.util.List<com.taobao.android.dinamicx.widget.calander.Calendar> r5 = r14.mItems
            java.lang.Object r5 = r5.get(r12)
            r7 = r5
            com.taobao.android.dinamicx.widget.calander.Calendar r7 = (com.taobao.android.dinamicx.widget.calander.Calendar) r7
            com.taobao.android.dinamicx.widget.calander.CalendarViewDelegate r5 = r14.mDelegate
            int r5 = r5.y()
            if (r5 != r2) goto L_0x0066
            java.util.List<com.taobao.android.dinamicx.widget.calander.Calendar> r5 = r14.mItems
            int r5 = r5.size()
            int r6 = r14.mNextDiff
            int r5 = r5 - r6
            if (r12 <= r5) goto L_0x005e
            return
        L_0x005e:
            boolean r5 = r7.isCurrentMonth()
            if (r5 != 0) goto L_0x0071
        L_0x0064:
            int r12 = r12 + r2
            goto L_0x007a
        L_0x0066:
            com.taobao.android.dinamicx.widget.calander.CalendarViewDelegate r5 = r14.mDelegate
            int r5 = r5.y()
            if (r5 != r1) goto L_0x0071
            if (r12 < r3) goto L_0x0071
            return
        L_0x0071:
            r5 = r14
            r6 = r15
            r8 = r11
            r9 = r13
            r10 = r12
            r5.draw(r6, r7, r8, r9, r10)
            goto L_0x0064
        L_0x007a:
            int r13 = r13 + r2
            goto L_0x003f
        L_0x007c:
            int r11 = r11 + r2
            r5 = r12
            goto L_0x0039
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.calander.MonthView.onDraw(android.graphics.Canvas):void");
    }

    public abstract void onDrawCalendarInfo(Canvas canvas, Calendar calendar, int i, int i2);

    public abstract void onDrawCurrentDayUnSelected(Canvas canvas, Calendar calendar, int i, int i2);

    public abstract void onDrawSelected(Canvas canvas, Calendar calendar, int i, int i2, boolean z);

    public abstract void onDrawText(Canvas canvas, Calendar calendar, int i, int i2, boolean z, boolean z2);

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
        }
        this.mDelegate.getClass();
        return false;
    }
}
