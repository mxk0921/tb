package com.taobao.android.dinamicx.widget.calander;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class WeekBar extends LinearLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private CalendarViewDelegate mDelegate;

    static {
        t2o.a(444597490);
    }

    public WeekBar(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(R.layout.datepicker_week_bar, (ViewGroup) this, true);
    }

    private String getWeekString(int i, int i2) {
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5109fcde", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        String[] stringArray = getContext().getResources().getStringArray(R.array.week_string_array);
        if (i2 == 1) {
            return stringArray[i];
        }
        int i4 = 6;
        if (i2 == 2) {
            if (i != 6) {
                i3 = i + 1;
            }
            return stringArray[i3];
        }
        if (i != 0) {
            i4 = i - 1;
        }
        return stringArray[i4];
    }

    public static /* synthetic */ Object ipc$super(WeekBar weekBar, String str, Object... objArr) {
        if (str.hashCode() == 650865254) {
            super.onMeasure(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/calander/WeekBar");
    }

    public void onDateSelected(Calendar calendar, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bcb5350", new Object[]{this, calendar, new Integer(i), new Boolean(z)});
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            i3 = View.MeasureSpec.makeMeasureSpec(calendarViewDelegate.D(), 1073741824);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(a.c(getContext(), 40.0f), 1073741824);
        }
        super.onMeasure(i, i3);
    }

    public void onWeekStartChange(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe0b047d", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setText(getWeekString(i2, i));
        }
    }

    public void setTextColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc80f7e8", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setTextColor(i);
        }
    }

    public void setTextSize(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b5ef80c", new Object[]{this, new Integer(i)});
            return;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((TextView) getChildAt(i2)).setTextSize(0, i);
        }
    }

    public void setup(CalendarViewDelegate calendarViewDelegate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2667438a", new Object[]{this, calendarViewDelegate});
            return;
        }
        this.mDelegate = calendarViewDelegate;
        setTextSize(calendarViewDelegate.I());
        setTextColor(calendarViewDelegate.H());
        setBackgroundColor(calendarViewDelegate.C());
        setPadding(calendarViewDelegate.e(), 0, calendarViewDelegate.f(), 0);
    }
}
