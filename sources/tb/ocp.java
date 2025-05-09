package tb;

import anet.channel.appmonitor.AppMonitor;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.statistics.ServerExceptionStat;
import com.network.diagnosis.statistics.SlowServerRTStat;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ocp implements pod {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f25300a;

        public a(Map map) {
            this.f25300a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                ocp.b(ocp.this, this.f25300a);
            } catch (Throwable unused) {
                ALog.e("npm.ServerDetector", "checkRequest error", null, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ocp f25301a = new ocp();

        public static /* synthetic */ ocp a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ocp) ipChange.ipc$dispatch("cccb592", new Object[0]);
            }
            return f25301a;
        }
    }

    public static /* synthetic */ void b(ocp ocpVar, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daba3f5a", new Object[]{ocpVar, map});
        } else {
            ocpVar.c(map);
        }
    }

    public static ocp d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ocp) ipChange.ipc$dispatch("cff59117", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.pod
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e92c2c57", new Object[]{this, map});
        } else {
            mhj.c(new a(map));
        }
    }

    public final void c(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae285c1", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            Long l = (Long) map.get("serverRT");
            long longValue = l.longValue();
            Integer num = (Integer) map.get("code");
            int intValue = num.intValue();
            String str = (String) map.get("host");
            String str2 = (String) map.get("url");
            String str3 = (String) map.get("protocol");
            String str4 = (String) map.get(pod.IP);
            String str5 = (String) map.get(pod.EAGLE_EYE_ID);
            if (longValue >= qxn.c()) {
                SlowServerRTStat slowServerRTStat = new SlowServerRTStat();
                slowServerRTStat.serverRt = longValue;
                slowServerRTStat.code = intValue;
                slowServerRTStat.url = str2;
                slowServerRTStat.eagleEyeId = str5;
                slowServerRTStat.host = str;
                slowServerRTStat.userType = zuv.b().c();
                ALog.e("npm.ServerDetector", "slow server rt detect.", null, "url", str2, "serverRT", l, pod.EAGLE_EYE_ID, str5);
                AppMonitor.getInstance().commitStat(slowServerRTStat);
            }
            if (intValue != 200 && qxn.g(str)) {
                ServerExceptionStat serverExceptionStat = new ServerExceptionStat();
                serverExceptionStat.host = str;
                serverExceptionStat.url = str2;
                serverExceptionStat.protocol = str3;
                serverExceptionStat.ip = str4;
                serverExceptionStat.code = intValue;
                ALog.e("npm.ServerDetector", "server exception detect.", null, "host", str, pod.IP, str4, "protocol", str3, "code", num);
                AppMonitor.getInstance().commitStat(serverExceptionStat);
            }
        }
    }
}
