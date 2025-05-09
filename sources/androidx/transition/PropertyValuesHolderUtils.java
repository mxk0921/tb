package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class PropertyValuesHolderUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private PropertyValuesHolderUtils() {
    }

    public static PropertyValuesHolder ofPointF(Property<?, PointF> property, Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PropertyValuesHolder) ipChange.ipc$dispatch("9ec7df0a", new Object[]{property, path});
        }
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
