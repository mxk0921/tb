package androidx.databinding.adapters;

import androidx.appcompat.widget.SwitchCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SwitchCompatBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setSwitchTextAppearance(SwitchCompat switchCompat, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbd4235", new Object[]{switchCompat, new Integer(i)});
        } else {
            switchCompat.setSwitchTextAppearance(null, i);
        }
    }
}
