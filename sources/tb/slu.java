package tb;

import android.text.TextUtils;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.HttpDnsAdapter;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.utils.TrtcLog;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class slu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final vmu f28139a = new vmu();
    public static ArrayList<HttpDnsAdapter.HttpDnsOrigin> b = null;
    public static final AtomicBoolean c = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28140a;

        public a(String str) {
            this.f28140a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.util.concurrent.atomic.AtomicBoolean] */
        @Override // java.lang.Runnable
        public void run() {
            String str = "TrtcWaiter signal for get httpdns done";
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                try {
                    slu.e(HttpDnsAdapter.getOriginsByHttpDns(this.f28140a));
                } catch (Exception e) {
                    TrtcLog.j("TrtcHttpDns", "GetIPFromHttpDns e: " + e.getMessage());
                }
            } finally {
                TrtcLog.j("TrtcHttpDns", str);
                slu.f().a(3);
                slu.g().set(false);
            }
        }
    }

    static {
        t2o.a(395313641);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59814b8c", new Object[0]);
            return;
        }
        StringBuilder sb = new StringBuilder("TrtcWaiter signal for get httpdns done, http dns workding: ");
        AtomicBoolean atomicBoolean = c;
        sb.append(atomicBoolean);
        TrtcLog.j("TrtcHttpDns", sb.toString());
        if (atomicBoolean.get()) {
            f28139a.a(3);
            i();
            atomicBoolean.set(false);
        }
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> arrayList = b;
        if (arrayList != null && !arrayList.isEmpty()) {
            b.clear();
            b = null;
        }
    }

    public static ArrayList<HttpDnsAdapter.HttpDnsOrigin> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("d888a18d", new Object[]{str});
        }
        h(new a(str));
        TrtcLog.j("TrtcHttpDns", "TrtcWaiter wait for get httpdns done");
        c.set(true);
        f28139a.b(3, 5000);
        return b;
    }

    public static Object[] c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("aced720c", new Object[]{str});
        }
        TrtcLog.j("TrtcHttpDns", "GetIPFromHttpDns host: " + str);
        ArrayList<HttpDnsAdapter.HttpDnsOrigin> b2 = b(str);
        if (b2 == null || b2.size() <= 0) {
            TrtcLog.i("TrtcHttpDns", "GetIPFromHttpDns get ip error");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<HttpDnsAdapter.HttpDnsOrigin> it = b2.iterator();
        while (it.hasNext()) {
            String originIP = it.next().getOriginIP();
            if (!TextUtils.isEmpty(originIP)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((String) it2.next()).equals(originIP)) {
                            break;
                        }
                    } else {
                        try {
                            if (!NetworkStatusHelper.getStatus().isWifi() || arrayList.isEmpty() || !(InetAddress.getByName((String) arrayList.get(0)) instanceof Inet6Address) || !(InetAddress.getByName(originIP) instanceof Inet4Address) || !cmu.b(rlu.TRTC_ORANGE_DEF_BOOL_DNS_WIFI_DUAL_STACK_V4_FIRST, true)) {
                                arrayList.add(originIP);
                            } else {
                                arrayList.add(0, originIP);
                                tmu.f("TrtcHttpDns", "httpdns v4 first: " + originIP);
                            }
                        } catch (Throwable unused) {
                            arrayList.add(originIP);
                        }
                    }
                }
            }
        }
        b2.clear();
        Object[] array = arrayList.toArray();
        TrtcLog.j("TrtcHttpDns", "GetIPFromHttpDns host: " + Arrays.toString(array));
        return array;
    }

    public static void d(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("157f6776", new Object[]{str, str2, new Boolean(z)});
            return;
        }
        TrtcLog.j("TrtcHttpDns", "UpdateHttpDnsAMDC host: " + str + " ,ip: " + str2 + " ,status: " + z);
    }

    public static /* synthetic */ ArrayList e(ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("c41caa2b", new Object[]{arrayList});
        }
        b = arrayList;
        return arrayList;
    }

    public static /* synthetic */ vmu f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vmu) ipChange.ipc$dispatch("c1fd35d1", new Object[0]);
        }
        return f28139a;
    }

    public static /* synthetic */ AtomicBoolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AtomicBoolean) ipChange.ipc$dispatch("ba126bf9", new Object[0]);
        }
        return c;
    }

    public static void h(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{runnable});
            return;
        }
        TrtcLog.j("TrtcHttpDns", "execute thread.");
        nf.j(runnable);
    }

    public static void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("450aec87", new Object[0]);
            return;
        }
        TrtcLog.j("TrtcHttpDns", "shutdown thread.");
        nf.w();
    }
}
