package androidx.collection;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ArraySetJvmUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ArraySetJvmUtil() {
    }

    public static <T> T[] resizeForToArray(T[] tArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T[]) ((Object[]) ipChange.ipc$dispatch("7e3cb743", new Object[]{tArr, new Integer(i)}));
        }
        if (tArr.length < i) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
