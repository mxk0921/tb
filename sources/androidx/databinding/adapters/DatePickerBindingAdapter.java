package androidx.databinding.adapters;

import android.widget.DatePicker;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class DatePickerBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class DateChangedListener implements DatePicker.OnDateChangedListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public InverseBindingListener mDayChanged;
        public DatePicker.OnDateChangedListener mListener;
        public InverseBindingListener mMonthChanged;
        public InverseBindingListener mYearChanged;

        private DateChangedListener() {
        }

        @Override // android.widget.DatePicker.OnDateChangedListener
        public void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bd02e297", new Object[]{this, datePicker, new Integer(i), new Integer(i2), new Integer(i3)});
                return;
            }
            DatePicker.OnDateChangedListener onDateChangedListener = this.mListener;
            if (onDateChangedListener != null) {
                onDateChangedListener.onDateChanged(datePicker, i, i2, i3);
            }
            InverseBindingListener inverseBindingListener = this.mYearChanged;
            if (inverseBindingListener != null) {
                inverseBindingListener.onChange();
            }
            InverseBindingListener inverseBindingListener2 = this.mMonthChanged;
            if (inverseBindingListener2 != null) {
                inverseBindingListener2.onChange();
            }
            InverseBindingListener inverseBindingListener3 = this.mDayChanged;
            if (inverseBindingListener3 != null) {
                inverseBindingListener3.onChange();
            }
        }

        public void setListeners(DatePicker.OnDateChangedListener onDateChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2, InverseBindingListener inverseBindingListener3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ee4f7df", new Object[]{this, onDateChangedListener, inverseBindingListener, inverseBindingListener2, inverseBindingListener3});
                return;
            }
            this.mListener = onDateChangedListener;
            this.mYearChanged = inverseBindingListener;
            this.mMonthChanged = inverseBindingListener2;
            this.mDayChanged = inverseBindingListener3;
        }
    }

    public static void setListeners(DatePicker datePicker, int i, int i2, int i3, DatePicker.OnDateChangedListener onDateChangedListener, InverseBindingListener inverseBindingListener, InverseBindingListener inverseBindingListener2, InverseBindingListener inverseBindingListener3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f71dc28", new Object[]{datePicker, new Integer(i), new Integer(i2), new Integer(i3), onDateChangedListener, inverseBindingListener, inverseBindingListener2, inverseBindingListener3});
            return;
        }
        if (i == 0) {
            i = datePicker.getYear();
        }
        if (i3 == 0) {
            i3 = datePicker.getDayOfMonth();
        }
        if (inverseBindingListener == null && inverseBindingListener2 == null && inverseBindingListener3 == null) {
            datePicker.init(i, i2, i3, onDateChangedListener);
            return;
        }
        int i4 = R.id.onDateChanged;
        DateChangedListener dateChangedListener = (DateChangedListener) ListenerUtil.getListener(datePicker, i4);
        if (dateChangedListener == null) {
            dateChangedListener = new DateChangedListener();
            ListenerUtil.trackListener(datePicker, dateChangedListener, i4);
        }
        dateChangedListener.setListeners(onDateChangedListener, inverseBindingListener, inverseBindingListener2, inverseBindingListener3);
        datePicker.init(i, i2, i3, dateChangedListener);
    }
}
