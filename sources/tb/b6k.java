package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class b6k implements eq7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int[] f16208a = {17};
    public final Map<Integer, zp7> b = new HashMap();

    static {
        t2o.a(620757046);
        t2o.a(620757040);
    }

    public final synchronized zp7 a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zp7) ipChange.ipc$dispatch("69e127e4", new Object[]{this, new Integer(i)});
        }
        zp7 zp7Var = (zp7) ((HashMap) this.b).get(Integer.valueOf(i));
        if (zp7Var == null) {
            zp7Var = new a6k(i);
            ((HashMap) this.b).put(Integer.valueOf(i), zp7Var);
        }
        return zp7Var;
    }

    @Override // tb.eq7
    public synchronized zp7 get(int i) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (zp7) ipChange.ipc$dispatch("67da0773", new Object[]{this, new Integer(i)});
            }
            for (int i2 : this.f16208a) {
                if (i2 == i) {
                    return a(i);
                }
            }
            return null;
        }
    }

    @Override // tb.eq7
    public synchronized Collection<zp7> getAll() {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Collection) ipChange.ipc$dispatch("d4057695", new Object[]{this});
            }
            for (int i : this.f16208a) {
                a(i);
            }
            return ((HashMap) this.b).values();
        }
    }
}
