package com.alibaba.android.aura.taobao.adapter.extension.event.openUrl;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.ck;
import tb.iqw;
import tb.jqw;
import tb.kqw;
import tb.lqw;
import tb.nbb;
import tb.pi;
import tb.qi;
import tb.qj;
import tb.t2o;
import tb.tj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class AURAJsStandardEventListener implements jqw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String EventType = "auraEventNotification";

    static {
        t2o.a(81789069);
        t2o.a(989856388);
    }

    public static void register(jqw jqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21da5686", new Object[]{jqwVar});
        } else {
            lqw.d().b(jqwVar);
        }
    }

    private void routeAuraEvent(Context context, String str, String str2, JSONObject jSONObject) {
        List<nbb> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60f30f09", new Object[]{this, context, str, str2, jSONObject});
            return;
        }
        qi qiVar = new qi();
        qiVar.n(jSONObject);
        if (!TextUtils.isEmpty(str)) {
            nbb d = qj.h().d(str);
            if (d != null) {
                pi.b(d, str2, qiVar);
            } else {
                ck.g().d("AURAJsStandardEvent currentInstance is null");
            }
        } else {
            if (context == null) {
                list = qj.h().b();
            } else {
                list = qj.h().c(context);
            }
            if (list != null) {
                for (nbb nbbVar : list) {
                    pi.b(nbbVar, str2, qiVar);
                }
                return;
            }
            ck.g().d("AURAJsStandardEvent instancePool is null");
        }
    }

    public static void unregister(jqw jqwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2545be8d", new Object[]{jqwVar});
        } else {
            lqw.d().h(jqwVar);
        }
    }

    @Override // tb.jqw
    public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
        }
        if (i == 3005 && objArr != null && objArr.length >= 1) {
            Object obj = objArr[0];
            if (obj instanceof String) {
                JSONObject a2 = tj.a((String) obj);
                if (a2 == null) {
                    ck.g().d("AURAJsStandardEvent eventJson is null");
                    return null;
                } else if (!EventType.equalsIgnoreCase(a2.getString("event"))) {
                    ck.g().d("AURAJsStandardEvent event is not auraEventNotification");
                    return null;
                } else {
                    JSONObject jSONObject = a2.getJSONObject("param");
                    if (jSONObject == null) {
                        ck.g().d("AURAJsStandardEvent param is null");
                        return null;
                    }
                    String string = jSONObject.getString("type");
                    if (TextUtils.isEmpty(string)) {
                        ck.g().d("AURAJsStandardEvent eventType is null");
                        return null;
                    }
                    String string2 = jSONObject.getString("bizCode");
                    if (TextUtils.isEmpty(string2)) {
                        ck.g().d("AURAJsStandardEvent bizCode is null");
                    }
                    JSONObject jSONObject2 = jSONObject.getJSONObject("fields");
                    iqwVar.getClass();
                    routeAuraEvent(null, string2, string, jSONObject2);
                    return new kqw(true, null);
                }
            }
        }
        return null;
    }
}
