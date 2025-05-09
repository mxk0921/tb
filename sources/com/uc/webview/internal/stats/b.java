package com.uc.webview.internal.stats;

import android.text.TextUtils;
import android.webkit.ValueCallback;
import com.uc.webview.base.EnvInfo;
import com.uc.webview.base.GlobalSettings;
import com.uc.webview.base.Log;
import com.uc.webview.base.io.PathUtils;
import com.uc.webview.base.task.c;
import com.uc.webview.base.timing.StartupTimingKeys;
import com.uc.webview.base.timing.a;
import com.uc.webview.export.extension.UCExtension;
import com.uc.webview.stat.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import tb.c0c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f14505a = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a(C0846b bVar);
    }

    /* compiled from: Taobao */
    /* renamed from: com.uc.webview.internal.stats.b$b  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class C0846b {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, String> f14508a;
        private final Map<Integer, String> b;
        private final Map<Integer, Long> c;
        private final Map<Integer, Long> d;
        private c e;

        public C0846b() {
            this(null);
        }

        public final String a(int i) {
            return this.b.get(Integer.valueOf(i));
        }

        public final long b(int i) {
            if (this.c.containsKey(Integer.valueOf(i))) {
                return this.c.get(Integer.valueOf(i)).longValue();
            }
            return 0L;
        }

        public final long c(int i) {
            if (this.d.containsKey(Integer.valueOf(i))) {
                return this.d.get(Integer.valueOf(i)).longValue();
            }
            return 0L;
        }

        public C0846b(String str) {
            this.f14508a = new HashMap();
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
            this.e = null;
            if (!TextUtils.isEmpty(str)) {
                try {
                    for (String str2 : str.split("\\`")) {
                        String[] split = str2.trim().split(c0c.UNESCAPED_SEPARATOR);
                        if (split != null && split.length == 2) {
                            this.f14508a.put(split[0], split[1]);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public final void a(String str, long j) {
            this.f14508a.put(str, String.valueOf(j));
        }

        public final String b() {
            Map<String, String> map;
            try {
                JSONObject jSONObject = new JSONObject();
                c a2 = a();
                if (a2 != null) {
                    map = a2.a();
                } else {
                    map = null;
                }
                a(jSONObject, map);
                a(jSONObject, this.f14508a);
                return jSONObject.toString();
            } catch (Throwable th) {
                Log.w("u4perf", "toJson failed", th);
                return null;
            }
        }

        public final String toString() {
            Map<String, String> map;
            try {
                StringBuilder sb = new StringBuilder();
                c a2 = a();
                if (a2 != null) {
                    map = a2.a();
                } else {
                    map = null;
                }
                a(sb, map);
                a(sb, this.f14508a);
                return sb.toString();
            } catch (Throwable th) {
                Log.w("u4perf", "toString failed", th);
                return null;
            }
        }

        public final void a(int i, long j, boolean z) {
            if (j > 0) {
                (z ? this.d : this.c).put(Integer.valueOf(i), Long.valueOf(j));
            }
        }

        public final void a(int i, String str) {
            if (!TextUtils.isEmpty(str)) {
                this.b.put(Integer.valueOf(i), str);
            }
        }

        public final synchronized c a() {
            try {
                if (this.e == null && !this.b.isEmpty() && !this.c.isEmpty() && !this.d.isEmpty()) {
                    this.e = new c(this);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.e;
        }

        private static void a(Object obj, Map<String, String> map) {
            if (!(map == null || map.isEmpty())) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (obj instanceof JSONObject) {
                        try {
                            ((JSONObject) obj).put(key, value);
                        } catch (Throwable unused) {
                        }
                    } else if (obj instanceof StringBuilder) {
                        StringBuilder sb = (StringBuilder) obj;
                        sb.append(";");
                        sb.append(key);
                        sb.append(":");
                        sb.append(value);
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c extends a.bb {
        private Map<String, String> ah;

        public c(C0846b bVar) {
            int i;
            File e;
            try {
                String stringValue = GlobalSettings.getStringValue(220);
                if (!TextUtils.isEmpty(stringValue)) {
                    long longValue = Long.valueOf(stringValue).longValue();
                    a.c cVar = (a.c) com.uc.webview.base.timing.a.a((int) StartupTimingKeys.START);
                    if (cVar != null) {
                        long j = cVar.f14296a.f14297a - longValue;
                        if (j > 0) {
                            this.t = j;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            this.b = bVar.a(StartupTimingKeys.IS_REUSED);
            this.c = bVar.a(StartupTimingKeys.IS_FIRST_USED);
            this.d = bVar.a(StartupTimingKeys.NEED_VERIFY);
            this.e = bVar.a(StartupTimingKeys.INTEGRATION_TYPE);
            this.f = bVar.a(StartupTimingKeys.CAPABILITY_TYPE);
            this.g = bVar.a(StartupTimingKeys.DECIDE_RCI_REASON);
            this.s = bVar.a(StartupTimingKeys.INVALID_LRCI_REASON);
            this.h = bVar.a(StartupTimingKeys.INIT_FAILED_CODE);
            this.i = bVar.a(StartupTimingKeys.INIT_FAILED_MESSAGE);
            this.j = bVar.a(StartupTimingKeys.RE_EXTRACT_COUNT);
            this.k = bVar.a(StartupTimingKeys.UPDATE_FAILED_CODE);
            this.l = bVar.a(StartupTimingKeys.EXTRACTOR_7Z_FAILED_CODE);
            this.m = bVar.a(StartupTimingKeys.DETECT_LIBS_MAYBE_DAMAGED);
            this.n = bVar.a(StartupTimingKeys.USE_PRELOAD_CORE_DEX);
            this.o = bVar.a(StartupTimingKeys.USE_PRELOAD_CORE_SO);
            this.p = bVar.a(StartupTimingKeys.PRELOAD_CORE_DEX_LEAD_TIME);
            this.u = bVar.b(StartupTimingKeys.INITIALIZER);
            this.v = bVar.c(StartupTimingKeys.INITIALIZER);
            this.w = bVar.b(StartupTimingKeys.CREATE_RUNNING_CORE_INFO);
            this.x = bVar.c(StartupTimingKeys.CREATE_RUNNING_CORE_INFO);
            this.y = bVar.b(StartupTimingKeys.UPDATE_START);
            this.z = bVar.b(StartupTimingKeys.UPDATE_HEAD_VALIDITY);
            this.A = bVar.b(StartupTimingKeys.UPDATE_EXISTS);
            this.B = bVar.b(StartupTimingKeys.UPDATE_SUCCESS);
            this.C = bVar.b(StartupTimingKeys.EXTRACTOR_START);
            this.D = bVar.b(StartupTimingKeys.EXTRACTOR_EXISTS);
            this.E = bVar.b(StartupTimingKeys.EXTRACTOR_SUCCESS);
            this.F = bVar.b(StartupTimingKeys.CONTINUE_INIT_LIBS);
            this.G = bVar.b(StartupTimingKeys.LOAD_DEX);
            this.H = bVar.c(StartupTimingKeys.LOAD_DEX);
            this.I = bVar.b(StartupTimingKeys.LOAD_SO);
            this.J = bVar.c(StartupTimingKeys.LOAD_SO);
            this.K = bVar.b(StartupTimingKeys.INIT_FINISHED);
            this.L = bVar.b(StartupTimingKeys.INIT_CORE_FACTORY);
            this.M = bVar.c(StartupTimingKeys.INIT_CORE_FACTORY);
            this.N = bVar.b(StartupTimingKeys.INIT_CORE_ENGINE);
            this.O = bVar.c(StartupTimingKeys.INIT_CORE_ENGINE);
            this.P = bVar.b(StartupTimingKeys.INIT_NATIVE_LIBRARIES);
            this.Q = bVar.c(StartupTimingKeys.INIT_NATIVE_LIBRARIES);
            this.R = bVar.b(StartupTimingKeys.PRE_START_CORE_ENGINE);
            this.S = bVar.c(StartupTimingKeys.PRE_START_CORE_ENGINE);
            this.T = bVar.b(StartupTimingKeys.FIRST_EXPORT_WEBVIEW);
            this.U = bVar.c(StartupTimingKeys.FIRST_EXPORT_WEBVIEW);
            this.V = bVar.b(StartupTimingKeys.FIRST_EXPORT_WEBVIEW_WAIT);
            this.W = bVar.c(StartupTimingKeys.FIRST_EXPORT_WEBVIEW_WAIT);
            this.X = bVar.b(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.Y = bVar.c(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.Z = bVar.b(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.aa = bVar.c(StartupTimingKeys.FIRST_AOSP_WEBVIEW);
            this.ab = bVar.b(StartupTimingKeys.POST_INITIALIZER);
            this.ac = bVar.c(StartupTimingKeys.POST_INITIALIZER);
            this.ad = bVar.b(StartupTimingKeys.POST_CONTINUE_INIT_LIBS);
            this.ae = bVar.c(StartupTimingKeys.POST_CONTINUE_INIT_LIBS);
            this.af = bVar.b(StartupTimingKeys.POST_UPDATE_START);
            this.ag = bVar.b(StartupTimingKeys.POST_UPDATE_SUCCESS);
            int i2 = -1;
            try {
                e = PathUtils.e(EnvInfo.getContext());
            } catch (Throwable unused2) {
            }
            if (e != null) {
                i = 0;
                try {
                    i2 = (((int) com.uc.webview.base.io.d.c(e)) / 1024) / 1024;
                    File[] listFiles = e.listFiles();
                    if (listFiles != null) {
                        for (File file : listFiles) {
                            if (file != null && file.isDirectory()) {
                                i++;
                            }
                        }
                    }
                } catch (Throwable unused3) {
                }
                this.q = i2;
                this.r = i;
            }
            i = -1;
            this.q = i2;
            this.r = i;
        }

        public final synchronized Map<String, String> a() {
            try {
                if (this.ah == null) {
                    this.ah = e();
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.ah;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class d extends com.uc.webview.base.task.c {
        boolean c = true;
        C0846b d = null;
        private final String e;
        private final a f;

        public d(String str, a aVar) {
            this.e = str;
            this.f = aVar;
        }

        @Override // com.uc.webview.base.task.c, java.util.concurrent.Callable
        public final /* synthetic */ c.C0833c call() throws Exception {
            return call();
        }

        @Override // com.uc.webview.base.task.c
        public final void d() {
            C0846b bVar;
            if (this.c) {
                e eVar = new e(this.d);
                if (eVar.b == null) {
                    Log.w("u4perf", "no start time");
                    bVar = null;
                } else {
                    eVar.a(StartupTimingKeys.IS_REUSED);
                    eVar.a(StartupTimingKeys.IS_FIRST_USED);
                    eVar.a(StartupTimingKeys.NEED_VERIFY);
                    eVar.a(StartupTimingKeys.INTEGRATION_TYPE);
                    eVar.a(StartupTimingKeys.CAPABILITY_TYPE);
                    eVar.a(StartupTimingKeys.DECIDE_RCI_REASON);
                    eVar.a(StartupTimingKeys.INVALID_LRCI_REASON);
                    eVar.a(StartupTimingKeys.INIT_FAILED_CODE);
                    eVar.a(StartupTimingKeys.INIT_FAILED_MESSAGE);
                    eVar.a(StartupTimingKeys.RE_EXTRACT_COUNT);
                    eVar.a(StartupTimingKeys.UPDATE_FAILED_CODE);
                    eVar.a(StartupTimingKeys.EXTRACTOR_7Z_FAILED_CODE);
                    eVar.a(StartupTimingKeys.DETECT_LIBS_MAYBE_DAMAGED);
                    eVar.a(StartupTimingKeys.USE_PRELOAD_CORE_DEX);
                    eVar.a(StartupTimingKeys.USE_PRELOAD_CORE_SO);
                    eVar.a(StartupTimingKeys.PRELOAD_CORE_DEX_LEAD_TIME);
                    eVar.a(StartupTimingKeys.INITIALIZER, true);
                    eVar.a(StartupTimingKeys.CREATE_RUNNING_CORE_INFO, true);
                    eVar.a(StartupTimingKeys.UPDATE_START, false);
                    eVar.a(StartupTimingKeys.UPDATE_HEAD_VALIDITY, false);
                    eVar.a(StartupTimingKeys.UPDATE_EXISTS, false);
                    eVar.a(StartupTimingKeys.UPDATE_SUCCESS, false);
                    eVar.a(StartupTimingKeys.EXTRACTOR_START, false);
                    eVar.a(StartupTimingKeys.EXTRACTOR_EXISTS, false);
                    eVar.a(StartupTimingKeys.EXTRACTOR_SUCCESS, false);
                    eVar.a(StartupTimingKeys.CONTINUE_INIT_LIBS, false);
                    eVar.a(StartupTimingKeys.LOAD_DEX, true);
                    eVar.a(StartupTimingKeys.INIT_FINISHED, false);
                    eVar.a(StartupTimingKeys.INIT_CORE_FACTORY, true);
                    eVar.a(StartupTimingKeys.LOAD_SO, true);
                    eVar.a(StartupTimingKeys.INIT_CORE_ENGINE, true);
                    eVar.a(StartupTimingKeys.INIT_NATIVE_LIBRARIES, true);
                    eVar.a(StartupTimingKeys.PRE_START_CORE_ENGINE, true);
                    eVar.a(StartupTimingKeys.FIRST_EXPORT_WEBVIEW, true);
                    eVar.a(StartupTimingKeys.FIRST_EXPORT_WEBVIEW_WAIT, true);
                    eVar.a(StartupTimingKeys.FIRST_AOSP_WEBVIEW, true);
                    eVar.a(StartupTimingKeys.FIRST_AOSP_WEBVIEW, true);
                    eVar.a(StartupTimingKeys.POST_INITIALIZER, true);
                    eVar.a(StartupTimingKeys.POST_CONTINUE_INIT_LIBS, true);
                    eVar.a(StartupTimingKeys.POST_UPDATE_START, false);
                    eVar.a(StartupTimingKeys.POST_UPDATE_SUCCESS, false);
                    c a2 = eVar.f14509a.a();
                    eVar.f14509a.a("s0", a2.u);
                    eVar.f14509a.a("s1", a2.v);
                    eVar.f14509a.a("s32", a2.v);
                    eVar.f14509a.a("s36", a2.P);
                    eVar.f14509a.a("s35", a2.Q);
                    eVar.f14509a.a("ws0", a2.T);
                    eVar.f14509a.a("ws1", a2.U);
                    if (a2.E > 0) {
                        eVar.f14509a.a("sp4", 1L);
                        eVar.f14509a.a("s10", a2.C);
                        eVar.f14509a.a("s11", a2.E);
                    }
                    bVar = eVar.f14509a;
                }
            } else {
                bVar = this.d;
            }
            a aVar = this.f;
            if (aVar != null) {
                aVar.a(bVar);
            }
        }

        @Override // com.uc.webview.base.task.c
        public final String e() {
            return this.e;
        }
    }

    public static void a(boolean z) {
        AtomicBoolean atomicBoolean = f14505a;
        if (atomicBoolean.get()) {
            Log.b();
            return;
        }
        if (!z) {
            boolean b = com.uc.webview.base.timing.a.b(StartupTimingKeys.FIRST_EXPORT_WEBVIEW);
            boolean b2 = com.uc.webview.base.timing.a.b(StartupTimingKeys.SDK_INIT_READY);
            if (!b || !b2) {
                Log.d("u4perf", "commitStartup not ready " + b + ", " + b2);
                return;
            }
        }
        if (!atomicBoolean.getAndSet(true)) {
            Log.b();
            a(new a() { // from class: com.uc.webview.internal.stats.b.1
                @Override // com.uc.webview.internal.stats.b.a
                public final void a(C0846b bVar) {
                    b.a(bVar);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        final C0846b f14509a;
        final a.c b;

        public e(C0846b bVar) {
            this.f14509a = bVar == null ? new C0846b() : bVar;
            this.b = (a.c) com.uc.webview.base.timing.a.a((int) StartupTimingKeys.START);
        }

        private void b(int i, boolean z) {
            a.c cVar = (a.c) com.uc.webview.base.timing.a.a(i);
            if (cVar != null) {
                this.f14509a.a(i, a(cVar, z), z);
            }
        }

        public final void a(int i) {
            this.f14509a.a(i, (String) com.uc.webview.base.timing.a.a(i));
        }

        private long a(a.c cVar, boolean z) {
            a.c.C0835a aVar = this.b.f14296a;
            a.c.C0835a aVar2 = z ? cVar.b : cVar.f14296a;
            if (aVar == null || aVar2 == null) {
                return 0L;
            }
            return aVar2.f14297a - aVar.f14297a;
        }

        public final void a(int i, boolean z) {
            if (((a.c) com.uc.webview.base.timing.a.a(i)) != null) {
                b(i, false);
                if (z) {
                    b(i, true);
                }
            }
        }
    }

    public static void a(int i, int i2, final ValueCallback<String> valueCallback, UCExtension uCExtension) {
        if (valueCallback != null) {
            boolean z = false;
            final boolean z2 = i2 == 0;
            final boolean z3 = (i & 1) != 0;
            if (z3 && (i ^ 1) == 0) {
                z = true;
            }
            final a aVar = new a() { // from class: com.uc.webview.internal.stats.b.2
                @Override // com.uc.webview.internal.stats.b.a
                public final void a(C0846b bVar) {
                    ValueCallback valueCallback2;
                    String str;
                    String b;
                    if (bVar == null) {
                        valueCallback2 = valueCallback;
                        str = null;
                    } else {
                        ValueCallback valueCallback3 = valueCallback;
                        if (z2) {
                            b = bVar.toString();
                        } else {
                            b = bVar.b();
                        }
                        str = b;
                        valueCallback2 = valueCallback3;
                    }
                    b.a(valueCallback2, str);
                }
            };
            if (z) {
                a(aVar);
            } else {
                uCExtension.impl().serializeFirstScreenTimings(new ValueCallback<String>() { // from class: com.uc.webview.internal.stats.b.3
                    @Override // android.webkit.ValueCallback
                    public final /* synthetic */ void onReceiveValue(String str) {
                        String str2 = str;
                        if (TextUtils.isEmpty(str2)) {
                            b.a(valueCallback, str2);
                            return;
                        }
                        d dVar = new d("cmfss", aVar);
                        dVar.c = z3;
                        dVar.d = new C0846b(str2);
                        dVar.a();
                    }
                });
            }
        }
    }

    private static void a(a aVar) {
        new d("cmsus", aVar).a();
    }

    public static /* synthetic */ void a(C0846b bVar) {
        c a2 = bVar.a();
        if (a2 == null) {
            Log.w("u4perf", "no startup stats");
            return;
        }
        if (Log.a()) {
            StringBuilder sb = new StringBuilder("sdk_init=");
            sb.append(a2.K - a2.u);
            sb.append(", first_create_webview=");
            sb.append(a2.U - a2.T);
            sb.append(", create_core_info=");
            sb.append(a2.x - a2.w);
            sb.append(", start_init_core=");
            sb.append(a2.F - a2.u);
            sb.append(", load_dex=");
            sb.append(a2.H - a2.G);
            sb.append(", load_so=");
            sb.append(a2.Q - a2.P);
            sb.append(", init_native=");
            sb.append(a2.J - a2.I);
            sb.append(", init_core_engine=");
            sb.append(a2.O - a2.N);
            sb.append(", pre_start_core_engine=");
            sb.append(a2.S - a2.R);
            if (a2.E > 0) {
                sb.append(", extract=");
                sb.append(a2.E - a2.C);
            }
            if (a2.B > 0) {
                sb.append(", download=");
                sb.append(a2.B - a2.y);
            }
            if (a2.t > 0) {
                sb.append(", start_to_init=");
                sb.append(a2.t);
            }
            Log.rInfo("u4perf.startup_stats", sb.toString());
        }
        a2.l();
    }

    public static /* synthetic */ void a(ValueCallback valueCallback, String str) {
        if (valueCallback != null) {
            try {
                valueCallback.onReceiveValue(str);
            } catch (Throwable th) {
                Log.w("u4perf", "doCallback falied", th);
            }
        }
    }
}
