package androidx.databinding.adapters;

import android.widget.CalendarView;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CalendarViewBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setDate(CalendarView calendarView, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8ac4688", new Object[]{calendarView, new Long(j)});
        } else if (calendarView.getDate() != j) {
            calendarView.setDate(j);
        }
    }

    public static void setListeners(CalendarView calendarView, final CalendarView.OnDateChangeListener onDateChangeListener, final InverseBindingListener inverseBindingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cc02407", new Object[]{calendarView, onDateChangeListener, inverseBindingListener});
        } else if (inverseBindingListener == null) {
            calendarView.setOnDateChangeListener(onDateChangeListener);
        } else {
            calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() { // from class: androidx.databinding.adapters.CalendarViewBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CalendarView.OnDateChangeListener
                public void onSelectedDayChange(CalendarView calendarView2, int i, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("43a4b29", new Object[]{this, calendarView2, new Integer(i), new Integer(i2), new Integer(i3)});
                        return;
                    }
                    CalendarView.OnDateChangeListener onDateChangeListener2 = onDateChangeListener;
                    if (onDateChangeListener2 != null) {
                        onDateChangeListener2.onSelectedDayChange(calendarView2, i, i2, i3);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
