package androidx.databinding.adapters;

import android.os.Build;
import android.widget.TimePicker;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TimePickerBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static int getHour(TimePicker timePicker) {
        int hour;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("18afd34d", new Object[]{timePicker})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            hour = timePicker.getHour();
            return hour;
        }
        Integer currentHour = timePicker.getCurrentHour();
        if (currentHour == null) {
            return 0;
        }
        return currentHour.intValue();
    }

    public static void setHour(TimePicker timePicker, int i) {
        int hour;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6956a1f5", new Object[]{timePicker, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            hour = timePicker.getHour();
            if (hour != i) {
                timePicker.setHour(i);
            }
        } else if (timePicker.getCurrentHour().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    public static void setListeners(TimePicker timePicker, final TimePicker.OnTimeChangedListener onTimeChangedListener, final InverseBindingListener inverseBindingListener, final InverseBindingListener inverseBindingListener2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d146350c", new Object[]{timePicker, onTimeChangedListener, inverseBindingListener, inverseBindingListener2});
        } else if (inverseBindingListener == null && inverseBindingListener2 == null) {
            timePicker.setOnTimeChangedListener(onTimeChangedListener);
        } else {
            timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() { // from class: androidx.databinding.adapters.TimePickerBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.TimePicker.OnTimeChangedListener
                public void onTimeChanged(TimePicker timePicker2, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c04a98c", new Object[]{this, timePicker2, new Integer(i), new Integer(i2)});
                        return;
                    }
                    TimePicker.OnTimeChangedListener onTimeChangedListener2 = onTimeChangedListener;
                    if (onTimeChangedListener2 != null) {
                        onTimeChangedListener2.onTimeChanged(timePicker2, i, i2);
                    }
                    InverseBindingListener inverseBindingListener3 = inverseBindingListener;
                    if (inverseBindingListener3 != null) {
                        inverseBindingListener3.onChange();
                    }
                    InverseBindingListener inverseBindingListener4 = inverseBindingListener2;
                    if (inverseBindingListener4 != null) {
                        inverseBindingListener4.onChange();
                    }
                }
            });
        }
    }

    public static void setMinute(TimePicker timePicker, int i) {
        int minute;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce88b9a5", new Object[]{timePicker, new Integer(i)});
        } else if (Build.VERSION.SDK_INT >= 23) {
            minute = timePicker.getMinute();
            if (minute != i) {
                timePicker.setMinute(i);
            }
        } else if (timePicker.getCurrentMinute().intValue() != i) {
            timePicker.setCurrentHour(Integer.valueOf(i));
        }
    }

    public static int getMinute(TimePicker timePicker) {
        int minute;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d87c129d", new Object[]{timePicker})).intValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            minute = timePicker.getMinute();
            return minute;
        }
        Integer currentMinute = timePicker.getCurrentMinute();
        if (currentMinute == null) {
            return 0;
        }
        return currentMinute.intValue();
    }
}
