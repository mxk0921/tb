package tb;

import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import java.util.ArrayList;
import tb.si5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class lmt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(912262667);
    }

    public static si5.a a(JSONObject jSONObject, String str, String str2, DinamicXEngine dinamicXEngine) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (si5.a) ipChange.ipc$dispatch("b4a46e9d", new Object[]{jSONObject, str, str2, dinamicXEngine});
        }
        si5.a aVar = new si5.a();
        int length = str.length() - str2.length();
        aVar.f28067a = length;
        aVar.b = length + str2.length();
        Object d = d(jSONObject, dinamicXEngine);
        if (d != null) {
            ((ArrayList) aVar.d).add(d);
        }
        Object b = b(jSONObject);
        if (b != null) {
            ((ArrayList) aVar.d).add(b);
        }
        Object c = c(jSONObject);
        if (c != null) {
            ((ArrayList) aVar.d).add(c);
        }
        Object e = e(jSONObject);
        if (e != null) {
            ((ArrayList) aVar.d).add(e);
        }
        if (((ArrayList) aVar.d).size() > 0) {
            return aVar;
        }
        return null;
    }

    public static Object b(JSONObject jSONObject) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("7694aa2e", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            z = Boolean.parseBoolean(jSONObject.getString("bold"));
        }
        if (z) {
            return new StyleSpan(1);
        }
        return null;
    }

    public static Object c(JSONObject jSONObject) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("87b84899", new Object[]{jSONObject});
        }
        if (jSONObject != null) {
            z = Boolean.parseBoolean(jSONObject.getString("italic"));
        }
        if (z) {
            return new StyleSpan(2);
        }
        return null;
    }

    public static Object e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7c773b0", new Object[]{jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString("strikeThrough"))) {
            return new StrikethroughSpan();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object d(com.alibaba.fastjson.JSONObject r5, com.taobao.android.dinamicx.DinamicXEngine r6) {
        /*
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.lmt.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0016
            java.lang.String r3 = "ae57a399"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            java.lang.Object r5 = r2.ipc$dispatch(r3, r4)
            return r5
        L_0x0016:
            if (r5 == 0) goto L_0x0024
            java.lang.String r2 = "size"
            java.lang.String r5 = r5.getString(r2)
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: all -> 0x0024
            goto L_0x0026
        L_0x0024:
            r5 = 0
            r0 = 0
        L_0x0026:
            int r2 = (int) r5
            if (r0 == 0) goto L_0x0033
            android.content.Context r0 = tb.y9a.b()     // Catch: all -> 0x0034
            int r5 = tb.pb6.d(r6, r0, r5)     // Catch: all -> 0x0034
            r1 = r5
            goto L_0x0034
        L_0x0033:
            r1 = r2
        L_0x0034:
            android.text.style.AbsoluteSizeSpan r5 = new android.text.style.AbsoluteSizeSpan
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.lmt.d(com.alibaba.fastjson.JSONObject, com.taobao.android.dinamicx.DinamicXEngine):java.lang.Object");
    }
}
