package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class ListenerUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray<>();

    public static <T> T getListener(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("ce311bd0", new Object[]{view, new Integer(i)});
        }
        return (T) view.getTag(i);
    }

    public static <T> T trackListener(View view, T t, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("95586457", new Object[]{view, t, new Integer(i)});
        }
        T t2 = (T) view.getTag(i);
        view.setTag(i, t);
        return t2;
    }
}
