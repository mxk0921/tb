package tb;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p6j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MTOP_STAGE_ASSEMBLEPARAMS = "assembleParams";
    public static final String MTOP_STAGE_ASSEMBLEPARAMS_STARTTIME = "assembleParamsStartTime";
    public static final String MTOP_STAGE_DATAPARSE = "dataParse";
    public static final String MTOP_STAGE_NETWORKREQUEST = "networkRequest";

    /* renamed from: a  reason: collision with root package name */
    public static d f25906a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f25907a;

        public a(Map map) {
            this.f25907a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap<String, String> c = m7p.c();
            if (c != null && !c.isEmpty()) {
                this.f25907a.putAll(c);
            }
            mza.d().b("homeMtop", "home_mtop_cos_time", "1.0", "Page_Home_Mtop", "", this.f25907a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f25908a;

        public b(Map map) {
            this.f25908a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            HashMap<String, String> c = m7p.c();
            if (c != null && !c.isEmpty()) {
                this.f25908a.putAll(c);
            }
            mza.d().b("uiRefresh", "home_mtop_cos_time", "1.0", "Page_Home_Mtop", "", this.f25908a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25909a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ HashMap d;

        public c(String str, String str2, String str3, HashMap hashMap) {
            this.f25909a = str;
            this.b = str2;
            this.c = str3;
            this.d = hashMap;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                p6j.a(this.f25909a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f25910a;
        public long b;
        public final HashMap<String, String> c = new HashMap<>();

        static {
            t2o.a(729809806);
        }

        public d() {
            new HashMap();
        }
    }

    static {
        t2o.a(729809802);
    }

    public static void a(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38ab8a4b", new Object[]{str, str2, str3, hashMap});
            return;
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put(v4s.PARAM_UPLOAD_STAGE, str);
        hashMap2.put("duration", str3);
        hashMap2.put(m09.TASK_TYPE_LEVEL, m0b.d());
        if (!TextUtils.isEmpty(str2)) {
            hashMap2.put("eventType", str2.toLowerCase());
        }
        if (hashMap != null && hashMap.size() > 0) {
            hashMap2.putAll(hashMap);
        }
        mza.d().b("homeMtop", "home_mtop_cos_time", "1.0", "Page_Home", "", hashMap2);
    }

    public static synchronized void b(String str, String str2, long j, long j2, HashMap<String, String> hashMap, boolean z) {
        long startUptimeMillis;
        synchronized (p6j.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ec52b017", new Object[]{str, str2, new Long(j), new Long(j2), hashMap, new Boolean(z)});
            } else if (!TextUtils.isEmpty(str)) {
                if (TextUtils.equals(str2, MTOP_STAGE_ASSEMBLEPARAMS)) {
                    d dVar = new d();
                    f25906a = dVar;
                    dVar.f25910a = str;
                    dVar.b = j;
                }
                d dVar2 = f25906a;
                if (dVar2 != null) {
                    if (!TextUtils.equals(str, dVar2.f25910a)) {
                        f25906a = null;
                        return;
                    }
                    if (TextUtils.equals(str, "coldStart")) {
                        vxm.b.e().a(str2, Long.valueOf(SystemClock.uptimeMillis()));
                    }
                    f25906a.c.put(str2, String.valueOf(j2));
                    if (hashMap != null && !hashMap.isEmpty()) {
                        f25906a.c.putAll(hashMap);
                    }
                    if (z && j > 0) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("requestType", f25906a.f25910a);
                        hashMap2.put("totalTime", String.valueOf(j - f25906a.b));
                        if (TextUtils.equals(f25906a.f25910a, "coldStart") && Build.VERSION.SDK_INT >= 24) {
                            startUptimeMillis = Process.getStartUptimeMillis();
                            hashMap2.put("startTotalTime", String.valueOf(j - startUptimeMillis));
                        }
                        hashMap2.put(m09.TASK_TYPE_LEVEL, m0b.d());
                        HashMap<String, String> hashMap3 = f25906a.c;
                        if (hashMap3 != null && hashMap3.size() > 0) {
                            hashMap2.putAll(f25906a.c);
                        }
                        f25906a = null;
                        m5a.a().k(new a(hashMap2));
                    }
                }
            }
        }
    }

    public static void c(String str, String str2, String str3, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a750a1d", new Object[]{str, str2, str3, hashMap});
        } else {
            m5a.a().k(new c(str, str2, str3, hashMap));
        }
    }

    public static void d(String str, long j, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("446e8ebe", new Object[]{str, new Long(j), str2, str3});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("requestType", str);
        hashMap.put("duration", String.valueOf(j));
        hashMap.put(m09.TASK_TYPE_LEVEL, m0b.d());
        hashMap.put("containerId", str2);
        hashMap.put("dataSourceType", str3);
        m5a.a().k(new b(hashMap));
    }
}
