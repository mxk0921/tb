package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class ae1<CollectResult> extends k04<CollectResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static /* synthetic */ Object ipc$super(ae1 ae1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/collector/AsyncCollector");
    }

    @Override // tb.k04
    @Deprecated
    public final CollectResult a(int i, Map<String, ?> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CollectResult) ipChange.ipc$dispatch("3c7192ea", new Object[]{this, new Integer(i), map});
        }
        throw new RuntimeException("AsyncCollector: Incorrect usage.");
    }

    @Override // tb.k04
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("51db1d5f", new Object[]{this});
        }
    }

    public abstract void e(int i, Map<String, ?> map, zd1<CollectResult> zd1Var);

    public abstract Handler f();
}
