package tb;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class az9 implements Choreographer.FrameCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static az9 c;
    public static Double e;
    public static Double f;
    public static double g;
    public static float h;
    public static Boolean i;
    public static boolean j;
    public static boolean l;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f16086a = new Handler(Looper.getMainLooper());
    public long b;
    public static boolean d = false;
    public static int k = 3;
    public static final List<se2> m = new ArrayList();
    public static final Queue<rx9> n = new LinkedList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f16087a;

        public a(long j) {
            this.f16087a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            long doubleValue = (long) (az9.a().doubleValue() - ((System.nanoTime() / 1000000) - this.f16087a));
            if (az9.b(az9.this, doubleValue)) {
                doubleValue = 0;
            }
            az9.c(az9.this, doubleValue);
        }
    }

    static {
        t2o.a(468714610);
    }

    public static /* synthetic */ Double a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Double) ipChange.ipc$dispatch("4e444649", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ boolean b(az9 az9Var, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb71d68", new Object[]{az9Var, new Long(j2)})).booleanValue();
        }
        return az9Var.r(j2);
    }

    public static /* synthetic */ void c(az9 az9Var, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9aa8343", new Object[]{az9Var, new Long(j2)});
        } else {
            az9Var.w(j2);
        }
    }

    public static void d(rx9 rx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36249c2f", new Object[]{rx9Var});
        } else if (rx9Var != null) {
            if (!d || !lwl.b()) {
                ir9.b("FrameTaskScheduler", "doRun " + rx9Var.g);
                rx9Var.f27663a.run();
                return;
            }
            ir9.b("FrameTaskScheduler", "doAdd " + rx9Var.g);
            ((LinkedList) n).add(rx9Var);
        }
    }

    public static boolean e(long j2, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a6d1651", new Object[]{new Long(j2), new Boolean(z), new Integer(i2)})).booleanValue();
        }
        if (n.isEmpty() || ((j2 <= 0 || i2 >= k) && !z)) {
            return false;
        }
        return true;
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        int i2 = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cccab0", new Object[0]);
        } else if (lwl.b()) {
            ir9.b("FrameTaskScheduler", "flushTask " + ((LinkedList) n).size());
            while (true) {
                Queue<rx9> queue = n;
                if (((LinkedList) queue).peek() != null) {
                    rx9 rx9Var = (rx9) ((LinkedList) queue).poll();
                    rx9Var.b();
                    i2++;
                    k(rx9Var, "flush", i2, 0L);
                } else {
                    return;
                }
            }
        }
    }

    public static float j(Activity activity) {
        WindowManager windowManager;
        Display defaultDisplay;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5566b7de", new Object[]{activity})).floatValue();
        }
        if (activity == null || (windowManager = activity.getWindowManager()) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 60.0f;
        }
        return defaultDisplay.getRefreshRate();
    }

    public static void k(rx9 rx9Var, String str, int i2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9285ceb5", new Object[]{rx9Var, str, new Integer(i2), new Long(j2)});
        } else if (j && rx9Var != null) {
            ir9.b("FrameTaskScheduler", "handleTaskMetric: " + rx9Var.g + "/" + str + "/count:" + i2 + "/remain:" + j2);
            rx9Var.a("runType", str);
            rx9Var.a(HiAnalyticsConstant.HaKey.BI_KEY_WAITTIME, String.valueOf(rx9Var.e));
            rx9Var.a("spendTime", String.valueOf(rx9Var.d));
            yyr.b("PerfSmooth/FrameTaskScheduler/handleTaskMetric", String.valueOf(rx9Var.g), String.valueOf(rx9Var.d), rx9Var.h);
        }
    }

    public static void l(Activity activity) {
        float j2;
        float f2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1470fda9", new Object[]{activity});
            return;
        }
        if (i == null) {
            c = new az9();
            Choreographer.getInstance().postFrameCallback(c);
            i = Boolean.TRUE;
        }
        h = j(activity);
        double d2 = (1000.0f / j2) * 1.0d;
        e = Double.valueOf(d2);
        f = Double.valueOf(d2 * 2.0d);
        g = e.doubleValue() * 0.5d;
        if (h < 110.0f) {
            f2 = 1.0f;
        } else {
            k = 2;
            f2 = 0.5f;
        }
        rx9.i *= f2;
        rx9.j *= f2;
        rx9.k *= f2;
        j = lwl.a();
        ir9.b("PerfSmooth", "frameStandCost " + e);
    }

    public static boolean m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6bd0b61e", new Object[0])).booleanValue();
        }
        return l;
    }

    public static int n(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e6ec430", new Object[]{new Integer(i2)})).intValue();
        }
        if (pr9.d() >= 80) {
            return i2 / 2;
        }
        return i2;
    }

    public static void o(Runnable runnable, int i2, long j2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("937a4150", new Object[]{runnable, new Integer(i2), new Long(j2), str});
        } else if (runnable != null) {
            if (lwl.b()) {
                d(new rx9(runnable, i2, j2, str));
            } else {
                runnable.run();
            }
        }
    }

    public static void p(Runnable runnable, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa1a68af", new Object[]{runnable, str});
        } else if (runnable != null) {
            if (lwl.b()) {
                d(new rx9(runnable, str));
            } else {
                runnable.run();
            }
        }
    }

    public static void q(se2 se2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f00bfe", new Object[]{se2Var});
        } else if (se2Var.f27988a > 5) {
            ((ArrayList) m).add(se2Var);
        }
    }

    public static void t(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fab9b9c2", new Object[]{new Boolean(z)});
        } else {
            l = z;
        }
    }

    public static void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd363d1d", new Object[0]);
        } else if (lwl.b()) {
            ir9.b("FrameTaskScheduler", "startSchduler");
            d = true;
        }
    }

    public static void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c592a8bd", new Object[0]);
            return;
        }
        d = false;
        h();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j2)});
            return;
        }
        long j3 = j2 / 1000000;
        g(j3);
        if (((LinkedList) n).peek() != null) {
            s(j3);
        }
        if (lwl.b()) {
            try {
                Choreographer.getInstance().postFrameCallback(this);
            } catch (Exception e2) {
                ir9.c("FrameTaskScheduler", "doFrame exception", e2);
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    }

    public final boolean f(rx9 rx9Var) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("67de39b1", new Object[]{this, rx9Var})).booleanValue();
        }
        if (rx9Var == null) {
            return false;
        }
        long nanoTime = (System.nanoTime() - rx9Var.b) / 1000000;
        if (nanoTime <= 0) {
            z = false;
        }
        if (z) {
            ir9.b("FrameTaskScheduler", "checkDeadline/true/gap:" + nanoTime);
            yyr.b("PerfSmooth/FrameTaskScheduler/checkDeadline", String.valueOf(rx9Var.g), String.valueOf(nanoTime), null);
        }
        return z;
    }

    public final float i(rx9 rx9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2d8986d6", new Object[]{this, rx9Var})).floatValue();
        }
        if (rx9Var == null) {
            return 0.0f;
        }
        int i2 = rx9Var.f;
        if (i2 == 3002) {
            return rx9.j;
        }
        if (i2 != 3003) {
            return rx9.i;
        }
        return rx9.k;
    }

    public final boolean r(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("76c40893", new Object[]{this, new Long(j2)})).booleanValue();
        }
        if (j2 < g) {
            return true;
        }
        return false;
    }

    public final void s(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a48926f7", new Object[]{this, new Long(j2)});
        } else {
            this.f16086a.postDelayed(new a(j2), 0L);
        }
    }

    public final void w(long j2) {
        String str;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a39053cb", new Object[]{this, new Long(j2)});
            return;
        }
        rx9 rx9Var = (rx9) ((LinkedList) n).peek();
        if (rx9Var != null) {
            boolean f2 = f(rx9Var);
            do {
                LinkedList linkedList = (LinkedList) n;
                rx9 rx9Var2 = (rx9) linkedList.peek();
                j2 = (long) Math.floor(((float) j2) - i(rx9Var2));
                if (!((j2 <= 0 && !f2) || (rx9Var2 = (rx9) linkedList.poll()) == null || rx9Var2.f27663a == null)) {
                    rx9Var2.b();
                    i2++;
                    if (f2) {
                        str = "deadline";
                    } else {
                        str = "default";
                    }
                    k(rx9Var2, str, i2, j2);
                }
                if (rx9Var2 != null && rx9Var2.f == 3003) {
                    j2 = 0;
                }
                f2 = f((rx9) linkedList.peek());
            } while (e(j2, f2, i2));
        }
    }

    public final void g(long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bc5d539", new Object[]{this, new Long(j2)});
        } else if (j) {
            long doubleValue = (long) ((j2 - this.b) - e.doubleValue());
            if (this.b > 0 && doubleValue > f.doubleValue()) {
                List<se2> list = m;
                if (!((ArrayList) list).isEmpty()) {
                    String jSONString = JSON.toJSONString(list);
                    HashMap hashMap = new HashMap();
                    hashMap.put("hitchBizRecord", jSONString);
                    hashMap.put("fastScroll", String.valueOf(m()));
                    hashMap.put("busy_count", String.valueOf(0));
                    hashMap.put("canSchedule", String.valueOf(d));
                    if (d) {
                        ir9.b("xiewei", "hitch: " + doubleValue + ", record:" + jSONString);
                    }
                    yyr.b("PerfSmooth/FrameTaskScheduler/hitchreport", String.valueOf(doubleValue), String.valueOf(pr9.d()), hashMap);
                }
            }
            ((ArrayList) m).clear();
            this.b = j2;
        }
    }
}
