package tb;

import com.alibaba.analytics.core.config.UTDBConfigEntity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class n0v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(962592834);
    }

    public static final Map<String, String> a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("87499fe4", new Object[]{jSONObject});
        }
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject.getString(next);
                if (!(next == null || string == null)) {
                    hashMap.put(next, string);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return hashMap;
    }

    public static UTDBConfigEntity b(String str, Map<String, String> map, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UTDBConfigEntity) ipChange.ipc$dispatch("50b066d0", new Object[]{str, map, new Long(j)});
        }
        UTDBConfigEntity uTDBConfigEntity = new UTDBConfigEntity();
        uTDBConfigEntity.setConfContent(hsq.i(map));
        uTDBConfigEntity.setGroupname(str);
        uTDBConfigEntity.setConfTimestamp(j);
        return uTDBConfigEntity;
    }

    public static List<UTDBConfigEntity> c(JSONObject jSONObject) {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("369177bd", new Object[]{jSONObject});
        }
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2 = jSONObject.getJSONObject(next);
            } catch (JSONException e) {
                e.printStackTrace();
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                try {
                    jSONObject3 = jSONObject2.getJSONObject("content");
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject3 = null;
                }
                if (jSONObject3 != null) {
                    linkedList.add(b(next, a(jSONObject3), 1L));
                }
            }
        }
        return linkedList;
    }
}
