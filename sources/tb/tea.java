package tb;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.FrameMetrics;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class tea {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final boolean ENABLED = ijr.l();
    public Window.OnFrameMetricsAvailableListener f;

    /* renamed from: a  reason: collision with root package name */
    public long f28658a = 0;
    public long b = 0;
    public long c = 0;
    public int d = 0;
    public long e = 0;
    public boolean g = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Window.OnFrameMetricsAvailableListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f28659a;

        public a(long j) {
            this.f28659a = j;
        }

        @Override // android.view.Window.OnFrameMetricsAvailableListener
        public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
            long metric;
            long metric2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e6a75cee", new Object[]{this, window, frameMetrics, new Integer(i)});
            } else if (tea.a(tea.this)) {
                FrameMetrics a2 = pea.a(frameMetrics);
                metric = a2.getMetric(11);
                metric2 = a2.getMetric(10);
                long j = metric - metric2;
                long j2 = this.f28659a;
                long j3 = j / j2;
                tea.this.e += Math.max(j, j2);
                tea teaVar = tea.this;
                teaVar.c += j3;
                teaVar.d++;
                if (j3 >= 5) {
                    teaVar.f28658a++;
                }
                if (j3 >= 3) {
                    teaVar.b++;
                }
                if (wda.N()) {
                    TimeUnit.MILLISECONDS.toNanos(1L);
                    a2.getMetric(8);
                    a2.getMetric(1);
                    a2.getMetric(2);
                    a2.getMetric(3);
                    a2.getMetric(4);
                }
            }
        }
    }

    static {
        t2o.a(295699038);
    }

    public static /* synthetic */ boolean a(tea teaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3acef0", new Object[]{teaVar})).booleanValue();
        }
        return teaVar.g;
    }

    public void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5af96a77", new Object[]{this, activity});
        } else if (ENABLED && Build.VERSION.SDK_INT >= 26) {
            this.f = new a(TimeUnit.SECONDS.toNanos(1L) / ((int) activity.getWindowManager().getDefaultDisplay().getRefreshRate()));
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f, new Handler());
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        this.e = 0L;
        this.c = 0L;
        this.f28658a = 0L;
        this.b = 0L;
        this.d = 0;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ceb73299", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    public void e(Activity activity, xea xeaVar, int i) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cbc8b61", new Object[]{this, activity, xeaVar, new Integer(i)});
        } else if (ENABLED && Build.VERSION.SDK_INT >= 26) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.f);
                this.f = null;
                float nanos = ((float) this.e) / ((float) TimeUnit.SECONDS.toNanos(1L));
                b2e o = kkr.i().o();
                if (o != null && nanos > 0.0f && !iw0.j(activity)) {
                    HashMap<String, String> hashMap = new HashMap<>();
                    hashMap.put("jank_frames_5", String.valueOf(this.f28658a));
                    hashMap.put("jank_frames_3", String.valueOf(this.b));
                    hashMap.put("skipped_frames", String.valueOf(this.c));
                    hashMap.put("frame_sum", String.valueOf(this.d));
                    hashMap.put("duration", String.valueOf(nanos));
                    hashMap.put("skipped_frames_per_second", String.valueOf(((float) this.c) / nanos));
                    hashMap.put("deviceLevel", "" + xj7.a());
                    hashMap.put("gl_opt", "" + wda.E());
                    hashMap.put("gl_lv", "" + wda.e());
                    if (wda.d()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    hashMap.put("cdnCache", str);
                    hashMap.put("scrollStopTimes", "" + i);
                    hashMap.put("trackV", "4");
                    o.c("tblive_gl_trace", hashMap);
                    hha.b("FrameTracer", "unregisterFrameListener | jankFramesSum_5=" + this.f28658a + " jankFramesSum_3=" + this.b + " skipped_frames=" + this.c + " frame_sum=" + this.d + " duration=" + nanos + " skipped_frames_per_second=" + (((float) this.c) / nanos));
                    c();
                }
            } catch (IllegalArgumentException e) {
                Log.e("FrameTracer", e.toString());
            }
        }
    }
}
