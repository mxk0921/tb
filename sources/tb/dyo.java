package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.IScrollListener;
import com.taobao.metrickit.context.MetricContext;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dyo extends ol8 implements IScrollListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Map<String, Object> g = new HashMap();

    public dyo() {
        super(new Handler(Looper.getMainLooper()));
        h();
        i();
    }

    public static /* synthetic */ Object ipc$super(dyo dyoVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/metrickit/event/frame/ScrollEventSource");
    }

    @Override // tb.ol8
    public int[] l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("f6d4687e", new Object[]{this});
        }
        return new int[]{9, 10, 11, 12};
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onDoFrame(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69ad383a", new Object[]{this, new Long(j)});
            return;
        }
        ((HashMap) this.g).clear();
        ((HashMap) this.g).put("frameTimeNanos", Long.valueOf(j));
        k(9, this.g);
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a820af52", new Object[]{this, activity, str});
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollStart(Activity activity, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b005994", new Object[]{this, activity, new Integer(i)});
        } else if (i == 1) {
            ((HashMap) this.g).clear();
            Map<String, Object> map = this.g;
            if (activity != null) {
                str = activity.getClass().getName();
            } else {
                str = null;
            }
            ((HashMap) map).put("activity", str);
            k(11, this.g);
            ((HashMap) this.g).clear();
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onStopMonitorDoFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4729dd0", new Object[]{this});
            return;
        }
        ((HashMap) this.g).clear();
        k(10, this.g);
    }

    @Override // tb.ol8
    public void q(MetricContext metricContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce7c6c76", new Object[]{this, metricContext});
        } else {
            c21.f(this);
        }
    }

    @Override // com.taobao.application.common.IScrollListener
    public void onScrollEnd(Activity activity, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fbc32d85", new Object[]{this, activity, new Integer(i), str});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activity", activity != null ? activity.getClass().getName() : null);
        hashMap.put("blockFrameMetrics", str);
        hashMap.put("scrollHitchRate", Integer.valueOf(i));
        k(12, hashMap);
    }
}
