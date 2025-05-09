package tb;

import anet.channel.status.NetworkStatusHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l6m {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile l6m c;
    public static final String d = l6m.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, k6m> f23137a = new HashMap<>();
    public final HashSet<String> b = new HashSet<>();

    static {
        t2o.a(779093071);
    }

    public static l6m c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (l6m) ipChange.ipc$dispatch("eb9c39fb", new Object[0]);
        }
        if (c == null) {
            synchronized (l6m.class) {
                try {
                    if (c == null) {
                        c = new l6m();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f0f790f", new Object[]{this});
        }
        if (NetworkStatusHelper.isConnected()) {
            return "1";
        }
        return "0";
    }

    public k6m b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k6m) ipChange.ipc$dispatch("9a54e1d3", new Object[]{this, str});
        }
        return this.f23137a.get(str);
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e169be6f", new Object[]{this, str});
        } else {
            this.f23137a.put(str, new k6m());
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("15772da0", new Object[]{this, str});
        } else if (str == null) {
            v2s.o().A().c(d, "liveEnd null error liveContextKey = null");
        } else {
            k6m k6mVar = this.f23137a.get(str);
            if (k6mVar == null) {
                v2s.o().A().c(d, "liveEnd PlayReportParams null error liveContextKey = ".concat(str));
            } else if (!this.b.contains(str)) {
                v2s.o().A().c(d, "liveEnd no start liveContextKey = ".concat(str));
            } else {
                Map<String, String> a2 = k6mVar.a();
                a2.put("action", "exit");
                a2.put("networkstatus", a());
                j(a2);
                this.f23137a.remove(str);
                this.b.remove(str);
                cwd A = v2s.o().A();
                String str2 = d;
                A.a(str2, "liveEnd liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public void f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cc5564", new Object[]{this, str, str2});
        } else if (str == null) {
            v2s.o().A().c(d, "liveFailed null error liveContextKey = null");
        } else {
            k6m k6mVar = this.f23137a.get(str);
            if (k6mVar == null) {
                v2s.o().A().c(d, "liveFailed PlayReportParams null error liveContextKey = ".concat(str));
            } else if (!this.b.contains(str)) {
                v2s.o().A().c(d, "liveFailed no start liveContextKey = ".concat(str));
            } else {
                k6mVar.c = str2;
                Map<String, String> a2 = k6mVar.a();
                a2.put("action", "failed");
                a2.put("networkstatus", a());
                j(a2);
                this.f23137a.remove(str);
                this.b.remove(str);
                cwd A = v2s.o().A();
                String str3 = d;
                A.a(str3, "liveFailed liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5667ace7", new Object[]{this, str});
        } else if (str == null) {
            cwd A = v2s.o().A();
            String str2 = d;
            A.c(str2, "liveStart test liveContextKey null error liveContextKey = " + str);
        } else {
            k6m k6mVar = this.f23137a.get(str);
            if (k6mVar == null) {
                v2s.o().A().c(d, "liveStart PlayReportParams null error liveContextKey = ".concat(str));
            } else if (this.b.contains(str)) {
                v2s.o().A().c(d, "liveStart duplicate error liveContextKey = ".concat(str));
            } else {
                this.b.add(str);
                i();
                Map<String, String> a2 = k6mVar.a();
                a2.put("action", "start");
                a2.put("networkstatus", a());
                j(a2);
                cwd A2 = v2s.o().A();
                String str3 = d;
                A2.a(str3, "liveStart liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24ec3ac9", new Object[]{this, str});
        } else if (str == null) {
            v2s.o().A().c(d, "liveStartSucc liveContextKey null error liveContextKey = null");
        } else {
            k6m k6mVar = this.f23137a.get(str);
            if (k6mVar == null) {
                v2s.o().A().c(d, "liveStartSucc PlayReportParams null error liveContextKey = ".concat(str));
            } else if (!this.b.contains(str)) {
                v2s.o().A().c(d, "liveStartSucc no start liveContextKey = ".concat(str));
            } else {
                Map<String, String> a2 = k6mVar.a();
                a2.put("action", "success");
                a2.put("networkstatus", a());
                j(a2);
                this.f23137a.remove(str);
                this.b.remove(str);
                cwd A = v2s.o().A();
                String str2 = d;
                A.a(str2, "liveStartSucc liveContextKey = " + str + " args = " + a2);
            }
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36a34e34", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("feed_type", "live");
        hashMap.put("live_status", "6");
        uwt.b(hashMap, "live_status_expo");
    }

    public final void j(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459c1778", new Object[]{this, map});
            return;
        }
        if (v2s.o().s() != null) {
            v2s.o().s().a("lpm_liveStability", "Page_TaobaoLiveWatch", map);
        }
        if (v2s.o().E() != null) {
            g2e D = v2s.o().D();
            if (D != null) {
                for (Map.Entry<String, String> entry : D.e().entrySet()) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
            v2s.o().E().trackCustom(yj4.STAIN_TRACK_PAGE, 2101, "lpm_liveStability", null, null, map);
        }
    }
}
