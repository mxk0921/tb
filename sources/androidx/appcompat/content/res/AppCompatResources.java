package androidx.appcompat.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.core.content.ContextCompat;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class AppCompatResources {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private AppCompatResources() {
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ColorStateList) ipChange.ipc$dispatch("3020e8f0", new Object[]{context, new Integer(i)});
        }
        return ContextCompat.getColorStateList(context, i);
    }

    public static Drawable getDrawable(Context context, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("e90e44e4", new Object[]{context, new Integer(i)});
        }
        return ResourceManagerInternal.get().getDrawable(context, i);
    }
}
