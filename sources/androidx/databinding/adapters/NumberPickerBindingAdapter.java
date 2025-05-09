package androidx.databinding.adapters;

import android.widget.NumberPicker;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NumberPickerBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setListeners(NumberPicker numberPicker, final NumberPicker.OnValueChangeListener onValueChangeListener, final InverseBindingListener inverseBindingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("460ef1ac", new Object[]{numberPicker, onValueChangeListener, inverseBindingListener});
        } else if (inverseBindingListener == null) {
            numberPicker.setOnValueChangedListener(onValueChangeListener);
        } else {
            numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: androidx.databinding.adapters.NumberPickerBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.NumberPicker.OnValueChangeListener
                public void onValueChange(NumberPicker numberPicker2, int i, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("c37d7836", new Object[]{this, numberPicker2, new Integer(i), new Integer(i2)});
                        return;
                    }
                    NumberPicker.OnValueChangeListener onValueChangeListener2 = onValueChangeListener;
                    if (onValueChangeListener2 != null) {
                        onValueChangeListener2.onValueChange(numberPicker2, i, i2);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }

    public static void setValue(NumberPicker numberPicker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6683563a", new Object[]{numberPicker, new Integer(i)});
        } else if (numberPicker.getValue() != i) {
            numberPicker.setValue(i);
        }
    }
}
