package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qm1 extends g2v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final AtomicBoolean f = new AtomicBoolean(false);
    public static int[] g = new int[0];

    static {
        t2o.a(404750649);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("357b0d0", new Object[0]);
        } else if (f.compareAndSet(false, true) && v82.c.f()) {
            g = v82.c.j();
            UTAnalytics.getInstance().registerPlugin(new qm1());
        }
    }

    public static /* synthetic */ Object ipc$super(qm1 qm1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/utcollect/BHXUTPlugin");
    }

    @Override // tb.g2v
    public int[] getAttentionEventIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("873e4cb7", new Object[]{this});
        }
        return g;
    }

    @Override // tb.g2v
    public Map<String, String> onEventDispatch(String str, int i, String str2, String str3, String str4, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("84d56f5f", new Object[]{this, str, new Integer(i), str2, str3, str4, map});
        }
        if (v82.c.f()) {
            return pm1.l().e(i, str, map);
        }
        return null;
    }
}
