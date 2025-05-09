package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class lgg extends ol8 implements v11 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public lgg(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(lgg lggVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/lifecycle/LaunchInteractiveEventSource");
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{17};
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        } else {
            c21.d(this);
        }
    }

    @Override // com.taobao.application.common.IAppLaunchListener
    public void d(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60cba989", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (i == 0 && i2 == 2) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", 2);
            k(17, hashMap);
        }
    }
}
