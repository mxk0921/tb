package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.impl.MtopAdapter;
import java.util.Map;
import tb.tpu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class t4j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(919601221);
    }

    public final boolean c(String str, String str2, Map<String, ? extends Object> map, String str3, String str4, Map<String, ? extends Object> map2, jwc jwcVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("18389436", new Object[]{this, str, str2, map, str3, str4, map2, jwcVar})).booleanValue();
        }
        ckf.g(str, "api1");
        ckf.g(str3, "api2");
        if (!ckf.b(str, str3) || !ckf.b(str2, str4)) {
            z = false;
        }
        if (z) {
            return z & b(map, map2, jwcVar);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
        if (r11.b(r3, r2, r4) == false) goto L_0x00a0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.util.Map<java.lang.String, ? extends java.lang.Object> r9, java.util.Map<java.lang.String, ? extends java.lang.Object> r10, tb.jwc r11) {
        /*
            r8 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.t4j.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = "d53ee99e"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r8
            r4[r0] = r9
            r9 = 2
            r4[r9] = r10
            r9 = 3
            r4[r9] = r11
            java.lang.Object r9 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        L_0x0022:
            int r2 = r9.size()     // Catch: all -> 0x005a
            int r3 = r10.size()     // Catch: all -> 0x005a
            if (r2 == r3) goto L_0x002d
            return r1
        L_0x002d:
            java.util.Set r9 = r9.entrySet()     // Catch: all -> 0x005a
            java.util.Iterator r9 = r9.iterator()     // Catch: all -> 0x005a
        L_0x0035:
            boolean r2 = r9.hasNext()     // Catch: all -> 0x005a
            if (r2 == 0) goto L_0x00be
            java.lang.Object r2 = r9.next()     // Catch: all -> 0x005a
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: all -> 0x005a
            java.lang.Object r3 = r2.getKey()     // Catch: all -> 0x005a
            java.lang.String r3 = (java.lang.String) r3     // Catch: all -> 0x005a
            java.lang.Object r2 = r2.getValue()     // Catch: all -> 0x005a
            if (r2 != 0) goto L_0x005d
            java.lang.Object r2 = r10.get(r3)     // Catch: all -> 0x005a
            if (r2 != 0) goto L_0x005c
            boolean r2 = r10.containsKey(r3)     // Catch: all -> 0x005a
            if (r2 != 0) goto L_0x0035
            goto L_0x005c
        L_0x005a:
            r9 = move-exception
            goto L_0x00a1
        L_0x005c:
            return r1
        L_0x005d:
            java.lang.Object r4 = r10.get(r3)     // Catch: all -> 0x005a
            boolean r5 = tb.ckf.b(r2, r4)     // Catch: all -> 0x005a
            if (r5 != 0) goto L_0x0035
            java.lang.String r5 = "params"
            boolean r5 = tb.ckf.b(r3, r5)     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x0097
            boolean r5 = r2 instanceof java.lang.String     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x0097
            boolean r5 = r4 instanceof java.lang.String     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x0097
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch: all -> 0x005a
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSON.parseObject(r5)     // Catch: all -> 0x005a
            java.lang.String r6 = "JSON.parseObject(value)"
            tb.ckf.f(r5, r6)     // Catch: all -> 0x005a
            r6 = r4
            java.lang.String r6 = (java.lang.String) r6     // Catch: all -> 0x005a
            com.alibaba.fastjson.JSONObject r6 = com.alibaba.fastjson.JSON.parseObject(r6)     // Catch: all -> 0x005a
            java.lang.String r7 = "JSON.parseObject(value2 as String?)"
            tb.ckf.f(r6, r7)     // Catch: all -> 0x005a
            boolean r5 = tb.ckf.b(r5, r6)     // Catch: all -> 0x005a
            if (r5 == 0) goto L_0x0097
            goto L_0x0035
        L_0x0097:
            if (r11 == 0) goto L_0x00a0
            boolean r2 = r11.b(r3, r2, r4)     // Catch: all -> 0x005a
            if (r2 == 0) goto L_0x00a0
            goto L_0x0035
        L_0x00a0:
            return r1
        L_0x00a1:
            tb.tpu$a r2 = tb.tpu.Companion
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "defalutParamsEqual error:"
            r10.<init>(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r4 = r10.toString()
            r6 = 4
            r7 = 0
            java.lang.String r3 = "MtopAdapter"
            r5 = 0
            tb.tpu.a.b(r2, r3, r4, r5, r6, r7)
            r0 = 0
        L_0x00be:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.t4j.a(java.util.Map, java.util.Map, tb.jwc):boolean");
    }

    public final boolean b(Map<String, ? extends Object> map, Map<String, ? extends Object> map2, jwc jwcVar) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8857235f", new Object[]{this, map, map2, jwcVar})).booleanValue();
        }
        if (map == null && map2 == null) {
            return true;
        }
        if (map == null || map2 == null) {
            return false;
        }
        try {
            if (jwcVar != null) {
                z = jwcVar.a(map, map2);
            } else {
                z = a(map, map2, jwcVar);
            }
            return z;
        } catch (Exception e) {
            tpu.a aVar = tpu.Companion;
            tpu.a.b(aVar, MtopAdapter.TAG, "paramsEqual error:" + e.getMessage(), null, 4, null);
            return z;
        }
    }
}
