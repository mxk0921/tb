package tb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class x9u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMON_ASYNC_THREAD = "common_async_thread";
    public static final String MAIN_THREAD = "main_thread";
    public static final String TRACK_CENTER_DEGRADE = "trackCenterDegrade";
    public static boolean c;
    public static final HandlerThread j;
    public static final Handler k;

    /* renamed from: a  reason: collision with root package name */
    public static final String f31240a = "TrackCenter";
    public static boolean b = false;
    public static final String d = "Page_Home";
    public static final Map<String, Long> e = Collections.synchronizedMap(new LinkedHashMap());
    public static final Map<String, Long> f = Collections.synchronizedMap(new LinkedHashMap());
    public static final List<String> g = Collections.synchronizedList(new ArrayList());
    public static int h = 0;
    public static int i = 0;
    public static final Runnable l = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/home/component/moniter/TrackCenter$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            if (!x9u.a() && x9u.b() && (obj = message.obj) != null) {
                aau aauVar = (aau) obj;
                int i = aauVar.f15635a;
                if (i == 0) {
                    x9u.i(aauVar.b, aauVar.d, aauVar.e, aauVar.c);
                } else if (i == 1) {
                    x9u.j(aauVar.b, aauVar.e, aauVar.c);
                } else if (i == 2) {
                    x9u.l(x9u.k(aauVar.b));
                    x9u.m();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (x9u.a() || !x9u.b()) {
                String n = x9u.n();
                TLog.logd(n, "LooperRunnable=stopTimer+isDegrade=" + x9u.a() + "-ready=" + x9u.b());
                x9u.J();
            } else {
                x9u.p();
                if (x9u.o() > 30) {
                    x9u.l(x9u.k("too_long_time_event"));
                    x9u.q().clear();
                    x9u.d(0);
                }
                if (x9u.e().size() > 20 || x9u.f().size() > 15) {
                    x9u.l(x9u.k("too_many_event"));
                    x9u.q().clear();
                    x9u.d(0);
                }
                if (x9u.c() > 0) {
                    if (cw6.b()) {
                        String n2 = x9u.n();
                        TLog.logd(n2, "sendPerformanceAsync=" + x9u.q().toString());
                    }
                    x9u.h().postDelayed(x9u.g(), 800L);
                    return;
                }
                x9u.m();
            }
        }
    }

    static {
        t2o.a(473956361);
        HandlerThread a2 = wsa.a("TrackCenterHandlerThread");
        j = a2;
        a2.start();
        k = new a(a2.getLooper());
    }

    public static long A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("95784991", new Object[0])).longValue();
        }
        try {
            chb g2 = c21.g();
            if (g2 != null) {
                return g2.getLong("startProcessSystemClockTime", -1L);
            }
            return -1L;
        } catch (Throwable th) {
            TLog.loge(f31240a, "uniteTimeCal IAppPreferences error", th);
            return -1L;
        }
    }

    public static Map<String, Long> B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("947d0d9f", new Object[]{str});
        }
        if (str == null || !str.equals(MAIN_THREAD)) {
            return f;
        }
        return e;
    }

    public static String C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2baf34b", new Object[0]);
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return MAIN_THREAD;
        }
        return COMMON_ASYNC_THREAD;
    }

    public static String D(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db087357", new Object[]{str});
        }
        return str + "_start_time";
    }

    public static boolean E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1a0f90c", new Object[0])).booleanValue();
        }
        if (!e.isEmpty() || !f.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void F(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab810135", new Object[]{str, str2, new Long(j2)});
        } else if (!b && c) {
            t(str + "_end_time", str2, j2);
            List<String> list = g;
            if (list.contains(str)) {
                list.remove(str);
            }
            h--;
        }
    }

    public static void G(String str, boolean z, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8370f592", new Object[]{str, new Boolean(z), str2, new Long(j2)});
        } else if (!b && c) {
            if (z) {
                g.add(str);
                h++;
            }
            t(D(str), str2, j2);
        }
    }

    public static void H(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c16fa79", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3281184", new Object[0]);
        } else {
            c = true;
        }
    }

    public static void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("212d4524", new Object[0]);
        } else if (c) {
            TLog.logd(f31240a, "stopPerformanceTrack");
            k.removeCallbacksAndMessages(null);
            j.quit();
            w();
            c = false;
        }
    }

    public static void K(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80b8d4a9", new Object[]{str, str2, str3});
        } else if (!b) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", (Object) str3);
            AppMonitor.Counter.commit(str, str2, k4v.e(jSONObject), 1.0d);
            if (cw6.b()) {
                String str4 = f31240a;
                TLog.logd(str4, "fieldName=" + str2 + "-point=" + str3);
            }
        }
    }

    public static void M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7629fc07", new Object[0]);
        } else {
            K("Page_Home", "track_center_action", "main_model_spm_null_count");
        }
    }

    public static void N(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da5598a", new Object[]{str});
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        f.put(str, Long.valueOf(uptimeMillis));
        e.put(str, Long.valueOf(uptimeMillis));
    }

    public static void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2251fba7", new Object[0]);
            return;
        }
        long A = A();
        for (Map.Entry<String, Long> entry : e.entrySet()) {
            entry.setValue(Long.valueOf(entry.getValue().longValue() - A));
        }
        for (Map.Entry<String, Long> entry2 : f.entrySet()) {
            entry2.setValue(Long.valueOf(entry2.getValue().longValue() - A));
        }
    }

    public static /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd6077b", new Object[0])).booleanValue();
        }
        return b;
    }

    public static /* synthetic */ boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
        }
        return c;
    }

    public static /* synthetic */ int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("45eaf499", new Object[0])).intValue();
        }
        return h;
    }

    public static /* synthetic */ int d(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7addc44e", new Object[]{new Integer(i2)})).intValue();
        }
        h = i2;
        return i2;
    }

    public static /* synthetic */ Map e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8c41e1dc", new Object[0]);
        }
        return f;
    }

    public static /* synthetic */ Map f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("98dad75d", new Object[0]);
        }
        return e;
    }

    public static /* synthetic */ Runnable g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("f1082c8b", new Object[0]);
        }
        return l;
    }

    public static /* synthetic */ Handler h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("d5288dc", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ void i(String str, boolean z, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2509b6e9", new Object[]{str, new Boolean(z), str2, new Long(j2)});
        } else {
            G(str, z, str2, j2);
        }
    }

    public static /* synthetic */ void j(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35624736", new Object[]{str, str2, new Long(j2)});
        } else {
            F(str, str2, j2);
        }
    }

    public static /* synthetic */ String k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4654f9bb", new Object[]{str});
        }
        return D(str);
    }

    public static /* synthetic */ void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cdec6286", new Object[]{str});
        } else {
            N(str);
        }
    }

    public static /* synthetic */ void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa3b6afd", new Object[0]);
        } else {
            y();
        }
    }

    public static /* synthetic */ String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("542dd222", new Object[0]);
        }
        return f31240a;
    }

    public static /* synthetic */ int o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6407e172", new Object[0])).intValue();
        }
        return i;
    }

    public static /* synthetic */ int p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("64789d7a", new Object[0])).intValue();
        }
        int i2 = i;
        i = i2 + 1;
        return i2;
    }

    public static /* synthetic */ List q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f829d87", new Object[0]);
        }
        return g;
    }

    public static void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12da5a95", new Object[]{str});
        } else {
            s(str, C());
        }
    }

    public static void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda7e91f", new Object[]{str, str2});
        } else if (!b && c) {
            Message message = new Message();
            aau aauVar = new aau();
            aauVar.b = str;
            aauVar.f15635a = 1;
            aauVar.e = str2;
            aauVar.c = SystemClock.uptimeMillis();
            message.obj = aauVar;
            k.sendMessage(message);
        }
    }

    public static void t(String str, String str2, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42cb85fe", new Object[]{str, str2, new Long(j2)});
            return;
        }
        Map<String, Long> B = B(str2);
        if (B != null) {
            B.put(str, Long.valueOf(j2));
            if (cw6.b()) {
                String str3 = f31240a;
                TLog.logd(str3, "point=" + str + "--currentTimeMillis=" + j2 + "--currentThread=" + Thread.currentThread().getName());
                return;
            }
            return;
        }
        TLog.logd(f31240a, "no can use thread map");
    }

    public static void u(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc212ff8", new Object[]{str, new Boolean(z)});
        } else {
            v(str, z, C());
        }
    }

    public static void v(String str, boolean z, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da74bc2", new Object[]{str, new Boolean(z), str2});
        } else if (!b && c) {
            Message message = new Message();
            aau aauVar = new aau();
            aauVar.b = str;
            aauVar.f15635a = 0;
            aauVar.d = z;
            aauVar.e = str2;
            aauVar.c = SystemClock.uptimeMillis();
            message.obj = aauVar;
            k.sendMessage(message);
        }
    }

    public static void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a08ac5", new Object[0]);
            return;
        }
        e.clear();
        f.clear();
    }

    public static void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f06d2af", new Object[0]);
        } else if (!b && c && !E()) {
            aau aauVar = new aau();
            aauVar.b = "cold_start_track_direct_send_event";
            aauVar.f15635a = 2;
            aauVar.c = SystemClock.uptimeMillis();
            Message message = new Message();
            message.obj = aauVar;
            k.sendMessage(message);
        }
    }

    public static void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46a580ae", new Object[0]);
            return;
        }
        g.clear();
        h = 0;
        z();
        try {
            O();
            String str = "main_thread=" + e.toString() + ";common_async_thread=" + f.toString();
            AppMonitor.Alarm.commitSuccess(d, "track_center_performance", str);
            if (cw6.b()) {
                TLog.logd(f31240a, "sendPerformanceAsync=" + str);
            }
        } catch (Exception unused) {
            TLog.logd(f31240a, "performanceEventsMap.toString error");
        }
        J();
    }

    public static void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a9a3ec7", new Object[0]);
        } else {
            N(D("cold_start_track_end_event"));
        }
    }

    public static void L(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7cc747", new Object[]{jSONObject});
        } else if (!b) {
            if (jSONObject != null) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("clickParam");
                if (jSONObject2 == null) {
                    M();
                    return;
                }
                JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
                if (jSONObject3 == null) {
                    M();
                    return;
                }
                String string = jSONObject3.getString("spm");
                if (string == null || !string.startsWith("a2141")) {
                    M();
                } else if (string.lastIndexOf(".") <= 0) {
                    M();
                } else {
                    String substring = string.substring(0, string.lastIndexOf("."));
                    K("Page_Home", "track_center_action", "main_model_tap_" + substring);
                }
            } else {
                M();
            }
        }
    }
}
