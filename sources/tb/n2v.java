package tb;

import android.text.TextUtils;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0139;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.audid.Constants;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n2v extends y1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static n2v e = null;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, a> f24477a = new HashMap();
    public int b = 10;
    public int c = 0;
    public int d = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Map<String, String> f24478a = new HashMap();
        public Map<String, String> b = new HashMap();
        public Map<String, String> c = new HashMap();
        public int d = 0;

        static {
            t2o.a(962592847);
        }

        public static Map<String, String> b(JSONObject jSONObject, String str) {
            JSONObject optJSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("9fd67c53", new Object[]{jSONObject, str});
            }
            HashMap hashMap = new HashMap();
            if (jSONObject.has(str) && (optJSONObject = jSONObject.optJSONObject(str)) != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.optString(next));
                }
            }
            return hashMap;
        }

        public static a d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4b5e0460", new Object[]{str});
            }
            try {
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("tp")) {
                    aVar.d = n2v.d(jSONObject.optString("tp"));
                }
                aVar.f24478a = b(jSONObject, "pg");
                aVar.b = b(jSONObject, "arg1");
                aVar.c = b(jSONObject, "arg2");
                return aVar;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public int a(String str, String str2, String str3) {
            String c;
            String c2;
            String c3;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3b8048c", new Object[]{this, str, str2, str3})).intValue();
            }
            if (!hsq.f(str3) && (c3 = c(this.c, str3)) != null) {
                return n2v.d(c3);
            }
            if (!hsq.f(str) && (c2 = c(this.f24478a, str)) != null) {
                return n2v.d(c2);
            }
            if (hsq.f(str2) || (c = c(this.b, str2)) == null) {
                return this.d;
            }
            return n2v.d(c);
        }

        public final String c(Map<String, String> map, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c0e9f5dc", new Object[]{this, map, str});
            }
            if (str == null) {
                return null;
            }
            for (String str2 : map.keySet()) {
                if (!str2.startsWith(f7l.MOD) || !str2.endsWith(f7l.MOD)) {
                    if (str.equals(str2)) {
                        return map.get(str2);
                    }
                } else if (str.contains(str2.substring(1, str2.length() - 1))) {
                    return map.get(str2);
                }
            }
            return null;
        }
    }

    static {
        t2o.a(962592846);
    }

    public static /* synthetic */ int d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38fae174", new Object[]{str})).intValue();
        }
        return e(str);
    }

    public static int e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("de08d0b4", new Object[]{str})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception e2) {
            nhh.f("", e2);
            return 0;
        }
    }

    public static n2v g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n2v) ipChange.ipc$dispatch("7623c065", new Object[0]);
        }
        if (e == null) {
            e = new n2v();
        }
        return e;
    }

    public static /* synthetic */ Object ipc$super(n2v n2vVar, String str, Object... objArr) {
        if (str.hashCode() == 1219635554) {
            super.b((String) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/analytics/core/config/UTRealtimeConfBiz");
    }

    @Override // tb.y1v
    public String[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("f1114543", new Object[]{this});
        }
        return new String[]{"ut_realtime"};
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

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5c0c26d8", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final int h(String str, String str2, String str3, String str4) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9cd89a16", new Object[]{this, str, str2, str3, str4})).intValue();
        }
        if (TextUtils.isEmpty(str) || !((HashMap) this.f24477a).containsKey(str) || (aVar = (a) ((HashMap) this.f24477a).get(str)) == null) {
            return 0;
        }
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4)) {
            return aVar.a(str2, str3, str4);
        }
        return 0;
    }

    public synchronized int i(Map<String, String> map) {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e41c391d", new Object[]{this, map})).intValue();
        }
        String str3 = "";
        if (map.containsKey(oeh.EVENTID)) {
            str3 = map.get(oeh.EVENTID);
        }
        String str4 = null;
        if (map.containsKey("PAGE")) {
            str = map.get("PAGE");
        } else {
            str = null;
        }
        if (map.containsKey(oeh.ARG1)) {
            str2 = map.get(oeh.ARG1);
        } else {
            str2 = null;
        }
        if (map.containsKey(oeh.ARG2)) {
            str4 = map.get(oeh.ARG2);
        }
        return h(str3, str, str2, str4);
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcb1628c", new Object[]{this})).booleanValue();
        }
        if (o2w.k().L() || o2w.k().H() || o2w.k().D()) {
            return true;
        }
        return false;
    }

    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("575d5ba5", new Object[]{this});
            return;
        }
        ((HashMap) this.f24477a).clear();
        this.b = 10;
        this.c = 0;
    }

    public boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ec9389b6", new Object[]{this})).booleanValue();
        }
        if (j()) {
            return false;
        }
        if (o2w.k().j()) {
            return true;
        }
        if (this.d == -1) {
            String utdid = UTDevice.getUtdid(o2w.k().g());
            if (utdid == null || utdid.equals(Constants.UTDID_INVALID)) {
                return false;
            }
            this.d = Math.abs(hsq.d(utdid));
        }
        nhh.r("", "hashcode", Integer.valueOf(this.d), C0139.f207, Integer.valueOf(this.c));
        return this.d % 10000 < this.c;
    }

    @Override // tb.y1v
    public synchronized void c(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5217cb94", new Object[]{this, str, map});
            return;
        }
        nhh.f("", "aGroupname", str, "aConfContent", map);
        l();
        for (String str2 : map.keySet()) {
            String str3 = map.get(str2);
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                if (str2.equals("time")) {
                    int e2 = e(str3);
                    if (e2 >= 3 && e2 <= 20) {
                        this.b = e2;
                    }
                } else if (str2.equals(C0139.f207)) {
                    int e3 = e(str3);
                    if (e3 >= 0 && e3 <= 10000) {
                        this.c = e3;
                    }
                } else {
                    a d = a.d(str3);
                    if (d != null) {
                        ((HashMap) this.f24477a).put(str2, d);
                    }
                }
            }
        }
    }
}
