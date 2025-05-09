package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class u5t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final u5t INSTANCE = new u5t();

    static {
        t2o.a(1010827406);
    }

    public final void a(String str, Map<String, ? extends Object> map, l0g l0gVar) {
        Object obj;
        String a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58785332", new Object[]{this, str, map, l0gVar});
            return;
        }
        ckf.g(l0gVar, "resultOriginData");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("subtype", z9u.SOURCE_UPDOWNSWITCH);
        linkedHashMap.put("responseType", "live");
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        linkedHashMap.put("errorCode", str);
        if (map == null || (obj = map.get("entryLiveSource")) == null) {
            obj = str2;
        }
        linkedHashMap.put("entryLiveSource", obj.toString());
        linkedHashMap.put(c4o.KEY_DATA_SOURCE, "mtop");
        m0g e = l0gVar.e();
        if (!(e == null || (a2 = e.a()) == null)) {
            str2 = a2;
        }
        linkedHashMap.put("traceId", str2);
        rwt.d("live_recommendation_abnormal", "Page_TaobaoLiveWatch", linkedHashMap);
    }

    public final void b(String str, Integer num, Integer num2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54f0474a", new Object[]{this, str, num, num2, new Integer(i)});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("dupLiveId", str);
        linkedHashMap.put("dupIndex", String.valueOf(num));
        linkedHashMap.put("count", String.valueOf(num2));
        linkedHashMap.put("currentIndex", String.valueOf(i));
        ivs.INSTANCE.track4Click("Page_TaobaoLiveWatch", "upDownSwitchRealtimeRepeat", linkedHashMap);
    }
}
