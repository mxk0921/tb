package tb;

import android.os.Build;
import android.view.FrameMetrics;
import android.view.Window;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.monitor.impl.util.LimitedQueue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ey9 implements Window.OnFrameMetricsAvailableListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int NANOS_PER_MS = 1000000;

    /* renamed from: a  reason: collision with root package name */
    public final List<cll> f18884a;
    public volatile String c;
    public volatile boolean b = false;
    public final LimitedQueue<FrameMetrics> d = new LimitedQueue<>(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f18885a;

        public a(cll cllVar) {
            this.f18885a = cllVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ey9.a(ey9.this).add(this.f18885a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ cll f18886a;

        public b(cll cllVar) {
            this.f18886a = cllVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ey9.a(ey9.this).remove(this.f18886a);
            }
        }
    }

    public ey9(cll cllVar) {
        ArrayList arrayList = new ArrayList();
        this.f18884a = arrayList;
        arrayList.add(cllVar);
    }

    public static /* synthetic */ List a(ey9 ey9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2f8c29a3", new Object[]{ey9Var});
        }
        return ey9Var.f18884a;
    }

    public Queue<FrameMetrics> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Queue) ipChange.ipc$dispatch("7c50d18", new Object[]{this});
        }
        return new ConcurrentLinkedQueue(this.d);
    }

    public void c(cll cllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd5e10a9", new Object[]{this, cllVar});
        } else {
            w9a.g().b().post(new a(cllVar));
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee84ecb6", new Object[]{this});
            return;
        }
        this.b = false;
        this.d.clear();
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23bcbc47", new Object[]{this, str});
            return;
        }
        this.c = str;
        this.b = true;
    }

    public final String g(FrameMetrics frameMetrics, long j) {
        long metric;
        long metric2;
        long metric3;
        long metric4;
        long metric5;
        long metric6;
        long metric7;
        long metric8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("eea059a1", new Object[]{this, frameMetrics, new Long(j)});
        }
        long j2 = (long) (j * 0.3d);
        metric = frameMetrics.getMetric(0);
        if (metric > j2) {
            return "UNKNOWN_DELAY";
        }
        metric2 = frameMetrics.getMetric(1);
        if (metric2 > j2) {
            return "INPUT_HANDLING";
        }
        metric3 = frameMetrics.getMetric(2);
        if (metric3 > j2) {
            return "ANIMATION";
        }
        metric4 = frameMetrics.getMetric(3);
        if (metric4 > j2) {
            return "LAYOUT_MEASURE";
        }
        metric5 = frameMetrics.getMetric(4);
        if (metric5 > j2) {
            return "DRAW";
        }
        metric6 = frameMetrics.getMetric(5);
        if (metric6 > j2) {
            return "SYNC";
        }
        metric7 = frameMetrics.getMetric(6);
        if (metric7 > j2) {
            return "COMMAND_ISSUE";
        }
        metric8 = frameMetrics.getMetric(7);
        if (metric8 > j2) {
            return "SWAP_BUFFERS";
        }
        return null;
    }

    public void j(cll cllVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd5cd742", new Object[]{this, cllVar});
        } else {
            w9a.g().b().post(new b(cllVar));
        }
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
        long metric;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a75cee", new Object[]{this, window, frameMetrics, new Integer(i)});
            return;
        }
        FrameMetrics a2 = pea.a(frameMetrics);
        metric = a2.getMetric(8);
        long j = metric / 1000000;
        String str = null;
        int i2 = (j > 250L ? 1 : (j == 250L ? 0 : -1));
        if (i2 > 0) {
            HashMap hashMap = new HashMap();
            String h = h(a2, metric, hashMap);
            if ("DEFAULT".equals(h)) {
                str = g(a2, metric);
            }
            hashMap.put("totalDurationNs", Long.valueOf(metric));
            b21.s().i().a(hashMap);
            this.d.add(a2);
            str = h;
        } else {
            str = null;
        }
        Iterator it = ((ArrayList) this.f18884a).iterator();
        while (it.hasNext()) {
            cll cllVar = (cll) it.next();
            if (cllVar != null) {
                cllVar.F();
                cllVar.G(i);
                if (this.b) {
                    cllVar.I();
                    if (i2 > 0) {
                        cllVar.E();
                        cllVar.W(str);
                        cllVar.T(str);
                    }
                    if (j > 700) {
                        cllVar.H();
                    }
                }
            } else {
                return;
            }
        }
        if (j > 250) {
            d(a2);
        }
    }

    public static void i(StringBuilder sb, FrameMetrics frameMetrics) {
        long metric;
        long metric2;
        long metric3;
        long metric4;
        long metric5;
        long metric6;
        long metric7;
        long metric8;
        long metric9;
        long metric10;
        long metric11;
        long metric12;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261e1e5f", new Object[]{sb, frameMetrics});
            return;
        }
        sb.append("FIRST_DRAW_FRAME(绘制的该帧是否是第一帧, 0 不是, 1 是) ");
        metric = frameMetrics.getMetric(9);
        sb.append(metric);
        sb.append("\n");
        sb.append("UNKNOWN_DELAY_DURATION(UI线程响应并开始处理渲染的等待时间) ");
        metric2 = frameMetrics.getMetric(0);
        sb.append(metric2 / 1000000);
        sb.append("ms\n");
        sb.append("INPUT_HANDLING_DURATION(处理输入事件耗时) ");
        metric3 = frameMetrics.getMetric(1);
        sb.append(metric3 / 1000000);
        sb.append("ms\n");
        sb.append("ANIMATION_DURATION(动画执行回调耗时) ");
        metric4 = frameMetrics.getMetric(2);
        sb.append(metric4 / 1000000);
        sb.append("ms\n");
        sb.append("LAYOUT_MEASURE_DURATION(measure和layout耗时) ");
        metric5 = frameMetrics.getMetric(3);
        sb.append(metric5 / 1000000);
        sb.append("ms\n");
        sb.append("DRAW_DURATION(draw耗时) ");
        metric6 = frameMetrics.getMetric(4);
        sb.append(metric6 / 1000000);
        sb.append("ms\n");
        sb.append("SYNC_DURATION(render线程同步耗时) ");
        metric7 = frameMetrics.getMetric(5);
        sb.append(metric7 / 1000000);
        sb.append("ms\n");
        sb.append("COMMAND_ISSUE_DURATION(向GPU发送绘制命令耗时) ");
        metric8 = frameMetrics.getMetric(6);
        sb.append(metric8 / 1000000);
        sb.append("ms\n");
        sb.append("SWAP_BUFFERS_DURATION(交换缓冲队列耗时) ");
        metric9 = frameMetrics.getMetric(7);
        sb.append(metric9 / 1000000);
        sb.append("ms\n");
        sb.append("TOTAL_DURATION(总耗时) ");
        metric10 = frameMetrics.getMetric(8);
        sb.append(metric10 / 1000000);
        sb.append("ms\n");
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            sb.append("VSYNC_TIMESTAMP ");
            metric12 = frameMetrics.getMetric(11);
            sb.append(metric12);
            sb.append("\n");
        }
        if (i >= 26) {
            sb.append("INTENDED_VSYNC_TIMESTAMP ");
            metric11 = frameMetrics.getMetric(10);
            sb.append(metric11);
            sb.append("\n");
        }
    }

    public final void d(FrameMetrics frameMetrics) {
        long metric;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93c905d6", new Object[]{this, frameMetrics});
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FrameMetrics: isScrolling ");
        sb.append(this.b);
        sb.append("scrollType ");
        sb.append(this.c);
        sb.append("MainBlockCause：");
        metric = frameMetrics.getMetric(8);
        sb.append(h(frameMetrics, metric, null));
        zq6.a("FrameMetricsApi24", "FrameMetrics", sb);
    }

    public final String h(FrameMetrics frameMetrics, long j, Map<String, Object> map) {
        long metric;
        String str;
        long metric2;
        long metric3;
        long metric4;
        long metric5;
        long metric6;
        long metric7;
        long metric8;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cdb6c133", new Object[]{this, frameMetrics, new Long(j), map});
        }
        long j2 = j / 2;
        metric = frameMetrics.getMetric(0);
        long j3 = -1;
        if (metric > j2) {
            j3 = Math.max(-1L, metric);
            str = "UNKNOWN_DELAY";
        } else {
            str = "DEFAULT";
        }
        metric2 = frameMetrics.getMetric(1);
        if (metric2 > j2) {
            j3 = Math.max(j3, metric2);
            str = "INPUT_HANDLING";
        }
        metric3 = frameMetrics.getMetric(2);
        if (metric3 > j2) {
            j3 = Math.max(j3, metric3);
            str = "ANIMATION";
        }
        metric4 = frameMetrics.getMetric(3);
        if (metric4 > j2) {
            j3 = Math.max(j3, metric4);
            str = "LAYOUT_MEASURE";
        }
        metric5 = frameMetrics.getMetric(4);
        if (metric5 > j2) {
            j3 = Math.max(j3, metric5);
            str = "DRAW";
        }
        metric6 = frameMetrics.getMetric(5);
        if (metric6 > j2) {
            j3 = Math.max(j3, metric6);
            str = "SYNC";
        }
        metric7 = frameMetrics.getMetric(6);
        if (metric7 > j2) {
            j3 = Math.max(j3, metric7);
            str = "COMMAND_ISSUE";
        }
        metric8 = frameMetrics.getMetric(7);
        if (metric8 > j2) {
            j3 = Math.max(j3, metric8);
            str = "SWAP_BUFFERS";
        }
        if (map != null) {
            map.put("mainCause", str);
            map.put("mainCauseCostNs", Long.valueOf(j3));
        }
        return str;
    }
}
