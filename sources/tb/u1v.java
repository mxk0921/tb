package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.sdk.m.f.b;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.mtop.UTMtopConfig;
import com.ut.mini.mtop.UTMtopPageValue;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class u1v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Map<String, b2v>> f29081a = new ConcurrentHashMap();
    public static final Map<String, String> b = new ConcurrentHashMap();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String val$data;

        public a(String str) {
            this.val$data = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                u1v.parseConfigData(this.val$data);
            }
        }
    }

    static {
        t2o.a(962593330);
    }

    public static Map<String, String> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9ce26bf8", new Object[]{str});
        }
        Map map = (Map) ((ConcurrentHashMap) f29081a).get(str);
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String b2 = b((b2v) entry.getValue());
            if (!c(str2) && !c(b2)) {
                hashMap.put(str2, b2);
            }
        }
        return hashMap;
    }

    public static void activateMtopConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff82b34e", new Object[]{str});
        } else {
            zdt.c().f(new a(str));
        }
    }

    public static String b(b2v b2vVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("64b42f8c", new Object[]{b2vVar});
        }
        if (b2vVar == null) {
            return null;
        }
        List<String> list = b2vVar.valueList;
        if (d(list)) {
            return null;
        }
        String str = b2vVar.separator;
        StringBuilder sb = new StringBuilder();
        for (String str2 : list) {
            if (z) {
                sb.append(str2);
                z = false;
            } else {
                sb.append(str);
                sb.append(str2);
            }
        }
        return sb.toString();
    }

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4a300898", new Object[]{str})).booleanValue();
        }
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static boolean d(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a436963f", new Object[]{list})).booleanValue();
        }
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean e(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("489e80ff", new Object[]{map})).booleanValue();
        }
        if (map == null || map.size() == 0) {
            return true;
        }
        return false;
    }

    public static boolean f(b2v b2vVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2dfe9043", new Object[]{b2vVar, str})).booleanValue();
        }
        if (b2vVar.valueList.contains(str)) {
            return false;
        }
        b2vVar.valueList.add(str);
        return true;
    }

    public static String getUtparamCnt(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ea947de", new Object[]{str});
        }
        if (c(str)) {
            return null;
        }
        try {
            return (String) ((ConcurrentHashMap) b).get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void parseConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f758f4a6", new Object[]{str});
        } else if (!c(str)) {
            try {
                Map map = (Map) JSON.parseObject(str, Map.class);
                if (!e(map)) {
                    Object obj = map.get(b.c);
                    if (obj instanceof List) {
                        List<JSONObject> list = (List) obj;
                        synchronized (u1v.class) {
                            for (JSONObject jSONObject : list) {
                                UTMtopConfig uTMtopConfig = (UTMtopConfig) JSON.toJavaObject(jSONObject, UTMtopConfig.class);
                                List<UTMtopPageValue> list2 = uTMtopConfig.pageValueList;
                                if (!d(list2)) {
                                    String str2 = uTMtopConfig.key;
                                    String str3 = uTMtopConfig.separator;
                                    for (UTMtopPageValue uTMtopPageValue : list2) {
                                        String str4 = uTMtopPageValue.page;
                                        List<String> list3 = uTMtopPageValue.valueList;
                                        if (!c(str4) && !d(list3)) {
                                            Map<String, Map<String, b2v>> map2 = f29081a;
                                            b2v b2vVar = null;
                                            Map map3 = ((ConcurrentHashMap) map2).containsKey(str4) ? (Map) ((ConcurrentHashMap) map2).get(str4) : null;
                                            if (map3 == null) {
                                                map3 = new ConcurrentHashMap();
                                                ((ConcurrentHashMap) map2).put(str4, map3);
                                            }
                                            if (map3.containsKey(str2)) {
                                                b2vVar = (b2v) map3.get(str2);
                                            }
                                            if (b2vVar == null) {
                                                b2vVar = new b2v();
                                                b2vVar.separator = str3;
                                                map3.put(str2, b2vVar);
                                            }
                                            boolean z = false;
                                            for (String str5 : list3) {
                                                if (f(b2vVar, str5)) {
                                                    z = true;
                                                }
                                            }
                                            if (z) {
                                                Map<String, String> a2 = a(str4);
                                                if (!e(a2)) {
                                                    String jSONString = JSON.toJSONString(a2);
                                                    if (!c(str4)) {
                                                        ((ConcurrentHashMap) b).put(str4, jSONString);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void parseConfigData(String str) {
        byte[] b2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909af270", new Object[]{str});
            return;
        }
        try {
            nhh.f("UTMtopConfigMgr", "parseConfigData", str);
            byte[] a2 = tp1.a(str.getBytes("UTF-8"), 2);
            if (a2 != null && (b2 = foa.b(a2)) != null) {
                parseConfig(new String(b2, 0, b2.length));
            }
        } catch (Throwable unused) {
        }
    }
}
