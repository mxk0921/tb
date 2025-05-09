package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.uniinfra_kmp.common_utils.app.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class iqz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final iqz INSTANCE = new iqz();

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, ? extends Object> f21516a = new LinkedHashMap();
    public static g1a<? super Map<String, ? extends Object>, xhv> b;

    static {
        t2o.a(1010827415);
    }

    public final ziv a(TaoLiveKtSwitchModel taoLiveKtSwitchModel, String str, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ziv) ipChange.ipc$dispatch("51209650", new Object[]{this, taoLiveKtSwitchModel, str, map, map2});
        }
        ziv zivVar = new ziv();
        zivVar.h("true");
        String str2 = null;
        zivVar.d(taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getLiveId() : null);
        zivVar.b(str);
        zivVar.c(taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getAccountId() : null);
        Map<String, ? extends Object> map3 = f21516a;
        zivVar.i(String.valueOf(map3 != null ? map3.get("source") : null));
        zivVar.j(map2 != null ? xrf.c(map2) : null);
        if (a.g()) {
            Object obj = map != null ? map.get("mockUserId") : null;
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        zivVar.e(str2);
        return zivVar;
    }

    public final void c(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df57873f", new Object[]{this, map});
        } else {
            f21516a = map;
        }
    }

    public final void d(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0cdea8", new Object[]{this, g1aVar});
        } else {
            b = g1aVar;
        }
    }

    public final Map<String, Object> b(String str, TaoLiveKtSwitchModel taoLiveKtSwitchModel, Integer num, Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3172120", new Object[]{this, str, taoLiveKtSwitchModel, num, map});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ? extends Object> map2 = f21516a;
        Integer num2 = null;
        linkedHashMap.put(zlr.PARAM_ENTRY_LIVE_ID, map2 != null ? map2.get(zlr.PARAM_ENTRY_LIVE_ID) : null);
        Map<String, ? extends Object> map3 = f21516a;
        linkedHashMap.put(zlr.PARAM_ENTRY_ACCOUNT_ID, map3 != null ? map3.get(zlr.PARAM_ENTRY_ACCOUNT_ID) : null);
        Map<String, ? extends Object> map4 = f21516a;
        linkedHashMap.put(zlr.PARAM_ENTRY_RECOMMEND_BIND_ID, map4 != null ? map4.get(zlr.PARAM_ENTRY_RECOMMEND_BIND_ID) : null);
        Map<String, ? extends Object> map5 = f21516a;
        linkedHashMap.put("entryLiveSource", map5 != null ? map5.get("entryLiveSource") : null);
        Map<String, ? extends Object> map6 = f21516a;
        linkedHashMap.put(zlr.PARAM_ENTRY_SJSD_ITEM_ID, map6 != null ? map6.get(zlr.PARAM_ENTRY_SJSD_ITEM_ID) : null);
        Map<String, ? extends Object> map7 = f21516a;
        linkedHashMap.put(zlr.PARAM_ENTRY_LIVE_TRACE_ID, map7 != null ? map7.get(zlr.PARAM_ENTRY_LIVE_TRACE_ID) : null);
        Map<String, ? extends Object> map8 = f21516a;
        linkedHashMap.put(zlr.PARAM_ENTRY_TIMESHIFT_ITEM_ID, map8 != null ? map8.get(zlr.PARAM_ENTRY_TIMESHIFT_ITEM_ID) : null);
        Map<String, ? extends Object> map9 = f21516a;
        linkedHashMap.put("appkey", map9 != null ? map9.get("appkey") : null);
        Map<String, ? extends Object> map10 = f21516a;
        linkedHashMap.put("queryKey", map10 != null ? map10.get("queryKey") : null);
        Map<String, ? extends Object> map11 = f21516a;
        linkedHashMap.put("queryDetailInfo", map11 != null ? map11.get("queryDetailInfo") : null);
        Map<String, ? extends Object> map12 = f21516a;
        linkedHashMap.put(zlr.PARAM_ENTRY_SELLERID, map12 != null ? map12.get(zlr.PARAM_ENTRY_SELLERID) : null);
        Map<String, ? extends Object> map13 = f21516a;
        linkedHashMap.put("liveBucket", map13 != null ? map13.get("liveBucket") : null);
        Map<String, ? extends Object> map14 = f21516a;
        linkedHashMap.put("liveAbid", map14 != null ? map14.get("liveAbid") : null);
        Map<String, ? extends Object> map15 = f21516a;
        linkedHashMap.put("singleLiveTabSessionId", map15 != null ? map15.get("singleLiveTabSessionId") : null);
        c5t c5tVar = c5t.INSTANCE;
        if (c5tVar.C()) {
            linkedHashMap.put("queryTimeMoving", "true");
        }
        if (c5tVar.H()) {
            Map<String, ? extends Object> map16 = f21516a;
            Object obj = map16 != null ? map16.get("entryLiveSource") : null;
            Map<String, ? extends Object> map17 = f21516a;
            Object obj2 = map17 != null ? map17.get("timeMovingStatus") : null;
            if (obj != null && obj2 != null && ckf.b(obj, "tpp_88") && ckf.b(obj2, "1")) {
                linkedHashMap.put("timeMovingStatus", obj2);
                Map<String, ? extends Object> map18 = f21516a;
                linkedHashMap.put(zlr.PARAM_ENTRY_ITEM_ID, map18 != null ? map18.get(zlr.PARAM_ENTRY_ITEM_ID) : null);
            }
        }
        Map<String, ? extends Object> map19 = f21516a;
        linkedHashMap.put(yj4.REF_PID, map19 != null ? map19.get(yj4.REF_PID) : null);
        Map<String, ? extends Object> map20 = f21516a;
        linkedHashMap.put("entrySpm", map20 != null ? map20.get("entrySpm") : null);
        Map<String, ? extends Object> map21 = f21516a;
        linkedHashMap.put("platform", map21 != null ? map21.get("platform") : null);
        Map<String, ? extends Object> map22 = f21516a;
        linkedHashMap.put(r4p.KEY_CITY_CODE, map22 != null ? map22.get(r4p.KEY_CITY_CODE) : null);
        Map<String, ? extends Object> map23 = f21516a;
        linkedHashMap.put(r4p.KEY_CITY_NAME, map23 != null ? map23.get(r4p.KEY_CITY_NAME) : null);
        Map<String, ? extends Object> map24 = f21516a;
        linkedHashMap.put("realExposure", map24 != null ? map24.get("realExposure") : null);
        Map<String, ? extends Object> map25 = f21516a;
        if ((map25 != null ? map25.get("homepageFeedList") : null) != null) {
            Map<String, ? extends Object> map26 = f21516a;
            linkedHashMap.put("homepageFeedList", map26 != null ? map26.get("homepageFeedList") : null);
        }
        Map<String, ? extends Object> map27 = f21516a;
        linkedHashMap.put("entryLiveSourcePre", map27 != null ? map27.get("entryLiveSourcePre") : null);
        if ((map != null ? map.get("queryDirectDown") : null) != null) {
            linkedHashMap.put("queryDirectDown", map.get("queryDirectDown"));
        }
        if ((map != null ? map.get(bia.UNDER_TAKE_GOODS_LIST) : null) != null) {
            linkedHashMap.put(bia.UNDER_TAKE_GOODS_LIST, map.get(bia.UNDER_TAKE_GOODS_LIST));
        }
        linkedHashMap.put("feedList", map != null ? map.get("feedList") : null);
        linkedHashMap.put("nextLiveId", taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getLiveId() : null);
        linkedHashMap.put("nextAccountId", taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getAccountId() : null);
        linkedHashMap.put("nextClientReturnMap", taoLiveKtSwitchModel != null ? taoLiveKtSwitchModel.getClientReturnMap() : null);
        linkedHashMap.put("type", str);
        if (num != null) {
            num2 = Integer.valueOf(num.intValue() + 1);
        }
        linkedHashMap.put("index", String.valueOf(num2));
        g1a<? super Map<String, ? extends Object>, xhv> g1aVar = b;
        if (g1aVar != null) {
            g1aVar.invoke(linkedHashMap);
        }
        return linkedHashMap;
    }
}
