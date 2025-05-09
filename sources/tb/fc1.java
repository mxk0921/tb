package tb;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class fc1 {
    public static final <T> T[] a(T[] tArr, int i) {
        ckf.g(tArr, TypedValues.Custom.S_REFERENCE);
        Object newInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        ckf.e(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (T[]) ((Object[]) newInstance);
    }

    public static final void b(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }
}
