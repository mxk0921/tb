package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import com.taobao.wireless.link.assistant.jsbridge.AssistantPermissionJsBridge;
import com.taobao.wireless.link.model.ActivityOutTime;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class lh8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements xrg {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f23337a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ qgf c;
        public final /* synthetic */ String d;
        public final /* synthetic */ Map e;

        public a(Context context, Map map, qgf qgfVar, String str, Map map2) {
            this.f23337a = context;
            this.b = map;
            this.c = qgfVar;
            this.d = str;
            this.e = map2;
        }

        @Override // tb.xrg
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bdd26f3", new Object[]{this, jSONObject});
                return;
            }
            irg.a("link_tag", "EquityCenter === callEquity2Server: onSuccess：" + jSONObject);
            try {
                Map<String, Object> s = jsg.s(jSONObject);
                lh8.a(this.f23337a, s, this.b);
                qgf qgfVar = this.c;
                if (qgfVar != null) {
                    ((AssistantPermissionJsBridge.b) qgfVar).a(true, s);
                }
            } catch (Exception e) {
                irg.a("link_tag", "EquityCenter === callEquity2Server: onSuccess：解析返回数据异常=" + e.getMessage());
            }
            esg.b(esg.ARG1_ASSISTANT_REQUEST_SUCCESS, this.d, this.e.toString(), new HashMap());
        }

        @Override // tb.xrg
        public void b(JSONObject jSONObject, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29c4da98", new Object[]{this, jSONObject, str});
                return;
            }
            irg.b("link_tag", "EquityCenter === callEquity2Server: onError：" + jSONObject + " === retMsg=" + str);
            qgf qgfVar = this.c;
            if (qgfVar != null) {
                ((AssistantPermissionJsBridge.b) qgfVar).a(false, new HashMap());
            }
            esg.b(esg.ARG1_ASSISTANT_REQUEST_FAIL, this.d, this.e.toString(), new HashMap());
        }
    }

    static {
        t2o.a(1030750231);
    }

    public static /* synthetic */ void a(Context context, Map map, Map map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d2b41d1", new Object[]{context, map, map2});
        } else {
            e(context, map, map2);
        }
    }

    public static void c(Context context, List<String> list, Map<String, String> map, qgf qgfVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18360d35", new Object[]{context, list, map, qgfVar});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("activityId", d(list));
        hashMap.put("uid", Login.getUserId());
        hashMap.put("utdid", UTDevice.getUtdid(context));
        if (md1.h().d == null) {
            str = "";
        } else {
            str = JSON.toJSONString(md1.h().d);
        }
        hashMap.put("ext", str);
        irg.a("link_tag", "EquityCenter === callEquity2Server === 请求参数" + hashMap.toString());
        zpg.b().d(zpg.ASSISTANT_API, "1.0", hashMap, false, false, false, new a(context, map, qgfVar, md1.h().f(context), hashMap));
    }

    public static String d(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5dd3d3a8", new Object[]{list});
        }
        if (list == null || list.size() == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
            sb.append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static void e(Context context, Map<String, Object> map, Map<String, String> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b8965dc", new Object[]{context, map, map2});
            return;
        }
        if (map != null && map.size() > 0) {
            Set<String> keySet = map.keySet();
            if (keySet.size() > 0) {
                for (String str : keySet) {
                    for (String str2 : map2.keySet()) {
                        if (TextUtils.equals(str, str2)) {
                            map2.put(str2, (String) map.get(str));
                        }
                    }
                }
            }
        }
        qd1.s(cno.b(context), map2, qd1.k(context));
        irg.a("link_tag", "EquityCenter === refreshActivityId === 更新后的id集合" + map2.toString());
    }

    public static void b(Context context, Map<String, String> map, qgf qgfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("615f6997", new Object[]{context, map, qgfVar});
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<ActivityOutTime> list = qd1.c(context).activities;
        if (list == null) {
            irg.a("link_tag", "EquityCenter === callEquity === 获取到的过期时间配置为空，不请求接口");
            return;
        }
        for (ActivityOutTime activityOutTime : list) {
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> next = it.next();
                String key = next.getKey();
                String value = next.getValue();
                if (TextUtils.equals(activityOutTime.id, key)) {
                    if (!qd1.n(activityOutTime.outTime)) {
                        it.remove();
                    } else if (TextUtils.equals(value, "true")) {
                        arrayList.add(key);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            if (qgfVar != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("local", "true");
                ((AssistantPermissionJsBridge.b) qgfVar).a(false, hashMap);
            }
            irg.a("link_tag", "EquityCenter === callEquity === 没有需要请求的id=" + arrayList);
            return;
        }
        irg.a("link_tag", "EquityCenter === callEquity === 请求接口list=" + arrayList);
        c(context, arrayList, map, qgfVar);
    }
}
