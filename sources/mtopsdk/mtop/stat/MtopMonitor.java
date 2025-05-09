package mtopsdk.mtop.stat;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MtopMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile IMtopMonitor monitor = null;
    private static volatile IMtopMonitor headerMonitor = null;
    private static volatile ConcurrentHashMap<String, IMtopMonitor> responseHeaderMonitors = new ConcurrentHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class Proxy implements IMtopMonitor {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public IMtopMonitor mtopMonitor;

        static {
            t2o.a(589299988);
            t2o.a(589299983);
        }

        public Proxy(IMtopMonitor iMtopMonitor) {
            this.mtopMonitor = iMtopMonitor;
        }

        @Override // mtopsdk.mtop.stat.IMtopMonitor
        public void onCommit(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6701704c", new Object[]{this, str, hashMap});
                return;
            }
            IMtopMonitor iMtopMonitor = this.mtopMonitor;
            if (iMtopMonitor != null) {
                iMtopMonitor.onCommit(str, hashMap);
            }
        }
    }

    static {
        t2o.a(589299987);
    }

    public static void addHeaderMonitor(IMtopMonitor iMtopMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("22164ee8", new Object[]{iMtopMonitor});
        } else {
            headerMonitor = new Proxy(iMtopMonitor);
        }
    }

    public static void addMtopMonitor(IMtopMonitor iMtopMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("334e188d", new Object[]{iMtopMonitor});
        } else {
            monitor = new Proxy(iMtopMonitor);
        }
    }

    public static void addResponseHeaderMonitor(String str, IMtopMonitor iMtopMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e172f1", new Object[]{str, iMtopMonitor});
        } else if (responseHeaderMonitors != null) {
            responseHeaderMonitors.put(str, new Proxy(iMtopMonitor));
        }
    }

    public static IMtopMonitor getHeaderMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopMonitor) ipChange.ipc$dispatch("42f69aad", new Object[0]);
        }
        return headerMonitor;
    }

    public static IMtopMonitor getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IMtopMonitor) ipChange.ipc$dispatch("cf893279", new Object[0]);
        }
        return monitor;
    }

    public static ConcurrentHashMap<String, IMtopMonitor> getResponseHeaderMonitors() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("263e47c2", new Object[0]);
        }
        return responseHeaderMonitors;
    }

    public static void removeResponseHeaderMonitor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4194b5b9", new Object[]{str});
        } else if (responseHeaderMonitors != null) {
            responseHeaderMonitors.remove(str);
        }
    }
}
