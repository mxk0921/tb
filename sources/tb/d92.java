package tb;

import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d92 implements c92 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, List<gjw>> f17660a = new ConcurrentHashMap();
    public SharedPreferences b;

    static {
        t2o.a(329252965);
        t2o.a(329252964);
    }

    public static String f(Map<String, List<gjw>> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd5eea36", new Object[]{map});
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, List<gjw>> entry : map.entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArray = new JSONArray();
            for (gjw gjwVar : entry.getValue()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("count", (Object) Integer.valueOf(gjwVar.b));
                jSONObject2.put("name", (Object) gjwVar.c);
                jSONObject2.put("path", (Object) gjwVar.f20050a);
                jSONArray.add(jSONObject2);
            }
            jSONObject.put(key, (Object) jSONArray);
        }
        return jSONObject.toJSONString();
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b42d4c58", new Object[]{this})).booleanValue();
        }
        if (this.b == null) {
            return false;
        }
        return e(Collections.emptyList());
    }

    public List<gjw> b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("12d156f9", new Object[]{this, str});
        }
        if (((ConcurrentHashMap) this.f17660a).containsKey(str)) {
            return (List) ((ConcurrentHashMap) this.f17660a).get(str);
        }
        return Collections.emptyList();
    }

    public boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f96713af", new Object[]{this, str})).booleanValue();
        }
        if (((ConcurrentHashMap) this.f17660a).containsKey(str)) {
            if (((ConcurrentHashMap) this.f17660a).size() > 1) {
                return true;
            }
            return false;
        } else if (((ConcurrentHashMap) this.f17660a).size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean h(String str, String str2) {
        ArrayList arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a8189e7", new Object[]{this, str, str2})).booleanValue();
        }
        String b = ku6.b();
        gjw a2 = gjw.a(str2, str);
        if (((ConcurrentHashMap) this.f17660a).containsKey(b)) {
            List list = (List) ((ConcurrentHashMap) this.f17660a).get(b);
            if (list != null) {
                int indexOf = list.indexOf(a2);
                if (indexOf == -1) {
                    list.add(a2);
                    arrayList = list;
                } else {
                    ((gjw) list.get(indexOf)).b++;
                    arrayList = list;
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(a2);
                arrayList = arrayList2;
            }
            ((ConcurrentHashMap) this.f17660a).put(b, arrayList);
        } else {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(a2);
            ((ConcurrentHashMap) this.f17660a).put(b, arrayList3);
        }
        this.b.edit().putString(q5c.HISTORY, f(this.f17660a)).apply();
        return true;
    }

    public void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("tschedule_history", 0);
        this.b = sharedPreferences;
        String string = sharedPreferences.getString(q5c.HISTORY, null);
        if (string != null && string.length() > 0) {
            ((ConcurrentHashMap) this.f17660a).putAll(g(string));
        }
    }

    public static Map<String, List<gjw>> g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aa1d2d74", new Object[]{str});
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, Object> entry : ((JSONObject) JSON.parse(str)).entrySet()) {
            String key = entry.getKey();
            JSONArray jSONArray = (JSONArray) entry.getValue();
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.size(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                    arrayList.add(gjw.b(jSONObject.getString("path"), jSONObject.getIntValue("count"), jSONObject.getString("name")));
                }
                hashMap.put(key, arrayList);
            }
        }
        return hashMap;
    }

    public boolean e(List<String> list) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7438e8f", new Object[]{this, list})).booleanValue();
        }
        Iterator it = ((ConcurrentHashMap) this.f17660a).keySet().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!list.contains(str)) {
                zdh.a("DefaultBehaviorStorage", "recycle, remove :" + str);
                it.remove();
                if (!z) {
                    z = true;
                }
            }
        }
        if (z) {
            String f = f(this.f17660a);
            SharedPreferences sharedPreferences = this.b;
            if (sharedPreferences != null) {
                sharedPreferences.edit().putString(q5c.HISTORY, f).apply();
            }
        }
        return true;
    }
}
