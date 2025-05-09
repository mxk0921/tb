package tb;

import android.content.Context;
import android.os.Trace;
import anet.channel.util.ALog;
import com.alibaba.android.aura.util.AURATraceUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.ck;
import tb.icu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v9r {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f29875a;
    public static boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements icu.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.icu.e
        public void a(icu icuVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d10d10ed", new Object[]{this, icuVar});
            } else {
                icuVar.f();
            }
        }
    }

    static {
        t2o.a(708837628);
    }

    public static void a(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("770c13bc", new Object[]{strArr});
        } else if (b) {
            Trace.beginSection(i(strArr));
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14454ae8", new Object[0]);
        } else if (new File("/data/local/tmp/.enableMethodTrace").exists()) {
            b = true;
            AURATraceUtil.h(true);
            ck.g().e("enableBuyTrace", ck.b.b().i("AURA/performance").a());
        }
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99a63089", new Object[0]);
        } else if (new File("/data/local/tmp/.enableBuyTrace").exists()) {
            b = true;
            AURATraceUtil.i(true);
            ck.g().e("enableBuyTrace", ck.b.b().i("AURA/performance").a());
        }
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13a323b5", new Object[0]);
        }
    }

    public static void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("831da861", new Object[0]);
        } else if (new File("/data/local/tmp/.enableNetworkTrace").exists()) {
            ALog.setUseTlog(false);
            ALog.setPrintLog(true);
            ALog.setLevel(1);
        }
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28f84399", new Object[0]);
        } else if (new File("/data/local/tmp/.enablePhenixTrace").exists()) {
            xv8.h(new f17());
            xv8.i(3);
        }
    }

    public static void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fcca111", new Object[0]);
        } else if (b) {
            Trace.endSection();
        }
    }

    public static void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edfae2be", new Object[0]);
        } else if (!f29875a) {
            if (th.c() || new File("/data/local/tmp/.enableTBBuyTrace").exists()) {
                f();
                e();
                d();
                c();
                b();
            }
            f29875a = true;
        }
    }

    public static String i(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3193a943", new Object[]{strArr});
        }
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        if (strArr.length == 1) {
            return strArr[0];
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void j(String... strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4db5a8", new Object[]{strArr});
        } else if (b) {
            Trace.beginSection(i(strArr));
            Trace.endSection();
        }
    }

    public static void k(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ec0344", new Object[]{context, str});
            return;
        }
        icu icuVar = new icu(context);
        icuVar.v("温馨提示");
        icuVar.q(str);
        icuVar.s(new a());
        icuVar.x();
    }
}
