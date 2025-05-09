package tb;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Handler;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.context.MetricContext;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class f3r extends ol8 implements ComponentCallbacks2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public f3r(Handler handler) {
        super(handler);
    }

    public static /* synthetic */ Object ipc$super(f3r f3rVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/system/SystemLowMemoryEventSource");
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{13, 14};
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb2f300c", new Object[]{this, configuration});
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bbd23dd", new Object[]{this});
        } else {
            u(13, null);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c69db59a", new Object[]{this, new Integer(i)});
        } else {
            u(14, Integer.valueOf(i));
        }
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
            return;
        }
        metricContext.getApplication().registerComponentCallbacks(this);
        metricContext.getApplication();
    }

    public final void u(int i, Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a9c29c7", new Object[]{this, new Integer(i), num});
            return;
        }
        HashMap hashMap = new HashMap();
        if (num != null) {
            hashMap.put(m09.TASK_TYPE_LEVEL, num);
        }
        k(i, hashMap);
    }
}
