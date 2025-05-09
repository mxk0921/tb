package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class e {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ long f5348a;
        final /* synthetic */ ArrayList b;
        final /* synthetic */ JSONArray c;

        public a(long j, ArrayList arrayList, JSONArray jSONArray) {
            this.f5348a = j;
            this.b = arrayList;
            this.c = jSONArray;
        }

        /* JADX WARN: Removed duplicated region for block: B:5:0x001a  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r5 = this;
                r0 = 1
                com.huawei.hms.framework.network.grs.g.j.a r1 = new com.huawei.hms.framework.network.grs.g.j.a
                r1.<init>()
                long r2 = r5.f5348a
                java.lang.String r4 = "total_time"
                r1.put(r4, r2)
                java.util.ArrayList r2 = r5.b
                java.util.Iterator r2 = r2.iterator()
            L_0x0014:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0037
                java.lang.Object r3 = r2.next()
                com.huawei.hms.framework.network.grs.g.d r3 = (com.huawei.hms.framework.network.grs.g.d) r3
                boolean r4 = r3.o()
                if (r4 != 0) goto L_0x002c
                boolean r4 = r3.m()
                if (r4 == 0) goto L_0x0014
            L_0x002c:
                java.util.LinkedHashMap r3 = com.huawei.hms.framework.network.grs.g.e.a(r3)
                r1.put(r3)
                r2.remove()
                goto L_0x0058
            L_0x0037:
                java.util.ArrayList r2 = r5.b
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0058
                java.util.ArrayList r2 = r5.b
                int r3 = r2.size()
                int r3 = r3 - r0
                java.lang.Object r2 = r2.get(r3)
                com.huawei.hms.framework.network.grs.g.d r2 = (com.huawei.hms.framework.network.grs.g.d) r2
                java.util.LinkedHashMap r3 = com.huawei.hms.framework.network.grs.g.e.a(r2)
                r1.put(r3)
                java.util.ArrayList r3 = r5.b
                r3.remove(r2)
            L_0x0058:
                java.util.ArrayList r2 = r5.b
                int r2 = r2.size()
                if (r2 <= 0) goto L_0x0081
                java.util.ArrayList r2 = r5.b
                java.util.Iterator r2 = r2.iterator()
            L_0x0066:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x0081
                java.lang.Object r3 = r2.next()
                com.huawei.hms.framework.network.grs.g.d r3 = (com.huawei.hms.framework.network.grs.g.d) r3
                org.json.JSONObject r4 = new org.json.JSONObject
                java.util.LinkedHashMap r3 = com.huawei.hms.framework.network.grs.g.e.a(r3)
                r4.<init>(r3)
                org.json.JSONArray r3 = r5.c
                r3.put(r4)
                goto L_0x0066
            L_0x0081:
                org.json.JSONArray r2 = r5.c
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0094
                org.json.JSONArray r2 = r5.c
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "failed_info"
                r1.put(r3, r2)
            L_0x0094:
                org.json.JSONObject r2 = new org.json.JSONObject
                java.util.LinkedHashMap r3 = r1.get()
                r2.<init>(r3)
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r3 = 0
                r0[r3] = r2
                java.lang.String r2 = "HaReportHelper"
                java.lang.String r3 = "grssdk report data to aiops is: %s"
                com.huawei.hms.framework.common.Logger.d(r2, r3, r0)
                com.huawei.hms.framework.common.hianalytics.HianalyticsHelper r0 = com.huawei.hms.framework.common.hianalytics.HianalyticsHelper.getInstance()
                java.util.LinkedHashMap r1 = r1.get()
                java.lang.String r2 = "grs_request"
                r0.onEvent(r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.e.a.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<String, String> b(d dVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception d = dVar.d();
        if (d != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(d));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, d.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(d.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", dVar.b());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, dVar.c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(dVar.l()).getHost());
        } catch (MalformedURLException e) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e);
        }
        linkedHashMapPack.put("req_start_time", dVar.h());
        linkedHashMapPack.put("req_end_time", dVar.g());
        linkedHashMapPack.put("req_total_time", dVar.i());
        return linkedHashMapPack.getAll();
    }

    public static void a(ArrayList<d> arrayList, long j, JSONArray jSONArray, Context context) {
        if (context != null && arrayList != null && arrayList.size() > 0 && HianalyticsHelper.getInstance().isEnableReport(context)) {
            HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j, arrayList, jSONArray));
        }
    }
}
