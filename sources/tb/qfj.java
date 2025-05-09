package tb;

import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class qfj<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26725a = 0;
    public List<T> b;
    public List<T> c;

    static {
        t2o.a(511705389);
    }

    public void c(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95d80199", new Object[]{this, list});
        } else if (list != null && list.size() > 0) {
            List<T> list2 = this.b;
            if (list2 != null) {
                list2.addAll(list);
            }
            this.c = list;
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc9fa7d0", new Object[]{this});
        } else {
            this.c = null;
        }
    }

    public void e(List<T> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8f9397b", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public T f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
        }
        odg.b(RPCDataItems.SWITCH_TAG_LOG, "aYou thumbnailL onDestroy, LCContext ,mCurrentIndex=" + this.f26725a + " ，size=" + m());
        return i(this.f26725a);
    }

    public List<T> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b846d2ad", new Object[]{this});
        }
        return this.c;
    }

    public List<T> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("96bfe95", new Object[]{this});
        }
        return this.b;
    }

    public T i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("cbf3e0bf", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.get(i);
    }

    public int j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bb85d649", new Object[]{this})).intValue();
        }
        return this.f26725a;
    }

    public T k(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (T) ipChange.ipc$dispatch("e3aab8da", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.b.size()) {
            return null;
        }
        return this.b.remove(i);
    }

    public void l(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90cb73e1", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < this.b.size()) {
            this.f26725a = i;
        }
    }

    public int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        List<T> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }
}
