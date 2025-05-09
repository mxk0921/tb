package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dp7<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<T, List<T>> f17996a = new LinkedHashMap();

    static {
        t2o.a(1002438735);
    }

    public final void a(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b892f9bd", new Object[]{this, t, t2});
            return;
        }
        b(t);
        b(t2);
        List list = (List) ((LinkedHashMap) this.f17996a).get(t);
        if (list != null) {
            list.add(t2);
        }
    }

    public final void b(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d46fea6", new Object[]{this, t});
        } else if (!this.f17996a.containsKey(t)) {
            this.f17996a.put(t, new ArrayList());
        }
    }

    public final List<T> c(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6e412287", new Object[]{this, t});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.f17996a).entrySet()) {
            Object key = entry.getKey();
            if (((List) entry.getValue()).contains(t)) {
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    public final List<T> d(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("36a6ce01", new Object[]{this, t});
        }
        return (List) ((LinkedHashMap) this.f17996a).get(t);
    }

    public final boolean e(T t, T t2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1eec23a", new Object[]{this, t, t2})).booleanValue();
        }
        List list = (List) ((LinkedHashMap) this.f17996a).get(t);
        if (list == null || !list.contains(t2)) {
            return false;
        }
        return true;
    }
}
