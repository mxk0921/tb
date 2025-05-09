package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ruv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_UT_EXPOSURE_EVENT = "userTrack";

    static {
        t2o.a(745538176);
    }

    public static void a(gsb gsbVar) {
        JSONObject fields;
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5971bad", new Object[]{gsbVar});
        } else if (gsbVar != null && (fields = gsbVar.getFields()) != null) {
            try {
                i = fields.getInteger("eventId").intValue();
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                String string = fields.getString("page");
                if (!TextUtils.isEmpty(string)) {
                    String string2 = fields.getString("arg1");
                    String string3 = fields.getString("arg2");
                    String string4 = fields.getString("arg3");
                    String str = "";
                    String str2 = TextUtils.isEmpty(string3) ? str : string3;
                    if (!TextUtils.isEmpty(string4)) {
                        str = string4;
                    }
                    JSONObject jSONObject = fields.getJSONObject("args");
                    HashMap hashMap = new HashMap();
                    if (jSONObject != null) {
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && value != null) {
                                hashMap.put(key, String.valueOf(value));
                            }
                        }
                    }
                    try {
                        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str2, str, hashMap).build());
                    } catch (Throwable unused2) {
                    }
                }
                JSONObject jSONObject2 = fields.getJSONObject("nextPage");
                if (jSONObject2 != null) {
                    HashMap hashMap2 = new HashMap();
                    for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                        String key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        if (!TextUtils.isEmpty(key2) && value2 != null) {
                            hashMap2.put(key2, String.valueOf(value2));
                        }
                    }
                    try {
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap2);
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
    }

    public static void b(IDMComponent iDMComponent, f8v f8vVar) {
        List<gsb> d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1253c78f", new Object[]{iDMComponent, f8vVar});
        } else if (iDMComponent != null && f8vVar != null && (d = d(iDMComponent, "percentExposureItem")) != null) {
            for (gsb gsbVar : d) {
                String type = gsbVar.getType();
                if (!TextUtils.isEmpty(type)) {
                    b8v t = f8vVar.e().t(type);
                    t.p(iDMComponent);
                    t.A("percentExposureItem");
                    t.r(gsbVar);
                    if (gsbVar.getFields() != null && gsbVar.getFields().containsKey("args")) {
                        gsbVar.getFields().getJSONObject("args").put("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                    }
                    f8vVar.k(t);
                }
            }
        }
    }

    public static void c(DealInfo dealInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2949440", new Object[]{dealInfo});
        } else if (dealInfo != null) {
            if (e(dealInfo.toPayBiz, 0) != 0) {
                suv.h(u3j.b, "Page_MyTaobao_Show-OrderNumber", suv.a("a2141.7631743.3.51", null, null, null));
            }
            if (e(dealInfo.hasPaid, 0) != 0) {
                suv.h(u3j.b, "Page_MyTaobao_Show-OrderNumber", suv.a("a2141.7631743.3.52", null, null, null));
            }
            if (e(dealInfo.toConfirmBiz, 0) != 0) {
                suv.h(u3j.b, "Page_MyTaobao_Show-OrderNumber", suv.a("a2141.7631743.3.53", null, null, null));
            }
            if (e(dealInfo.toComment, 0) != 0) {
                suv.h(u3j.b, "Page_MyTaobao_Show-OrderNumber", suv.a("a2141.7631743.3.54", null, null, null));
            }
            if (e(dealInfo.refundBiz, 0) != 0) {
                suv.h(u3j.b, "Page_MyTaobao_Show-OrderNumber", suv.a("a2141.7631743.3.55", null, null, null));
            }
        }
    }

    public static List<gsb> d(IDMComponent iDMComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e5054a61", new Object[]{iDMComponent, str});
        }
        Map<String, List<gsb>> eventMap = iDMComponent.getEventMap();
        if (eventMap != null) {
            return eventMap.get(str);
        }
        return null;
    }

    public static int e(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db2d38ba", new Object[]{str, new Integer(i)})).intValue();
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
