package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.msoa.annotation.MSOAServiceDefinition;
import com.taobao.codetrack.sdk.assets.AssetsDelegate;
import com.taobao.tao.Globals;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.ldp;
import tb.trh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class odp {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, Class> f25318a;
    public static Map<String, ldp> b;
    public static Map<String, List<String>> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f25319a;

        public a(c cVar) {
            this.f25319a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            odp.b(odp.j());
            odp.c(odp.h());
            odp.d(odp.e(odp.a()));
            c cVar = this.f25319a;
            if (cVar != null) {
                ((trh.a) cVar).a();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Comparator<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public int compare(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b88f5f3", new Object[]{this, str, str2})).intValue();
            }
            return str.compareTo(str2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
    }

    static {
        HashMap hashMap = new HashMap();
        f25318a = hashMap;
        hashMap.put("int", Integer.TYPE);
        hashMap.put("long", Long.TYPE);
        hashMap.put("boolean", Boolean.TYPE);
        hashMap.put("float", Float.TYPE);
        hashMap.put("double", Double.TYPE);
        hashMap.put("byte", Byte.TYPE);
        hashMap.put("char", Character.TYPE);
        hashMap.put("short", Short.TYPE);
    }

    public static /* synthetic */ Map a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c8ee3d6c", new Object[0]);
        }
        return b;
    }

    public static /* synthetic */ Map b(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("6d458921", new Object[]{map});
        }
        b = map;
        return map;
    }

    public static /* synthetic */ Map c(Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("e184c180", new Object[]{map});
        }
        c = map;
        return map;
    }

    public static /* synthetic */ String d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5c6713b", new Object[]{str});
        }
        return str;
    }

    public static String e(Map<String, ldp> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("89abf49a", new Object[]{map});
        }
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if (map == null) {
            return null;
        }
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList, new b());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(";");
        }
        return doh.d(sb.toString());
    }

    public static boolean f(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("14f7ad9d", new Object[]{str, str2})).booleanValue();
        }
        if ("msoa.taobao.privilege.weex".equals(str) || "msoa.taobao.privilege.windvane".equals(str)) {
            return true;
        }
        if (str2 != null && str2.startsWith("msoa.taobao.detail.showsku")) {
            return true;
        }
        Map<String, List<String>> map = c;
        if (map == null || !map.containsKey(str) || !c.get(str).contains(str2)) {
            return false;
        }
        return true;
    }

    public static boolean g(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("baf4625d", new Object[]{new Integer(i), str})).booleanValue();
        }
        Map<String, ldp> map = b;
        if (map == null || (i & map.get(str).i) <= 0) {
            return false;
        }
        return true;
    }

    public static Map<String, List<String>> h() {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c29dbe78", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "msoac.json")));
                } catch (FileNotFoundException unused) {
                    bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "c_backup.json")));
                }
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
                String sb2 = sb.toString();
                if (!TextUtils.isEmpty(sb2) && (parseArray = JSON.parseArray(sb2)) != null && parseArray.size() > 0) {
                    for (int i = 0; i < parseArray.size(); i++) {
                        JSONObject jSONObject = parseArray.getJSONObject(i);
                        if (jSONObject != null) {
                            String string = jSONObject.getString("bizName");
                            JSONArray jSONArray = jSONObject.getJSONArray("serviceDependency");
                            if (jSONArray != null && jSONArray.size() > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                    if (jSONObject2 != null) {
                                        String string2 = jSONObject2.getString("serviceId");
                                        String string3 = jSONObject2.getString("version");
                                        arrayList.add(string2 + "@" + string3);
                                    }
                                }
                                concurrentHashMap.put(string, arrayList);
                            }
                        }
                    }
                }
                bufferedReader.close();
            } catch (Exception unused2) {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (Throwable th) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return concurrentHashMap;
    }

    public static void i(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbfad9f", new Object[]{cVar});
        } else {
            AsyncTask.execute(new a(cVar));
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01bd -> B:84:0x01c9). Please submit an issue!!! */
    public static Map<String, ldp> j() {
        JSONArray parseArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8228d7b3", new Object[0]);
        }
        StringBuilder sb = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "msoap.json")));
                    } catch (FileNotFoundException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(AssetsDelegate.proxy_open(Globals.getApplication().getAssets(), "p_backup.json")));
                    }
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(sb2) && (parseArray = JSON.parseArray(sb2)) != null && parseArray.size() > 0) {
                        for (int i = 0; i < parseArray.size(); i++) {
                            JSONObject jSONObject = parseArray.getJSONObject(i);
                            if (jSONObject != null) {
                                jSONObject.getString("bizName");
                                JSONArray jSONArray = jSONObject.getJSONArray("services");
                                if (jSONArray != null && jSONArray.size() > 0) {
                                    for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                        if (jSONObject2 != null) {
                                            ldp ldpVar = new ldp();
                                            ldpVar.f23275a = jSONObject2.getString("serviceId");
                                            ldpVar.b = jSONObject2.getString("version");
                                            JSONObject jSONObject3 = jSONObject2.getJSONObject("provider");
                                            if (jSONObject3 != null) {
                                                ldpVar.c = jSONObject3.getString("className");
                                                ldpVar.d = jSONObject3.getString("action");
                                                ldpVar.e = jSONObject3.getString("func");
                                                ldpVar.f = jSONObject3.getBoolean("needTimeout") == null ? false : jSONObject3.getBoolean("needTimeout").booleanValue();
                                                ldpVar.j = jSONObject3.getString("type");
                                                ldpVar.l = jSONObject3.getString("bundleName");
                                                ldpVar.k = jSONObject3.getString("implClassName");
                                            }
                                            int intValue = jSONObject2.getIntValue("platform");
                                            ldpVar.i = intValue;
                                            if (intValue == 0) {
                                                ldpVar.i = MSOAServiceDefinition.Platform.ALL.value();
                                            }
                                            JSONArray jSONArray2 = jSONObject2.getJSONArray("params");
                                            if (jSONArray2 != null && jSONArray2.size() > 0) {
                                                ldpVar.g = new ArrayList();
                                                ldpVar.h = new Class[jSONArray2.size()];
                                                for (int i3 = 0; i3 < jSONArray2.size(); i3++) {
                                                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i3);
                                                    if (jSONObject4 != null) {
                                                        ldp.a aVar = new ldp.a();
                                                        aVar.f23276a = jSONObject4.getString("name");
                                                        String string = jSONObject4.getString("type");
                                                        Map<String, Class> map = f25318a;
                                                        if (((HashMap) map).containsKey(string)) {
                                                            Class cls = (Class) ((HashMap) map).get(string);
                                                            aVar.b = cls;
                                                            ldpVar.h[i3] = cls;
                                                        } else {
                                                            try {
                                                                aVar.b = Class.forName(string);
                                                            } catch (ClassNotFoundException unused2) {
                                                                aVar.b = vf1.a(ldpVar.l, string);
                                                            }
                                                            ldpVar.h[i3] = aVar.b;
                                                        }
                                                        ((ArrayList) ldpVar.g).add(aVar);
                                                    }
                                                }
                                            }
                                            concurrentHashMap.put(ldpVar.f23275a + "@" + ldpVar.b, ldpVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    bufferedReader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                }
            } catch (Throwable th) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return concurrentHashMap;
    }

    public static ldp k(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ldp) ipChange.ipc$dispatch("b5fa3990", new Object[]{str});
        }
        Map<String, ldp> map = b;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
