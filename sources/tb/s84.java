package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s84 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(301990086);
    }

    public static boolean a(String str, String str2, String str3, List<String> list, nk nkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("acc835d0", new Object[]{str, str2, str3, list, nkVar})).booleanValue();
        }
        if (TextUtils.equals(str2, str3)) {
            return true;
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            nkVar.a().put("missKey", str);
            nkVar.a().put("missMsg", "emptyValue");
            nkVar.a().put("prefetchValue", str2);
            nkVar.a().put("realValue", str3);
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            JSONObject parseObject2 = JSON.parseObject(str3);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (String str4 : parseObject.keySet()) {
                if (!TextUtils.isEmpty(str4) && (list == null || !list.contains(str4))) {
                    hashMap.put(str4, parseObject.get(str4));
                }
            }
            for (String str5 : parseObject2.keySet()) {
                if (!TextUtils.isEmpty(str5) && (list == null || !list.contains(str5))) {
                    hashMap2.put(str5, parseObject2.get(str5));
                }
            }
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                String str6 = (String) it.next();
                Object obj = hashMap.get(str6);
                Object obj2 = hashMap2.get(str6);
                if (obj == null || obj2 == null) {
                    it = it;
                } else {
                    it = it;
                    if (obj.getClass() != obj2.getClass()) {
                        nkVar.a().put("missKey", str6);
                        nkVar.a().put("missMsg", "diffType");
                        nkVar.a().put("prefetchValue", obj.getClass().toString());
                        nkVar.a().put("realValue", obj2.getClass().toString());
                        return false;
                    }
                }
                String str7 = "";
                if ((obj != null || obj2 == null || !obj2.equals(str7)) && (obj2 != null || obj == null || !obj.equals(str7))) {
                    if (!(obj == null || obj2 == null)) {
                        if (!a(str6, hashMap.get(str6).toString(), hashMap2.get(str6).toString(), list, nkVar)) {
                            return false;
                        }
                    }
                    nkVar.a().put("missKey", str6);
                    nkVar.a().put("missMsg", "diffType");
                    nkVar.a().put("prefetchValue", obj != null ? obj.getClass().toString() : str7);
                    HashMap<String, String> a2 = nkVar.a();
                    if (obj2 != null) {
                        str7 = obj2.getClass().toString();
                    }
                    a2.put("realValue", str7);
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            nkVar.a().put("missKey", str);
            nkVar.a().put("missMsg", "parseError");
            nkVar.a().put("prefetchValue", str2);
            nkVar.a().put("realValue", str3);
            th.printStackTrace();
            return false;
        }
    }
}
