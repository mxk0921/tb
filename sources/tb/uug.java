package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class uug {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262809);
    }

    public static <T> List<T> a(T... tArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("55e6d5ad", new Object[]{tArr});
        }
        if (tArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }
}
