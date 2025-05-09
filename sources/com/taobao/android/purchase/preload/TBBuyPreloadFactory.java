package com.taobao.android.purchase.preload;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.s;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import tb.d9r;
import tb.g9r;
import tb.hm0;
import tb.m8r;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TBBuyPreloadFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean mHasInit;
    public static s sDinamicXEngineRouter;

    static {
        t2o.a(708837592);
    }

    public static void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[0]);
            return;
        }
        g9r.b();
        RequestConfig.a();
        d9r.b("purchase");
        hm0.f20738a = false;
        sDinamicXEngineRouter = null;
        TBBuyPreRequest.c();
        m8r.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
        if (r7.equals(com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridStage.ON_DATA_CHANGED) != false) goto L_0x0052;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:6:0x001b, B:13:0x002f, B:18:0x003c, B:21:0x0047, B:28:0x005b, B:29:0x005f, B:32:0x0067, B:33:0x006c, B:34:0x007c, B:36:0x0082, B:37:0x0087, B:38:0x008d, B:40:0x0093), top: B:43:0x001b }] */
    @com.alibaba.android.ultron.vfw.weex2.highPerformance.management.custom.TradeHybridCustomAnnotation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void onStage(android.content.Context r6, java.lang.String r7, java.lang.String r8, com.alibaba.fastjson.JSONObject r9) {
        /*
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.purchase.preload.TBBuyPreloadFactory.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x001b
            java.lang.String r4 = "ce9c787a"
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r6 = 3
            r5[r6] = r9
            r3.ipc$dispatch(r4, r5)
            return
        L_0x001b:
            int r3 = r7.hashCode()     // Catch: all -> 0x003a
            r4 = -1981035137(0xffffffff89ebcd7f, float:-5.676744E-33)
            if (r3 == r4) goto L_0x0047
            r2 = -307051014(0xffffffffedb2c5fa, float:-6.915959E27)
            if (r3 == r2) goto L_0x003c
            r2 = 58688523(0x37f840b, float:7.5089343E-37)
            if (r3 == r2) goto L_0x002f
            goto L_0x0051
        L_0x002f:
            java.lang.String r2 = "on_container_resume"
            boolean r2 = r7.equals(r2)     // Catch: all -> 0x003a
            if (r2 == 0) goto L_0x0051
            r2 = 2
            goto L_0x0052
        L_0x003a:
            r6 = move-exception
            goto L_0x0099
        L_0x003c:
            java.lang.String r2 = "on_tab_change"
            boolean r2 = r7.equals(r2)     // Catch: all -> 0x003a
            if (r2 == 0) goto L_0x0051
            r2 = 1
            goto L_0x0052
        L_0x0047:
            java.lang.String r3 = "on_data_changed"
            boolean r3 = r7.equals(r3)     // Catch: all -> 0x003a
            if (r3 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r2 = -1
        L_0x0052:
            java.lang.String r3 = "tabCart"
            if (r2 == 0) goto L_0x008d
            if (r2 == r1) goto L_0x007c
            if (r2 == r0) goto L_0x005f
            onBuyState(r6, r7, r8, r9)     // Catch: all -> 0x003a
            goto L_0x00a2
        L_0x005f:
            boolean r7 = r3.equals(r8)     // Catch: all -> 0x003a
            if (r7 == 0) goto L_0x00a2
            if (r9 != 0) goto L_0x006c
            com.alibaba.fastjson.JSONObject r9 = new com.alibaba.fastjson.JSONObject     // Catch: all -> 0x003a
            r9.<init>()     // Catch: all -> 0x003a
        L_0x006c:
            java.lang.String r7 = "from"
            r9.put(r7, r8)     // Catch: all -> 0x003a
            java.lang.String r7 = "bizName"
            r9.put(r7, r8)     // Catch: all -> 0x003a
            java.lang.String r7 = "enterPage"
            onBuyState(r6, r7, r8, r9)     // Catch: all -> 0x003a
            goto L_0x00a2
        L_0x007c:
            boolean r7 = r3.equals(r8)     // Catch: all -> 0x003a
            if (r7 != 0) goto L_0x0087
            java.lang.String r7 = "exitPage"
            onBuyState(r6, r7, r8, r9)     // Catch: all -> 0x003a
        L_0x0087:
            java.lang.String r7 = "idle"
            onBuyState(r6, r7, r8, r9)     // Catch: all -> 0x003a
            goto L_0x00a2
        L_0x008d:
            boolean r7 = r3.equals(r8)     // Catch: all -> 0x003a
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = "dataChanged"
            onBuyState(r6, r7, r8, r9)     // Catch: all -> 0x003a
            goto L_0x00a2
        L_0x0099:
            java.lang.String r7 = "PRELOAD_EXCEPTION"
            java.lang.String r6 = r6.getMessage()
            tb.vm0.e(r7, r6)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.purchase.preload.TBBuyPreloadFactory.onStage(android.content.Context, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONObject):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r8.equals(com.taobao.android.purchase.preload.TBBuyPreloadScene.NAV) == false) goto L_0x0026;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void onBuyState(android.content.Context r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.Object> r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.purchase.preload.TBBuyPreloadFactory.onBuyState(android.content.Context, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
