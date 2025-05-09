package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class dxl {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, Long> f18135a = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5331c237", new Object[]{this, new Integer(i)});
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = this.f18135a;
        concurrentHashMap.put("callback_" + i, Long.valueOf(System.currentTimeMillis()));
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else {
            this.f18135a.put(xpc.RECORD_EXECUTE, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final ConcurrentHashMap<String, Long> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("229ad13b", new Object[]{this});
        }
        return this.f18135a;
    }

    public final void d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3fc9841", new Object[]{this, new Integer(i)});
            return;
        }
        ConcurrentHashMap<String, Long> concurrentHashMap = this.f18135a;
        concurrentHashMap.put("mtopReceive_" + i, Long.valueOf(System.currentTimeMillis()));
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62fb9f7", new Object[]{this});
        } else {
            this.f18135a.put("mtopSend", Long.valueOf(System.currentTimeMillis()));
        }
    }
}
