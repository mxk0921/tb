package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ObjectAnimatorUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ObjectAnimatorUtils() {
    }

    public static <T> ObjectAnimator ofPointF(T t, Property<T, PointF> property, Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ObjectAnimator) ipChange.ipc$dispatch("c84ccf2b", new Object[]{t, property, path});
        }
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
