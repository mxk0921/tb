package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dressup.base.BaseDressupActivity;
import com.taobao.android.dressup.common.model.PageModel;
import com.taobao.message.sp.framework.model.SimpleMessageListData;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class jau implements d2e, eyb, p6d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public qpu f21874a;
    public Map<String, String> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        static {
            t2o.a(918552776);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(918552775);
        t2o.a(918552774);
        t2o.a(919601268);
        t2o.a(919601322);
    }

    @Override // tb.d2e
    public void F(String str, Map<String, ? extends Object> map, Integer num, Boolean bool, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75a9884b", new Object[]{this, str, map, num, bool, str2, str3});
            return;
        }
        ckf.g(str, "arg1");
        if (num == null) {
            num = 2201;
        }
        String x = x(str, getPageName(), "Show-", bool);
        String[] T0 = T0(M(map, str3));
        if (r(x, str2)) {
            TBS.Ext.commitEvent(getPageName(), num.intValue(), x, null, null, (String[]) Arrays.copyOf(T0, T0.length));
        }
    }

    @Override // tb.d2e
    public void H(String str, Map<String, ? extends Object> map, Boolean bool, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85c63d90", new Object[]{this, str, map, bool, str2, str3});
            return;
        }
        ckf.g(str, "arg1");
        String x = x(str, getPageName(), "Show-", bool);
        String[] T0 = T0(M(map, str3));
        if (r(x, str2)) {
            TBS.Ext.commitEvent(getPageName(), 2201, x, null, null, (String[]) Arrays.copyOf(T0, T0.length));
        }
    }

    public final Map<String, Object> M(Map<String, ? extends Object> map, String str) {
        Object obj;
        String str2;
        HashMap hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7671dec0", new Object[]{this, map, str});
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("renderType", "native");
        if (map != null) {
            hashMap2.putAll(map);
            if (map.containsKey("utLogMap")) {
                Object obj2 = map.get("utLogMap");
                if (obj2 instanceof Map) {
                    hashMap = new HashMap((Map) obj2);
                } else {
                    hashMap = new HashMap();
                }
                Map<String, String> map2 = this.b;
                if (map2 != null) {
                    hashMap.putAll(map2);
                }
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!ckf.b(key, "utLogMap")) {
                        hashMap.put(key, value);
                    }
                }
                hashMap2.put("utLogMap", hashMap);
            } else {
                HashMap hashMap3 = new HashMap();
                Map<String, String> map3 = this.b;
                if (map3 != null) {
                    hashMap3.putAll(map3);
                }
                hashMap3.putAll(map);
                hashMap2.put("utLogMap", hashMap3);
            }
        } else {
            HashMap hashMap4 = new HashMap();
            Map<String, String> map4 = this.b;
            if (map4 != null) {
                hashMap4.putAll(map4);
            }
            hashMap2.put("utLogMap", hashMap4);
        }
        if (!(str == null || str.length() == 0 || !((obj = hashMap2.get("spm")) == null || ckf.b("", obj)))) {
            hashMap2.put("spm", b() + "." + str);
            tpu.a.b(tpu.Companion, "穿搭埋点-坑位信息:argsSpm:" + ((Object) str2) + ":spmCd:" + str, null, null, 4, null);
        }
        return hashMap2;
    }

    public void U0(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eeb4db3", new Object[]{this, map});
            return;
        }
        ckf.g(map, "globalParams");
        this.b = map;
    }

    @Override // tb.d2e
    public void X(String str, Map<String, ? extends Object> map, Integer num, Boolean bool, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38f44d20", new Object[]{this, str, map, num, bool, str2});
            return;
        }
        ckf.g(str, "arg1");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "clickForEventId arg1:" + str + " eventId:" + num + " spmCd:" + str2, null, 4, null);
        if (num == null) {
            num = 2101;
        }
        String x = x(str, getPageName(), "Button-", bool);
        String[] T0 = T0(M(map, str2));
        TBS.Ext.commitEvent(getPageName(), num.intValue(), x, null, null, (String[]) Arrays.copyOf(T0, T0.length));
    }

    @Override // tb.d2e
    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f1dca", new Object[]{this});
        }
        qpu qpuVar = this.f21874a;
        if (qpuVar == null) {
            ckf.y("context");
            throw null;
        } else if (ckf.b(qpuVar.a().b(), BaseDressupActivity.BIZ_DETAIL)) {
            return "a21zgw.29958414";
        } else {
            return "a21zgw.29958409";
        }
    }

    public final void e1() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82ca68e", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "TrackService", "updatePageNameAndProperties", null, 4, null);
        qpu qpuVar = this.f21874a;
        if (qpuVar != null) {
            Activity p = qpuVar.a().p();
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().updatePageName(p, getPageName());
            HashMap hashMap = new HashMap();
            hashMap.put("pageName", getPageName());
            hashMap.put("spm-cnt", b());
            qpu qpuVar2 = this.f21874a;
            if (qpuVar2 != null) {
                Map<String, String> h = qpuVar2.a().h();
                String str = h.get("scm");
                if (str != null) {
                    hashMap.put("scm", str);
                }
                String str2 = h.get("contentId");
                if (str2 != null) {
                    hashMap.put("contentId", str2);
                }
                String str3 = h.get("sceneSource");
                if (str3 != null) {
                    hashMap.put("sceneSource", str3);
                }
                String str4 = h.get(SimpleMessageListData.SOURCE_NAME_MESSAGE);
                if (str4 != null) {
                    hashMap.put(SimpleMessageListData.SOURCE_NAME_MESSAGE, str4);
                }
                hashMap.put("renderType", "native");
                HashMap hashMap2 = new HashMap();
                Map<String, String> map = this.b;
                if (map != null) {
                    hashMap2.putAll(map);
                }
                if (str2 != null) {
                    hashMap2.put("content_id", str2);
                }
                hashMap.put("utLogMap", JSON.toJSONString(hashMap2));
                UTAnalytics instance2 = UTAnalytics.getInstance();
                ckf.f(instance2, "UTAnalytics.getInstance()");
                instance2.getDefaultTracker().updatePageProperties(p, hashMap);
                return;
            }
            ckf.y("context");
            throw null;
        }
        ckf.y("context");
        throw null;
    }

    @Override // tb.d2e
    public String getPageName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("707fddc9", new Object[]{this});
        }
        qpu qpuVar = this.f21874a;
        if (qpuVar == null) {
            ckf.y("context");
            throw null;
        } else if (ckf.b(qpuVar.a().b(), BaseDressupActivity.BIZ_DETAIL)) {
            return "Page_OutfitChannelSoloDetail";
        } else {
            return "Page_OutfitChannelHome";
        }
    }

    @Override // tb.sod
    public void onCreateService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b2eb95", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "TrackService", "onCreateService", null, 4, null);
        this.f21874a = qpuVar;
        ((byb) qpuVar.getService(byb.class)).r(this);
        ((b7d) qpuVar.getService(b7d.class)).e1(this);
    }

    @Override // tb.sod
    public void onDestroyService(qpu qpuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("673e3e35", new Object[]{this, qpuVar});
            return;
        }
        ckf.g(qpuVar, "context");
        tpu.a.b(tpu.Companion, "TrackService", "onDestroyService", null, 4, null);
    }

    @Override // tb.p6d
    public void onPageCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8b8731", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ceb4d93", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPagePause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("687ed20f", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bbaade2", new Object[]{this});
            return;
        }
        tpu.a.b(tpu.Companion, "TrackService", "onPageResume", null, 4, null);
        e1();
    }

    @Override // tb.p6d
    public void onPageStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8245a7b", new Object[]{this});
        }
    }

    @Override // tb.p6d
    public void onPageStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("702d0eb7", new Object[]{this});
        }
    }

    @Override // tb.d2e
    public void p(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbc86072", new Object[]{this, str});
        } else {
            ckf.g(str, "spmURL");
        }
    }

    @Override // tb.d2e
    public void q(String str, Map<String, ? extends Object> map, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd49cb16", new Object[]{this, str, map, str2});
            return;
        }
        ckf.g(str, "arg1");
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "click arg1:" + str + " args:" + map + " spmCd:" + str2, null, 4, null);
        String x = x(str, getPageName(), "Button-", Boolean.FALSE);
        String[] T0 = T0(M(map, str2));
        TBS.Ext.commitEvent(getPageName(), 2101, x, null, null, (String[]) Arrays.copyOf(T0, T0.length));
    }

    public final String x(String str, String str2, String str3, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a63100d3", new Object[]{this, str, str2, str3, bool});
        }
        if (ckf.b(bool, Boolean.TRUE)) {
            return str;
        }
        if (tsq.I(str, "Show-", false, 2, null) || tsq.I(str, "Button-", false, 2, null)) {
            return str2 + '_' + str;
        } else if (tsq.I(str, str2, false, 2, null)) {
            return str;
        } else {
            return str2 + '_' + str3 + str;
        }
    }

    @Override // tb.eyb
    public void z0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75e1d39a", new Object[]{this});
        }
    }

    @Override // tb.eyb
    public void B(Object obj) {
        JSONObject originData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd0098e0", new Object[]{this, obj});
            return;
        }
        tpu.a aVar = tpu.Companion;
        tpu.a.b(aVar, "TrackService", "onPageDataLoaded pageModel:" + obj, null, 4, null);
        if (obj instanceof PageModel) {
            qpu qpuVar = this.f21874a;
            if (qpuVar == null) {
                ckf.y("context");
                throw null;
            } else if (ckf.b(qpuVar.a().b(), BaseDressupActivity.BIZ_DETAIL) && (originData = ((PageModel) obj).getOriginData()) != null) {
                JSONObject jSONObject = originData.getJSONObject("utParams");
                if (jSONObject instanceof Map) {
                    U0(jSONObject);
                }
            }
        }
        qpu qpuVar2 = this.f21874a;
        if (qpuVar2 == null) {
            ckf.y("context");
            throw null;
        } else if (((b7d) qpuVar2.getService(b7d.class)).getPageState() == 2) {
            e1();
        }
    }

    public final String[] T0(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("74d74e51", new Object[]{this, map});
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof String) {
                arrayList.add(key + '=' + value);
            } else {
                String jSONString = JSON.toJSONString(value);
                arrayList.add(key + '=' + jSONString);
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final boolean r(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d02b8ea", new Object[]{this, str, str2})).booleanValue();
        }
        if (str2 == null || str2.length() == 0) {
            str3 = str;
        } else {
            str3 = str + "__" + str2;
        }
        cz7 cz7Var = cz7.INSTANCE;
        qpu qpuVar = this.f21874a;
        if (qpuVar != null) {
            JSONObject a2 = cz7Var.a(qpuVar);
            if (a2 == null) {
                tpu.a.b(tpu.Companion, "TrackService", "穿搭埋点:异常退出:pageUtFilterToken:" + str3 + ":无法检测埋点过滤:无有效originData:允许继续曝光", null, 4, null);
                return true;
            } else if (ckf.b(a2.get("cache"), Boolean.TRUE)) {
                tpu.a.b(tpu.Companion, "TrackService", "穿搭埋点:缓存过滤:pageUtFilterToken:" + str3 + ":禁止本次曝光", null, 4, null);
                return false;
            } else {
                JSONObject jSONObject = a2.getJSONObject(cz7.PAGE_DATA_KEY_PAGE_CACHE_UT_FILTER_JSON);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                    a2.put((JSONObject) cz7.PAGE_DATA_KEY_PAGE_CACHE_UT_FILTER_JSON, (String) jSONObject);
                    tpu.a.b(tpu.Companion, "TrackService", "穿搭埋点:字典准备:pageUtFilterToken:" + str3, null, 4, null);
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject(str3);
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                    jSONObject2.put((JSONObject) "utArg1", str);
                    jSONObject2.put((JSONObject) "pageUtFilterToken", str3);
                    tpu.a.b(tpu.Companion, "TrackService", "穿搭埋点:状态准备:pageUtFilterToken:" + str3 + "埋点过滤状态对象已初始化", null, 4, null);
                    jSONObject.put((JSONObject) str3, (String) jSONObject2);
                }
                Integer integer = jSONObject2.getInteger("exposureCount");
                if (integer == null) {
                    integer = 0;
                }
                if (integer.intValue() >= 1) {
                    tpu.a.b(tpu.Companion, "TrackService", "穿搭埋点:已曝光过:pageUtFilterToken:" + str3 + ":exposureCount:" + integer + ":禁止本次曝光", null, 4, null);
                    return false;
                }
                Integer valueOf = Integer.valueOf(integer.intValue() + 1);
                jSONObject2.put((JSONObject) "exposureCount", (String) valueOf);
                tpu.a.b(tpu.Companion, "TrackService", "穿搭埋点:允许曝光:pageUtFilterToken:" + str3 + ":exposureCount:" + valueOf + ":允许本次曝光", null, 4, null);
                return true;
            }
        } else {
            ckf.y("context");
            throw null;
        }
    }
}
