package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.HashMap;
import tb.v82;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f29217a;
    public static int b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29218a;
        public final /* synthetic */ Runnable b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ String[] e;

        public a(String str, Runnable runnable, String str2, String str3, String[] strArr) {
            this.f29218a = str;
            this.b = runnable;
            this.c = str2;
            this.d = str3;
            this.e = strArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (u82.a() == 0) {
                u82.b(Process.myTid());
            }
            try {
                gwv.e(Thread.currentThread().getName(), this.f29218a);
                long nanoTime = System.nanoTime();
                this.b.run();
                long nanoTime2 = System.nanoTime() - nanoTime;
                if (v82.c.A()) {
                    String h = gwv.h(this.c);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("cost", (Object) Long.valueOf(nanoTime2));
                    jSONObject.put("scene", (Object) h);
                    jSONObject.put("actionType", (Object) this.f29218a);
                    AppMonitor.Counter.commit("BehaviX", "bx_native_task", jSONObject.toJSONString(), 1.0d);
                }
            } catch (Throwable th) {
                u82.i(th, this.c, this.d, this.f29218a, this.e);
            }
        }
    }

    static {
        t2o.a(404750599);
        HandlerThread handlerThread = new HandlerThread("bhx_action");
        handlerThread.start();
        f29217a = new Handler(handlerThread.getLooper());
    }

    public static /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue();
        }
        return b;
    }

    public static /* synthetic */ int b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a821938e", new Object[]{new Integer(i)})).intValue();
        }
        b = i;
        return i;
    }

    public static Handler c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[0]);
        }
        return f29217a;
    }

    public static int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eee3a153", new Object[0])).intValue();
        }
        return b;
    }

    public static void e(m02 m02Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5bc8819c", new Object[]{m02Var, new Long(j)});
        } else {
            f29217a.postDelayed(m02Var, j);
        }
    }

    public static void f(Runnable runnable, String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50ba5a5f", new Object[]{runnable, str, str2, str3, strArr});
        } else {
            f29217a.post(new a(str2, runnable, str, str3, strArr));
        }
    }

    public static void g(m02 m02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63f62eab", new Object[]{m02Var});
        } else {
            f29217a.post(m02Var);
        }
    }

    public static void h(m02 m02Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c7567ba", new Object[]{m02Var});
        } else {
            f29217a.postAtFrontOfQueue(m02Var);
        }
    }

    public static void i(Throwable th, String str, String str2, String str3, String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c24842", new Object[]{th, str, str2, str3, strArr});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("actionType", str3);
        hashMap.put("actionName", str2);
        if (strArr != null && strArr.length > 0) {
            hashMap.put("bizArgs", Arrays.toString(strArr));
        }
        q82.f("exception", str, hashMap, th);
    }

    public static void j(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46435e46", new Object[]{runnable});
        } else {
            f29217a.removeCallbacks(runnable);
        }
    }
}
