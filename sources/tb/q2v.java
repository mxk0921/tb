package tb;

import com.alipay.sdk.app.statistic.StatisticRecord;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class q2v extends y1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static q2v d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f26472a;
    public final Random b;
    public final Map<String, b> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public int f26473a;
        public Map<String, Integer> b;

        static {
            t2o.a(962592850);
        }

        public b() {
            this.f26473a = 0;
            this.b = new HashMap();
        }

        public static /* synthetic */ int a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9203e18e", new Object[]{bVar, new Integer(i)})).intValue();
            }
            bVar.f26473a = i;
            return i;
        }

        public static /* synthetic */ Map b(b bVar, Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("82d5bbf1", new Object[]{bVar, map});
            }
            bVar.b = map;
            return map;
        }

        public boolean c(String str, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("eb5f67c7", new Object[]{this, str, new Integer(i)})).booleanValue();
            }
            if (str != null) {
                try {
                    for (Map.Entry<String, Integer> entry : this.b.entrySet()) {
                        String key = entry.getKey();
                        int intValue = entry.getValue().intValue();
                        if (!key.startsWith(f7l.MOD) || !key.endsWith(f7l.MOD)) {
                            if (str.equals(key)) {
                                return d(intValue, i);
                            }
                        } else if (str.contains(key.substring(1, key.length() - 1))) {
                            return d(intValue, i);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            return d(this.f26473a, i);
        }

        public final boolean d(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("748c27e4", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
            }
            if (i != 0 && i2 < i) {
                return true;
            }
            return false;
        }
    }

    static {
        t2o.a(962592848);
    }

    public q2v() {
        this.f26472a = 0;
        this.b = null;
        this.c = null;
        String utdid = UTDevice.getUtdid(o2w.k().g());
        if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
            this.f26472a = 0;
        } else {
            this.f26472a = Math.abs(hsq.d(utdid)) % 10000;
        }
        nhh.f("UTSampleConfBiz", "deviceSample", Integer.valueOf(this.f26472a));
        this.b = new Random();
        this.c = new HashMap();
    }

    public static q2v d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q2v) ipChange.ipc$dispatch("609e4524", new Object[0]);
        }
        if (d == null) {
            d = new q2v();
        }
        return d;
    }

    public static b h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("548c4338", new Object[]{str});
        }
        try {
            b bVar = new b();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(StatisticRecord.ET_CP)) {
                b.a(bVar, jSONObject.optInt(StatisticRecord.ET_CP));
            }
            if (jSONObject.has("arg1")) {
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject = jSONObject.optJSONObject("arg1");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, Integer.valueOf(Integer.parseInt(optJSONObject.optString(next))));
                    }
                }
                b.b(bVar, hashMap);
            }
            return bVar;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static /* synthetic */ Object ipc$super(q2v q2vVar, String str, Object... objArr) {
        if (str.hashCode() == 1219635554) {
            super.b((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/config/UTSampleConfBiz");
    }

    @Override // tb.y1v
    public String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f1114543", new Object[]{this});
        }
        return new String[]{"ut_sample"};
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

    @Override // tb.y1v
    public synchronized void c(String str, Map<String, String> map) {
        b h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5217cb94", new Object[]{this, str, map});
            return;
        }
        ((HashMap) this.c).clear();
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (!(str3 == null || (h = h(str3)) == null)) {
                ((HashMap) this.c).put(str2, h);
            }
        }
    }

    public final int e(int i, String str, int i2) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0e08176", new Object[]{this, new Integer(i), str, new Integer(i2)})).intValue();
        }
        String valueOf = String.valueOf(i);
        if (!((HashMap) this.c).containsKey(valueOf) || (bVar = (b) ((HashMap) this.c).get(valueOf)) == null) {
            return 0;
        }
        if (bVar.c(str, i2)) {
            return 1;
        }
        return -1;
    }

    public synchronized boolean f(int i, String str) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8b2ce75b", new Object[]{this, new Integer(i), str})).booleanValue();
        } else if (o2w.k().j()) {
            return true;
        } else {
            if (((HashMap) this.c).size() == 0) {
                return true;
            }
            if (i == 19998 || i == 19997) {
                i2 = this.f26472a;
            } else {
                i2 = this.b.nextInt(10000);
            }
            int e = e(i, str, i2);
            if (e == 1) {
                return true;
            }
            if (e == -1) {
                return false;
            }
            int e2 = e(i - (i % 10), str, i2);
            if (e2 == 1) {
                return true;
            }
            if (e2 == -1) {
                return false;
            }
            int e3 = e(i - (i % 100), str, i2);
            if (e3 == 1) {
                return true;
            }
            if (e3 == -1) {
                return false;
            }
            int e4 = e(i - (i % 1000), str, i2);
            if (e4 == 1) {
                return true;
            }
            if (e4 == -1) {
                return false;
            }
            int e5 = e(-1, str, i2);
            if (e5 == 1) {
                return true;
            }
            return e5 == -1 ? false : false;
        }
    }

    public synchronized boolean g(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7daf5d3", new Object[]{this, map})).booleanValue();
        }
        try {
            return f(Integer.parseInt(map.get(oeh.EVENTID)), map.get(oeh.ARG1));
        } catch (Exception e) {
            nhh.h("UTSampleConfBiz", e, new Object[0]);
            return false;
        }
    }
}
