package com.taobao.android.dinamicx.widget;

import android.graphics.Color;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.z;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public z.e a(z zVar, JSONObject jSONObject, String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z.e) ipChange.ipc$dispatch("7fb8abf1", new Object[]{this, zVar, jSONObject, str, str2, new Boolean(z)});
        }
        z.e eVar = new z.e();
        int length = str.length() - str2.length();
        eVar.f7540a = length;
        eVar.b = length + str2.length();
        Object e = e(zVar, jSONObject, z);
        if (e != null) {
            ((ArrayList) eVar.d).add(e);
        }
        Object c = c(zVar, jSONObject);
        if (c != null) {
            ((ArrayList) eVar.d).add(c);
        }
        Object b = b(zVar, jSONObject);
        if (b != null) {
            ((ArrayList) eVar.d).add(b);
        }
        Object d = d(zVar, jSONObject);
        if (d != null) {
            ((ArrayList) eVar.d).add(d);
        }
        Object f = f(jSONObject);
        if (f != null) {
            ((ArrayList) eVar.d).add(f);
        }
        if (((ArrayList) eVar.d).size() > 0) {
            return eVar;
        }
        return null;
    }

    public final Object b(z zVar, JSONObject jSONObject) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("9c5a5038", new Object[]{this, zVar, jSONObject});
        }
        if (zVar != null && zVar.getTextStyle() == 1) {
            z = true;
        }
        if (jSONObject != null) {
            z = Boolean.parseBoolean(jSONObject.getString("bold"));
        }
        if (z) {
            return new StyleSpan(1);
        }
        return null;
    }

    public final Object c(z zVar, JSONObject jSONObject) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d2c166c6", new Object[]{this, zVar, jSONObject});
        }
        if (zVar != null) {
            i = zVar.getTextColor();
        } else {
            i = -16777216;
        }
        if (jSONObject != null) {
            try {
                i = h(jSONObject.getString("color"), i);
            } catch (Throwable unused) {
            }
        }
        return new ForegroundColorSpan(i);
    }

    public final Object d(z zVar, JSONObject jSONObject) {
        boolean z = true;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("df2677ed", new Object[]{this, zVar, jSONObject});
        }
        if (zVar != null) {
            if (zVar.getTextStyle() != 2) {
                z = false;
            }
            z2 = z;
        }
        if (jSONObject != null) {
            z2 = Boolean.parseBoolean(jSONObject.getString("italic"));
        }
        if (z2) {
            return new StyleSpan(2);
        }
        return null;
    }

    public final Object f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d7c773b0", new Object[]{this, jSONObject});
        }
        if (jSONObject != null && Boolean.parseBoolean(jSONObject.getString("strikeThrough"))) {
            return new StrikethroughSpan();
        }
        return null;
    }

    public int h(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c923b015", new Object[]{this, str, new Integer(i)})).intValue();
        }
        if (str == null || str.length() <= 0) {
            return i;
        }
        String lowerCase = str.toLowerCase(Locale.SIMPLIFIED_CHINESE);
        StringBuilder sb = new StringBuilder("#");
        for (int i2 = 1; i2 < 9 && i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'f')) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        if (sb2.length() == 7 || sb2.length() == 9) {
            return Color.parseColor(sb2);
        }
        return i;
    }

    public boolean g(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ae3797b", new Object[]{this, jSONObject})).booleanValue();
        }
        if (jSONObject != null) {
            return Boolean.parseBoolean(jSONObject.getString("tailIndent"));
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:7)(1:8)|(9:10|24|11|13|26|(1:15)(1:(1:18)(3:19|20|21))|16|20|21)|12|13|26|(0)(0)|16|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #1 {all -> 0x005d, blocks: (B:15:0x003b, B:18:0x004f), top: B:26:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(com.taobao.android.dinamicx.widget.z r5, com.alibaba.fastjson.JSONObject r6, boolean r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.android.dinamicx.widget.y.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0021
            java.lang.Boolean r3 = new java.lang.Boolean
            r3.<init>(r7)
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r1] = r4
            r7[r0] = r5
            r5 = 2
            r7[r5] = r6
            r5 = 3
            r7[r5] = r3
            java.lang.String r5 = "d9fb5b14"
            java.lang.Object r5 = r2.ipc$dispatch(r5, r7)
            return r5
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            float r2 = r5.getTextSize()
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            if (r6 == 0) goto L_0x0037
            java.lang.String r3 = "size"
            java.lang.String r6 = r6.getString(r3)
            float r2 = java.lang.Float.parseFloat(r6)     // Catch: all -> 0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            int r6 = (int) r2
            if (r7 == 0) goto L_0x004d
            com.taobao.android.dinamicx.DinamicXEngine r6 = r5.getEngine()     // Catch: all -> 0x005d
            com.taobao.android.dinamicx.DXRuntimeContext r5 = r5.getDXRuntimeContext()     // Catch: all -> 0x005d
            android.content.Context r5 = r5.h()     // Catch: all -> 0x005d
            int r5 = tb.pb6.d(r6, r5, r2)     // Catch: all -> 0x005d
        L_0x004b:
            r1 = r5
            goto L_0x005d
        L_0x004d:
            if (r0 == 0) goto L_0x005c
            com.taobao.android.dinamicx.DXRuntimeContext r5 = r5.getDXRuntimeContext()     // Catch: all -> 0x005d
            android.content.Context r5 = r5.h()     // Catch: all -> 0x005d
            int r5 = tb.pb6.f(r5, r2)     // Catch: all -> 0x005d
            goto L_0x004b
        L_0x005c:
            r1 = r6
        L_0x005d:
            android.text.style.AbsoluteSizeSpan r5 = new android.text.style.AbsoluteSizeSpan
            r5.<init>(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.dinamicx.widget.y.e(com.taobao.android.dinamicx.widget.z, com.alibaba.fastjson.JSONObject, boolean):java.lang.Object");
    }
}
