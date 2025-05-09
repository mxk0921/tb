package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xb1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262740);
    }

    public static <T> T[] a(T[] tArr, int i, int i2) {
        T[] tArr2;
        int i3 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("11627b72", new Object[]{tArr, new Integer(i), new Integer(i2)}));
        }
        if (tArr == null || tArr.length == 0) {
            return tArr;
        }
        if (i >= tArr.length || i2 <= i) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 > tArr.length) {
            i2 = tArr.length;
        }
        int i4 = i2 - i;
        Class<?> cls = tArr.getClass();
        if (cls == Object[].class) {
            tArr2 = (T[]) new Object[i4];
        } else {
            tArr2 = (T[]) ((Object[]) Array.newInstance(cls.getComponentType(), i4));
        }
        while (i < i2) {
            tArr2[i3] = tArr[i];
            i++;
            i3++;
        }
        return tArr2;
    }
}
