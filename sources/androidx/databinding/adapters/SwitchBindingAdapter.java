package androidx.databinding.adapters;

import android.widget.Switch;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SwitchBindingAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static void setSwitchTextAppearance(Switch r3, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cf4cecf", new Object[]{r3, new Integer(i)});
        } else {
            r3.setSwitchTextAppearance(null, i);
        }
    }
}
