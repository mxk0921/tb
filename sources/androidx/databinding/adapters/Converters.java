package androidx.databinding.adapters;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Converters {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static ColorStateList convertColorToColorStateList(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("933b514f", new Object[]{new Integer(i)});
        }
        return ColorStateList.valueOf(i);
    }

    public static ColorDrawable convertColorToDrawable(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorDrawable) ipChange.ipc$dispatch("dcecf330", new Object[]{new Integer(i)});
        }
        return new ColorDrawable(i);
    }
}
