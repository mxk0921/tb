package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class coi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIS_APPEAR = "disappear";
    public static final String OPEN_URL = "open_url";
    public static final String USER_TRACK = "user_track";
    public static final String UT_EXPOSURE = "ut_exposure";

    static {
        t2o.a(912262335);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r4.equals("user_track") == false) goto L_0x0032;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static tb.ux1 a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel r7, com.alibaba.fastjson.JSONObject r8) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = tb.coi.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "e526ae5a"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r7
            r0[r1] = r8
            java.lang.Object r7 = r3.ipc$dispatch(r4, r0)
            tb.ux1 r7 = (tb.ux1) r7
            return r7
        L_0x0018:
            r3 = 0
            if (r7 == 0) goto L_0x00b7
            java.lang.String r4 = r7.type
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0025
            goto L_0x00b7
        L_0x0025:
            java.lang.String r4 = r7.type
            r4.hashCode()
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -504306182: goto L_0x004a;
                case 1348838055: goto L_0x003e;
                case 1935670231: goto L_0x0034;
                default: goto L_0x0032;
            }
        L_0x0032:
            r0 = -1
            goto L_0x0055
        L_0x0034:
            java.lang.String r6 = "user_track"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0055
            goto L_0x0032
        L_0x003e:
            java.lang.String r0 = "ut_exposure"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0048
            goto L_0x0032
        L_0x0048:
            r0 = 1
            goto L_0x0055
        L_0x004a:
            java.lang.String r0 = "open_url"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0054
            goto L_0x0032
        L_0x0054:
            r0 = 0
        L_0x0055:
            switch(r0) {
                case 0: goto L_0x00a0;
                case 1: goto L_0x0094;
                case 2: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r3
        L_0x0059:
            if (r8 == 0) goto L_0x0088
            com.alibaba.fastjson.JSONObject r0 = r7.params
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = "trackParams"
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r1)
            if (r0 == 0) goto L_0x0088
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0070:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0088
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getValue()
            java.lang.Object r3 = tb.yr8.a(r8, r3)
            r1.setValue(r3)
            goto L_0x0070
        L_0x0088:
            tb.rc7 r8 = new tb.rc7
            java.lang.String r0 = r7.type
            com.alibaba.fastjson.JSONObject r7 = r7.params
            com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[] r1 = new com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[r2]
            r8.<init>(r0, r7, r1)
            return r8
        L_0x0094:
            tb.rc7 r8 = new tb.rc7
            java.lang.String r0 = r7.type
            com.alibaba.fastjson.JSONObject r7 = r7.params
            com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[] r1 = new com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[r2]
            r8.<init>(r0, r7, r1)
            return r8
        L_0x00a0:
            tb.rc7 r8 = new tb.rc7
            java.lang.String r0 = r7.type
            com.alibaba.fastjson.JSONObject r7 = r7.params
            com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam r3 = new com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.String r5 = "appendURLParamsOnly"
            r3.<init>(r5, r4)
            com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[] r1 = new com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam[r1]
            r1[r2] = r3
            r8.<init>(r0, r7, r1)
            return r8
        L_0x00b7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.coi.a(com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.ActionModel, com.alibaba.fastjson.JSONObject):tb.ux1");
    }
}
