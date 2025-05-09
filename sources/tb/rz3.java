package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class rz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static boolean a(Collection<Integer> collection, int[] iArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25f62d4a", new Object[]{collection, iArr})).booleanValue();
        }
        boolean z = false;
        for (int i : iArr) {
            z |= collection.add(Integer.valueOf(i));
        }
        return z;
    }

    public static int[] b(int[] iArr, int[] iArr2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("6ffb390d", new Object[]{iArr, iArr2});
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + iArr2.length);
        System.arraycopy(iArr2, 0, copyOf, iArr.length, iArr2.length);
        return copyOf;
    }

    public static boolean c(int[] iArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6eeb58d3", new Object[]{iArr, new Integer(i)})).booleanValue();
        }
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static int[] d(Set<Integer> set) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f2761e2a", new Object[]{set});
        }
        int[] iArr = new int[set.size()];
        for (Integer num : set) {
            if (num != null) {
                iArr[i] = num.intValue();
            }
            i++;
        }
        return iArr;
    }
}
