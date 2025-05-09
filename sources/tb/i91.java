package tb;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class i91 extends k04<h91> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f21165a = 0;

    public static /* synthetic */ Object ipc$super(i91 i91Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/time/AppTimeCollector");
    }

    @Override // tb.k04
    public int[] b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("b4c7c910", new Object[]{this});
        }
        return new int[]{0};
    }

    @Override // tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    @Override // tb.k04
    public void d(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa642358", new Object[]{this, new Integer(i), map});
        } else {
            this.f21165a = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: e */
    public h91 a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h91) ipChange.ipc$dispatch("26b7f00", new Object[]{this, new Integer(i), map});
        }
        long j = this.f21165a;
        if (j <= 0) {
            return new h91();
        }
        return new h91(j, SystemClock.uptimeMillis());
    }
}
