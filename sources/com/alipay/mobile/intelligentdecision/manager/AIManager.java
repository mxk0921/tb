package com.alipay.mobile.intelligentdecision.manager;

import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.drivers.actions.MspEventTypes;
import com.alipay.mobile.intelligentdecision.DecisionContext;
import com.alipay.mobile.intelligentdecision.IDeviceInfoUtil;
import com.alipay.mobile.intelligentdecision.callback.TBDaiCallBack;
import com.alipay.mobile.intelligentdecision.engine.DecisionEngine;
import com.alipay.mobile.intelligentdecision.log.DecisionLogcat;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tmall.android.dai.DAI;
import com.tmall.android.dai.DAIError;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.h7r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AIManager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f4243a = "AIManager";
    public static volatile AIManager d;
    public final AtomicBoolean c = new AtomicBoolean(true);
    public AtomicBoolean b = new AtomicBoolean(true);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public Object f4248a;
        public int b;
        public long c;
        public String d;
        public String e;
        public String f;

        public a(Object obj, int i, long j, String str, String str2, String str3) {
            this.f4248a = obj;
            this.b = i;
            this.c = j;
            this.d = str;
            this.e = str2;
            this.f = str3;
        }
    }

    public static /* synthetic */ AtomicBoolean a(AIManager aIManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("81b469c8", new Object[]{aIManager}) : aIManager.b;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[0]) : f4243a;
    }

    public static /* synthetic */ void a(AIManager aIManager, JSONObject jSONObject, String str, String str2, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8034cd8", new Object[]{aIManager, jSONObject, str, str2, bundle});
        } else {
            aIManager.a(jSONObject, str, str2, bundle);
        }
    }

    public static /* synthetic */ AtomicBoolean b(AIManager aIManager) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AtomicBoolean) ipChange.ipc$dispatch("ab1be2a7", new Object[]{aIManager}) : aIManager.c;
    }

    public static AIManager a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AIManager) ipChange.ipc$dispatch("95954388", new Object[0]);
        }
        if (d == null) {
            synchronized (AIManager.class) {
                try {
                    if (d == null) {
                        d = new AIManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.alibaba.fastjson.JSONObject r14, final java.lang.String r15, final java.lang.String r16, final android.os.Bundle r17) {
        /*
            r13 = this;
            r8 = r13
            r5 = r17
            r9 = 1
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alipay.mobile.intelligentdecision.manager.AIManager.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0021
            java.lang.String r2 = "7bdd7ab8"
            r3 = 5
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r8
            r3[r9] = r14
            r0 = 2
            r3[r0] = r15
            r0 = 3
            r3[r0] = r16
            r0 = 4
            r3[r0] = r5
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0021:
            if (r14 != 0) goto L_0x002c
            java.lang.String r0 = com.alipay.mobile.intelligentdecision.manager.AIManager.f4243a
            java.lang.String r1 = "predictObj == null"
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r0, r1)
            return
        L_0x002c:
            java.lang.String r1 = com.alipay.mobile.intelligentdecision.manager.AIManager.f4243a
            java.lang.String r2 = "predictObj != null"
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, r2)
            com.alibaba.fastjson.JSONObject r2 = r14.getJSONObject(r15)
            if (r2 != 0) goto L_0x0041
            java.lang.String r0 = "obj == null"
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, r0)
            return
        L_0x0041:
            java.lang.String r3 = "enable"
            boolean r3 = r2.getBooleanValue(r3)
            if (r3 != 0) goto L_0x0050
            java.lang.String r0 = "predit not scene_enable"
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, r0)
            return
        L_0x0050:
            java.lang.String r1 = "bio_type"
            com.alibaba.fastjson.JSONArray r3 = r2.getJSONArray(r1)
            java.lang.String r4 = ""
            java.lang.String r1 = r5.getString(r1, r4)
            if (r3 == 0) goto L_0x007e
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x007e
            java.util.Iterator r3 = r3.iterator()
        L_0x0068:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007d
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = r4.toString()
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L_0x0068
            goto L_0x007e
        L_0x007d:
            return
        L_0x007e:
            java.lang.String r1 = "scene_code"
            java.lang.String r3 = r2.getString(r1)
            java.lang.String r1 = com.alipay.mobile.intelligentdecision.manager.AIManager.f4243a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "predit start scenecode:"
            r4.<init>(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, r4)
            java.lang.String r4 = "param_list"
            com.alibaba.fastjson.JSONArray r6 = r2.getJSONArray(r4)
            if (r6 == 0) goto L_0x00b8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "paramList:"
            r4.<init>(r7)
            java.lang.String r7 = r6.toJSONString()
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, r4)
        L_0x00b8:
            java.lang.String r10 = "startAICompute"
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, r10)
            java.util.concurrent.atomic.AtomicBoolean r4 = r8.c
            boolean r4 = r4.get()
            if (r4 != 0) goto L_0x00cd
            java.lang.String r0 = "have start predit, so return"
            com.alipay.mobile.intelligentdecision.log.DecisionLogcat.b(r1, r0)
            return
        L_0x00cd:
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.c
            r1.set(r0)
            com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor r11 = com.alipay.mobile.verifyidentity.utils.task.AsyncTaskExecutor.getInstance()     // Catch: all -> 0x00e6
            com.alipay.mobile.intelligentdecision.manager.AIManager$2 r12 = new com.alipay.mobile.intelligentdecision.manager.AIManager$2     // Catch: all -> 0x00e6
            r0 = r12
            r1 = r13
            r4 = r16
            r5 = r17
            r7 = r15
            r0.<init>()     // Catch: all -> 0x00e6
            r11.execute(r12, r10)     // Catch: all -> 0x00e6
            return
        L_0x00e6:
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.c
            r0.set(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.manager.AIManager.a(com.alibaba.fastjson.JSONObject, java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public static String a(final String str, final String str2, Bundle bundle, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6df5cda0", new Object[]{str, str2, bundle, jSONArray});
        }
        DecisionLogcat.b(f4243a, "getMobileAixData");
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(bundle.getString("mcSalesProd"))) {
            hashMap.put("viScene", "");
        } else {
            hashMap.put("viScene", bundle.getString("mcSalesProd"));
        }
        hashMap.put("biometry_type", Integer.valueOf(IDeviceInfoUtil.a(DecisionContext.getInstance().getContext())));
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                String string = jSONArray.getString(i);
                String str3 = f4243a;
                DecisionLogcat.b(str3, "key:" + string + ", value:" + bundle.get(string));
                if (bundle.get(string) != null) {
                    hashMap.put(string, bundle.get(string));
                }
            }
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final JSONObject jSONObject = new JSONObject();
        try {
            DAI.runComputeByAlias(str, hashMap, new TBDaiCallBack(new TBDaiCallBack.DaiCallback() { // from class: com.alipay.mobile.intelligentdecision.manager.AIManager.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* JADX WARN: Removed duplicated region for block: B:49:0x013f  */
                @Override // com.alipay.mobile.intelligentdecision.callback.TBDaiCallBack.DaiCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void a(java.lang.Object... r9) {
                    /*
                        Method dump skipped, instructions count: 332
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.intelligentdecision.manager.AIManager.AnonymousClass3.a(java.lang.Object[]):void");
                }

                @Override // com.alipay.mobile.intelligentdecision.callback.TBDaiCallBack.DaiCallback
                public final void a(DAIError dAIError) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("e7ac4563", new Object[]{this, dAIError});
                        return;
                    }
                    String b = AIManager.b();
                    DecisionLogcat.b(b, "AiManager onError:" + dAIError.getMessage());
                    JSONObject.this.put("errorMsg", (Object) dAIError.getMessage());
                    countDownLatch.countDown();
                }
            }));
            countDownLatch.await();
        } catch (Throwable th) {
            String str4 = f4243a;
            DecisionLogcat.b(str4, "AiManager runCompute erro:" + th.getMessage());
            jSONObject.put("errorMsg", (Object) ("AiManager runCompute error:" + th.getMessage()));
        }
        return jSONObject.toJSONString();
    }

    public static /* synthetic */ String a(String str, long j, long j2, String str2, String str3, int i, String str4, String str5, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("30917ce", new Object[]{str, new Long(j), new Long(j2), str2, str3, new Integer(i), str4, str5, new Integer(i2)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(MspEventTypes.ACTION_STRING_VERIFYID, (Object) str);
        jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, (Object) Long.valueOf(j));
        jSONObject.put("current_time", (Object) Long.valueOf(j2));
        jSONObject.put("timing", (Object) str2);
        jSONObject.put("model_scene", (Object) str3);
        jSONObject.put("config_version", (Object) Integer.valueOf(i));
        jSONObject.put("idp", (Object) ("a;" + DecisionEngine.a()));
        jSONObject.put("app_name", (Object) IDeviceInfoUtil.e());
        jSONObject.put("app_version", (Object) IDeviceInfoUtil.f());
        jSONObject.put(h7r.DEVICE_MODEL, (Object) IDeviceInfoUtil.b());
        if (!TextUtils.isEmpty(str5)) {
            jSONObject.put("exception", (Object) str5);
        } else if (i2 > 0) {
            jSONObject.put("timeout", (Object) Integer.valueOf(i2));
        } else {
            jSONObject.put("model_result", (Object) str4);
        }
        return jSONObject.toJSONString();
    }
}
