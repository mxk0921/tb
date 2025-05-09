package tb;

import androidx.collection.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.combo.dataobject.ComboResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class n24 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static n24 b = null;

    /* renamed from: a  reason: collision with root package name */
    public final LruCache<Long, ComboResponse> f24461a = new LruCache<>(10);

    static {
        t2o.a(764412039);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f4ee50", new Object[0]);
        } else {
            b = null;
        }
    }

    public static n24 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n24) ipChange.ipc$dispatch("3349008e", new Object[0]);
        }
        if (b == null) {
            b = new n24();
        }
        return b;
    }

    public ComboResponse b(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ComboResponse) ipChange.ipc$dispatch("fddd6683", new Object[]{this, l});
        }
        if (l.longValue() < 0) {
            return null;
        }
        return this.f24461a.get(l);
    }

    public void d(Long l, ComboResponse comboResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db95e0f", new Object[]{this, l, comboResponse});
            return;
        }
        synchronized (this.f24461a) {
            try {
                if (l.longValue() >= 0 && comboResponse != null) {
                    this.f24461a.put(l, comboResponse);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
