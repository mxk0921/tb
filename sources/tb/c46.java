package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class c46 implements s2d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final wub f16842a;
    public final Map<String, Integer> b;
    public final String c;
    public final String d;

    static {
        t2o.a(444597906);
        t2o.a(144703517);
    }

    public c46(wub wubVar, Map<String, Integer> map, String str, String str2) {
        this.f16842a = wubVar;
        this.b = map;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    @Override // tb.s2d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCallback(com.alibaba.ability.result.ExecuteResult r6) {
        /*
            r5 = this;
            r0 = 2
            com.android.alibaba.ip.runtime.IpChange r1 = tb.c46.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = "f183ed74"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r5
            r3 = 1
            r0[r3] = r6
            r1.ipc$dispatch(r2, r0)
            return
        L_0x0015:
            boolean r1 = tb.eb5.u()
            if (r1 == 0) goto L_0x002c
            java.lang.String r1 = r5.c
            java.lang.String r2 = r5.d
            java.lang.String r3 = " onCallback result "
            java.lang.String r4 = com.alibaba.fastjson.JSON.toJSONString(r6)
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4}
            tb.h36.o(r1)
        L_0x002c:
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r5.b
            if (r1 != 0) goto L_0x0031
            return
        L_0x0031:
            int r1 = r6.getStatusCode()
            if (r1 != r0) goto L_0x0038
            return
        L_0x0038:
            int r0 = r6.getStatusCode()
            r1 = 99
            if (r0 <= r1) goto L_0x0058
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            java.lang.String r1 = "onError"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0077
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0078
        L_0x0058:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            java.lang.String r1 = r6.getType()
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x006e
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r5.b
            java.lang.String r1 = r6.getModType()
            java.lang.Object r0 = r0.get(r1)
        L_0x006e:
            if (r0 == 0) goto L_0x0077
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0078
        L_0x0077:
            r0 = -1
        L_0x0078:
            if (r0 >= 0) goto L_0x0089
            java.lang.String r0 = "找不到对应的callback "
            java.lang.String r6 = r6.getType()
            java.lang.String[] r6 = new java.lang.String[]{r0, r6}
            tb.h36.o(r6)
            return
        L_0x0089:
            tb.wub r1 = r5.f16842a
            tb.ovb r1 = r1.f()
            tb.d56 r1 = r1.f()
            tb.wub r2 = r5.f16842a
            tb.ovb r2 = r2.f()
            java.util.Map r6 = r6.getData()
            r3 = 0
            r1.b(r0, r2, r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.c46.onCallback(com.alibaba.ability.result.ExecuteResult):void");
    }
}
