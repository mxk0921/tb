package tb;

import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.metrickit.LowMemoryListener;
import com.taobao.tao.log.TLog;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zfl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f32726a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        public a(int i, long j, long j2) {
            this.f32726a = i;
            this.b = j;
            this.c = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            for (LowMemoryListener lowMemoryListener : nxl.b().a()) {
                try {
                    lowMemoryListener.a(this.f32726a, this.b, this.c);
                } catch (Exception e) {
                    TLog.loge("MetricKit.OuterCallbackScheduler", "listener.onLowMemory callback exception", e);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("memoryType", this.f32726a);
                jSONObject.put("currSize", this.b);
                jSONObject.put("totalSize", this.c);
                WVStandardEventCenter.postNotificationToJS("PerformanceMetric.onLowMemory", jSONObject.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void a(int i, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848459f8", new Object[]{this, new Integer(i), new Long(j), new Long(j2)});
        } else {
            mti.c().b().post(new a(i, j, j2));
        }
    }
}
