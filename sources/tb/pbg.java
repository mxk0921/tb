package tb;

import android.os.SystemClock;
import android.os.Trace;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Stack;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class pbg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "LCTrace";

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Stack<a>> f25997a = new ThreadLocal<>();
    public static final boolean b = tv6.a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f25998a;
        public final long b;
        public final long c;

        static {
            t2o.a(511705617);
        }

        public a(String str, long j, long j2) {
            this.f25998a = str;
            this.b = j;
            this.c = j2;
        }
    }

    static {
        t2o.a(511705616);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5235938d", new Object[]{str});
        } else {
            b(str, Long.MAX_VALUE);
        }
    }

    public static void b(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f47d54d7", new Object[]{str, new Long(j)});
        } else if (b) {
            Trace.beginSection(str);
            ThreadLocal<Stack<a>> threadLocal = f25997a;
            Stack<a> stack = threadLocal.get();
            if (stack == null) {
                stack = new Stack<>();
                threadLocal.set(stack);
            }
            stack.push(new a(str, SystemClock.elapsedRealtime(), j));
        }
    }

    public static void c() {
        a pop;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (b) {
            Trace.endSection();
            Stack<a> stack = f25997a.get();
            if (stack != null && (pop = stack.pop()) != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - pop.b;
                boolean a2 = trt.a();
                if (elapsedRealtime <= pop.c) {
                    odg.d(TAG, pop.f25998a + "[mainThread:" + a2 + "] cost " + elapsedRealtime + "ms");
                    return;
                }
                odg.c(TAG, pop.f25998a + "[mainThread:" + a2 + "] cost " + elapsedRealtime + "ms, please optimize. limit=" + pop.c);
            }
        }
    }
}
