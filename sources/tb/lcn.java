package tb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.alipay.mobile.common.transport.http.RequestMethodConstants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.riverlogger.NativeAdaptor;
import com.taobao.android.riverlogger.RVLLevel;
import com.taobao.android.riverlogger.RVLRemoteConnectCallback;
import com.taobao.android.riverlogger.inspector.RVLWVPlugin;
import com.taobao.weex.utils.tools.TimeCalculator;
import com.ut.device.UTDevice;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class lcn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<ncn> f23260a;
    public static final AtomicBoolean b = new AtomicBoolean(false);
    public static final AtomicBoolean c = new AtomicBoolean(false);
    public static RVLLevel d = RVLLevel.Info;
    public static final AtomicLong e = new AtomicLong(1);

    static {
        t2o.a(649068553);
        ConcurrentLinkedQueue<ncn> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        f23260a = concurrentLinkedQueue;
        concurrentLinkedQueue.add(jcn.instance);
    }

    public static icn a(RVLLevel rVLLevel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (icn) ipChange.ipc$dispatch("5fa6fa2c", new Object[]{rVLLevel, str});
        }
        return new icn(rVLLevel, str);
    }

    @Deprecated
    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c138de5", new Object[0]);
        } else {
            ti3.b("user close");
        }
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf01edf", new Object[]{str});
        }
        if (str == null || str.length() == 0) {
            str = RequestMethodConstants.TRACE_METHOD;
        }
        return str + "_" + j();
    }

    public static String d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fccef818", new Object[]{context});
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String charSequence = packageManager.getApplicationLabel(context.getApplicationInfo()).toString();
            String str = packageManager.getPackageInfo(context.getPackageName(), 0).versionName;
            return charSequence + "/" + str;
        } catch (Exception unused) {
            return "UnknownApp";
        }
    }

    public static RVLLevel e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RVLLevel) ipChange.ipc$dispatch("6a8657cc", new Object[0]);
        }
        return d;
    }

    public static void f(RVLLevel rVLLevel, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eafe89e8", new Object[]{rVLLevel, str, str2});
        } else if (rVLLevel != null && rVLLevel.value <= d.value && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            kcn kcnVar = new kcn(rVLLevel, str, System.currentTimeMillis());
            kcnVar.i = str2;
            h(kcnVar);
        }
    }

    @Deprecated
    public static void g(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c228169", new Object[]{str, str2, str3});
        } else {
            mcn.b(str, str2, str3);
        }
    }

    public static void h(kcn kcnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ed4f4a", new Object[]{kcnVar});
            return;
        }
        Iterator<ncn> it = f23260a.iterator();
        while (it.hasNext()) {
            it.next().a(kcnVar);
        }
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9498e102", new Object[0]);
            return;
        }
        RVLLevel rVLLevel = RVLLevel.Off;
        Iterator<ncn> it = f23260a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            RVLLevel b2 = it.next().b();
            if (b2.value > rVLLevel.value) {
                if (b2 == RVLLevel.Verbose) {
                    rVLLevel = b2;
                    break;
                }
                rVLLevel = b2;
            }
        }
        if (rVLLevel != d) {
            d = rVLLevel;
            NativeAdaptor.setLogLevel(rVLLevel.value);
        }
    }

    public static long j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("594d3dba", new Object[0])).longValue();
        }
        return e.getAndIncrement();
    }

    @Deprecated
    public static void k(pcn pcnVar, RVLRemoteConnectCallback rVLRemoteConnectCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22155a6a", new Object[]{pcnVar, rVLRemoteConnectCallback});
        } else if (pcnVar == null) {
            if (rVLRemoteConnectCallback != null) {
                rVLRemoteConnectCallback.finish(false, "Invalid parameter");
            }
        } else if (pcnVar.c()) {
            rVLRemoteConnectCallback.finish(false, "Not supported");
        } else {
            mcn.d(pcnVar.b(), pcnVar.a(), rVLRemoteConnectCallback);
        }
    }

    public static void m(RVLLevel rVLLevel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92b3b1b6", new Object[]{rVLLevel});
        } else {
            jcn.instance.d(rVLLevel);
        }
    }

    public static void l(ncn ncnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff204d5", new Object[]{ncnVar});
        } else if (ncnVar != null) {
            f23260a.add(ncnVar);
            i();
            kcn kcnVar = new kcn(RVLLevel.Info, qcn.RVLModuleName, System.currentTimeMillis());
            kcnVar.j = true;
            kcnVar.e = "registerExternalLog";
            kcnVar.i = "{\"log\":\"" + ncnVar.getClass().getName() + "\",\"level\":\"" + d.toString() + "\"}";
            h(kcnVar);
        }
    }

    public static void o(ncn ncnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("947c501c", new Object[]{ncnVar});
        } else if (ncnVar != null) {
            f23260a.remove(ncnVar);
            i();
            kcn kcnVar = new kcn(RVLLevel.Info, qcn.RVLModuleName, System.currentTimeMillis());
            kcnVar.j = true;
            kcnVar.e = "unregisterExternalLog";
            kcnVar.i = "{\"log\":\"" + ncnVar.getClass().getName() + "\",\"level\":\"" + d.toString() + "\"}";
            h(kcnVar);
        }
    }

    public static void n(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7de2fc4", new Object[]{context});
            return;
        }
        g8q.a();
        if (context != null && c.compareAndSet(false, true)) {
            zbf.f("os", TimeCalculator.PLATFORM_ANDROID);
            zbf.f("AppInfo", d(context));
            try {
                String utdid = UTDevice.getUtdid(context);
                if (!TextUtils.isEmpty(utdid)) {
                    zbf.f(oeh.UTDID, utdid);
                }
            } catch (Exception | NoClassDefFoundError unused) {
            }
            ti3.h(context);
            qcn.d(context);
        }
        if (b.compareAndSet(false, true)) {
            ocn.c();
            try {
                fsw.h(qcn.RVLModuleName, RVLWVPlugin.class);
            } catch (Exception | NoClassDefFoundError unused2) {
            }
        }
    }
}
