package tb;

import android.util.Log;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class b38 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f16154a;
    public static final b38 INSTANCE = new b38();
    public static final List<JSONObject> b = new ArrayList();

    static {
        t2o.a(745538018);
    }

    public final void a(DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fd0d5fc", new Object[]{this, dinamicXEngine});
        } else if (dinamicXEngine != null && !f16154a) {
            f16154a = true;
            uv6.b("corePreloadDx", 0);
            JSONObject k = l3j.INSTANCE.k();
            if (k != null) {
                b(k, dinamicXEngine);
                uv6.c("corePreloadDx", 0);
                return;
            }
            ckf.s();
            throw null;
        }
    }

    public final Map<String, JSONObject> c(JSONObject jSONObject) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fc764043", new Object[]{this, jSONObject});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null) {
                Collection<Object> values = jSONObject2.values();
                ckf.c(values, "data.values");
                for (Object obj : values) {
                    if (!(obj instanceof JSONObject)) {
                        obj = null;
                    }
                    JSONObject jSONObject3 = (JSONObject) obj;
                    if (!(jSONObject3 == null || (string = jSONObject3.getString("type")) == null)) {
                        linkedHashMap.put(string, jSONObject3);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return linkedHashMap;
    }

    public final void b(JSONObject jSONObject, DinamicXEngine dinamicXEngine) {
        JSONObject jSONObject2;
        JSONArray jSONArray;
        String string;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6063fb1c", new Object[]{this, jSONObject, dinamicXEngine});
            return;
        }
        try {
            JSONObject jSONObject3 = jSONObject.getJSONObject("data");
            if (jSONObject3 != null && (jSONObject2 = jSONObject3.getJSONObject("container")) != null && (jSONArray = jSONObject2.getJSONArray("data")) != null) {
                Map<String, JSONObject> c = c(jSONObject3);
                int size = jSONArray.size();
                int i2 = 0;
                while (i2 < size) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                    if (ckf.b(jSONObject4.getString("containerType"), "dinamicx")) {
                        DXTemplateItem dXTemplateItem = new DXTemplateItem();
                        JSONArray jSONArray2 = jSONObject4.getJSONArray("type");
                        Object d0 = jSONArray2 != null ? i04.d0(jSONArray2, i) : null;
                        if (!(d0 instanceof String)) {
                            d0 = null;
                        }
                        String str = (String) d0;
                        String string2 = jSONObject4.getString("name");
                        if (!(string2 == null || (string = jSONObject4.getString("url")) == null)) {
                            long longValue = jSONObject4.getLongValue("version");
                            if (longValue > 0) {
                                dXTemplateItem.f7343a = string2;
                                dXTemplateItem.b = longValue;
                                dXTemplateItem.c = string;
                                DXTemplateItem u = dinamicXEngine.u(dXTemplateItem);
                                if (u != null) {
                                    dinamicXEngine.B0(Globals.getApplication(), u, c.get(str), -1, null);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("preRenderTemplate, name=");
                                    sb.append(string2);
                                    sb.append(" data=");
                                    JSONObject jSONObject5 = c.get(str);
                                    if (jSONObject5 != null) {
                                        sb.append(jSONObject5.toJSONString());
                                        Log.e("dsw", sb.toString());
                                        JSONObject jSONObject6 = c.get(str);
                                        if (jSONObject6 != null) {
                                            ((ArrayList) b).add(jSONObject6);
                                        }
                                    } else {
                                        ckf.s();
                                        throw null;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i2++;
                    i = 0;
                }
            }
        } catch (Throwable th) {
            TLog.loge("mtbMainLink", "下载dx异常，throw:" + th);
        }
    }
}
