package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class yb1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a<T> {
        boolean test(T t);
    }

    public static <T> boolean a(Collection<T> collection, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("747be519", new Object[]{collection, aVar})).booleanValue();
        }
        for (T t : collection) {
            if (aVar.test(t)) {
                return true;
            }
        }
        return false;
    }

    public static <T> Collection<T> b(Collection<T> collection, a<T> aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("ffab32d9", new Object[]{collection, aVar});
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (T t : collection) {
            if (aVar.test(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static <T> List<T> c(T... tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("386cecb6", new Object[]{tArr});
        }
        if (tArr == null || tArr.length == 0) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        Collections.addAll(arrayList, tArr);
        return arrayList;
    }
}
