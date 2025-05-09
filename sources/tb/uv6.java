package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.util.Log;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.core.os.TraceCompat;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.android.dinamicx.monitor.DXTraceUtil;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uv6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static long f29631a = 0;
    public static boolean b = false;
    public static final Map<String, Long> c = new HashMap();
    public static long d = 0;

    static {
        t2o.a(745538161);
    }

    public static /* synthetic */ long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd46c373", new Object[0])).longValue();
        }
        long j = d;
        d = 1 + j;
        return j;
    }

    public static void b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd1b3c92", new Object[]{str, new Integer(i)});
        } else if (b) {
            String str2 = "[mtb]" + str;
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.beginAsyncSection(str2, i);
            }
        }
    }

    public static void c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("308bb260", new Object[]{str, new Integer(i)});
        } else if (b) {
            String str2 = "[mtb]" + str;
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection(str2, i);
            }
        }
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else if (b) {
            TraceCompat.beginSection("[mtb]" + str);
            ((HashMap) c).put(str, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void e(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f8805a2", new Object[]{activity});
        } else if (activity != null && b && Build.VERSION.SDK_INT >= 24) {
            activity.getWindow().addOnFrameMetricsAvailableListener(new a(), new Handler());
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (b) {
            TraceCompat.endSection();
        }
    }

    public static void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("975c089b", new Object[]{str});
        } else if (b) {
            f();
            Long l = (Long) ((HashMap) c).get(str);
            long longValue = l == null ? 0L : l.longValue();
            TLog.loge("mtbDebug", str + " cost:" + (System.currentTimeMillis() - longValue));
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
            return;
        }
        boolean isFeatureOpened = ABGlobal.isFeatureOpened(Globals.getApplication(), "mtbDebugTrace3");
        b = isFeatureOpened;
        if (isFeatureOpened) {
            DXTraceUtil.j(true);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1175515f", new Object[]{str, str2});
        } else if (b) {
            Log.e(str, str2);
            TLog.loge(str, str2);
        }
    }

    public static void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50078c7d", new Object[]{str});
        } else {
            Log.e("newMtbDebugLog", str);
        }
    }

    public static void k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2845b1e5", new Object[]{str});
        } else if (b) {
            Log.e("mtbDebug", str + " cost:" + System.currentTimeMillis());
            TLog.loge("mtbDebug", str + " cost:" + System.currentTimeMillis());
        }
    }

    public static void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4de7832b", new Object[]{str});
        } else if (b) {
            if (f29631a == 0) {
                f29631a = System.nanoTime();
            }
            Log.e("mtbDebug", "MyTaobaoFragment->>>>>>>>>>>>" + str + " cost" + (((float) (System.nanoTime() - f29631a)) / 1000000.0f) + "ms");
            TLog.loge("mtbDebug", "MyTaobaoFragment->>>>>>>>>>>>" + str + " cost" + (((float) (System.nanoTime() - f29631a)) / 1000000.0f) + "ms");
            f29631a = System.nanoTime();
        }
    }

    public static void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[0]);
        } else if (b) {
            f29631a = System.nanoTime();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Window.OnFrameMetricsAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            long metric;
            long metric2;
            long metric3;
            long metric4;
            long metric5;
            long metric6;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6a75cee", new Object[]{this, window, frameMetrics, new Integer(i)});
            } else if (uv6.a() <= 10) {
                StringBuilder sb = new StringBuilder("measure + layout=");
                metric = frameMetrics.getMetric(3);
                sb.append(metric / 1000000);
                sb.append(",     delay=");
                metric2 = frameMetrics.getMetric(0);
                sb.append(metric2 / 1000000);
                sb.append(",     anim=");
                metric3 = frameMetrics.getMetric(2);
                sb.append(metric3 / 1000000);
                sb.append(",     touch=");
                metric4 = frameMetrics.getMetric(1);
                sb.append(metric4 / 1000000);
                sb.append(",     draw=");
                metric5 = frameMetrics.getMetric(4);
                sb.append(metric5 / 1000000);
                sb.append(",     total=");
                metric6 = frameMetrics.getMetric(8);
                sb.append(metric6 / 1000000);
                uv6.i("mtbDebug", sb.toString());
            }
        }
    }
}
