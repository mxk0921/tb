package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.RVStartParams;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.csw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class qrw {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String url;
    public boolean isInit = false;
    public long startTime = 0;
    public long init = 0;
    public String performanceInfo = "";
    public int wvAppMonitor = 1;
    public c stat = new c();
    public a args = new a();
    public String protocolType = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class a {
        public int statusCode;
        public String via;
        public csw.a netStat = null;
        public Map<String, Long> selfDefine = new ConcurrentHashMap();
        public Map<String, b> resStat = new ConcurrentHashMap();

        static {
            t2o.a(989856339);
        }

        public a() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long end;
        public int fromType;
        public csw.a netStat;
        public long start;
        public int statusCode;
        public String via;
        public int verifyError = 0;
        public long verifyResTime = 0;
        public long verifyTime = 0;
        public long tcpTime = 0;
        public String protocolType = "";

        static {
            t2o.a(989856340);
        }

        public Map<String, String> toUtMap() {
            Map<String, String> map;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("fd04be7e", new Object[]{this});
            }
            csw.a aVar = this.netStat;
            if (aVar == null) {
                map = new HashMap<>();
            } else {
                map = qrw.toUtMap(aVar);
            }
            int i = this.statusCode;
            if (i > 0) {
                map.put("statusCode", String.valueOf(i));
            }
            String str = this.via;
            if (str != null) {
                map.put(TBImageFlowMonitor.VIA, str);
            }
            long j = this.start;
            if (j > 0) {
                map.put("start", String.valueOf(j));
            }
            long j2 = this.end;
            if (j2 > 0) {
                map.put("end", String.valueOf(j2));
            }
            map.put(RVStartParams.KEY_FROM_TYPE, String.valueOf(this.fromType));
            map.put("protocolType", this.protocolType);
            map.put("tcpTime", String.valueOf(this.tcpTime));
            map.put("verifyError", String.valueOf(this.verifyError));
            map.put("verifyResTime", String.valueOf(this.verifyResTime));
            map.put("verifyTime", String.valueOf(this.verifyTime));
            return map;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public class c {
        public long onLoad = 0;
        public long onDomLoad = 0;
        public int finish = 0;
        public int fromType = 1;
        public long firstByteTime = 0;
        public String packageAppVersion = "";
        public String packageAppName = "";
        public String appSeq = "";
        public long matchCost = -1;
        public int verifyError = 0;
        public long verifyResTime = 0;
        public long verifyTime = 0;
        public long allVerifyTime = 0;
        public int verifyCacheSize = 0;

        static {
            t2o.a(989856341);
        }

        public c() {
        }
    }

    static {
        t2o.a(989856338);
    }

    public static b createNewResStatInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("98ee761", new Object[0]);
        }
        return new b();
    }

    public static ArrayList<String> toUtArray(csw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3fb54791", new Object[]{aVar});
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (Map.Entry<String, String> entry : toUtMap(aVar).entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        return arrayList;
    }

    public static Map<String, String> toUtMap(csw.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1bed8809", new Object[]{aVar});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("net_dnsTime", String.valueOf(aVar.dnsTime));
        hashMap.put("net_isDNSTimeout", String.valueOf((int) aVar.isDNSTimeout));
        hashMap.put("net_oneWayTime", String.valueOf(aVar.oneWayTime));
        hashMap.put("net_tcpLinkDate", String.valueOf(aVar.tcpLinkDate));
        hashMap.put("net_waitTime", String.valueOf(aVar.waitTime));
        hashMap.put("net_postBodyTime", String.valueOf(aVar.postBodyTime));
        hashMap.put("net_firstDataTime", String.valueOf(aVar.firstDataTime));
        hashMap.put("net_serverRT", String.valueOf(aVar.serverRT));
        hashMap.put("net_totalSize", String.valueOf(aVar.totalSize));
        hashMap.put("net_recDataTime", String.valueOf(aVar.recDataTime));
        hashMap.put("net_isSSL", String.valueOf(aVar.isSSL));
        hashMap.put("net_dataSpeed", String.valueOf(aVar.dataSpeed));
        hashMap.put("net_spdy", String.valueOf(aVar.spdy));
        return hashMap;
    }

    public HashMap<String, Object> toJsonStringMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("8b7680f2", new Object[]{this});
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("url", this.url);
        hashMap.put(z9u.KEY_LOAD_TIME, Long.valueOf(this.stat.onLoad));
        hashMap.put(xau.PROPERTY_IS_FINISH, Integer.valueOf(this.stat.finish));
        hashMap.put("firstByte", Long.valueOf(this.stat.firstByteTime));
        hashMap.put("domLoad", Long.valueOf(this.stat.onDomLoad));
        hashMap.put(RVStartParams.KEY_FROM_TYPE, Integer.valueOf(this.stat.fromType));
        hashMap.put("matchCost", Long.valueOf(this.stat.matchCost));
        hashMap.put("statusCode", Integer.valueOf(this.args.statusCode));
        hashMap.put("packageappversion", this.stat.packageAppVersion);
        hashMap.put("packageAppName", this.stat.packageAppName);
        hashMap.put("verifyCacheSize", Integer.valueOf(this.stat.verifyCacheSize));
        hashMap.put(TBImageFlowMonitor.VIA, this.args.via);
        hashMap.put("verifyError", Integer.valueOf(this.stat.verifyError));
        hashMap.put("verifyResTime", Long.valueOf(this.stat.verifyResTime));
        hashMap.put("verifyTime", Long.valueOf(this.stat.verifyTime));
        hashMap.put("allVerifyTime", Long.valueOf(this.stat.allVerifyTime));
        csw.a aVar = this.args.netStat;
        if (aVar != null) {
            hashMap.put("netStat", toUtArray(aVar));
        }
        if (!this.args.resStat.isEmpty() && ((int) Math.ceil((Math.random() * 100.0d) + 0.5d)) <= prw.getInstance().config.stat.resSample) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, b> entry : this.args.resStat.entrySet()) {
                if (entry.getValue().end - entry.getValue().start > prw.getInstance().config.stat.resTime) {
                    Map<String, String> utMap = entry.getValue().toUtMap();
                    String key = entry.getKey();
                    Uri parse = Uri.parse(key);
                    if (parse != null && parse.isHierarchical()) {
                        utMap.put("url", key);
                        arrayList.add(utMap);
                    }
                }
            }
            hashMap.put("resStat", arrayList);
        }
        return hashMap;
    }

    public String[] toJsonStringDict() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("dccbaee0", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("fromType=" + this.stat.fromType);
        if (!TextUtils.isEmpty(this.stat.appSeq)) {
            arrayList.add("PackageApp-Seq=" + this.stat.appSeq);
            arrayList.add("PackageApp-Version=" + this.stat.packageAppVersion);
            arrayList.add("PackageApp-Name=" + this.stat.packageAppName);
        }
        if (this.stat.onDomLoad > 0) {
            arrayList.add("domLoad=" + this.stat.onDomLoad);
        }
        if (((int) Math.ceil((Math.random() * 100.0d) + 0.5d)) <= prw.getInstance().config.stat.resSample && !this.args.resStat.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, b> entry : this.args.resStat.entrySet()) {
                if (entry.getValue().end - entry.getValue().start >= prw.getInstance().config.stat.resTime) {
                    Map<String, String> utMap = entry.getValue().toUtMap();
                    utMap.put("url", entry.getKey());
                    jSONArray.put(new JSONObject(utMap));
                }
            }
            arrayList.add("resStat=" + jSONArray.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
