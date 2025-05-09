package tb;

import android.text.TextUtils;
import com.alibaba.appmonitor.event.EventType;
import com.alibaba.appmonitor.sample.AlarmConfig;
import com.alibaba.appmonitor.sample.StatConfig;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class sa extends y1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static sa c = null;
    public static final String[] d = {"ap_stat", "ap_counter", "ap_alarm"};

    /* renamed from: a  reason: collision with root package name */
    public final Map<EventType, fa> f27896a = Collections.synchronizedMap(new HashMap(3));
    public int b;

    static {
        t2o.a(962593064);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sa() {
        EventType[] values;
        p();
        for (EventType eventType : EventType.values()) {
            Class<? extends rf8> cls = eventType.getCls();
            fa d2 = d(o2w.k().h().i(cls, null, "module,mp ASC ", -1));
            if (d2 == null) {
                try {
                    fa faVar = (fa) cls.newInstance();
                    try {
                        faVar.module = "event_type";
                        faVar.setSampling(eventType.getDefaultSampling());
                    } catch (Exception unused) {
                    }
                    d2 = faVar;
                } catch (Exception unused2) {
                }
            }
            this.f27896a.put(eventType, d2);
        }
    }

    public static sa h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sa) ipChange.ipc$dispatch("e3d0efae", new Object[0]);
        }
        if (c == null) {
            synchronized (sa.class) {
                try {
                    if (c == null) {
                        c = new sa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public static /* synthetic */ Object ipc$super(sa saVar, String str, Object... objArr) {
        if (str.hashCode() == 1219635554) {
            super.b((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/appmonitor/sample/AMSamplingMgr");
    }

    @Override // tb.y1v
    public String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f1114543", new Object[]{this});
        }
        return d;
    }

    @Override // tb.y1v
    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48b22962", new Object[]{this, str});
        } else {
            super.b(str);
        }
    }

    public boolean e(String str, String str2, Boolean bool, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5fb31848", new Object[]{this, str, str2, bool, map})).booleanValue();
        }
        return i(str, str2, bool, map);
    }

    public boolean f(EventType eventType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6417256", new Object[]{this, eventType, str, str2})).booleanValue();
        }
        return l(eventType, str, str2, null);
    }

    public boolean g(EventType eventType, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d773af7", new Object[]{this, eventType, str, str2, map})).booleanValue();
        }
        return l(eventType, str, str2, map);
    }

    public boolean i(String str, String str2, Boolean bool, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d5b18aea", new Object[]{this, str, str2, bool, map})).booleanValue();
        }
        fa faVar = this.f27896a.get(EventType.ALARM);
        if (faVar == null || !(faVar instanceof AlarmConfig)) {
            return false;
        }
        return ((AlarmConfig) faVar).isSampled(this.b, str, str2, bool, map);
    }

    public boolean j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dcb0d53a", new Object[]{this, str, str2})).booleanValue();
        }
        fa faVar = this.f27896a.get(EventType.STAT);
        if (faVar == null) {
            return false;
        }
        return ((StatConfig) faVar).isDetail(str, str2);
    }

    public boolean k(EventType eventType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48e967dd", new Object[]{this, eventType, str, str2})).booleanValue();
        }
        if (m(eventType, str, str2)) {
            return true;
        }
        fa faVar = this.f27896a.get(eventType);
        if (faVar != null) {
            return faVar.isOffline(str, str2);
        }
        return false;
    }

    public boolean l(EventType eventType, String str, String str2, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77d02999", new Object[]{this, eventType, str, str2, map})).booleanValue();
        }
        fa faVar = this.f27896a.get(eventType);
        if (faVar != null) {
            return faVar.isSampled(this.b, str, str2, map);
        }
        nhh.f("eventTypeSample  ==null", new Object[0]);
        return false;
    }

    public final fa n(Class<? extends fa> cls, JSONObject jSONObject) {
        fa faVar = null;
        try {
            fa faVar2 = (fa) cls.newInstance();
            try {
                if (jSONObject.containsKey("offline")) {
                    faVar2.offline = jSONObject.getString("offline");
                }
                if (jSONObject.containsKey(StatisticRecord.ET_CP)) {
                    faVar2.setSampling(jSONObject.getIntValue(StatisticRecord.ET_CP));
                }
                if (faVar2 instanceof AlarmConfig) {
                    AlarmConfig alarmConfig = (AlarmConfig) faVar2;
                    if (jSONObject.containsKey("scp")) {
                        alarmConfig.successSampling = jSONObject.getIntValue("scp");
                    }
                    if (jSONObject.containsKey("fcp")) {
                        alarmConfig.failSampling = jSONObject.getIntValue("fcp");
                    }
                    return alarmConfig;
                } else if (!(faVar2 instanceof StatConfig)) {
                    return faVar2;
                } else {
                    StatConfig statConfig = (StatConfig) faVar2;
                    if (!jSONObject.containsKey("detail")) {
                        return faVar2;
                    }
                    statConfig.detail = jSONObject.getIntValue("detail");
                    return faVar2;
                }
            } catch (Throwable unused) {
                faVar = faVar2;
                nhh.i("new AppMonitorConfig error", new Object[0]);
                return faVar;
            }
        } catch (Throwable unused2) {
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dbcda68", new Object[]{this});
        } else {
            this.b = new Random().nextInt(10000);
        }
    }

    public void o(EventType eventType, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("882a8efe", new Object[]{this, eventType, new Integer(i)});
            return;
        }
        fa faVar = this.f27896a.get(eventType);
        if (faVar != null) {
            faVar.setSampling(i);
        }
        nhh.f("setSampling end", new Object[0]);
    }

    public final fa d(List<fa> list) {
        fa faVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fa) ipChange.ipc$dispatch("aab0249f", new Object[]{this, list});
        }
        int size = list.size();
        int i = 0;
        while (i < size && !"event_type".equalsIgnoreCase(list.get(i).module)) {
            i++;
        }
        if (i < size) {
            faVar = list.remove(i);
            nhh.r("remove root element", new Object[0]);
        } else {
            nhh.r("cannot found the root element", new Object[0]);
            faVar = null;
        }
        if (faVar == null) {
            return null;
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            fa faVar2 = list.get(i2);
            if (TextUtils.isEmpty(faVar2.monitorPoint)) {
                faVar.add(faVar2.module, faVar2);
            } else {
                faVar.getOrBulidNext(faVar2.module).add(faVar2.monitorPoint, faVar2);
            }
        }
        return faVar;
    }

    public final boolean m(EventType eventType, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec4ec9a", new Object[]{this, eventType, str, str2})).booleanValue();
        }
        return eventType != null && eventType == EventType.COUNTER && u9p.module.equalsIgnoreCase(str) && (u9p.UPLOAD_TRAFFIC_OFFLINE.equalsIgnoreCase(str2) || u9p.TNET_REQUEST_SEND_OFFLINE.equalsIgnoreCase(str2));
    }

    @Override // tb.y1v
    public void c(String str, Map<String, String> map) {
        fa faVar;
        nhh.f("", "namespace", str, "config:", map);
        if (!hsq.e(str) && map != null) {
            ArrayList arrayList = new ArrayList();
            EventType eventTypeByNameSpace = EventType.getEventTypeByNameSpace(str);
            Class cls = eventTypeByNameSpace.getCls();
            try {
                if (map.containsKey("event_type")) {
                    faVar = n(cls, JSON.parseObject(map.get("event_type")));
                    map.remove("event_type");
                } else {
                    try {
                        faVar = (fa) cls.newInstance();
                        if (faVar instanceof AlarmConfig) {
                            AlarmConfig alarmConfig = (AlarmConfig) faVar;
                            alarmConfig.successSampling = eventTypeByNameSpace.getDefaultSampling();
                            alarmConfig.failSampling = eventTypeByNameSpace.getDefaultSampling();
                        } else {
                            faVar.setSampling(eventTypeByNameSpace.getDefaultSampling());
                        }
                    } catch (Throwable unused) {
                        return;
                    }
                }
                faVar.module = "event_type";
                for (String str2 : map.keySet()) {
                    JSONObject parseObject = JSON.parseObject(map.get(str2));
                    if (parseObject != null) {
                        fa n = n(cls, parseObject);
                        n.module = str2;
                        JSONObject jSONObject = parseObject.getJSONObject("mps");
                        if (jSONObject != null) {
                            for (String str3 : jSONObject.keySet()) {
                                fa n2 = n(cls, jSONObject.getJSONObject(str3));
                                n2.module = str2;
                                n2.monitorPoint = str3;
                                n.add(str3, n2);
                                arrayList.add(n2);
                            }
                        }
                        faVar.add(str2, n);
                        arrayList.add(n);
                    }
                }
                arrayList.add(faVar);
                this.f27896a.put(eventTypeByNameSpace, faVar);
                o2w.k().h().b(faVar.getClass());
                o2w.k().h().o(arrayList);
            } catch (Throwable th) {
                nhh.i("", "parse config error", th);
            }
        }
    }
}
