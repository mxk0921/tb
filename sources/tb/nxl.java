package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.LowMemoryListener;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class nxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<LowMemoryListener> f25018a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final nxl f25019a = new nxl();

        public static /* synthetic */ nxl a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (nxl) ipChange.ipc$dispatch("30e2c78a", new Object[0]);
            }
            return f25019a;
        }
    }

    public static nxl b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nxl) ipChange.ipc$dispatch("e0e82d8f", new Object[0]);
        }
        return b.a();
    }

    public List<LowMemoryListener> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("fd5e7402", new Object[]{this});
        }
        return this.f25018a;
    }

    public nxl() {
        this.f25018a = new CopyOnWriteArrayList();
    }
}
