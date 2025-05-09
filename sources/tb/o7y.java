package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.uploader.implement.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.android.spdy.IPluginFetchCallback;
import org.android.spdy.SpdyAgent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tb.kyx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class o7y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f25199a;
    public SharedPreferences b;
    public com.uploader.implement.a c;
    public ThreadPoolExecutor d;
    public HashMap<String, Pair<Boolean, Long>> e;
    public boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(o7y o7yVar) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            return new Thread(runnable, "aus_quic_detect");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements IPluginFetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // org.android.spdy.IPluginFetchCallback
        public void onFetchFinished(boolean z, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1d759e5", new Object[]{this, new Boolean(z), map});
            } else if (z) {
                o7y.this.g();
                SpdyAgent.unregisterQuicListener(this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                o7y.c(o7y.this);
            } catch (Exception e) {
                if (rtx.d(16)) {
                    rtx.b(16, "QuicConnectionDetector", "detect error.", e);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class d implements kyx.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f25202a;
        public final /* synthetic */ long b;
        public final /* synthetic */ kyx c;
        public final /* synthetic */ j8y d;

        public d(String str, long j, kyx kyxVar, j8y j8yVar) {
            this.f25202a = str;
            this.b = j;
            this.c = kyxVar;
            this.d = j8yVar;
        }

        @Override // tb.kyx.c
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.kyx.c
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.kyx.c
        public void a(byte[] bArr, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2713f1b4", new Object[]{this, bArr, new Integer(i)});
            }
        }

        @Override // tb.kyx.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("56c6c68", new Object[]{this});
                return;
            }
            o7y.d(o7y.this, true, this.f25202a, this.b);
            this.c.h();
            j8y j8yVar = this.d;
            j8yVar.e = 1;
            j8yVar.g = System.currentTimeMillis() - this.b;
            this.d.b();
        }

        @Override // tb.kyx.c
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            } else if (i != -2002) {
                o7y.d(o7y.this, false, this.f25202a, this.b);
                j8y j8yVar = this.d;
                j8yVar.e = 0;
                j8yVar.f = i;
                j8yVar.b();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f25203a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;

        public e(boolean z, String str, long j) {
            this.f25203a = z;
            this.b = str;
            this.c = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (rtx.d(16)) {
                rtx.a(16, "QuicConnectionDetector", "saveResult, result:" + this.f25203a + ", network:" + this.b);
            }
            o7y.f(o7y.this).f14547a.h(this.f25203a);
            o7y.h(o7y.this).put(this.b, new Pair(Boolean.valueOf(this.f25203a), Long.valueOf(this.c)));
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : o7y.h(o7y.this).entrySet()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("network", entry.getKey());
                    jSONObject.put("result", ((Pair) entry.getValue()).first);
                    jSONObject.put("time", ((Pair) entry.getValue()).second);
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
            o7y.j(o7y.this).edit().putString("aus_quic_history_record", jSONArray.toString()).apply();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final o7y f25204a = new o7y(null);

        public static /* synthetic */ o7y a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (o7y) ipChange.ipc$dispatch("7798d702", new Object[0]);
            }
            return f25204a;
        }
    }

    public /* synthetic */ o7y(a aVar) {
        this();
    }

    public static o7y a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (o7y) ipChange.ipc$dispatch("7798d702", new Object[0]);
        }
        return f.a();
    }

    public static /* synthetic */ void c(o7y o7yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9e8ff3c", new Object[]{o7yVar});
        } else {
            o7yVar.k();
        }
    }

    public static /* synthetic */ void d(o7y o7yVar, boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75412422", new Object[]{o7yVar, new Boolean(z), str, new Long(j)});
        } else {
            o7yVar.e(z, str, j);
        }
    }

    public static /* synthetic */ com.uploader.implement.a f(o7y o7yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.uploader.implement.a) ipChange.ipc$dispatch("5194a0e3", new Object[]{o7yVar});
        }
        return o7yVar.c;
    }

    public static /* synthetic */ HashMap h(o7y o7yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("fe79921", new Object[]{o7yVar});
        }
        return o7yVar.e;
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[0])).booleanValue();
        }
        return SpdyAgent.isQuicReady();
    }

    public static /* synthetic */ SharedPreferences j(o7y o7yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SharedPreferences) ipChange.ipc$dispatch("70ac5453", new Object[]{o7yVar});
        }
        return o7yVar.b;
    }

    public void b(Context context, com.uploader.implement.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcd02a0a", new Object[]{this, context, aVar});
        } else if (!this.f) {
            this.f25199a = context;
            this.b = PreferenceManager.getDefaultSharedPreferences(context);
            this.c = aVar;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(1024), new a(this));
            this.d = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            this.f = true;
            if (!i()) {
                SpdyAgent.registerQuicListener(new b());
            } else {
                g();
            }
        }
    }

    public final void e(boolean z, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec16434e", new Object[]{this, new Boolean(z), str, new Long(j)});
        } else {
            this.d.submit(new e(z, str, j));
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = this.d;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.submit(new c());
        }
    }

    public o7y() {
    }

    public final void k() {
        NetworkInfo d2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
        } else if (cwx.l() && i() && (d2 = bux.d(this.f25199a)) != null && d2.isConnected()) {
            if (!TextUtils.isEmpty(d2.getExtraInfo())) {
                str = d2.getExtraInfo();
            } else {
                str = "default";
            }
            if (this.e == null) {
                this.e = new HashMap<>();
                String string = this.b.getString("aus_quic_history_record", null);
                if (!TextUtils.isEmpty(string)) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            String string2 = jSONObject.getString("network");
                            boolean z = jSONObject.getBoolean("result");
                            this.e.put(string2, new Pair<>(Boolean.valueOf(z), Long.valueOf(jSONObject.getLong("time"))));
                            if (string2 != null && string2.equalsIgnoreCase(str)) {
                                this.c.f14547a.h(z);
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            Pair<Boolean, Long> pair = this.e.get(str);
            if (pair == null || currentTimeMillis - ((Long) pair.second).longValue() >= xg4.DEFAULT_MAX_AGE) {
                List<a.b.C0850b> l = this.c.f14547a.l();
                if (l.size() != 0) {
                    a.b.C0850b bVar = l.get(0);
                    kyx kyxVar = new kyx(this.c, new s7y(bVar.f14550a, bVar.b, true, bVar.d, bVar.c));
                    j8y j8yVar = new j8y();
                    j8yVar.f21840a = bVar.f14550a;
                    j8yVar.b = bVar.b;
                    j8yVar.c = bVar.c;
                    j8yVar.d = str;
                    kyxVar.e(new d(str, currentTimeMillis, kyxVar, j8yVar));
                    kyxVar.b();
                }
            } else if (rtx.d(16)) {
                rtx.a(16, "QuicConnectionDetector", "detect in valid period, not need to detect.");
            }
        }
    }
}
