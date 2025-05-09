package tb;

import android.app.Application;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tcrash.JvmUncaughtCrashListener;
import com.taobao.android.tcrash.TCrashSDK;
import com.taobao.android.tcrash.UncaughtCrashType;
import com.taobao.pexode.decoder.AvifDecoder;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class siq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f28077a;
    public static boolean b;
    public static long c;
    public static boolean d;
    public static final b e = new b(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements JvmUncaughtCrashListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.tcrash.JvmUncaughtCrashListener
        public Map<String, Object> onJvmUncaughtCrash(Thread thread, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("d9b5b942", new Object[]{this, thread, th});
            }
            String c = siq.a().c();
            if (c == null) {
                fiv.k("StatMonitor4Phenix", "crash happened, collect latest decoding failed", new Object[0]);
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("PHENIX_LATEST_DECODING", c);
            fiv.f("StatMonitor4Phenix", "crash happened, collect latest decoding urls=%s", c);
            return hashMap;
        }
    }

    public static /* synthetic */ b a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("a37b3c88", new Object[0]);
        }
        return e;
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("833528a2", new Object[0]);
        } else if (f28077a) {
            v0a.f29712a = "bizReqStart";
            v0a.b = "bizReqProcessStart";
            v0a.c = "bizRspProcessStart";
            v0a.d = "bizRspCbDispatch";
            v0a.e = "bizRspCbStart";
            v0a.f = "bizRspCbEnd";
            v0a.g = "bizFinish";
        }
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0d7147f", new Object[0])).booleanValue();
        }
        return d;
    }

    public static void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6641b4f1", new Object[]{new Boolean(z)});
        } else {
            d = z;
        }
    }

    public static void e(Context context, etj etjVar, int i, int i2, int i3, fgr fgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85b3abcf", new Object[]{context, etjVar, new Integer(i), new Integer(i2), new Integer(i3), fgrVar});
            return;
        }
        TBImageFlowMonitor tBImageFlowMonitor = new TBImageFlowMonitor(i, i2, etjVar, fgrVar);
        c = System.currentTimeMillis();
        tBImageFlowMonitor.S(qpj.c());
        ((Application) context).registerActivityLifecycleCallbacks(qpj.c());
        tBImageFlowMonitor.T(new brr(context));
        if (i3 > 0) {
            tBImageFlowMonitor.R(i3);
        }
        p0m.u(tBImageFlowMonitor);
        s0m.B().n0(tBImageFlowMonitor);
        AvifDecoder.g(tBImageFlowMonitor);
        ouo a2 = s0m.B().j0().a();
        if (a2 != null) {
            huo b2 = a2.b();
            if (b2 instanceof dpl) {
                ((dpl) b2).l(tBImageFlowMonitor);
            }
        }
        s0m.B().m0(e);
        TCrashSDK.instance().addJvmUncaughtCrashListener(new a());
        fiv.f("StatMonitor4Phenix", "init stat monitor with sampling=%d", Integer.valueOf(i));
        try {
            f28077a = true;
        } catch (Exception unused) {
            f28077a = false;
        }
        b();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b implements mke {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<Long, String> f28078a;

        public b() {
            this.f28078a = new LinkedHashMap(2);
        }

        @Override // tb.mke
        public void a(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45ac5452", new Object[]{this, new Long(j), str});
                return;
            }
            synchronized (this) {
                try {
                    if (this.f28078a.size() > 5) {
                        ((LinkedHashMap) this.f28078a).clear();
                    }
                    this.f28078a.put(Long.valueOf(j), str);
                } catch (Throwable th) {
                    throw th;
                }
            }
            TCrashSDK.instance().getCrashCaughtHeaderByType(UncaughtCrashType.NATIVE_ONLY).addHeaderInfo("PHENIX_LATEST_DECODING", c());
        }

        @Override // tb.mke
        public synchronized void b(long j, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f6460007", new Object[]{this, new Long(j), str});
            } else {
                this.f28078a.remove(Long.valueOf(j));
            }
        }

        public String c() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("bc06ea25", new Object[]{this});
            }
            synchronized (this) {
                try {
                    str = null;
                    if (this.f28078a.size() > 0) {
                        for (Map.Entry entry : ((LinkedHashMap) this.f28078a).entrySet()) {
                            if (str == null) {
                                str = (String) entry.getValue();
                            } else {
                                str = str + "," + ((String) entry.getValue());
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }
}
