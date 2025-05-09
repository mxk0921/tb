package androidx.databinding.adapters;

import android.widget.RadioGroup;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RadioGroupBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setCheckedButton(RadioGroup radioGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3422760f", new Object[]{radioGroup, new Integer(i)});
        } else if (i != radioGroup.getCheckedRadioButtonId()) {
            radioGroup.check(i);
        }
    }

    public static void setListeners(RadioGroup radioGroup, final RadioGroup.OnCheckedChangeListener onCheckedChangeListener, final InverseBindingListener inverseBindingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("475612c2", new Object[]{radioGroup, onCheckedChangeListener, inverseBindingListener});
        } else if (inverseBindingListener == null) {
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: androidx.databinding.adapters.RadioGroupBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public void onCheckedChanged(RadioGroup radioGroup2, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8c7eae64", new Object[]{this, radioGroup2, new Integer(i)});
                        return;
                    }
                    RadioGroup.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    if (onCheckedChangeListener2 != null) {
                        onCheckedChangeListener2.onCheckedChanged(radioGroup2, i);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
