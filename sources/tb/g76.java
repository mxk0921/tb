package tb;

import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class g76 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public SparseArray<String> f19768a;
    public SparseArray<byte[]> b;
    public List<wx5> c;
    public Map<String, Short> d;

    static {
        t2o.a(444597337);
    }

    public SparseArray<String> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("1db0e933", new Object[]{this});
        }
        return this.f19768a;
    }

    public SparseArray<byte[]> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseArray) ipChange.ipc$dispatch("dd425d0d", new Object[]{this});
        }
        return this.b;
    }

    public Map<String, Short> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("eb3e1895", new Object[]{this});
        }
        return this.d;
    }

    public List<wx5> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1e74f21c", new Object[]{this});
        }
        return this.c;
    }

    public void e(SparseArray<String> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2e955d", new Object[]{this, sparseArray});
        } else {
            this.f19768a = sparseArray;
        }
    }

    public void f(SparseArray<byte[]> sparseArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a05d15b", new Object[]{this, sparseArray});
        } else {
            this.b = sparseArray;
        }
    }

    public void g(Map<String, Short> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0523831", new Object[]{this, map});
        } else {
            this.d = map;
        }
    }

    public void h(List<wx5> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710037c8", new Object[]{this, list});
        } else {
            this.c = list;
        }
    }
}
