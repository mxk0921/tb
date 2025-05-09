package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class dua<K, V> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<K, ArrayList<V>> f18071a = new HashMap<>();

    static {
        t2o.a(625999964);
    }

    public ArrayList<V> a(K k) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4b4338d3", new Object[]{this, k});
        }
        return this.f18071a.get(k);
    }

    public HashMap<K, ArrayList<V>> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("d617162", new Object[]{this});
        }
        return this.f18071a;
    }

    public void c(K k, V v) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("360f65ce", new Object[]{this, k, v});
            return;
        }
        ArrayList<V> a2 = a(k);
        if (a2 == null) {
            a2 = new ArrayList<>();
        }
        a2.add(v);
        this.f18071a.put(k, a2);
    }
}
