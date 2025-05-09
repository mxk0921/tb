package androidx.databinding.adapters;

import android.widget.CompoundButton;
import androidx.databinding.InverseBindingListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CompoundButtonBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setChecked(CompoundButton compoundButton, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ebe5047", new Object[]{compoundButton, new Boolean(z)});
        } else if (compoundButton.isChecked() != z) {
            compoundButton.setChecked(z);
        }
    }

    public static void setListeners(CompoundButton compoundButton, final CompoundButton.OnCheckedChangeListener onCheckedChangeListener, final InverseBindingListener inverseBindingListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1281fea2", new Object[]{compoundButton, onCheckedChangeListener, inverseBindingListener});
        } else if (inverseBindingListener == null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
        } else {
            compoundButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: androidx.databinding.adapters.CompoundButtonBindingAdapter.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton2, boolean z) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton2, new Boolean(z)});
                        return;
                    }
                    CompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = onCheckedChangeListener;
                    if (onCheckedChangeListener2 != null) {
                        onCheckedChangeListener2.onCheckedChanged(compoundButton2, z);
                    }
                    inverseBindingListener.onChange();
                }
            });
        }
    }
}
