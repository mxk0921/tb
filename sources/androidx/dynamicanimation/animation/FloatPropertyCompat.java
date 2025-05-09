package androidx.dynamicanimation.animation;

import android.util.FloatProperty;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class FloatPropertyCompat<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final String mPropertyName;

    public FloatPropertyCompat(String str) {
        this.mPropertyName = str;
    }

    public static <T> FloatPropertyCompat<T> createFloatPropertyCompat(final FloatProperty<T> floatProperty) {
        String name;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FloatPropertyCompat) ipChange.ipc$dispatch("7d5c06f6", new Object[]{floatProperty});
        }
        name = floatProperty.getName();
        return new FloatPropertyCompat<T>(name) { // from class: androidx.dynamicanimation.animation.FloatPropertyCompat.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/dynamicanimation/animation/FloatPropertyCompat$1");
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(T t) {
                Object obj;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("654bea0e", new Object[]{this, t})).floatValue();
                }
                obj = floatProperty.get(t);
                return ((Float) obj).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(T t, float f) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("3f1b246e", new Object[]{this, t, new Float(f)});
                } else {
                    floatProperty.setValue(t, f);
                }
            }
        };
    }

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);
}
